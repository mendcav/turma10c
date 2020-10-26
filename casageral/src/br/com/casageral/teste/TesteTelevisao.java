package br.com.casageral.teste;

import javax.swing.JOptionPane;

import br.com.casageral.modelo.Televisao;

public class TesteTelevisao {

	public static void main(String[] args) {
		// estanciar objeto
		Televisao tv = new Televisao();


		tv.preencherMarca(JOptionPane.showInputDialog("Informe a marca da TV"));
		tv.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da TV")));

		if (JOptionPane.showConfirmDialog(null, "ligar?","Pergunta", JOptionPane.YES_NO_OPTION)==0) {
			System.out.println("Status.: " + tv.ligar());
		}else {
			System.out.println("Status.: " + tv.desligar());
		}

		tv.mudarCanal(5);
		tv.aumentarVolume(10);
		//tv.diminuirVolume(5);

		System.out.println(tv.retornarTudo());






	}
}


