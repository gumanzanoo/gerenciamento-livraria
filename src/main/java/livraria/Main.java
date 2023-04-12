package livraria;

import model.*;

public class Main {
    public static void main(String[] args) {


        Endereco enderecoCliente = new Endereco();
        enderecoCliente.setNumero(3592);
        enderecoCliente.setRua("Almirante Barroso");
        enderecoCliente.setBairro("Centro");
        enderecoCliente.setCidade("Toledo");
        enderecoCliente.setEstado("Paraná");
        enderecoCliente.setPais("Brasil");
        enderecoCliente.setCep("93233-983");

        Endereco enderecoEditora = new Endereco();
        enderecoCliente.setNumero(182);
        enderecoCliente.setRua("Av. São Luís");
        enderecoCliente.setBairro("República");
        enderecoCliente.setCidade("São Paulo");
        enderecoCliente.setEstado("São Paulo");
        enderecoCliente.setPais("Brasil");
        enderecoCliente.setCep("01046-000");

        Cliente cliente = new Cliente();
        cliente.setNome("Gustavo Manzano");
        cliente.setEmail("gustavomanzanoluiz@hotmail.com");
        cliente.setTelefone("(45) 9.9831-7784");
        cliente.setEndereco(enderecoCliente);

        GeneroLiterario generoLiterario = new GeneroLiterario();
        generoLiterario.setTitulo("Romance");
        generoLiterario.setDescricao("Romance é um gênero textual que consiste em uma narrativa longa, escrita em prosa.");

        Autor autor = new Autor();
        autor.setNome("Machado De Assis");
        autor.setDtNascimento("21/06/1839");
        autor.setDtFalecimento("29/09/1908");
        autor.setNacionalidade("Brasileiro");

        Editora editora = new Editora();
        editora.setRazaoSocial("Editora Cambaia");
        editora.setCnpj("19.868.501/0001-12");
        editora.setEndereco(enderecoEditora);

        Livro livro = new Livro();
        livro.setTitulo("Memórias póstumas de Brás Cubas");
        livro.setNmPaginas(320);
        livro.setQtdEstoque(22);
        livro.setPrecoVenda(14.00);
        livro.setDataLancamento("01/01/1881");
        livro.setAutor(autor);
        livro.setGeneroLiterario(generoLiterario);
        livro.setEditora(editora);
    }
}