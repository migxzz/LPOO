package controller;

import model.Cliente;
import model.Gerente;
import model.Investidor;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SicrediController {
    public static void main(String[] args) {
        Gerente  g1 = new Gerente("Ana", "Silva", "SICR3", 10000);
        Cliente c1 = new Cliente("Rafael", "Pereira", "SICR3", 40000);
        Cliente c2 = new Cliente("Ivern", "God", "SICR3", 90000);


        List<Investidor> investidores = new ArrayList<>();
        investidores.add(g1);
        investidores.add(c1);
        investidores.add(c2);

        int acum = 0;
        for (Investidor investidor : investidores){
            acum += investidor.getQuantidade();
        }

        System.out.println(acum);

        //Quantidade cotas distribuidas pelo Sicredi para Clientes
        acum = 0;
        int acumGer = 0;
        for (Investidor investidor : investidores){
            if(investidor instanceof Cliente) {
                acum += investidor.getQuantidade();
            }
            if(investidor instanceof  Gerente){
                acumGer+= investidor.getQuantidade();
            }
        }
        System.out.println(acum);

    }
}
