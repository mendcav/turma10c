package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Quantidade de faltas"));
		if (faltas > 20) {
			System.out.println("Voc� foi reprovado por faltas");
		}else {		
			String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("nota 1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("nota 2"));
			float media =(nota1+nota2)/2;

			if (media >= 6) { 
				System.out.println(nome + ", parab�ns, aprovado com m�dia: " + media);
			}else if (media < 4) {
				System.out.println(nome + ", se lascou, reprovado com m�dia: " + media);
			}else {
				System.out.println(nome + ", vixi, ficou de exame com m�dia: " + media);
			}
			System.out.println("At� mais!");

		}
	}
}
