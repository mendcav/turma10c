package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("nota 2"));
		float media =(nota1+nota2)/2;
		
		if (media >= 6) { 
			System.out.println("Parab�ns, aprovado com m�dia: " + media);
		}  
		if (media < 4) {
			System.out.println("Se lascou, reprovado com m�dia: " + media);
		}
		// and = &&
		// or  = ||
		if (media >= 4 && media <6) {
			System.out.println("Vixi, ficou de exame com m�dia: " + media);
		}
		
	}

}
