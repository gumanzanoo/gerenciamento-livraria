package model;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Livro> livro;
    private Double valorTotal;
    private Date data;

    public Pedido() {
    }

    public Pedido(Cliente cliente, ArrayList<Livro> livro, Double valorTotal, Date data) {
        this.cliente = cliente;
        this.livro = livro;
        this.valorTotal = valorTotal;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Livro> getLivro() {
        return livro;
    }

    public void setLivro(ArrayList<Livro> livro) {
        this.livro = livro;
    }

    public Double getValorTotal() { return valorTotal; }

    public void setValorTotal(Double valorTotal) { this.valorTotal = valorTotal; }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", livro=" + livro +
                ", valorTotal=" + valorTotal +
                ", data=" + data +
                '}';
    }
}
