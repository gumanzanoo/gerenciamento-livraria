package model;

import java.util.Date;

public abstract class Pagamento {
    private double valor;
    private String data;
    private StatusPagamento statusPagamento;

    public Pagamento() {}

    public Pagamento(double valor, String data, StatusPagamento statusPagamento) {
        this.valor = valor;
        this.data = data;
        this.statusPagamento = statusPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
    
    @Override
    public String toString() {
        return "Valor: " + valor + '\n' +
               "Data: " + data + '\n' +
               '\n' + "Status Pagamento: " + statusPagamento + '\n';
    }
}
