package variaveis;

import javax.swing.JOptionPane;

public class VendaProduto {

	public static void main(String[] args) {
		// 
		// Crie as variaveis para armazenar: 
		// nome do produto, código, valor e qtde.
		// Exiba no final o nome do produto, o total e o total com 10% de desconto.
		
		String produto = JOptionPane.showInputDialog("Digito o nome do produto");
		double valprod = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		double total = qtde*valprod;
		
		System.out.println("Produto.............: " + produto);
		System.out.println("Total...............: " + total);
		System.out.println("Total com desconto..: " + (total*0.9));
		
		}

}
