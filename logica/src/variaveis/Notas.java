package variaveis;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		// Input=> nome, disciplina, duas notas
		// Exibir o nome do aluno, a média e a disciplina.
		
		String aluno = JOptionPane.showInputDialog("Digito o nome do aluno");
		String disciplina = JOptionPane.showInputDialog("Digito o nome da disciplina");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da primeira nota"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da segunda nota"));
		float media = (nota1+nota2)/2;		
		
		System.out.printf("%s sua média na disciplina %s foi de %.2f", aluno, disciplina, media);
	}

}
