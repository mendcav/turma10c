package br.com.casageral.modelo;

public class Televisao {
	private String marca;
	private float valor;
	private boolean status;
	private int canal;
	private int volume;
	
	//Preencher Marca
	public void preencherMarca(String pMarca) {
		marca = pMarca.toUpperCase();
	}
	
	//Preencher Valor
	public void preencherValor(float pValor) {
		if(pValor > 0) {
			valor = pValor;	
		}
	}

	//Ligar
	public String ligar() {
		status=true;
		return "TV Ligada";
	}
	
	//Desligar
	public String desligar() {
		status=false;
		canal=0;
		volume=0;
		return "TV desligada";	
	}
	
	//Mudar canal
	public void mudarCanal(int pCanal) {
		if(status==true && pCanal > 0) {
			canal = pCanal;	
		}
	}
	//Aumentar volume
	public void aumentarVolume(int pVolume) {
		if(status == true && pVolume > 0) {
			volume += pVolume;	
		}
	}
	
	//Diminuir volume
	public void diminuirVolume(int pVolume) {
		if(status == true && (volume-pVolume)>=0) {
			volume -= pVolume;	
		}
	}
	//Retornar Marca
	public String retornaMarca() {
		return marca;
	}
	
	//Retornar Valor
	public float retornaValor() {
		return valor;
	}
	
	//Retornar Status
	public boolean retornarStatus() {
		return status;
	}
	
	//Retornar canal
	public int retornaCanal() {
		return canal;
	}
	
	//Retornar volume
	public int retornaVolume() {
		return volume;
	}
	
	//RetornarTudo
	public String retornarTudo() {
		return
		"Marca..: " + marca + "\n" +
		"Valor..: " + valor + "\n" +
		"Volume.: " + volume + "\n" +
		"Canal..: " + canal;
		}
	
}
