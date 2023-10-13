package model;

public class Cliente implements Associado{
    private String nome;

    private double lucro;

    int quantidadeDeCotas;

    public Cliente(String nome, int quantidadeDeCotas) {
        this.nome = nome;
        this.quantidadeDeCotas = quantidadeDeCotas;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public double lucros(int quantidadeDeCotas, double valorCota) {
        this.lucro = quantidadeDeCotas * valorCota;
        return this.lucro;
    }

    public int getQuantidadeDeCotas(){
        return this.quantidadeDeCotas;
    }

    @Override
    public String toString() {
        return "\nCliente " +
                "\nnome = " + nome +
                "\nQuantidade de Cotas = " + quantidadeDeCotas +
                "\nLucro = " + lucro;
    }
}
