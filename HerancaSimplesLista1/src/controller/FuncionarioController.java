package controller;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {


        Desenvolvedor Dev1 = new Desenvolvedor();
        Desenvolvedor Dev2 = new Desenvolvedor();

        Gerente g1 = new Gerente("Francisca", 7500.0);
        Gerente g2 = new Gerente("Teemo", 7500.0);

        //Impressão dos Funcionários

        System.out.println("Funcionários criados:");
        System.out.println(Dev1);
        System.out.println(Dev2);
        System.out.println(g1);
        System.out.println(g2);

        //alterar os objetos utilizando setter

        Dev1.setNome("Nidalee");
        Dev1.setSalario(2000.0);
        Dev2.setNome("Bruty");
        Dev2.setSalario(2000.0);
        g1.setSalario(8000.0);
        g2.setSalario(8000.0);

        //Impressão dos Funcionários Alterados
        System.out.println("\nFuncionários Alterados:");
        System.out.println(Dev1);
        System.out.println(Dev2);
        System.out.println(g1);
        System.out.println(g2);


        //Impressão do bônus

        System.out.println("\n Bônus dos Funcionário:");
        System.out.println("Desenvolvedor1:"+Dev1.getBonus());
        System.out.println("Desenvolvedor2:"+Dev2.getBonus());
        System.out.println("Gerente1:"+g1.getBonus());
        System.out.println("Gerente2:"+g2.getBonus());

        //1. Foi possível criar instâncias da classe Funcionario? Justifique sua resposta.
        //Não, é abstrato.

        //2. 2. Onde você deve inserir estas regras de negócio? Na classe xxController ou nas
        //classes Gerente e Desenvolvedor? Justifique sua resposta.
        // Deve ser inserida nas classes Gerente e Desenvolvedor, respeitando os princípios de Encapsulamento.
        //Regras especificas de gerente devem estar dentro da classe gerente. assim como dev.

        //Gerentes
        Gerente GG1 = new GerenteGeral("Bojack", 6500.0);
        Gerente GD1 = new GerenteDev("Frederick", 4500.0);

        //Dev Seniors
        Desenvolvedor ds1 = new DevSenior("Arthur", 3500.0);
        Desenvolvedor ds2 = new DevSenior("Lancelot", 3500.0);
        Desenvolvedor ds3 = new DevSenior("Merlin", 3500.0);
        Desenvolvedor ds4 = new DevSenior("Icaro", 3500.0);
        Desenvolvedor ds5 = new DevSenior("Noe", 3500.0);
        Desenvolvedor ds6 = new DevSenior("Moises", 3500.0);

        //Dev Pleno

        Desenvolvedor dp1 = new DevPleno("Neymar", 2500.0);
        Desenvolvedor dp2 = new DevPleno("Rogerio", 2500.0);
        Desenvolvedor dp3 = new DevPleno("Ricardo", 2500.0);
        Desenvolvedor dp4 = new DevPleno("Ronaldo", 2500.0);
        Desenvolvedor dp5 = new DevPleno("Roger", 2500.0);
        Desenvolvedor dp6 = new DevPleno("Rivaldo", 2500.0);

        //Dev Junior

        Desenvolvedor dj1 = new DevJunior("Orli", 1800.0);
        Desenvolvedor dj2 = new DevJunior("Bruna", 1800.0);
        Desenvolvedor dj3 = new DevJunior("Rafael", 1800.0);
        Desenvolvedor dj4 = new DevJunior("Levi", 1800.0);
        Desenvolvedor dj5 = new DevJunior("William", 1800.0);
        Desenvolvedor dj6 = new DevJunior("Luciano", 1800.0);

        List <Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(GG1);
        funcionarios.add(GD1);
        funcionarios.add(dj1);
        funcionarios.add(dj2);
        funcionarios.add(dj3);
        funcionarios.add(dj4);
        funcionarios.add(dj5);
        funcionarios.add(dj6);
        funcionarios.add(dp1);
        funcionarios.add(dp2);
        funcionarios.add(dp3);
        funcionarios.add(dp4);
        funcionarios.add(dp5);
        funcionarios.add(dp6);
        funcionarios.add(ds1);
        funcionarios.add(ds2);
        funcionarios.add(ds3);
        funcionarios.add(ds4);
        funcionarios.add(ds5);
        funcionarios.add(ds6);

      //calcular Folha sem bonus

        double totalFolhaSemBonus = 0.0;
        for (Funcionario funcionario : funcionarios){
            totalFolhaSemBonus += funcionario.getSalario();
        }

        //Impressao folha sem bonus
        System.out.println("\nFolha sem bônus");
        System.out.println(NumberFormat.getCurrencyInstance().format(totalFolhaSemBonus));

        //calcular folha com bonus
        double totalFolhaComBonus = 0.0;
        for (Funcionario funcionario : funcionarios) {
            totalFolhaComBonus += funcionario.getSalario() + funcionario.getBonus();
        }

        //Impressão
        System.out.println("\nFolha com Bônus");
        System.out.println(NumberFormat.getCurrencyInstance().format(totalFolhaComBonus));

        //Detalhes dos funcionarios

        System.out.println("\nDetalhes dos Funcionários");
        funcionarios.forEach( f-> {
            double salarioBruto = f.getSalario() + f.getBonus();
            System.out.println("\nFuncionário:" + f.getNome());
            System.out.println("\nSalário bruto:" + NumberFormat.getCurrencyInstance().format(salarioBruto));
            System.out.println("\nBônus:" + NumberFormat.getCurrencyInstance().format(f.getBonus()));
        });

    // Nova folha com bonus

        totalFolhaComBonus=0.0;
        for (Funcionario funcionario : funcionarios){
            funcionario.setSalario(funcionario.getSalario()+(funcionario.getSalario()*0.05));
            totalFolhaComBonus+= funcionario.getSalario() + funcionario.getBonus();
        }

        //Impressão

        System.out.println("\nNova Folha Salarial Com Bônus:");
        System.out.println(NumberFormat.getCurrencyInstance().format(totalFolhaComBonus));

    }
}
