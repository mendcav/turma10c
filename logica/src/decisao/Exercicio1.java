package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os. 
		  A taxa de servi�os � de: 
		  R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15; 
		    R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15; 
		      R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15.
		  Monte uma aplica��o que apresente a conta do cliente.
		 */

		short diaria = Short.parseShort(JOptionPane.showInputDialog("Quantidade de di�rias"));
		double valdiaria = 80;
		double taxa1 = 5.50;
		double taxa2 = 6;
		double taxa3 = 8;
		double total;

		if (diaria > 15) {
			total = (valdiaria * diaria) + (taxa1 * diaria);
			System.out.println("Valor por di�ria......: " + valdiaria);
			System.out.println("Total de di�rias......: " + diaria);
			System.out.println("Taxa de servi�o (dia).: " + taxa1);
			System.out.println("O total da sua conta �: " + total);
		}else if (diaria == 15) {
			total = (valdiaria * diaria) + (taxa2 * diaria);
			System.out.println("Valor por di�ria......: " + valdiaria);
			System.out.println("Total de di�rias......: " + diaria);
			System.out.println("Taxa de servi�o (dia).: " + taxa2);
			System.out.println("O total da sua conta �: " + total);
		}else {
			total = (valdiaria * diaria) + (taxa3 * diaria);
			System.out.println("Valor por di�ria......: " + valdiaria);
			System.out.println("Total de di�rias......: " + diaria);
			System.out.println("Taxa de servi�o (dia).: " + taxa3);
			System.out.println("O total da sua conta �: " + total);		
		}
		System.out.println("At� mais!");

	}
}
