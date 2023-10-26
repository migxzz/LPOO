package model;

public class Item {
    private int codItem;
    private double desconto;
    private int quantidade;

    private Produto produto;
    private Pedido pedido;

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Item(int codItem, int quantidade, Produto produto, Pedido pedido) {
        this.codItem = codItem;
        this.quantidade = quantidade;
        this.produto = produto;
        this.pedido = pedido;
    }

    public double calcularTotal() {
        return quantidade * produto.getPreco();
    }
}
