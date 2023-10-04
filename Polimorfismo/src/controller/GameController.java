package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    public static void main(String[] args) {
        Aviao a1 = new Aviao();
        Aviao a2 = new Aviao(2,2,2);
        Tanque t1 = new Tanque();
        Navio n1 = new Navio();
        Submarino s1 = new Submarino();

        //Polimorfismo estrutural por sobreescrita de método (@overhide)
        List<Personagem> personagens = new ArrayList<>();
        personagens.add(a1);
        personagens.add(a2);
        personagens.add(n1);
        personagens.add(t1);
        personagens.add(s1);

        personagens.forEach(perso-> { //forEach percorra até não sobrar nenhum personagem quando não houver mais objetos ele para
            perso.desenhar();
        });

        personagens.forEach(perso -> {
            if (perso instanceof Aviao){
                ((Aviao) perso).mover(5,5,10); //downcasting "descer de cima para baixo"
            }
        });

        System.out.println(personagens);

        //Downcasting


    }
}
