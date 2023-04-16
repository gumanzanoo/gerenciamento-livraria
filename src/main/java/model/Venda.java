package model;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private Pedido pedido;
    private ArrayList<Pagamento> pagamentos;
    private double valorTotal;
    private String data;
    private StatusVenda statusVenda;

    public Venda() {
    }

    public Venda(Cliente cliente, Pedido pedido, ArrayList<Pagamento> pagamentos,
                 double valorTotal, String data, StatusVenda statusVenda) {
        this.cliente = cliente;
        this.pedido = pedido;
        this.pagamentos = pagamentos;
        this.valorTotal = valorTotal;
        this.data = data;
        this.statusVenda = statusVenda;
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

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<Pagamento> pagamentos) {
        if (pagamentos.size() > 2) {
            throw new IndexOutOfBoundsException("O número máximo de pagamentos permitidos é 2.");
        }
        this.pagamentos = pagamentos;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public StatusVenda getStatusVenda() { return statusVenda; }

    public void setStatusVenda(StatusVenda statusVenda) { this.statusVenda = statusVenda; }

    public double getValorTotal() { return valorTotal; }

    public void setValorTotal(ArrayList<ItemPedido> itensPedido) {
        double valorTotal = 0;
        for(ItemPedido itemPedido : itensPedido ) {
            valorTotal += itemPedido.getVlTotal();
        }
        this.valorTotal = valorTotal;
    }

    public void processaPagamento(ArrayList<Pagamento> pagamentos) {
        double valorTotal = this.valorTotal;
        double valorPago = 0.00;

        for (Pagamento pagamento: pagamentos) {
            valorPago += pagamento.getValor();
        }

        StatusPagamento statusPagamento;
        StatusVenda statusVenda;

        if (valorPago == valorTotal) {
            statusPagamento = StatusPagamento.APROVADO;
            statusVenda = StatusVenda.CONCLUIDA;

            for (Pagamento pagamento: pagamentos) {
                pagamento.setStatusPagamento(statusPagamento);
            }

        } else {
            statusPagamento = StatusPagamento.REJEITADO;
            statusVenda = StatusVenda.CANCELADA;

            for (Pagamento pagamento: pagamentos) {
                pagamento.setStatusPagamento(statusPagamento);
            }
        }

        this.statusVenda = statusVenda;
    }

    public void atribuirDesconto(Livro livro, double valorDesconto) {
        livro.setPrecoVenda(livro.getPrecoVenda() - valorDesconto);

    }

    public void atualizarEstoque(Livro livro, int qtd) {
        livro.setQtdEstoque(livro.getQtdEstoque() - qtd);
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + '\n' +
               "Pedido: " + pedido + '\n' +
               "Pagamento: " + pagamentos + '\n' +
               "ValorTotal: " + valorTotal + '\n' +
               "Status Venda: " + this.getStatusVenda() + '\n' +
               "Data: " + data + '\n';
    }
}