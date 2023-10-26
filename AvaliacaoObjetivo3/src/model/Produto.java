package model;

import java.util.List;

public class Produto {

    private int codigo;
    private String nome;
    private int quantidade;
    private double preco;

    List<Item> itens;
    Fornecedor fornecedor;

    public Produto(int codigo, String nome, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public boolean manterProduto(int codigo){
        return true;
    }

    public String getNome() {
        return nome;
    }


        public void baixarEstoque(int quantidadeVendida) {
            if (quantidadeVendida <= quantidade) {
                quantidade -= quantidadeVendida;
            } else {
                System.out.println("Quantidade insuficiente em estoque.");
            }
        }

    }

