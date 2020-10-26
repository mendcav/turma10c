package br.com.ecommerce.implementacao;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.util.Magica;

public class ImplementarEcommerce2 {

	public static void main(String[] args) {
		Produto p = new Produto();
		p.setQtde(Magica.i("Qtde"));
		p.setValorCompra(Magica.f("Compra"));
		p.setValorVenda(Magica.f("Venda"));
	
		//getDesconto() ajustarValores() totalCompra() 
			
		System.out.println("Total de Compra: " + p.totalCompra());
		System.out.println("Total de Venda: " + p.totalVenda());
		System.out.println("Total venda 10%: " + p.getDesconto());
		System.out.println("Total venda X%: " + p.getDesconto(Magica.f("Porc")));
		p.ajustarValores(Magica.f("Valor a ser adicionado"));
		System.out.println(p.getValorCompra());
		System.out.println(p.getValorVenda());
		
	
	}
	

}

