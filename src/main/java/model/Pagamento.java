package model;

import java.util.Date;

public abstract class Pagamento {
    private double valor;
    private Date data;
    private StatusPagamento statusPagamento;

    public Pagamento() {}

    public Pagamento(double valor, Date data, StatusPagamento statusPagamento) {
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public void processarPagamento() {}

    @Override
    public String toString() {
        return "Pagamento{" +
                "valor=" + valor +
                ", data=" + data +
                ", statusPagamento=" + statusPagamento +
                '}';
    }
}
