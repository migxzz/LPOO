package controller;

import exceptions.MinhaExcecao;

public class TratamentoExcecoes {
    public static void main(String[] args) {

        private static void mythrowException(){
            try {
                throw new MinhaExcecao("Minha mensagem de exceção");
            } catch (MinhaExcecao e) {
                throw new RuntimeException(e);
            }
        }
    }
}

