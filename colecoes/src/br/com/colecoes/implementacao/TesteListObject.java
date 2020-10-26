package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListObject {

	
	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo ("DBA", "JR",8000));
		lista.add(new Cargo ("PROJETO", "JR",10000));
		lista.add(new Cargo ("PROJETO", "PL",15000));
		lista.add(new Cargo ("PROJETO", "PL",15000));
		lista.add(new Cargo ("PROJETO", "SR",20000));
		lista.add(new Cargo ("ESTAGIARIO", "JR",2000));
		lista.add(new Cargo ("ESTAGIARIO", "PL",3500));
		lista.add(new Cargo ("ESTAGIARIO", "SR",5000));
		//System.out.println(lista.get(1).getSalario());
		
		//Exiba o total de todos os salarios
		//Exiba somento os cargos com salario > 7000
		
		float soma = 0;
		int qtdeSal = 0; //quantidade de salarios > 7000
		
		for (Cargo objeto : lista) {			
			soma = soma + objeto.getSalario();
						
			if (objeto.getSalario()>7000 ) {
				qtdeSal++;
				System.out.println("salario > 7000 = " + objeto.getSalario());
			}
			//System.out.println("nome   : " + objeto.getNome());
			//System.out.println("salario: " + objeto.getSalario());
		}
		System.out.println("Soma total dos sal�rios.: " + soma);
		System.out.println("Qtde de salarios > 7k...: " + qtdeSal);
		
		
		
		
	}
}
