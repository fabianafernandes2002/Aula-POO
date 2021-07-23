package poo;

public class ExecutarTeste {

	public static void main(String[] args) {

		VendaPoo venda = new VendaPoo();
		venda.setDescricaoVenda("Venda Curso Fromação Java");
		venda.setEnderecoEntrega("Entrega pelo e-mail");
		venda.setId(10L);
		venda.setNomeCliente("Fabiana Fernandes Apolinário");
		venda.setValorTotal(197.00);

		System.out.println("Descrição Venda:" + venda.getDescricaoVenda());
	}

}
