package model;

public class Cliente implements Investidor{

    private String ticker;
    private int quantidade;

    public Cliente(String nome, String sobrenome, String ticker, int quantidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ticker = ticker;
        this.quantidade = quantidade;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "ticker='" + ticker + '\'' +
                ", quantidade=" + quantidade +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    private String nome;
    private String sobrenome;
    @Override
    public String getTicker() {
        return this.ticker;
    }

    @Override
    public void setTicker(String ticket) {
        this.ticker = ticker;

    }

    @Override
    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {

    }
}
