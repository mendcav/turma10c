package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		/*Monte um programa que solicite a idade e o nome das pessoas. 
		 * Ao terminar, (quando o usuário responder "SIM", que ele quer terminar) o programa deverá exibir:
		 *** a pessoa mais velha (nome e idade),
		 **** a pessoa mais nova (nome e idade),
		 * a quantidade de pessoas maiores de idade e
		 ** a média entre as idades que foram digitadas.
		 * 
		 */

		String nome = "";
		String nomeMaior =""; 
		String nomeMenor ="";
		byte idade = 0;
		int contador=0;
		int maior=0;
		int menor=999;
		int maiores=0;
		int idadeTotal=0;
		int media=0;
		
		do {
			nome = JOptionPane.showInputDialog("Digite o nome da pessoa ou FIM").toUpperCase();
			
			if (!nome.equals("FIM")) {
				idade = Byte.parseByte(JOptionPane.showInputDialog("Digite a idade"));
				contador=contador+1;
				//contador++;
				//contador+=1;
				idadeTotal = idadeTotal+idade;
				
				if (idade >= 18) {
					maiores++;
				}
												
				if (idade < menor) {
					menor = idade;
					nomeMenor = nome;
				}else if (idade > maior) {
					maior = idade;
					nomeMaior = nome;
				}
						
			}			
			
		}while(!nome.equals("FIM"));
		media = idadeTotal / contador;
		System.out.println("============== RESUMO DO PROCESSAMENTO ==============");
		System.out.println("Total de pessoas cadastradas: " + contador);
		System.out.println("Total de maiores de idade...: " + maiores);
		System.out.println("A média de idade foi de.....: " + media + " anos.");
		System.out.println("A maior idade foi de........: " + nomeMaior + " com " + maior + " anos.");
		System.out.println("A menor idade foi de........: " + nomeMenor + " com " + menor + " anos.");
	}
}
