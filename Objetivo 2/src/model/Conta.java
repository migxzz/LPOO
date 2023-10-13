package model;

public abstract class Conta {
    protected double saldo;

    public int quantidadeDeCotas;

    public void deposita (double valor){
        saldo += valor;
    }
    
    public void saca ( double valor){
        if ( valor <= saldo){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void atualiza(double taxa) {
    saldo += saldo * taxa;
    }

    public int getQuantidadeDeCotas(){
        return this.quantidadeDeCotas;
    }

    public double getSaldo(){
        return saldo;
    }
}
