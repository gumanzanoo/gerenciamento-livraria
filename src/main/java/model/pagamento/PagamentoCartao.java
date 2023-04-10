package model.pagamento;

import java.util.Date;

public class PagamentoCartao extends Pagamento {
    private String nmCartao;
    private String nomeTitular;
    private Date dataValidade;
    private String codigoSeguranca;

    public PagamentoCartao(double valor, Date data, int numeroPedido, StatusPagamento status, String nmCartao, String nomeTitular, Date dataValidade, String codigoSeguranca) {
        super(valor, data, status);
        this.nmCartao = nmCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getNmCartao() {
        return nmCartao;
    }

    public void setNmCartao(String nmCartao) {
        this.nmCartao = nmCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public String toString() {
        return "PagamentoCartao{" +
                "nmCartao='" + nmCartao + '\'' +
                ", nomeTitular='" + nomeTitular + '\'' +
                ", dataValidade=" + dataValidade +
                ", codigoSeguranca='" + codigoSeguranca + '\'' +
                '}';
    }
}
