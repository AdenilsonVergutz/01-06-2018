/*Criar um caixa eletr�nico. Esse sistema o usu�rio poder� efetuar as seguintes a��es:
a. Depositar
b. Sacar
c. Extrato
d. Saldo
e. Sair
Valide os saques, apenas poder� ser sacado se o usu�rio tiver o valor m�nimo em conta.*/

package Lista07ArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex01 {
	
	public static void main(String args[]) {
		
	// Lista
	ArrayList<Double> extrato = new ArrayList<Double>();

	// Vari�veis
	double saldo = 0;
	String opcoes = "CAIXA ELETR�NICO\n\n" + "1. Depositar\n" + "2. Sacar\n" + "3. Extrato\n" + "4. Saldo\n"
			+ "0. Sair\n\n";
	
	int op = -1;
	

		// La�o principal
		while (op != 0) {

			// Obtendo op��o
			while (true) {
				try {
					op = Integer.parseInt(JOptionPane.showInputDialog(opcoes));
					break;
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Valor inv�lido");
				}
			}

			// Verificando qual foi a op��o escolhida
			switch (op) {

			case 1: {

				// Valor de dep�sito
				double n = 0;

				// Obtendo valor de dep�sito
				while (true) {
					try {
						double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de dep�sito"));
						String formatado = String.format("%.2f", n2);
						n = Double.parseDouble(formatado.replaceAll(",", "."));
						break;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Valor inv�lido");
					}
				}

				// Adicionando valor � lista
				extrato.add(n);

				// Somando ao saldo atual
				saldo += n;
				break;
			}

			case 2: {

				// Valor de saque
				double n = 0;

				// Obtendo valor de saque
				while (true) {
					try {
						double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de saque"));
						String formatado = String.format("%.2f", n2);
						n = Double.parseDouble(formatado.replaceAll(",", "."));
						break;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Valor inv�lido");
					}
				}

				// Adicionando valor � lista
				extrato.add(n * -1);

				// Subtraindo do saldo atual
				saldo -= n;
				break;
			}

			case 3: {

				String extratoS = "EXTRATO\n";

				// Verificando se algum extrato foi feito
				if (extrato.size() == 0) {
					JOptionPane.showMessageDialog(null, "Voc� n�o tem nenhuma movimenta��o monet�ria recente");
					break;
				}

				// Adicionando extrato � vari�vel string
				for (Double e : extrato) {

					// Verificando se � um dep�sito ou saque
					if (e < 0) {
						extratoS += "\n - R$" + String.format("%.2f", (e * -1));
					} else {
						extratoS += "\n + R$" + String.format("%.2f", e);
					}
				}

				// Exibindo resultado
				JOptionPane.showMessageDialog(null, extratoS);
				break;
			}

			case 4: {

				// Exibindo saldo
				JOptionPane.showMessageDialog(null, "SALDO\n\n" + "R$" + String.format("%.2f", saldo));
			}
			}
		}
	}

}
