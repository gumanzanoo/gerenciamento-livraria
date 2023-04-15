package model;


public class PagamentoCartao extends Pagamento {
    private String nmCartao;
    private String nomeTitular;
    private String dataValidade;
    private Integer codigoSeguranca;
    
    public PagamentoCartao(){
        
    }

    public PagamentoCartao(double valor, String data, StatusPagamento status, String nmCartao, String nomeTitular, String dataValidade, Integer codigoSeguranca) {
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

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Integer getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(Integer codigoSeguranca) {
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
