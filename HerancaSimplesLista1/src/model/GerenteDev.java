package model;
import java.text.NumberFormat;

public class GerenteDev extends Gerente{

    public GerenteDev(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonus(){
        return this.getSalario()*0.2;
    }

    @Override
    public String toString() {
        return "\nGerenteDesenvolvimento [Bonus= "
                + NumberFormat.getCurrencyInstance().format(getBonus())
                + ", Nome= " + getNome()
                + ", Salario= "
                + NumberFormat.getCurrencyInstance().format(getSalario()) + "]";
    }

}
