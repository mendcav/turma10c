package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		/* Peça o nome do usuario e nao aceite nomes com menos do cinco
		 * ou com mais de 20 caracteres  
		 */
		String email = JOptionPane.showInputDialog("Digite o email").toLowerCase();
		while (email.indexOf("@")==-1) {
			email = JOptionPane.showInputDialog("Email deve ter @").toLowerCase();
		}
		while (email.length()<5 || email.length()>20) {
			email = JOptionPane.showInputDialog("digite novamente").toLowerCase();
	    }
	System.out.println(email);
    }
}
