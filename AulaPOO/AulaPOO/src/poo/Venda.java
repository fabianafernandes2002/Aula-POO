package poo;

import java.util.ArrayList;
import java.util.List;


public class Venda {
	
	private String id;
	private String descricaoVenda;
	private String nomeCliente;
	private String enderecoEntrega;
	private Double valorTotal;
	
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	public double totalVenda() {
		double total = 0.0;
		for (Produto produto : listaProdutos) {
			total += produto.getValor().doubleValue();
		}
		return total;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String ID) {
		this.id = id;
	}
	public String getDescricaoVenda() {
		return descricaoVenda;
	}
	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	@Override
	public String toString() {
		return "VendaPoo [id=" + id + ", descricaoVenda=" + descricaoVenda + ", nomeCliente=" + nomeCliente
				+ ", enderecoEntrega=" + enderecoEntrega + ", valorTotal=" + valorTotal + ", listaProdutos="
				+ listaProdutos + ", getId()=" + getId() + ", getDescricaoVenda()=" + getDescricaoVenda()
				+ ", getNomeCliente()=" + getNomeCliente() + ", getEnderecoEntrega()=" + getEnderecoEntrega()
				+ ", getValorTotal()=" + getValorTotal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}

