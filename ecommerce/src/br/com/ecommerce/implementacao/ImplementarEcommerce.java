package br.com.ecommerce.implementacao;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.util.Magica;

public class ImplementarEcommerce {

	public static void main(String[] args) {

		Venda venda = new Venda (
				Magica.i("Nota Fiscal"),
				Magica.f("Total: "),
				Magica.f("Desconto: "),
				Magica.s("Data"),
				new Cliente(
						Magica.i("ID: "),
						Magica.s("Nome: "),
						Magica.s("Fone: "),
						new Endereco(
								Magica.s("Logradouro"),
								Magica.s("Numero"),
								Magica.s("Complemento"),
								Magica.s("Bairro"),
								Magica.s("Cidade"),
								Magica.s("Estado"),
								Magica.s("CEP")
								)
						),
				new Produto(
						Magica.i("ID"),
						Magica.s("Descrição"),
						Magica.f("Valor Venda"),
						Magica.f("Valor Compra"),
						Magica.i("Qtde")
						)
				);
	
		System.out.println(venda.getNotaFiscal());
		System.out.println(venda.getCliente().getNome());
		System.out.println(venda.getCliente().getEndereco().getEstado());
		System.out.println(venda.getProduto().getDescricao());
		System.out.println(venda.getProduto().getValorVenda());
		System.out.println(venda.getProduto().getValorCompra());
		System.out.println(venda.getProduto().getQtde());

	
	
	
	}
	

}

