package variaveis;

import javax.swing.JOptionPane;

public class Variavel {

	/*
	 * Parse => conversão entre tipos incompatíveis (String => primitivo)
	 * Primitivo => são os tipos que fazem parte da linguagem (começam com letras minusculas)
	 * 
	 * boolean => armazena True ou False
	 * char => armazena um caracter
	 * byte => numeros inteiros (-127 // +128)
	 * short => numeros inteiros (-32k // + 32k)
	 * int => numeros inteiros (-2bilhoes // +2bilhoes)
	 * long => numeros inteiros 
	 * float => numeros reais
	 * double => numeros reais (possui o dobro de precisão nas casas decimais)
	 * 
	 * Classe Wrapper => são classes que apoiam os tipos primitivos. Exemplo: parse().
	 * int => Integer
	 * double => Double
	 * float => Float
	 * boolean = Boolean
	 */	
	
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		double imc = peso / (altura*altura);
		
		System.out.println("Usuário: " + nome);
		System.out.println("Idade..: " + idade);
		System.out.printf("IMC....: %.2f\n" , imc);
		// %f => numeros reais
		// %s => strings
		// %d => numeros inteiros
		
		System.out.printf("Sr(a) %s, voce tem %d anos de idade. Seu IMC é %.2f\n" ,nome, idade, imc);
	}

}
