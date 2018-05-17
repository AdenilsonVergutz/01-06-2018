package limiteArray;

import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {
		
		//Vetor
		int[] idades = new int[3];
		
		//Obter dados
		for (int i = 0; i < idades.length; i++) {
			idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade"));
		}
		
		for (int idade : idades) {
			System.out.println(idade);
		}
	}
	
}