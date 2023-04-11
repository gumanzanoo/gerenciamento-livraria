package domain.cadastro;

import model.Endereco;
import javax.swing.*;
import java.awt.*;

public class CadastroEndereco {
    public static Endereco Cadastro() {
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
}
