package Lista03Arrays;

import javax.swing.JOptionPane;

public class Ex02 {

	public static void main(String[] args) {
		int[] numeross = new int[10];
		int contador = 0;
		String texto = "Seus n�meros na ordem inversa a inclus�o\n";
		while (contador < 10) {
			try {
				numeross[contador] = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Informe o " + (contador + 1) + "� numero"));
				contador++;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Informe somente n�meros inteiros");
			}
		}

		while (contador > 0) {
			contador--;
			texto += numeross[contador];
			if (contador != 0) {
				texto += ", ";
			} else {
				texto += ".";
			}

		}
		JOptionPane.showMessageDialog(null, texto);

	}

}
