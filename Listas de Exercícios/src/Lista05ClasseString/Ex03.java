
/*O usu�rio ir� informar um verbo (caso ele n�o informe um verbo o programa dever�
		informar que o termo informado n�o � um verbo). Esse verbo dever� terminar em AR,
		quando digitado o verbo voc� dever� conjug�-lo.*/

package Lista05ClasseString;

import javax.swing.*;

public class Ex03 {

	public static void main(String[] args) {

		// Vari�veis
		String verbo;

		// Obtendo verbo
		verbo = JOptionPane.showInputDialog("Informe um verbo terminado em AR");

		// Verificando se verbo termina em AR
		if (verbo.toUpperCase().endsWith("AR")) {
			String comeco = verbo.substring(0, verbo.length() - 2);
			String conjugado = "Eu " + comeco + "o\n";
			conjugado += "Tu " + comeco + "as\n";
			conjugado += "Ele " + comeco + "a\n";
			conjugado += "N�s " + comeco + "amos\n";
			conjugado += "V�s " + comeco + "�is\n";
			conjugado += "Eles " + comeco + "am\n";

			JOptionPane.showMessageDialog(null, conjugado.toUpperCase(), verbo + " conjugado", -1);
		} else {
			JOptionPane.showMessageDialog(null, "Esse verbo n�o termina com AR", "Verbo incorreto", -1);
		}
	}

}