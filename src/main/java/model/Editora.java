package model;

public class Editora {
    private String nome;
    private String cnpj;
    private Endereco endereco;

    public Editora () {}

    public Editora(String nome, String cnpj, Endereco endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public String getRazaoSocial() {
        return nome;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.nome = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Editora{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
