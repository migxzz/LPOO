package model;

public class ContaPoupancaSalario extends ContaPoupanca{
    public  void saca(double valor){
        if((this.saldo +1000) >= valor){
            this.saldo += valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
}
