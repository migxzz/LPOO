package controller;

import model.*;
import model.Item;
import model.Pedido;
import model.Produto;
import exceptions.EstoqueInsuficienteException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoController {
    public static void main(String[] args) {
        Produto produto1 = new Produto(123, "Arroz", 50, 20.0);
        Produto produto2 = new Produto(1234, "Feijão", 50, 18.0);

        Date data = new Date();

        Vendedor vendedor1 = new Vendedor(101, "Yasuo", "XXX", "XXXX",
                "XXXX", "Pelotas", "RS", "Casa");

        // Só consegui definir manualmente
        Pedido pedido1 = new Pedido(1, data, vendedor1);
        Pedido pedido2 = new Pedido(2, data, vendedor1);

        Item item1 = new Item(10, 5, produto1, pedido1);
        Item item2 = new Item(11, 5, produto2, pedido2);

        pedido1.getItens().add(item1);
        pedido2.getItens().add(item2);

        List<Pedido> vendas = new ArrayList<>();

        try {
            realizarVenda(pedido1, item1, produto1, 5);
            realizarVenda(pedido2, item2, produto2, 5);
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        vendas.add(pedido1);
        vendas.add(pedido2);

        // atualizando estoque pós venda
        produto1.baixarEstoque(item1.getQuantidade());
        produto2.baixarEstoque(item2.getQuantidade());

        System.out.println("Relatório de Vendas:");
        for (Pedido pedido : vendas) {
            System.out.println("Pedido #" + pedido.getNumero() + " - Vendedor: " + pedido.getVendedor().getNome());
            double totalPedido = pedido.getValor(); // Obtenha o valor total definido no pedido
            for (Item item : pedido.getItens()) {
                Produto produto = item.getProduto();
                System.out.println("  - Produto: " + produto.getNome() + " - Quantidade: " + item.getQuantidade() + " - Total: R$" + item.calcularTotal());
            }


            System.out.println("\nEstoque de Produtos Após as Vendas:");
            System.out.println("Produto: " + produto1.getNome() + " - Estoque: " + produto1.getQuantidade());
            System.out.println("Produto: " + produto2.getNome() + " - Estoque: " + produto2.getQuantidade());
        }


        Fornecedor f1 = new Fornecedor(123, "981122547", "Jurandir");

        Fornecimento fn1 = new Fornecimento(data, 1000.00, f1, produto1);
        Fornecimento fn2 = new Fornecimento(data, 800.0, f1, produto2);

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fn1);
        fornecimentos.add(fn2);

        System.out.println("Relatório Fornecimentos: ");
        double custoTotalFornecimento = 0;
        for (Fornecimento fornecimento : fornecimentos) {
            Produto produto = fornecimento.getProduto();
            System.out.println("Fornecedor: " + fornecimento.getFornecedor().getNome());
            System.out.println("Produto " + produto.getNome());
            System.out.println("Data do Fornecimento " + fornecimento.getData());
            System.out.println("Valor total do Fornecimento: " + fornecimento.getValorTotal());

            custoTotalFornecimento += fornecimento.getValorTotal();
        }

        System.out.println("Valor Total dos Fornecimentos: " + custoTotalFornecimento);
    }

    public static void realizarVenda(Pedido pedido, Item item, Produto produto, int quantidadeVendida) throws EstoqueInsuficienteException {
        if (quantidadeVendida > produto.getQuantidade()) {
            throw new EstoqueInsuficienteException();
        }

    }
}

