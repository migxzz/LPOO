package controller;

import model.*;

public class ContaController {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        ContaCorrente cc1 = new ContaCorrente();

        ContaPoupanca cp1 = new ContaPoupanca();
        cp1.deposita(1000.00);
        cp1.saca(2000.00);
        System.out.println(cp1.getSaldo());

        Conta ccj1 = new ContaConjunta();

        ContaPoupancaSalario cps1 = new ContaPoupancaSalario();

    }

}
