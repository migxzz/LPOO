package model;
import java.text.NumberFormat;

public  class GerenteGeral extends Gerente{

    public GerenteGeral(String nome, double salario) {

        super(nome, salario);
    }
    @Override
    public String toString() {
        return "\nGerenteGeral [Bonus= "
                + NumberFormat.getCurrencyInstance().format(getBonus())
                + ", Nome= " + getNome()
                + ", Salario= "
                + NumberFormat.getCurrencyInstance().format(getSalario()) + "]";
    }
    public double getBonus(){

        return this.getSalario()*0.4;
    }
}

