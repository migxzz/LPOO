package controller;

import model.Aluno;
import java.util.*;

public class AlunoController {
    public static void main(String[] args) {
        List<Aluno> alunosList = new ArrayList<>();
        Map<Integer, Aluno> alunosMap = new TreeMap<>();


        Aluno aluno1 = new Aluno(1,111, "Roberto", "Soares", "robertosoares@gmail.com");
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno(4, "Denise");
        Aluno aluno5 = new Aluno(5, "Ferreira");

        aluno2.setId(2);
        aluno2.setCpf(112);
        aluno2.setNome("Maria");
        aluno2.setSobrenome("Madalena");
        aluno2.setEmail("mm@gmail.com");

        aluno3.setId(3);
        aluno3.setCpf(113);
        aluno3.setNome("Nilson");
        aluno3.setSobrenome("Newmann");
        aluno3.setEmail("nn@gmail.com");

        alunosList.add(aluno1);
        alunosList.add(aluno2);
        alunosList.add(aluno3);
        alunosList.add(aluno4);
        alunosList.add(aluno5);

        alunosMap.put(aluno1.getId(), aluno1);
        alunosMap.put(aluno2.getId(), aluno2);
        alunosMap.put(aluno3.getId(), aluno3);
        alunosMap.put(aluno4.getId(), aluno4);
        alunosMap.put(aluno5.getId(), aluno5);



        //Imprimir as instâncias com o uso de ToString

        System.out.println("Lista de Alunos com o método ToString");
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(aluno4);
        System.out.println(aluno5);

        //Impressão com o método Getters
        System.out.println("Lista de Alunos com o método Getters:");
        System.out.println("Aluno 2:");
        System.out.println("ID:"+ aluno2.getId());
        System.out.println("CPF:"+ aluno2.getCpf());
        System.out.println("Nome:"+ aluno2.getNome());
        System.out.println("Sobrenome:"+ aluno2.getSobrenome());
        System.out.println("Email:"+ aluno2.getEmail());

        System.out.println("Aluno 3:");
        System.out.println("ID:"+ aluno3.getId());
        System.out.println("CPF:"+ aluno3.getCpf());
        System.out.println("Nome:"+ aluno3.getNome());
        System.out.println("Sobrenome:"+ aluno3.getSobrenome());
        System.out.println("Email:"+ aluno3.getEmail());

        // Imprimir o Map
        System.out.println("Impressão do Map:");
        System.out.println(alunosMap);

        // Imprimir List
        System.out.println("Impressão da List:");
        System.out.println(alunosList);

        // Imprimir Objetos de ID 5
        for (Aluno aluno: alunosList){
            if (aluno.getId() == 5){
                System.out.println("Imprimir os objetos de ID 5:");
                System.out.println(aluno);
            }
        }

        Aluno alunoMapId5 = alunosMap.get(5);
        System.out.println("Imprimir os objetos de ID 5:");
        System.out.println(alunoMapId5);

        // Ordenar a Lista pelo ID em ordem decrescente
        Collections.sort(alunosList, Comparator.comparingInt(Aluno::getId).reversed());

        // Imprimir List ordenada em ordem decrescente
        System.out.println("Lista de Alunos ordenada pelo ID em ordem decrescente:");
        for (Aluno aluno : alunosList) {
            System.out.println(aluno);


    }



    }


        }


