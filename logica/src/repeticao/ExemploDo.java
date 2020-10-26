package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		String candidato = "";
		int totalx = 0;
		int totaly = 0;
		
		do {
			candidato = JOptionPane.showInputDialog("Digite <X> ou <Y>").toUpperCase();
			if (candidato.equals("X")) {
				totalx=totalx+1;
			}else if (candidato.equals("Y")) {
				totaly=totaly+1;
			}
		}while(candidato.equals("X") || candidato.equals("Y"));
		System.out.println("Total do candidato X: " + totalx);
		System.out.println("Total do candidato Y: " + totaly);
			
	
	
	
	
	
	}

}
