package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Livro {
    private String titulo;
    private Integer nmPaginas;
    private Integer qtdEstoque;
    private double precoVenda;
    private String dataLancamento;
    private Autor autor;
    private Editora editora;
    private GeneroLiterario generoLiterario;

    public Livro() {}

    public Livro(String titulo, Integer nmPaginas, Integer qtdEstoque, double precoVenda,
                 String dataLancamento, Autor autor, Editora editora, GeneroLiterario generoLiterario) {
        this.titulo = titulo;
        this.nmPaginas = nmPaginas;
        this.qtdEstoque = qtdEstoque;
        this.precoVenda = precoVenda;
        this.dataLancamento = dataLancamento;
        this.autor = autor;
        this.editora = editora;
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

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) { this.autor = autor; }

    public Editora getEditora() { return editora; }

    public void setEditora(Editora editora) { this.editora = editora; }

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
                ", dataLancamento='" + dataLancamento + '\'' +
                ", autor=" + autor +
                ", editora=" + editora +
                ", generoLiterario=" + generoLiterario +
                '}';
    }
}
