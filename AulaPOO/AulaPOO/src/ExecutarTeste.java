

public class ExecutarTeste {

	public static void main(String[] args) {
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Froma��o Java");
		venda.setEnderecoEntrega("Entrega pelo e-mail");
		venda.setId(10L);
		venda.setNomeCliente("Fabiana Fernandes Apolin�rio");
		venda.setValorTotal(197.00);
		
		System.out.println("Descri��o Venda:" + venda.getDescricaoVenda());
	}
}
