package livraria;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

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
        cliente.setCpf("078.668.897-11");
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

        Livro livro1 = new Livro();
        livro1.setTitulo("Memórias póstumas de Brás Cubas");
        livro1.setNmPaginas(320);
        livro1.setQtdEstoque(22);
        livro1.setPrecoVenda(14.00);
        livro1.setDataLancamento("01/01/1881");
        livro1.setAutor(autor);
        livro1.setGeneroLiterario(generoLiterario);
        livro1.setEditora(editora);

        Livro livro2 = new Livro();
        livro2.setTitulo("Dom Casmurro");
        livro2.setNmPaginas(210);
        livro2.setQtdEstoque(9);
        livro2.setPrecoVenda(12.00);
        livro2.setDataLancamento("01/01/1899");
        livro2.setAutor(autor);
        livro2.setGeneroLiterario(generoLiterario);
        livro2.setEditora(editora);

        Livro livro3 = new Livro();
        livro1.setTitulo("O Alienista");
        livro1.setNmPaginas(100);
        livro1.setQtdEstoque(12);
        livro1.setPrecoVenda(16.00);
        livro1.setDataLancamento("15/03/1882");
        livro1.setAutor(autor);
        livro1.setGeneroLiterario(generoLiterario);
        livro1.setEditora(editora);

        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
        
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setLivro(livros);
        pedido.setData(LocalDate.now().toString());
        pedido.setValorTotal(livros);

        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        pagamentoCartao.setNmCartao("2548-1154-1418-5485");
        pagamentoCartao.setNomeTitular("Pedro Augusto");
        pagamentoCartao.setDataValidade("09/03/2024");
        pagamentoCartao.setCodigoSeguranca(777);
        pagamentoCartao.setValor(42.00);
        pagamentoCartao.setData(LocalDate.now().toString());
        pagamentoCartao.setStatusPagamento(StatusPagamento.PENDENTE);

        PagamentoPix pagamentoPix = new PagamentoPix();
        pagamentoPix.setChavePix("64.322.292/0001-61");
        pagamentoPix.setTipoChavePix(TipoChavePix.CNPJ);
        pagamentoPix.setInstituicaoFinanceira("Itáu");
        pagamentoPix.setValor(42.00);
        pagamentoPix.setData(LocalDate.now().toString());
        pagamentoPix.setStatusPagamento(StatusPagamento.PENDENTE);

        ArrayList<Pagamento> pagamentos = new ArrayList<>();
        pagamentos.add(pagamentoCartao);
        pagamentos.add(pagamentoPix);
    }
}