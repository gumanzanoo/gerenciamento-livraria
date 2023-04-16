package livraria;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String currentDateTime = LocalDate.now().toString();

        Endereco enderecoCliente = new Endereco();
        enderecoCliente.setNumero(3592);
        enderecoCliente.setRua("Almirante Barroso");
        enderecoCliente.setBairro("Centro");
        enderecoCliente.setCidade("Toledo");
        enderecoCliente.setEstado("Paraná");
        enderecoCliente.setPais("Brasil");
        enderecoCliente.setCep("93233-983");

        Endereco enderecoEditora = new Endereco();
        enderecoEditora.setNumero(182);
        enderecoEditora.setRua("Av. São Luís");
        enderecoEditora.setBairro("República");
        enderecoEditora.setCidade("São Paulo");
        enderecoEditora.setEstado("São Paulo");
        enderecoEditora.setPais("Brasil");
        enderecoEditora.setCep("01046-000");

        Cliente cliente = new Cliente();
        cliente.setNome("Gustavo Manzano");
        cliente.setEmail("gustavomanzanoluiz@hotmail.com");
        cliente.setTelefone("(45) 9.9831-7784");
        cliente.setCpf("078.668.897-11");
        cliente.setEndereco(enderecoCliente);

        GeneroLiterario generoLiterario = new GeneroLiterario();
        generoLiterario.setTitulo("Romance");
        generoLiterario.setDescricao("Romance é um gênero textual que"
                + " consiste em uma narrativa longa, escrita em prosa.");

        Autor autor = new Autor();
        autor.setNome("Machado De Assis");
        autor.setDtNascimento("21/06/1839");
        autor.setDtFalecimento("29/09/1908");
        autor.setNacionalidade("Brasileiro");

        Editora editora = new Editora();
        editora.setNome("Editora Cambaia");
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
        livro2.setTitulo("O Alienista");
        livro2.setNmPaginas(100);
        livro2.setQtdEstoque(12);
        livro2.setPrecoVenda(16.00);
        livro2.setDataLancamento("15/03/1882");
        livro2.setAutor(autor);
        livro2.setGeneroLiterario(generoLiterario);
        livro2.setEditora(editora);

        ItemPedido item1 = new ItemPedido();
        item1.setLivro(livro1);
        item1.setVlUn(livro1.getPrecoVenda());
        item1.setQtdItem(1);
        item1.atribuirDesconto(2);

        ItemPedido item2 = new ItemPedido();
        item2.setLivro(livro2);
        item2.setVlUn(livro2.getPrecoVenda());
        item2.setQtdItem(2);
        item2.atribuirDesconto(0);

        ArrayList<ItemPedido> itensPedido = new ArrayList<>();
        itensPedido.add(item1);
        itensPedido.add(item2);
        
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setItensPedido(itensPedido);
        pedido.setData(currentDateTime);

        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        pagamentoCartao.setNmCartao("2548-1154-1418-5485");
        pagamentoCartao.setNomeTitular("Pedro Augusto");
        pagamentoCartao.setDataValidade("09/03/2024");
        pagamentoCartao.setCodigoSeguranca(777);
        pagamentoCartao.setValor(22.00);
        pagamentoCartao.setData(currentDateTime);
        pagamentoCartao.setStatusPagamento(StatusPagamento.PENDENTE);

        PagamentoPix pagamentoPix = new PagamentoPix();
        pagamentoPix.setChavePix("64.322.292/0001-61");
        pagamentoPix.setTipoChavePix(TipoChavePix.CNPJ);
        pagamentoPix.setInstituicaoFinanceira("Itáu");
        pagamentoPix.setValor(22.00);
        pagamentoPix.setData(currentDateTime);
        pagamentoPix.setStatusPagamento(StatusPagamento.PENDENTE);

        ArrayList<Pagamento> pagamentos = new ArrayList<>();
        pagamentos.add(pagamentoCartao);
        pagamentos.add(pagamentoPix);

        Venda venda = new Venda();
        venda.setValorTotal(itensPedido);
        venda.setPedido(pedido);
        venda.setPagamentos(pagamentos);
        venda.setCliente(cliente);
        venda.setData(currentDateTime);
        venda.processaPagamento(pagamentos);
        venda.atualizarEstoque(livro1, 2);
        venda.atualizarEstoque(livro2, 1);

        System.out.println(venda.toString());
    }
}