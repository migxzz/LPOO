package controller;

import model.Cliente;
import model.Desenvolvedor;
import model.Gerente;

import java.util.*;
import java.util.Comparator;

public class SicrediController {
    public static void main(String[] args) {

        //1. Interprete o diagrama das classes abaixo na tecnologia Java e organize o projeto em
        //camadas MVC. Depois, faça o que se pede:
        //a) Crie seis instâncias de cada classe do diagrama (das possíveis) com valores válidos
        //para os seus atributos. Depois, utilizando o método toString(), imprima estes objetos
        //e verifique o resultado.

        Desenvolvedor d1 = new Desenvolvedor("Marcos", 2000);
        Desenvolvedor d2 = new Desenvolvedor("Roger", 3000);
        Desenvolvedor d3 = new Desenvolvedor("Lilia", 4000);
        Desenvolvedor d4 = new Desenvolvedor("Nila", 5000);
        Desenvolvedor d5 = new Desenvolvedor("Miguel", 6000);
        Desenvolvedor d6 = new Desenvolvedor("Florence", 7000);

        Gerente g1 = new Gerente("Carlos", 9000.0, "VV1", 200);
        Gerente g2 = new Gerente("Alberto", 10000.0, "VV1", 300);
        Gerente g3 = new Gerente("Eleonora", 11000, "VV1", 400);
        Gerente g4 = new Gerente("Luciane", 12000, "VV1", 400);
        Gerente g5 = new Gerente("Heitor", 13000, "VV1", 500);
        Gerente g6 = new Gerente("Giovanna", 14000, "VV1", 600);

        Cliente c1 = new Cliente("Howard","Liss","S1CR3D10", 200);
        Cliente c2 = new Cliente("Fred","Liss","S1CR3D10", 200);
        Cliente c3 = new Cliente("Lisa","Liss","S1CR3D10", 300);
        Cliente c4 = new Cliente("Ward","Anton","S1CR3D10", 400);
        Cliente c5 = new Cliente("Loren","Gonçalves","S1CR3D10", 200);
        Cliente c6 = new Cliente("Lucia","Gonçalves","S1CR3D10", 700);

        System.out.println("Desenvolvedores da Cooperativa: ");
        System.out.println(d1 + "" + d2 + d3 + d4 + d5 + d6);

        System.out.println("Gerentes da Cooperativa: ");
        System.out.println(g1 + "" + g2 + g3 + g4 + g5 + g6);

        System.out.println("Investidores da Cooperativa: ");
        System.out.println(c1 + "" + c2 + c3 + c4 + c5 + c6);

       // b) Insira esses doze objetos em estruturas de dados do tipo coleção e imprima esta (s)
        // coleção (ões)

        List<Desenvolvedor> Devs = new ArrayList<>();
        Devs.add(d1);
        Devs.add(d2);
        Devs.add(d3);
        Devs.add(d4);
        Devs.add(d5);
        Devs.add(d6);

        List<Gerente> Gerentes = new ArrayList<>();
        Gerentes.add(g1);
        Gerentes.add(g2);
        Gerentes.add(g3);
        Gerentes.add(g4);
        Gerentes.add(g5);
        Gerentes.add(g6);

        List<Cliente> Investidores = new ArrayList<>();
        Investidores.add(c1);
        Investidores.add(c2);
        Investidores.add(c3);
        Investidores.add(c4);
        Investidores.add(c5);
        Investidores.add(c6);

        System.out.println("Coleção de Desenvolvedores: ");
        for (Desenvolvedor desenvolvedor: Devs){
            System.out.println(desenvolvedor);
        }

        System.out.println("Coleção de Gerentes: ");
        for (Gerente gerente: Gerentes){
            System.out.println(gerente);
        }

        System.out.println("Coleção de Clientes Investidores: ");
        for (Cliente investidor: Investidores){
            System.out.println(investidor);
        }

        //c A partir dessa (as) coleção (ões) liste todos os funcionários, todos os clientes, bem
        //como, todos os investidores, ordenando-os pelo salário, ordem decrescente, e pela
        //quantidade de ações, ordem decrescente;

        Collections.sort(Devs, Comparator.comparing(Desenvolvedor::getSalario).reversed());

        System.out.println("Desenvolvedores ordenados por ordem decrescente de salário: ");
        for (Desenvolvedor dev: Devs){
            System.out.println(dev);
        }

        Collections.sort(Gerentes, Comparator.comparing(Gerente::getSalario).reversed());

        System.out.println("Gerentes ordenados por ordem decrescente de salário: ");
        for (Gerente ger: Gerentes){
            System.out.println(ger);
        }

        Collections.sort(Investidores, Comparator.comparing(Cliente::getQuantidade).reversed());
        for (Cliente c: Investidores){
            System.out.println(c);
        }

        // Encontre o funcionário com o maior salário
        Optional<Desenvolvedor> funcionarioMaiorSalario = Devs.stream()
                .max(Comparator.comparing(Desenvolvedor::getSalario));

// Encontre o investidor com o maior número de ações
        Optional<Cliente> investidorMaiorAcoes = Investidores.stream()
                .max(Comparator.comparing(Cliente::getQuantidade));

        if (funcionarioMaiorSalario.isPresent()) {
            System.out.println("Funcionário com o maior salário:");
            System.out.println(funcionarioMaiorSalario.get());
        } else {
            System.out.println("Não há funcionários cadastrados.");
        }

        if (investidorMaiorAcoes.isPresent()) {
            System.out.println("Investidor com o maior número de ações:");
            System.out.println(investidorMaiorAcoes.get());
        } else {
            System.out.println("Não há investidores cadastrados.");
        }


    }
}
