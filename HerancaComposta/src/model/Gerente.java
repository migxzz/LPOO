package model;

//Como a Questão 2 especializa os Gerentes, esta classe deveria ser marcada com abstract.
//Isso não foi feito para poder manter a resposta da Questão 1.
public class Gerente extends Funcionario implements Investidor {

    private String ticker;
    private int quantidade;

    private String nome;
    private String sobrenome;


    public Gerente(String nome, String sobrenome, String ticker, int quantidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ticker = ticker;
        this.quantidade = quantidade;
    }

    //Na Questão 2 poderia ser marcado como abstract, deixando para as classes especializadas resolver esse cálculo
    @Override
    public double getBonus(){
        return getSalario() * 0.20;
    }

    @Override
    public String getTicker() {
        return this.ticker;
    }

    @Override
    public void setTicker(String ticket) {

    }

    @Override
    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {

    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "ticker='" + ticker + '\'' +
                ", quantidade=" + quantidade +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                "} " + super.toString();
    }
}