/*. Desenvolver um algoritmo para supermercado, nela deverá conter os seguintes produtos já
cadastrados:
PRODUTOS COMERCIALIZADOS
1 Arroz 5 KG R$ 9,50
2 Arroz 1 KG R$ 2,75
3 Feijão 3 KG R$ 5,60
4 Feijão 1 KG R$ 3,10
5 Macarrão 500 GR R$ 1,90
6 Farinha de Trigo 2 KG R$ 3,21
7 Ketchup 370 GR R$ 5,50
8 Maionese 480 GR R$ 7,30
9 Gelatina 50 GR R$ 0,65
10 Macarrão Instantâneo 120 GR R$ 1,19
11 Creme de Leite 150 GR R$ 1,89
12 Leite Condensado 150 GR R$ 2,88
13 Leite 1 L R$ 2,06
14 Chocolate em Pó 500 GR R$ 9,67
15 Pepino em Conserva 600 GR R$ 11,99
16 Vinagre 550 ML R$ 1,94
17 Sal 500 GR R$ 3,34
18 Açúcar 550 GR R$ 4,89
19 Fermento 150 FR R$ 2,19
20 Biscoito de Chocolate 70 GR R$ 2,09
O algoritmo com esses produtos pré-definidos deverá perguntar o código do produto a ser comprado e a
quantidade, enquanto o código for diferente de zero deverá perguntar o código e a quantidade.
Após digitado zero deve ser exibido: código, nome do produto, quantidade comprada, valor unitário e total de
cada produto (quantidade * produto) de cada pedido adicionado. Juntamente com o total a ser pago pelo
cliente.
Informe também qual é o total da compra (soma de todos os totais)*/

package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex07test {

	public static void main(String[] args) {

		// Vetores
				double valorQnt[][] = { { 9.5, 2.75, 5.6, 3.1, 1.9, 3.21, 5.5, 7.3, 0.65, 1.19, 1.89, 2.88, 2.06, 9.67, 11.99,
						1.94, 3.34, 4.89, 2.19, 2.09 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
				String produto[] = { "Arroz 5 KG", "Arroz 1 KG", "Feijão 3 KG", "Feijão 1 KG", "Macarrão 500 GR",
						"Farinha de Trigo 2 KG", "Kethup 370 GR", "Maionese 480 GR", "Gelatina 50 GR",
						"Macarrão Instantâneo 120GR", "Creme de Leite 150 GR", "Leite Condensado 150 GR", "Leita 1 L",
						"Chocolate em Pó 500 GR", "Pepino em conserva 600 GR", "Vinagre 550 ML", "Sal 500 GR", "Açúcar 550 GR",
						"Fermento 150 GR", "Biscoito de Chocolate 70 GR" };

				// Variáveis
				String compra = "COMPRAS\n\n";
				double total = 0;

				// Obtendo Código do produto desejado
				int codProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o Código do produto que você deseja comprar ou 0 para finalizar"));

				// Laço principal
				while (codProduto != 0) {

					// Obtendo quantidade desejada do produto
					valorQnt[1][codProduto - 1] += Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto " + produto[codProduto - 1]));

					// Obtendo id do produto desejado
					codProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o Código do produto que você deseja comprar ou 0 para finalizar"));
				}

				// Calculando total e preço de cada produto
				for (int i = 0; i < 20; i++) {

					// Verificando se o
					if (valorQnt[1][i] > 0) {

						// Calculo
						double valor = valorQnt[0][i] * valorQnt[1][i];

						// Adicionando ao total
						total += valor;

						// Adicionando à string de compras
						compra += (i + 1) + " - " + produto[i] + " - " + (int) valorQnt[1][i] + " unidades - R$"
								+ String.format("%.2f", valorQnt[0][i]) + " cada - R$" + String.format("%.2f", valor) + "\n";
					}
				}

				// Adicionando total à variável string
				compra += "TOTAL: R$" + String.format("%.2f", total);

				// Exibindo informações
				JOptionPane.showMessageDialog(null, compra);

			}
		}