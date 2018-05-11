/*9. Criar um sistema onde o usu�rio informa um ano. Dever� retornar se o ano � bissexto ou n�o, fa�a
com que haja um la�o para que sejam pedidos v�rios anos, at� que alguma op��o de sa�da seja
executada.
*/


package Lista08.OO;

import javax.swing.JOptionPane;

public class Ex09 {
	
	double anoinformado = 0;

	boolean valida = false;
	boolean validalaco = false;

	int continuar = 0;

	public void obterAno() {

		try {
			anoinformado = Integer.parseInt(
					JOptionPane.showInputDialog("Informe o ano para saber se � bissexto."));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Falha: " + e.getMessage());
		}


	}

	public void verificarAno() {

		if ((anoinformado % 100 == 0) && (anoinformado % 400 != 0) && (anoinformado % 4 != 0)) {
			JOptionPane.showMessageDialog(null, "N�o � bissexto.");
		} else if ((anoinformado % 4 == 0) || (anoinformado % 400 == 0)) {
			JOptionPane.showMessageDialog(null, "� bissexto.");
		} else {
			JOptionPane.showMessageDialog(null, "N�o � bissexto.");
		}

	}

	public void laco() {

		do {

			obterAno();
			verificarAno();

			continuar = JOptionPane.showConfirmDialog(null, "Deseja verificar outro ano?");

			if (continuar != 0) {
				validalaco = true;
			}

		} while (validalaco != true);

	}

}

