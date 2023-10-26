package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int numero;
    private Date data;
    private double valor;



    List<Item> itens;
    Vendedor  vendedor;

    public boolean manterPedido(int numero){
        return false;
    }

    public boolean manterItem(int codItem){
        return  false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Pedido(int numero, Date data, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.vendedor = vendedor;
        this.valor = valor;
        this.itens = new ArrayList<>();
    }
}
