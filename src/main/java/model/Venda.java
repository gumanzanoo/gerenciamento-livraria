package model;

import java.sql.Array;
import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private Pedido pedido;
    private ArrayList<Pagamento> pagamento;
    private String data;

    public Venda() {
    }

    public Venda(Cliente cliente, Pedido pedido, ArrayList<Pagamento> pagamento, String data) {
        this.cliente = cliente;
        this.pedido = pedido;
        this.pagamento = pagamento;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public ArrayList<Pagamento> getPagamento() {
        return pagamento;
    }

    public void setPagamento(ArrayList<Pagamento> pagamento) {
        this.pagamento = pagamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + '\n' +
               "Pedido: " + pedido + '\n' +
               "Pagamento: " + pagamento + '\n' +
               "Data: " + data + '\n';
    }
}