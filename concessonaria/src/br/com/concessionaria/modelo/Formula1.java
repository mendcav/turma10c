package br.com.concessionaria.modelo;

public class Formula1 {
	private String cor;
	private String escuderia;
	private boolean status;
	private float velocidadeAtual;
	private float valor;
	private String ligar;
	private String desligar;


	//Sintaxe para os m�todos
	// <modificador> <tipo do Retorno> <nomeMetodo>(<TipoParam> <nomeParam>){

	// ---> escuderia
	public void preencherEscuderia(String pEscuderia) {
		escuderia=pEscuderia.toUpperCase();
	}

	public String retornarEscuderia() {
		return escuderia;
	}

	// ---> cor
	public void preencherCor(String pCor) {
		cor=pCor.toUpperCase();
	}

	public String retornarCor() {
		return cor;
	}

	//---> valor
	public void preencherValor(float pValor) {
		if (pValor > 0) {
			valor=pValor;
		}	
	}

	public float retornaValor() {
		return valor;
	}

	//---> ligar
	public String ligar() {
		status=true;
		return "CARRO LIGADO";			
	}

	//---> desligar
	public String desligar() {
		status=false;
		return "CARRO DESLIGADO";
	}

	//acelerar
	public void acelerar(float pVelocidade) {
		if (status==true) {
			velocidadeAtual += pVelocidade;
		}
	}

	//desacelerar
	public void desacelerar(float pVelocidade) {
		if (status==true) {
			velocidadeAtual -= pVelocidade;
			if (velocidadeAtual < 0) {
				velocidadeAtual = 0;
			}
		}
	}

	//mostrar velocidade
	public float retornaVelocidade() {
		return velocidadeAtual;
	}

}   
