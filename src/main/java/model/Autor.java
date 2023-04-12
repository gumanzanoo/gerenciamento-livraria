package model;

import java.util.Date;

public class Autor {
    private String nome;
    private String dtNascimento;
    private String dtFalecimento;
    private String nacionalidade;
    private GeneroLiterario generoLiterario;

    public Autor () {}

    public Autor(String nome, String dtNascimento, String dtFalecimento, String nacionalidade, GeneroLiterario generoLiterario) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.dtFalecimento = dtFalecimento;
        this.nacionalidade = nacionalidade;
        this.generoLiterario = generoLiterario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getDtFalecimento() {
        return dtFalecimento;
    }

    public void setDtFalecimento(String dtFalecimento) {
        this.dtFalecimento = dtFalecimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public GeneroLiterario getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(GeneroLiterario generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", dtNascimento=" + dtNascimento +
                ", dtFalecimento=" + dtFalecimento +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", generoLiterario=" + generoLiterario +
                '}';
    }
}
