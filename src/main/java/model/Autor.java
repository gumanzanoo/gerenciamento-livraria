package model;

import java.time.LocalDate;
import java.util.Date;

public class Autor {
    private String nome;
    private String sobrenome;
    private Date dtNascimento;
    private Date dtFalecimento;
    private String nacionalidade;
    private GeneroLiterario generoLiterario;

    public Autor () {}

    public Autor(String nome, String sobrenome, Date dtNascimento, Date dtFalecimento, String nacionalidade, GeneroLiterario generoLiterario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Date getDtFalecimento() {
        return dtFalecimento;
    }

    public void setDtFalecimento(Date dtFalecimento) {
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
                ", sobrenome='" + sobrenome + '\'' +
                ", dtNascimento=" + dtNascimento +
                ", dtFalecimento=" + dtFalecimento +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", generoLiterario=" + generoLiterario +
                '}';
    }
}
