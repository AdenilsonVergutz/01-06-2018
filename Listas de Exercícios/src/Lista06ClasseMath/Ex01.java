/*Utilizando os conceitos vistos desenvolva uma calculadora que irá pedir:
a. Uma operação;
b. Um número (ou dois dependendo da operação escolhida).
As operações a disposição do usuário serão:
 Soma;
 Subtração;
 Multiplicação;
 Divisão;
 Seno;
 Cosseno;
 Tangente;
 Log;
 Raiz Quadrada;
 Raiz Cúbica.
Após informado o valor deverá ser perguntado se o usuário deseja continuar a utilizar a
calculadora ou não, enquanto não informar um termo de sua preferência para sair deverão ser
realizadas as perguntas e os cálculos.
*/

package Lista06ClasseMath;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {

		// Vetores
		String[] operacoes = { " + ", " - ", " * ", " / ", "O seno de ", "O cosseno de ", "A tangente de ",
				"O logaritmo de ", "A raiz quadrada de ", "A raiz cúbica de " };

		// Variáveis
		String opcoes = "CALCULADORA\n\n" + "Escolha uma operação:\n\n" + "1. Soma\n" + "2. Subtração\n"
				+ "3. Multiplicação\n" + "4. Divisão\n" + "5. Seno\n" + "6. Cosseno\n" + "7. Tangente\n"
				+ "8. Logaritmo\n" + "9. Raiz Quadrada\n" + "10. Raiz Cúbica\n" + "\n0. Sair\n\n";
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

			// Verificando qual operação foi escolhida
			if (op > 0) {
				if (op <= 4) {

					// Números
					double n1, n2, resultado = 0;

					// Obtendo valores
					while (true) {
						try {
							n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1º número"));
							n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º número"));
							break;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Algum valor está inválido");
						}
					}

					// Calculando
					switch (op) {

					case 1:
						resultado = n1 + n2;
						break;
					case 2:
						resultado = n1 - n2;
						break;
					case 3:
						resultado = n1 * n2;
						break;
					case 4:
						resultado = n1 / n2;
						break;
					}

					// Exibindo resultado
					JOptionPane.showMessageDialog(null, n1 + operacoes[op - 1] + n2 + " = " + resultado);
				} else {

					// Números
					double n, resultado = 0;

					// Obtendo valor
					while (true) {
						try {
							n = Double.parseDouble(JOptionPane.showInputDialog("Informe o número"));
							break;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Valor inválido");
						}
					}

					// Calculando
					switch (op) {

					case 5:
						resultado = Math.sin(n);
						break;
					case 6:
						resultado = Math.cos(n);
						break;
					case 7:
						resultado = Math.tan(n);
						break;
					case 8:
						resultado = Math.log(n);
						break;
					case 9:
						resultado = Math.sqrt(n);
						break;
					case 10:
						resultado = Math.cbrt(n);
						break;
					}

					// Exibindo resultado
					JOptionPane.showMessageDialog(null, operacoes[op - 1] + n + " é " + resultado);
				}
			}
		}
	}

}
