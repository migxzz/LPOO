package model;

public class Cliente implements Investidor{

    private String nome;
    private String sobrenome;

    private String ticker;
    private int quantidade;

    public Cliente() {
    }

    public Cliente(String nome, String sobrenome, String ticker, int quantidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ticker = ticker;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return
                "\nnome = '" + nome + '\'' +
                "\nsobrenome = '" + sobrenome + '\'' +
                "\nticker = '" + ticker + '\'' +
                "\nquantidade = '" + quantidade;
    }

    @Override
    public String getTicker() {
        return this.ticker;
    }

    @Override
    public void setTicker(String ticker) {

    }

    @Override
    public int getQuantidade() {
        return 0;
    }

    @Override
    public void setQuantidade(int quantidade) {

    }
}
