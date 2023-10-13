package model;

public class ContaCorrente extends Conta implements Associado{
     String idContaCorrente;
     private double lucro;

     private String nome;
     int quantidadeDeCotas;

    public ContaCorrente(String idContaCorrente, String nome, int quantidadeDeCotas) {
        this.idContaCorrente = idContaCorrente;
        this.nome = nome;
        this.quantidadeDeCotas = quantidadeDeCotas;
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
        return "\nAssociado " +
                "\nIDConta = " + idContaCorrente +
                "\nnome = " + nome +
                "\nQuantidade de Cotas = " + quantidadeDeCotas +
                "\nsaldo = " + getSaldo() +
                "\nLucro = " + lucro;
    }
}
