package br.com.ecommerce.implementacao;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.PessoaFisica;
import br.com.ecommerce.modelo.PessoaJuridica;
import br.com.ecommerce.util.Magica;

public class ImplementarCliente {

	public static void main(String[] args) {
		 
		Cliente c = new Cliente();
		int resposta = Magica.i("Digite <1> PF ou <2> PF");
		if (resposta == 1) {
			c = new PessoaFisica(
					1,
					"REGINA",
					"1234-4321",
					new Endereco(),
					"123.456.789-00",
					"00.000.000-X"
					);
		}else if (resposta==2){
			c = new PessoaJuridica(
					2,
					"EMPRESA",
					"1234-4321",
					new Endereco(),
					"00.000.000/0001-00",
					"00.000.000.000",
					"SR JOão".toUpperCase()
					);
		}
		
		System.out.println(c.getAll());
		
		

	}

}
