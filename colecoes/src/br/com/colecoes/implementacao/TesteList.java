package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {
	// Collection Framework=> possuem recursos para facilitar o trabalho com dados multivalorados
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		
		
		lista.add("DBA");
		lista.add("DEV");
		lista.add("DEVOPS");
		lista.add("DBA");
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println("ordenada: " + lista);
		System.out.println("Exibindo segundo elemento: " + lista.get(3));
		//lista.remove(3);
		System.out.println("Depois de excluir: " + lista);
		
		// Com FOR tradicional
		//for (int contador=0;contador<lista.size();contador++) {
		//	System.out.println(lista.get(contador));
		//}
		
		//Com FOREACH
		for (String elemento : lista ) {
			System.out.println("Cargo: " + elemento);
			
		}
		
		
		
	}

}
