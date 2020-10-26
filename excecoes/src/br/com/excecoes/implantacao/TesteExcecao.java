package br.com.excecoes.implantacao;

public class TesteExcecao {

	public static void main(String[] args) {
		try {
			int numero = Integer.parseInt("8");
			System.out.println("Resultado = " + (numero * 10));
			
			String email="";
			System.out.println("Usuario: " + email.substring(0,email.indexOf("@")));
			
		}catch (NumberFormatException e) {
			System.out.println("N�mero inv�lido");
		}catch(Exception e) {
			System.out.println("Deu ruim");
			e.printStackTrace(); // >>> so usa essa linha em teste para mapear as exce��es<<<<
		}finally {
			System.out.println("At� logo");
		}
		

	}

}
