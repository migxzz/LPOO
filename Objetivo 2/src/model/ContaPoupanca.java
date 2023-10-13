package model;

public class ContaPoupanca extends Conta{
    String idconta;

    public ContaPoupanca(String idconta) {
        this.idconta = idconta;
    }

    @Override
    public String toString() {
        return "\nConta Poupanca" +
                "\nidconta ='" + idconta + '\'' +
                "\nsaldo =" + saldo;
    }
}
