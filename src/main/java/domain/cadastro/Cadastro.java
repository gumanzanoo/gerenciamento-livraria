package domain.cadastro;

import model.*;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Cadastro {
    public static Cliente Cliente() {
        Endereco endereco = Endereco();

        JPanel painel = new JPanel(new GridLayout(0, 2));
        painel.add(new JLabel("Nome: "));
        painel.add(new JTextField(10));
        painel.add(new JLabel("Sobrenome: "));
        painel.add(new JTextField(10));
        painel.add(new JLabel("Email: "));
        painel.add(new JTextField(10));
        painel.add(new JLabel("Telefone: "));
        painel.add(new JTextField(10));

        int resultado = JOptionPane.showConfirmDialog(
                null, painel, "Preencha os dados do cliente", JOptionPane.OK_CANCEL_OPTION
        );

        if (resultado == JOptionPane.OK_OPTION) {
            JTextField nome = (JTextField)painel.getComponent(1);
            JTextField sobrenome = (JTextField)painel.getComponent(3);
            JTextField email = (JTextField)painel.getComponent(5);
            JTextField telefone = (JTextField)painel.getComponent(7);

            Cliente cliente = new Cliente();
            cliente.setNome(nome.getText());
            cliente.setSobrenome(sobrenome.getText());
            cliente.setEmail(email.getText());
            cliente.setTelefone(telefone.getText());
            cliente.setEndereco(endereco);

            return cliente;
        }
        return null;
    }

    public static Endereco Endereco() {
        JPanel painel = new JPanel(new GridLayout(0, 2));
        painel.add(new JLabel("Número: "));
        painel.add(new JTextField(10));
        painel.add(new JLabel("Bairro: "));
        painel.add(new JTextField(10));
        painel.add(new JLabel("Cidade: "));
        painel.add(new JTextField(10));
        painel.add(new JLabel("Estado: "));
        painel.add(new JTextField(10));
        painel.add(new JLabel("Pais: "));
        painel.add(new JTextField(10));
        painel.add(new JLabel("CEP: "));
        painel.add(new JTextField(10));

        int resultado = JOptionPane.showConfirmDialog(
                null, painel, "Preencha Endereço", JOptionPane.OK_CANCEL_OPTION
        );

        if (resultado == JOptionPane.OK_OPTION) {
            JTextField numero = (JTextField)painel.getComponent(1);
            JTextField bairro = (JTextField)painel.getComponent(3);
            JTextField cidade = (JTextField)painel.getComponent(5);
            JTextField estado = (JTextField)painel.getComponent(7);
            JTextField pais = (JTextField)painel.getComponent(9);
            JTextField cep = (JTextField)painel.getComponent(11);

            Endereco endereco = new Endereco();
            endereco.setNumero(Integer.parseInt(numero.getText()));
            endereco.setBairro(bairro.getText());
            endereco.setCidade(cidade.getText());
            endereco.setEstado(estado.getText());
            endereco.setPais(pais.getText());
            endereco.setCep(cep.getText());

            return endereco;
        }
        return null;
    }

    public Livro Livro() {
        private String titulo;
        private Integer nmPaginas;
        private Integer qtdEstoque;
        private double precoVenda;
        private Date dataLancamento;
        private Autor autor;
        private GeneroLiterario generoLiterario;


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
            JTextField numero = (JTextField)painel.getComponent(1);
            JTextField bairro = (JTextField)painel.getComponent(3);
            JTextField cidade = (JTextField)painel.getComponent(5);
            JTextField estado = (JTextField)painel.getComponent(7);
            JTextField pais = (JTextField)painel.getComponent(9);
            JTextField cep = (JTextField)painel.getComponent(11);

            Endereco endereco = new Endereco();
            endereco.setNumero(Integer.parseInt(numero.getText()));
            endereco.setBairro(bairro.getText());
            endereco.setCidade(cidade.getText());
            endereco.setEstado(estado.getText());
            endereco.setPais(pais.getText());
            endereco.setCep(cep.getText());

            return endereco;
        }
        return null;
    }
}
