package livraria;

import model.Cliente;
import model.Endereco;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setBairro(JOptionPane.showInputDialog(null, "Bairro"));
        endereco.setCidade(JOptionPane.showInputDialog(null, "Cidade"));
        endereco.setEstado(JOptionPane.showInputDialog(null, "Estado"));
//        endereco.setNumero(JOptionPane.showInputDialog(null, "Numero"));
        endereco.setCep(JOptionPane.showInputDialog(null, "CEP"));

        JOptionPane.showMessageDialog(null, endereco);
//        Cliente cliente = new Cliente();
//        cliente.setNome("Gustavo");
//        cliente.setSobrenome("Manzano");
//        cliente.setEmail("gustavomanzanoluiz@hotmail.com");
//        cliente.setEndereco(endereco);
    }
}