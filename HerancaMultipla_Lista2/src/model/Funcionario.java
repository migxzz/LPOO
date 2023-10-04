package model;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){

    }

    public double getSalario() {
        return this.salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus(){

        return 0;
    }

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return
                "\nnome = '" + nome + '\'' +
                "\nsalario = " + salario;
    }
}
