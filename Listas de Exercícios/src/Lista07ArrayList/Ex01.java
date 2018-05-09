/*Criar um caixa eletrônico. Esse sistema o usuário poderá efetuar as seguintes ações:
a. Depositar
b. Sacar
c. Extrato
d. Saldo
e. Sair
Valide os saques, apenas poderá ser sacado se o usuário tiver o valor mínimo em conta.*/

package Lista07ArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex01 {
	
	public static void main(String args[]) {
		
	// Lista
	ArrayList<Double> extrato = new ArrayList<Double>();

	// Variáveis
	double saldo = 0;
	String opcoes = "CAIXA ELETRÔNICO\n\n" + "1. Depositar\n" + "2. Sacar\n" + "3. Extrato\n" + "4. Saldo\n"
			+ "0. Sair\n\n";
	
	int op = -1;
	

		// Laço principal
		while (op != 0) {

			// Obtendo opção
			while (true) {
				try {
					op = Integer.parseInt(JOptionPane.showInputDialog(opcoes));
					break;
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
			}

			// Verificando qual foi a opção escolhida
			switch (op) {

			case 1: {

				// Valor de depósito
				double n = 0;

				// Obtendo valor de depósito
				while (true) {
					try {
						double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de depósito"));
						String formatado = String.format("%.2f", n2);
						n = Double.parseDouble(formatado.replaceAll(",", "."));
						break;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Valor inválido");
					}
				}

				// Adicionando valor à lista
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
						JOptionPane.showMessageDialog(null, "Valor inválido");
					}
				}

				// Adicionando valor à lista
				extrato.add(n * -1);

				// Subtraindo do saldo atual
				saldo -= n;
				break;
			}

			case 3: {

				String extratoS = "EXTRATO\n";

				// Verificando se algum extrato foi feito
				if (extrato.size() == 0) {
					JOptionPane.showMessageDialog(null, "Você não tem nenhuma movimentação monetária recente");
					break;
				}

				// Adicionando extrato à variável string
				for (Double e : extrato) {

					// Verificando se é um depósito ou saque
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
