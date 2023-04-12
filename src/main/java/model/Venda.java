package model;

public class Venda {
    private Cliente cliente;
    private Pedido pedido;
    private Pagamento pagamento;
    private String data;

    public Venda() {
    }

    public Venda(Cliente cliente, Pedido pedido, Pagamento pagamento, String data) {
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

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
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
        return "Venda{" +
                "cliente=" + cliente +
                ", pedido=" + pedido +
                ", pagamento=" + pagamento +
                ", data='" + data + '\'' +
                '}';
    }
}
