package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*Um hotel cobra R$ 80,00 a diária e mais uma taxa de serviços. 
		  A taxa de serviços é de: 
		  R$ 5,50 por diária, se o número de diárias for maior que 15; 
		    R$ 6,00 por diária, se o número de diárias for igual a 15; 
		      R$ 8,00 por diária, se o número de diárias for menor que 15.
		  Monte uma aplicação que apresente a conta do cliente.
		 */

		short diaria = Short.parseShort(JOptionPane.showInputDialog("Quantidade de diárias"));
		double valdiaria = 80;
		double taxa1 = 5.50;
		double taxa2 = 6;
		double taxa3 = 8;
		double total;

		if (diaria > 15) {
			total = (valdiaria * diaria) + (taxa1 * diaria);
			System.out.println("Valor por diária......: " + valdiaria);
			System.out.println("Total de diárias......: " + diaria);
			System.out.println("Taxa de serviço (dia).: " + taxa1);
			System.out.println("O total da sua conta é: " + total);
		}else if (diaria == 15) {
			total = (valdiaria * diaria) + (taxa2 * diaria);
			System.out.println("Valor por diária......: " + valdiaria);
			System.out.println("Total de diárias......: " + diaria);
			System.out.println("Taxa de serviço (dia).: " + taxa2);
			System.out.println("O total da sua conta é: " + total);
		}else {
			total = (valdiaria * diaria) + (taxa3 * diaria);
			System.out.println("Valor por diária......: " + valdiaria);
			System.out.println("Total de diárias......: " + diaria);
			System.out.println("Taxa de serviço (dia).: " + taxa3);
			System.out.println("O total da sua conta é: " + total);		
		}
		System.out.println("Até mais!");

	}
}
