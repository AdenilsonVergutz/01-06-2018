package Lista03Arrays;

import javax.swing.JOptionPane;

public class Ex01{

	public static void main(String[] args) {
	
		int[] numero1 = new int[10];
		int[] numero2 = new int[10];
		String texto = "";
		Object[] opcao = {"Somar", "Subtrair", "Multiplicar", "Dividir"};
		
		for(int i = 0; i<10; i++) {
			numero1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero do primeiro vetor posição "+i ));
			numero2[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero do segundo vetor posição "+i ));
		}
		Object escolha = JOptionPane.showInputDialog(null, "Selecionar Operação", "Calcular", JOptionPane.PLAIN_MESSAGE, null, opcao, "");
		for(int i = 0; i<10; i++) {
			texto += "\nVetor1: "+numero1[i]+" "+escolha+" Vetor2: "+numero2[i]+" = ";
			if(escolha.equals("Somar")) {
				texto += numero1[i]+numero2[i];
			}
			if(escolha.equals("Subtrair")) {
				texto += numero1[i]-numero2[i];
			}
			if(escolha.equals("Multiplicar")) {
				texto += numero1[i]*numero2[i];
			}
			if(escolha.equals("Dividir")) {
				texto += numero1[i]/numero2[i];
			}
			
			
		}
		JOptionPane.showMessageDialog(null, texto);
		
	}

}