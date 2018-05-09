/*. Desenvolver um algoritmo para supermercado, nela dever� conter os seguintes produtos j�
cadastrados:
PRODUTOS COMERCIALIZADOS
1 Arroz 5 KG R$ 9,50
2 Arroz 1 KG R$ 2,75
3 Feij�o 3 KG R$ 5,60
4 Feij�o 1 KG R$ 3,10
5 Macarr�o 500 GR R$ 1,90
6 Farinha de Trigo 2 KG R$ 3,21
7 Ketchup 370 GR R$ 5,50
8 Maionese 480 GR R$ 7,30
9 Gelatina 50 GR R$ 0,65
10 Macarr�o Instant�neo 120 GR R$ 1,19
11 Creme de Leite 150 GR R$ 1,89
12 Leite Condensado 150 GR R$ 2,88
13 Leite 1 L R$ 2,06
14 Chocolate em P� 500 GR R$ 9,67
15 Pepino em Conserva 600 GR R$ 11,99
16 Vinagre 550 ML R$ 1,94
17 Sal 500 GR R$ 3,34
18 A��car 550 GR R$ 4,89
19 Fermento 150 FR R$ 2,19
20 Biscoito de Chocolate 70 GR R$ 2,09
O algoritmo com esses produtos pr�-definidos dever� perguntar o c�digo do produto a ser comprado e a
quantidade, enquanto o c�digo for diferente de zero dever� perguntar o c�digo e a quantidade.
Ap�s digitado zero deve ser exibido: c�digo, nome do produto, quantidade comprada, valor unit�rio e total de
cada produto (quantidade * produto) de cada pedido adicionado. Juntamente com o total a ser pago pelo
cliente.
Informe tamb�m qual � o total da compra (soma de todos os totais)*/

package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex07test {

	public static void main(String[] args) {

		// Vetores
				double valorQnt[][] = { { 9.5, 2.75, 5.6, 3.1, 1.9, 3.21, 5.5, 7.3, 0.65, 1.19, 1.89, 2.88, 2.06, 9.67, 11.99,
						1.94, 3.34, 4.89, 2.19, 2.09 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
				String produto[] = { "Arroz 5 KG", "Arroz 1 KG", "Feij�o 3 KG", "Feij�o 1 KG", "Macarr�o 500 GR",
						"Farinha de Trigo 2 KG", "Kethup 370 GR", "Maionese 480 GR", "Gelatina 50 GR",
						"Macarr�o Instant�neo 120GR", "Creme de Leite 150 GR", "Leite Condensado 150 GR", "Leita 1 L",
						"Chocolate em P� 500 GR", "Pepino em conserva 600 GR", "Vinagre 550 ML", "Sal 500 GR", "A��car 550 GR",
						"Fermento 150 GR", "Biscoito de Chocolate 70 GR" };

				// Vari�veis
				String compra = "COMPRAS\n\n";
				double total = 0;

				// Obtendo C�digo do produto desejado
				int codProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o C�digo do produto que voc� deseja comprar ou 0 para finalizar"));

				// La�o principal
				while (codProduto != 0) {

					// Obtendo quantidade desejada do produto
					valorQnt[1][codProduto - 1] += Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto " + produto[codProduto - 1]));

					// Obtendo id do produto desejado
					codProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o C�digo do produto que voc� deseja comprar ou 0 para finalizar"));
				}

				// Calculando total e pre�o de cada produto
				for (int i = 0; i < 20; i++) {

					// Verificando se o
					if (valorQnt[1][i] > 0) {

						// Calculo
						double valor = valorQnt[0][i] * valorQnt[1][i];

						// Adicionando ao total
						total += valor;

						// Adicionando � string de compras
						compra += (i + 1) + " - " + produto[i] + " - " + (int) valorQnt[1][i] + " unidades - R$"
								+ String.format("%.2f", valorQnt[0][i]) + " cada - R$" + String.format("%.2f", valor) + "\n";
					}
				}

				// Adicionando total � vari�vel string
				compra += "TOTAL: R$" + String.format("%.2f", total);

				// Exibindo informa��es
				JOptionPane.showMessageDialog(null, compra);

			}
		}