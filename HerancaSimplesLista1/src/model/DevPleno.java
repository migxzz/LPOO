
package model;
import java.text.NumberFormat;

public class DevPleno extends Desenvolvedor{
    public DevPleno(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorPleno [Bonus= "
                + NumberFormat.getCurrencyInstance().format(getBonus())
                + ", Nome= " + getNome()
                + ", Salario= "
                + NumberFormat.getCurrencyInstance().format(getSalario()) + "]";
    }

    public double getBonus(){
        return this.getSalario() *0.05;
    }
}
