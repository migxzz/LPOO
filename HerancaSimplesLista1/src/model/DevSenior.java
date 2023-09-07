package model;
import java.text.NumberFormat;

public class DevSenior extends Desenvolvedor {
    public DevSenior(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorSenior [Bonus= "
                + NumberFormat.getCurrencyInstance().format(getBonus())
                + ", Nome= " + getNome()
                + ", Salario= "
                + NumberFormat.getCurrencyInstance().format(getSalario()) + "]";
    }

    public double getBonus(){
        return this.getSalario() *0.1;
    }
}
