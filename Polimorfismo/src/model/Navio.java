package model;

public class Navio extends Personagem{
    @Override
    public void desenhar() {
        System.out.println("Desenhou navio");
    }

    public Navio() {
    }

    public Navio(double x, double y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "\nNavio{" +
                "x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }
}
