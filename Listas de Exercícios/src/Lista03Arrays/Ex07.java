		/*7. Pe�a sete n�meros inteiros e armazene no vetor. O vetor n�o poder� aceitar n�meros repetidos. Ap�s
		informados os sete n�meros exiba cada um deles.*/
		

package Lista03Arrays;

import javax.swing.JOptionPane;

public class Ex07 {

	public static void main(String[] args) {
		
		
		//Vetor
		int[] numeros = new int[7];

		
		//Vari�veis
		int numero = 0;
		int quantNumeros = 0;
		boolean valido = false;
		String texto;

		while (quantNumeros <= 6) {
			do{
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(quantNumeros+1)+"� n�mero"));
				valido = true;
				for (int i = 0; i < 7; i++) {
					if(numero == numeros[i]){
						JOptionPane.showMessageDialog(null, "Esse n�mero ja foi usado, favor escolher outro!");
						valido = false;
					}
				}
			}while(valido == false);
				numeros[quantNumeros] = numero;
				quantNumeros++;		
		}
		texto = "\n\n****Os N�meros escolhidos****\n\n";
		for (int i = 0; i < numeros.length; i++) {
			
		 
		 texto += "\n "+numeros[i]+"\n";
			
			
		}
		JOptionPane.showMessageDialog(null, texto);
	}
}
