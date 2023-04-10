package model;

import java.time.LocalDate;
import java.util.Date;

public class Livro {
    private String titulo;
    private Integer nmPaginas;
    private Integer qtdEstoque;
    private double precoVenda;
    private Date dataLancamento;
    private Autor autor;
    private GeneroLiterario generoLiterario;

    public Livro() {}

    public Livro(String titulo, Integer nmPaginas, Integer qtdEstoque, double precoVenda, Date dataLancamento, Autor autor, GeneroLiterario generoLiterario) {
        this.titulo = titulo;
        this.nmPaginas = nmPaginas;
        this.qtdEstoque = qtdEstoque;
        this.precoVenda = precoVenda;
        this.dataLancamento = dataLancamento;
        this.autor = autor;
        this.generoLiterario = generoLiterario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNmPaginas() {
        return nmPaginas;
    }

    public void setNmPaginas(Integer nmPaginas) {
        this.nmPaginas = nmPaginas;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public GeneroLiterario getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(GeneroLiterario generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", nmPaginas=" + nmPaginas +
                ", qtdEstoque=" + qtdEstoque +
                ", precoVenda=" + precoVenda +
                ", dataLancamento=" + dataLancamento +
                ", autor=" + autor +
                ", generoLiterario=" + generoLiterario +
                '}';
    }
}
