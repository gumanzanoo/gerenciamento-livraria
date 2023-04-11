package model;

import model.Cliente;
import model.Livro;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Livro> livro;
    private Date data;

    public Pedido() {
    }

    public Pedido(Cliente cliente, ArrayList<Livro> livro, Date data) {
        this.cliente = cliente;
        this.livro = livro;
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
                ", data=" + data +
                '}';
    }
}
