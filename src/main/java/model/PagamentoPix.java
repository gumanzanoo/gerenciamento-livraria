package model;

import java.util.Date;

public class PagamentoPix extends Pagamento {
    private String chavePix;
    private TipoChavePix tipoChavePix;
    private String instituicaoFinanceira;

    public PagamentoPix() {}

    public PagamentoPix(double valor, String data, StatusPagamento statusPagamento, String chavePix, TipoChavePix tipoChavePix, String instituicaoFinanceira) {
        super(valor, data, statusPagamento);
        this.chavePix = chavePix;
        this.tipoChavePix = tipoChavePix;
        this.instituicaoFinanceira = instituicaoFinanceira;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public TipoChavePix getTipoChavePix() {
        return tipoChavePix;
    }

    public void setTipoChavePix(TipoChavePix tipoChavePix) {
        this.tipoChavePix = tipoChavePix;
    }

    public String getInstituicaoFinanceira() {
        return instituicaoFinanceira;
    }

    public void setInstituicaoFinanceira(String instituicaoFinanceira) {
        this.instituicaoFinanceira = instituicaoFinanceira;
    }

    @Override
    public void processarPagamento() {
        super.processarPagamento();
    }

    @Override
    public String toString() {
        return "PagamentoPix{" +
                "chavePix='" + chavePix + '\'' +
                ", tipoChavePix=" + tipoChavePix +
                ", instituicaoFinanceira='" + instituicaoFinanceira + '\'' +
                '}';
    }
}

