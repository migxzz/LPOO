package model;

import java.text.NumberFormat;

public class DevJunior extends Desenvolvedor {

    public DevJunior(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public String toString() {
        return "\nDesenvolvedorJunior [Bonus= "
                + NumberFormat.getCurrencyInstance().format(getBonus())
                + ", Nome= " + getNome()
                + ", Salario= "
                + NumberFormat.getCurrencyInstance().format(getSalario()) + "]";
    }
    @Override
    public double getBonus() {
        return getSalario() * 0.05;
    }



}