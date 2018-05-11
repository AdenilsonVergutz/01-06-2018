/*9. Criar um sistema onde o usuário informa um ano. Deverá retornar se o ano é bissexto ou não, faça
com que haja um laço para que sejam pedidos vários anos, até que alguma opção de saída seja
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
					JOptionPane.showInputDialog("Informe o ano para saber se é bissexto."));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Falha: " + e.getMessage());
		}


	}

	public void verificarAno() {

		if ((anoinformado % 100 == 0) && (anoinformado % 400 != 0) && (anoinformado % 4 != 0)) {
			JOptionPane.showMessageDialog(null, "Não é bissexto.");
		} else if ((anoinformado % 4 == 0) || (anoinformado % 400 == 0)) {
			JOptionPane.showMessageDialog(null, "É bissexto.");
		} else {
			JOptionPane.showMessageDialog(null, "Não é bissexto.");
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

