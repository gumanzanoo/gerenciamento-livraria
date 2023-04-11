package domain.cadastro;

import model.Cliente;
import model.Endereco;

import javax.swing.*;
import java.awt.*;

public class CadastroCliente {
    public static Cliente Cadastro(Endereco endereco) {
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
}
