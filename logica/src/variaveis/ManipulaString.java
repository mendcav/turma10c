package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "reGina@gAma.AcAdemy";
		System.out.println("Original.............: " + email);
		System.out.println("Min�scula............: " + email.toLowerCase());
		System.out.println("Mai�scula............: " + email.toUpperCase());
		System.out.println("Qtde de caracteres...: " + email.length());
		System.out.println("Posi��o do @.........: " + email.indexOf("@"));
		System.out.println("Exibir do 2 ao 4 char: " + email.substring(1,4));
		System.out.println("Do 3 em diante.......: " + email.substring(2));
		System.out.println("primeita metade......: " + email.length()/2);
		System.out.println("Usu�rio..............: " + email.substring(0,email.indexOf("@")));
		System.out.println("Servidor.............: " + email.substring(email.indexOf("@")+1));
		System.out.println("Primeiro caracter....: " + email.charAt(0));
		System.out.println("Compara��o...........: " + email.equals("eGina@gAma.AcAdemy"));
		System.out.println("Ignorando caixa......: " + email.equalsIgnoreCase("regina@gama.academy"));
	}

}
