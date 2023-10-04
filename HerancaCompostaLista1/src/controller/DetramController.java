package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DetramController {
    public static void main(String[] args) {

        //Criando o exercício 2
        List<Veiculos> cadastroVeiculos = new ArrayList<>();
        // Exercicio 1 a
        Bicicleta bike1 = new Bicicleta(2,"Humana", "Caloi", "C120",
                2021,28, "H334");
        Bicicleta bike2 = new Bicicleta(2,"Humana", "Caloi", "C121",
                2021,28, "H335");
        Bicicleta bike3 = new Bicicleta(2,"Humana", "Caloi", "C122",
                2021,28, "H336");
        Bicicleta bike4 = new Bicicleta(2,"Humana", "Caloi", "C123",
                2021,28, "H337");
        Bicicleta bike5 = new Bicicleta(2,"Humana", "Caloi", "C124",
                2021,28, "H338");


        //1 b

        Carro c1 = new Carro(4,"Gasolina","BMW","XM100", 2023,
                30,"FFFFF", "GGGGG", "IBLBD");
        Carro c2 = new Carro(4,"Gasolina","BMW","XM100", 2023,
                30,"FFFFF", "GGGGG", "JBLBD");
        Carro c3 = new Carro(4,"Gasolina","BMW","XM100", 2023,
                30,"FFFFF", "GGGGG", "JBLBD");
        Carro c4 = new Carro(4,"Gasolina","BMW","XM100", 2023,
                30,"FFFFF", "GGGGG", "JBLBD");
        Carro c5 = new Carro(4,"Gasolina","BMW","XM100", 2023,
                30,"FFFFF", "GGGGG", "JBLBD");

        //1 c
        Caminhao cam1 = new Caminhao(6,"Diesel","Mercedes",
                "MRV40",2022,20000,"VVV",
                "KLLKL", "IYV-2332");
        Caminhao cam2 = new Caminhao(6,"Diesel","Mercedes",
                "MRV40",2022,20000,"VVV",
                "KLLKL", "XYV-2332");
        Caminhao cam3 = new Caminhao(6,"Diesel","Mercedes",
                "MRV40",2022,20000,"VVV",
                "KLLKL", "XYV-2332");
        Caminhao cam4 = new Caminhao(6,"Diesel","Mercedes",
                "MRV40",2022,20000,"VVV",
                "KLLKL", "XYV-2332");
        Caminhao cam5 = new Caminhao(6,"Diesel","Mercedes",
                "MRV40",2022,20000,"VVV",
                "KLLKL", "IIV-2332");



        cadastroVeiculos.add(bike1);
        cadastroVeiculos.add(bike2);
        cadastroVeiculos.add(bike3);
        cadastroVeiculos.add(bike4);
        cadastroVeiculos.add(bike5);
        cadastroVeiculos.add(c1);
        cadastroVeiculos.add(c2);
        cadastroVeiculos.add(c3);
        cadastroVeiculos.add(c4);
        cadastroVeiculos.add(c5);
        cadastroVeiculos.add(cam1);
        cadastroVeiculos.add(cam2);
        cadastroVeiculos.add(cam3);
        cadastroVeiculos.add(cam4);
        cadastroVeiculos.add(cam5);

        //Ordene e imprima a lista de veículos cadastradas no sistema, do maior para o menor
        //ano de fabricação;

        Collections.sort(cadastroVeiculos, new Comparator<Veiculos>() {
            @Override
            public int compare(Veiculos veiculos1, Veiculos veiculos2) {
                return Integer.compare(veiculos2.getAnoFabricacao(), veiculos1.getAnoFabricacao());
            }
        });

        System.out.println("Veículos por ordem maior ao menor ano de fabricação");
        for (Veiculos veiculos : cadastroVeiculos){
            System.out.println(veiculos);
        }

        //Ordene e imprima a lista de automóveis cadastradas no sistema, na mesma ordem
        //do item a;

        List<Automovel> automoveis = cadastroVeiculos.stream()
                .filter(veiculos -> veiculos instanceof Automovel)
                .map(veiculos -> (Automovel) veiculos)
                .collect(Collectors.toList());

        List<Bicicleta> bicicletas = cadastroVeiculos.stream()
                .filter(veiculos -> veiculos instanceof Bicicleta)
                .map (veiculos -> (Bicicleta) veiculos)
                .collect(Collectors.toList());

        Collections.sort(bicicletas, new Comparator<Bicicleta>() {
            @Override
            public int compare(Bicicleta bike1, Bicicleta bike2) {
                return Integer.compare(bike2.getAnoFabricacao(), bike1.getAnoFabricacao());
            }
        });

        //Letra

        System.out.println("\n\nLista de veículos que tenham placa começando por i ou I: ");
        cadastroVeiculos.forEach(v -> {
            if (v instanceof Automovel){
                if ( ((Automovel) v).getPlaca().startsWith("I") || ((Automovel) v).getPlaca().startsWith("i") ) {
                    System.out.println(v);
                }
            }
        });










    }
}
