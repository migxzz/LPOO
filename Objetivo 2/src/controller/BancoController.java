package controller;

import model.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class BancoController {
    public static void main(String[] args) {


        //Crie 3 instâncias de cada classe (das possíveis de criar instâncias), insira valores válidos
        //nos atributos dessas instâncias, e imprima esses objetos;

        ContaPoupanca cp1 = new ContaPoupanca("1F2D");
        ContaPoupanca cp2 = new ContaPoupanca("1G2D");
        ContaPoupanca cp3 = new ContaPoupanca("1H2D");

        ContaCorrente cc1 = new ContaCorrente("1AF2", "Vagner", 100);
        ContaCorrente cc2 = new ContaCorrente("1AF3", "Maria", 400);
        ContaCorrente cc3 = new ContaCorrente("1AF4", "Julieta", 600);

        Cliente c1 = new Cliente("William", 300);
        Cliente c2 = new Cliente("Eduarda", 600);
        Cliente c3 = new Cliente("Fábio", 600);

        cp1.deposita(1000.0);
        cp2.deposita(2000.0);
        cp3.deposita(3000.0);

        cc1.deposita(4000.0);
        cc2.deposita(5000.0);
        cc3.deposita(6000.0);

        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cp3);

        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //Crie as coleções necessárias para expressar as contas registradas no sistema, bem como,
        //os associados, depois, imprima essa (s) coleção (ões);

        List<Conta> contas = new ArrayList<>();
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);

        List<Associado> associados = new ArrayList<>();
        associados.add(cc1);
        associados.add(cc2);
        associados.add(cc3);
        associados.add(c1);
        associados.add(c2);
        associados.add(c3);


        // c1.lucros(10, 5);
        //c2.lucros(5,5);
        //c3.lucros(100, 5);

        System.out.println("\nContas Registradas: ");
        for (Conta conta : contas) {
            System.out.println(conta);
        }

        for (Associado associado : associados) {
            System.out.println(associado);
        }

        //Movimente, pelo menos, uma conta poupança, realizando as seguintes operações:
        //depósito de R$ 1.000,00; atualização monetária de 5%; saque de R$ 50,00;
        cp1.deposita(1000.0);
        cp1.atualiza(0.05);
        cp1.saca(50.0);

        System.out.println(cp1);

        //Movimente, pelo menos, uma conta corrente, realizando as seguintes operações: depósito
        //R$ 500,00; saque de R$ 400,00;

        cc1.deposita(500.0);
        cc1.saca(400.0);
        System.out.println(cc1);

        //Faça com que cada associado tenha as seguintes quantidade de cotas, nessa ordem: 100,
        //400, 600, 300, 600, 600, e imprima a (s) coleção (ões);
        //Foi inserido lá em cima

        System.out.println("Quantidade de Cotas por Associado: ");
        for (Associado associado : associados) {
            System.out.println(associado);
        }

        //. A partir da (s) coleção (ões), imprima todos os associados, ordenados pelo critério de
        //número de cotas, em ordem decrescente. E faça o programa calcular e imprimir os
        //associados com o maior número de cotas no sistema.

        Collections.sort(associados, new Comparator<Associado>() {
            @Override
            public int compare(Associado a1, Associado a2) {
                return Integer.compare(a2.getQuantidadeDeCotas(), a1.getQuantidadeDeCotas());
            }
        });

        System.out.println("Impressão Cotas Decrescente");
        for (Associado associado: associados){
            System.out.println(associado);
        }

        //Encontrar Associado com maior num de cota

        int maiorCota= associados.get(0).getQuantidadeDeCotas();
        System.out.println("Associado com maior número de cotas: ");
        for (Associado associado:associados){
            if ( associado.getQuantidadeDeCotas()==maiorCota){
                System.out.println(associado);
            } else {
                break;
            }
        }

        //. A partir da (s) coleção (ões), imprima todas as contas cadastradas no sistema, ordenadas
        //pelo critério saldo, em ordem decrescente. E, imprima todos associados que sejam
        //Associado e possua conta cadastradas no sistema, em qualquer ordem. Também faça o
        //programa imprimir a lista de contas com maior saldo bancário.

        Collections.sort(contas, new Comparator<Conta>() {
            @Override
            public int compare(Conta c1, Conta c2) {
                return Double.compare(c2.getSaldo(), c1.getSaldo());
            }
        });

        System.out.println("Contas Ordenadas por Saldo Decrescente:");
        for (Conta conta : contas) {
            System.out.println(conta);
        }

        System.out.println("\nAssociados com Contas no Sistema:");
        for (Associado associado : associados) {
            if (associado instanceof Cliente) {
                Cliente cliente = (Cliente) associado;
                System.out.println(cliente.getNome());
            }
            if (associado instanceof Conta) {
                Conta conta = (Conta) associado;
                System.out.println("Conta de " + conta.getSaldo());
            }
        }

        double maiorSaldo = contas.get(0).getSaldo();
        System.out.println("\nContas com Maior Saldo Bancário:");
        for (Conta conta : contas) {
            if (conta.getSaldo() == maiorSaldo) {
                System.out.println(conta);
            } else {
                break;
            }
        }

    }
}

