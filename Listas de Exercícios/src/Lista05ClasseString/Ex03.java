
/*O usuário irá informar um verbo (caso ele não informe um verbo o programa deverá
		informar que o termo informado não é um verbo). Esse verbo deverá terminar em AR,
		quando digitado o verbo você deverá conjugá-lo.*/

package Lista05ClasseString;

import javax.swing.*;

public class Ex03 {

	public static void main(String[] args) {

		// Variáveis
		String verbo;

		// Obtendo verbo
		verbo = JOptionPane.showInputDialog("Informe um verbo terminado em AR");

		// Verificando se verbo termina em AR
		if (verbo.toUpperCase().endsWith("AR")) {
			String comeco = verbo.substring(0, verbo.length() - 2);
			String conjugado = "Eu " + comeco + "o\n";
			conjugado += "Tu " + comeco + "as\n";
			conjugado += "Ele " + comeco + "a\n";
			conjugado += "Nós " + comeco + "amos\n";
			conjugado += "Vós " + comeco + "áis\n";
			conjugado += "Eles " + comeco + "am\n";

			JOptionPane.showMessageDialog(null, conjugado.toUpperCase(), verbo + " conjugado", -1);
		} else {
			JOptionPane.showMessageDialog(null, "Esse verbo não termina com AR", "Verbo incorreto", -1);
		}
	}

}