/*1 = Criar um random que gere um n�mero entre 0 e 20.
				Ap�s criar esse random fa�a com que 5  n�meros geradores pelo random sejam cadastrados em um vetor de 5 posi��es.
				
				os n�meros n�o podem se repetir.*/

package Lista04Matrizes;

import java.util.Random;

import javax.swing.JOptionPane;

public class ExBonus {

	public static void main(String[] args) {

		// Vetores
		int[] num = new int[5];

		// Gerando n�meros
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
