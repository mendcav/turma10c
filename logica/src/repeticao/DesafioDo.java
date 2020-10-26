package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*
		 * Um jogo de adivinhação
		 * O jogador 1 digita um numero inteiro
		 * o jogador 2 tem que adivinhar o numero que foi digitado pelo jogador 1
		 * enquanto ele não acertar o jogo continua perguntando o numero
		 * 
		 * etapa 2
		 * acrescente uma contagem de tentativas do jogador 2 e apresente
		 * quantas tentativas ele usou para acertar o numero
		 * 
		 * etapa 3
		 * acrescente dicas indicando se o numero é maior ou menor
		 */

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Número a ser advinhado"));
		int chute = 0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o número"));
			contador=contador+1;
			//contador++;
			//contador+=1;
			if (numero>chute) {
				JOptionPane.showMessageDialog(null, "O número é maior");
			}else if (numero<chute) {
				JOptionPane.showMessageDialog(null, "O número é menor");
			}
		}while(numero!=chute);
		System.out.println("Parabéns você acertou com " + contador + " tentativa(s).");
	}
}
