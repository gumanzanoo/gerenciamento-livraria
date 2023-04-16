package model;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Livro> livros;
    private String data;

    public Pedido() {
    }

    public Pedido(Cliente cliente, ArrayList<Livro> livros, String data) {
        this.cliente = cliente;
        this.livros = livros;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Livro> getLivro() {
        return livros;
    }

    public void setLivro(ArrayList<Livro> livro) {
        this.livros = livro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return '\n' + "Cliente: " + cliente.getNome() + '\n' +
               "Livros: " + livros + '\n' +
               "Data: " + data + '\n';
    }
}
