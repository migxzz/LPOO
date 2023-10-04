package model;

public class Tanque extends  Personagem{
    @Override
    public void desenhar() {
        System.out.println("Desenhou um tanque");
    }

    public Tanque() {
    }

    public Tanque(double x, double y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "\nTanque{" +
                "x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }
}
