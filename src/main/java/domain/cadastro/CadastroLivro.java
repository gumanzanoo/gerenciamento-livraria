package domain.cadastro;

import model.Autor;
import model.GeneroLiterario;
import model.Livro;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CadastroLivro {
    public Livro Cadastro(Autor autor, GeneroLiterario generoLiterario) {
        JPanel painel = new JPanel(new GridLayout(0, 2));
        painel.add(new JLabel("Título: "));
        painel.add(new JTextField(10));
        painel.add(new JLabel("Número de páginas: "));
        painel.add(new JTextField(10));
        painel.add(new JLabel("Quantidade em estoque: "));
        painel.add(new JTextField(10));
        painel.add(new JLabel("Preço de venda: "));
        painel.add(new JTextField(10));
        painel.add(new JLabel("Data de lançamento: "));
        painel.add(new JTextField(10));

        int resultado = JOptionPane.showConfirmDialog(
                null, painel, "Preencha Endereço", JOptionPane.OK_CANCEL_OPTION
        );

        if (resultado == JOptionPane.OK_OPTION) {
            JTextField titulo = (JTextField)painel.getComponent(1);
            JTextField nmPaginas = (JTextField)painel.getComponent(3);
            JTextField qtdEstoque = (JTextField)painel.getComponent(5);
            JTextField precoVenda = (JTextField)painel.getComponent(7);
            JTextField dataLancamento = (JTextField)painel.getComponent(9);

            LocalDate data = LocalDate.parse(dataLancamento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            Livro livro = new Livro();
            livro.setTitulo(titulo.getText());
            livro.setNmPaginas(Integer.valueOf(nmPaginas.getText()));
            livro.setQtdEstoque(Integer.valueOf(qtdEstoque.getText()));
            livro.setPrecoVenda(Double.parseDouble(precoVenda.getText()));
            livro.setDataLancamento(data);
            livro.setAutor(autor);
            livro.setGeneroLiterario(generoLiterario);

            return livro;
        }
        return null;
    }
}
