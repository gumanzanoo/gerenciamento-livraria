package model;

public class ItemPedido {
    private Livro livro;
    private int qtdItem;
    private double vlUn;
    private double vlDesconto;
    private double vlTotal;

    public ItemPedido() {
    }

    public ItemPedido(Livro livro, double vlUn, double vlDesconto, double vlTotal) {
        this.livro = livro;
        this.vlUn = vlUn;
        this.vlDesconto = vlDesconto;
        this.vlTotal = vlTotal;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public double getVlUn() {
        return vlUn;
    }

    public void setVlUn(double vlUn) {
        this.vlUn = vlUn;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(double vlTotal) {
        this.vlTotal = vlTotal;
    }

    public void atribuirDesconto(double desconto) {
        this.vlTotal = (this.vlUn - desconto * this.qtdItem);
    }

    @Override
    public String toString() {
        return "Livro: " + livro + '\n' +
               "Quantidade: " + qtdItem + '\n' +
               "Valor Unitário: " + vlUn + '\n' +
               "Valor Desconto: " + vlDesconto + '\n' +
               "Valor Total: " + vlTotal  + '\n';
    }
}
