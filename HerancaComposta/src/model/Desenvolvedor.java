package model;

//Como a Questão 2 especializa os Desenvolvedores, esta classe deveria ser marcada com abstract.
//Isso não foi feito para poder manter a resposta da Questão 1.
public class Desenvolvedor extends Funcionario {

    public Desenvolvedor() {
        super();
    }

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus(){
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor{Nome=" + super.getNome() + " Salário=" + super.getSalario() + "}";
    }

}