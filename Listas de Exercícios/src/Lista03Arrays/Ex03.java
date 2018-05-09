package Lista03Arrays;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		
		//Vetor
		int[] numeross = new int[5];
		int contador = 0;
		String texto = "";
		
		//Obter os numeros
		while (contador < 5) {
			try {
				numeross[contador] = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Informe o " + (contador + 1) + "º numero"));
				contador++;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Informe somente números inteiros");
			}
		}
		contador = 0;
		while (contador < 5) {
			if (numeross[contador] == 10) {
				if (texto.equals("")) {
					texto = "O numero 10 está na posição " + (contador + 1);
				} else {
					texto += " e " + (contador + 1);
				}

			} else if (texto.equals("")) {
				texto = "Nenhum número 10 encontrado";
			}
			contador++;

		}
		JOptionPane.showMessageDialog(null, texto);

	}

}
