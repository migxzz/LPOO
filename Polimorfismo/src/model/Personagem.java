package model;

public abstract class Personagem {
    protected double x;
    protected double y;

    public void mover (double x, double y){
        this.x = x;
        this.y = y;
    }

    public abstract void desenhar(); // está abstraco porque ele deve desenhar cada personagem (navio, aviao, etc)

    public Personagem() {
    }

    public Personagem(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
