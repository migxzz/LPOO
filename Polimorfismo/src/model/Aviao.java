package model;

import model.Personagem;


public class Aviao extends Personagem {

    private double z;

    @Override
    public void desenhar() {
        System.out.println("Desenhou um avião");
    }

    public void mover(double x, double y, double z){
        super.mover(x,y); //ou this.x = x e this.y = y
        this.z = z;
    }

    public Aviao() {
    }

    public Aviao(double x, double y) {
        super(x, y);
    }

    public Aviao(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "\nAviao  " +
                "x= " + x +
                " y= " + y +
                " z= " + z ;
    }
}
