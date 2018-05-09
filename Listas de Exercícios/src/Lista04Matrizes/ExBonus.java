/*1 = Criar um random que gere um número entre 0 e 20.
				Após criar esse random faça com que 5  números geradores pelo random sejam cadastrados em um vetor de 5 posições.
				
				os números não podem se repetir.*/

package Lista04Matrizes;

import java.util.Random;

import javax.swing.JOptionPane;

public class ExBonus {

	public static void main(String[] args) {

		// Vetores
		int[] num = new int[5];

		// Gerando números
		Random random = new Random();
		for (int i = 0; i < 5; i++) {

			int n = 0;

			boolean NoVetor = true;
			while (NoVetor) {

				NoVetor = false;

				n = random.nextInt(21);

				for (int a = 0; a < i; a++) {
					if (n == num[a]) {
						NoVetor = true;
						break;
					}
				}
			}

			num[i] = n;
			JOptionPane.showMessageDialog(null, num[i]);
		}
	}

}
