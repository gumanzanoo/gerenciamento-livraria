package model;

public class Endereco {
    private int numero;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;

    public Endereco() {}

    public Endereco(String rua, int numero, String bairro, String cidade, String estado, String pais, String cep) {
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public String getRua() { return rua; }

    public void setRua(String rua) { this.rua = rua; }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Numero: " + getNumero() + '\n' +
               "Bairro: " + getBairro() + '\n' +
               "Cidade: " + getCidade() + '\n' +
               "Estado: " + getEstado() + '\n' +
               "Pais: " + getPais() + '\n' +
               "CEP: " + getCep() + '\n';
    }
}
