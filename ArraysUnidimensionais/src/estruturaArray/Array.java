package estruturaArray;

import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {

		// Vetor ou array = Variável para armazenar vários dados
		String nomes[] = { "Alan", "Bruna", "Daniel", "Jean", "Samantha" };

		// Obter a quantidade de elementos cadastrados
		// JOptionPane.showMessageDialog(null, nomes.length);

		// Exibir dados #1
		/*
		 * System.out.println(nomes[0]); System.out.println(nomes[1]);
		 * System.out.println(nomes[2]); System.out.println(nomes[3]);
		 * System.out.println(nomes[4]);
		 */

		// Exibir dados #2
		/*
		 * int indice = 0;
		 * do { 
		 * 		System.out.println(nomes[indice]); indice++; 
		 * } while (indice < nomes.length);
		 */
		
		//Exibir dados #3
		/*for (int indice = 0; indice < nomes.length; indice++) {
			System.out.println(nomes[indice]);
		}*/
		
		//Exibir dados #4
		/*for (String nome : nomes) {
			System.out.println(nome);
		}*/

	}

}