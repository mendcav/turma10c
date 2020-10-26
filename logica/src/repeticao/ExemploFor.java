package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		/*
		 * For: utilizamos normalmente, quando não ha interação do usuario com a repetição.
		 * Sintaxe:
		 * 1° Parametro: inicio da repeticao com a definicao do contador
		 * 2° Parametro: condição ou seja ate quando o laço vai ser executado
		 * 3° Parametro: qual a forma de contagem 
		 */

		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		
		for (int contador=1;contador<11;contador++) {
			System.out.println(tabuada + " X " + contador + " = " + (tabuada * contador));
		}
	}

}
