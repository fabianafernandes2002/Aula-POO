package poo;

import java.math.BigDecimal;

import poo.Produto;

public class ExecutarTeste {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.setId("1");
		produto1.setNome("M�dulo Orienta��o Objeto");
		produto1.setValor (Double.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setId("2");
		produto2.setNome("M�dulo Spring Boot API REST");
		produto2.setValor (Double.valueOf(300));
		
		Produto produto3 = new Produto();
		produto3.setId("3");
		produto3.setNome("Java Full Stack");
		produto3.setValor (Double.valueOf(500));
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Curso Forma��o Java");
		venda.setEnderecoEntrega("Entrega pelo e-mail");
		venda.setId ("10");
		venda.setNomeCliente("Fabiana Fernandes Apolin�rio");
		venda.setValorTotal (Double.valueOf(197));

		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);/*N�o posso fazer valida��es*/
		/*venda.addProduto(produto3); Posso fazer valida��es antes de adicionar na lista*/
		venda.getListaProdutos().add(produto3);
		
		
		System.out.println("Descri��o da venda:" + venda.getDescricaoVenda() + "e o total" + venda.totalVenda());
		
	}

}
