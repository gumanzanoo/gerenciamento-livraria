package livraria;

import model.acervo.Endereco;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JPanel painelEndereco = new JPanel(new GridLayout(0, 2));
        painelEndereco.add(new JLabel("Número:"));
        painelEndereco.add(new JTextField(10));
        painelEndereco.add(new JLabel("Bairro:"));
        painelEndereco.add(new JTextField(10));
        painelEndereco.add(new JLabel("Cidade:"));
        painelEndereco.add(new JTextField(10));
        painelEndereco.add(new JLabel("Estado:"));
        painelEndereco.add(new JTextField(10));
        painelEndereco.add(new JLabel("Pais:"));
        painelEndereco.add(new JTextField(10));
        painelEndereco.add(new JLabel("CEP:"));
        painelEndereco.add(new JTextField(10));

        int resultado = JOptionPane.showConfirmDialog(
                null, painelEndereco, "Preencha o Endereço", JOptionPane.OK_CANCEL_OPTION
        );

        if (resultado == JOptionPane.OK_OPTION) {
            JTextField numero = (JTextField)painelEndereco.getComponent(1);
            JTextField bairro = (JTextField)painelEndereco.getComponent(3);
            JTextField cidade = (JTextField)painelEndereco.getComponent(5);
            JTextField estado = (JTextField)painelEndereco.getComponent(7);
            JTextField pais = (JTextField)painelEndereco.getComponent(9);
            JTextField cep = (JTextField)painelEndereco.getComponent(11);

            Endereco endereco = new Endereco();
            endereco.setNumero(Integer.parseInt(numero.getText()));
            endereco.setBairro(bairro.getText());
            endereco.setCidade(cidade.getText());
            endereco.setEstado(estado.getText());
            endereco.setPais(pais.getText());
            endereco.setCep(cep.getText());

            JOptionPane.showMessageDialog(null, endereco.toString());
        }
    }
}