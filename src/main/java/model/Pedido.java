package model;

import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private ArrayList<ItemPedido> itensPedido;
    private String data;

    public Pedido() {
    }

    public Pedido(Cliente cliente, ArrayList<ItemPedido> itensPedido, String data) {
        this.cliente = cliente;
        this.itensPedido = itensPedido;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(ArrayList<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
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
               "Livros: " + itensPedido + '\n' +
               "Data: " + data + '\n';
    }
}
