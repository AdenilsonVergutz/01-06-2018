/*7. Desenvolver um algoritmo para supermercado, nela deverá conter os seguintes produtos já
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
Informe também qual é o total da compra (soma de todos os totais).*/

package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex07 {

	public static void main(String[] args) {

		// Variáveis

		String menu;
		int produto;
		int quantidade;
		double vt = 0;

		// Menu
		menu = "Escolha seu produto ";
		menu += "\n\n0) ";
		menu += "\n\n1) Arroz 5kg R$ 9,50";
		menu += "\n2) Arroz 1kg R$2,75 ";
		menu += "\n3) Feijão 3kg R$5,60 ";
		menu += "\n4) Feijão 1kg R$3,10 ";
		menu += "\n5) Macarrão 500Gr R$1,90";
		menu += "\n6) Farinha de Trigo 2Kg R$3,21 ";
		menu += "\n7) Ketchup 370Gr R$5,50";
		menu += "\n8) Maionese 480Gr R$7,30";
		menu += "\n9) Gelatina 50Gr R$0,65";
		menu += "\n10) Macarrão Instantâneo 120Gr R$1,19";
		menu += "\n11) Creme de Leite 150Gr R$1,89";
		menu += "\n12) Leite Condensado 150 GR R$ 2,88";
		menu += "\n13)Leite 1 L R$ 2,06";
		menu += "\n14) Chocolate em Pó 500 GR R$ 9,67";
		menu += "\n15) Pepino em Conserva 600 GR R$ 11,99";
		menu += "\n16) Vinagre 550 ML R$ 1,94";
		menu += "\n17) Sal 500 GR R$ 3,34";
		menu += "\n18) Açúcar 550 GR R$ 4,89";
		menu += "\n19) Fermento 150 FR R$ 2,19";
		menu += "\n20) Biscoito de Chocolate 70 GR R$ 2,09";

		// Código do produto
		produto = Integer.parseInt(JOptionPane.showInputDialog(menu));

		// Laço
		while (produto != 20) {

			// Obter quantidade
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("informe a Quantidade."));

			// Condicional

			for (produto = 0; produto < 20; produto++) {
			}
			if (produto == 0) {
				JOptionPane.showMessageDialog(null, "Produto: " +produto+ " Quantidade: " +quantidade+ " Valor unitário: " +vt);
			}

			if (produto == 1) {
				vt += 9.50 * quantidade;
			} else if (produto == 2) {
				vt += 2.75 * quantidade;
			} else if (produto == 3) {
				vt += 5.60 * quantidade;
			} else if (produto == 4) {
				vt += 3.10 * quantidade;
			} else if (produto == 5) {
				vt += 1.90 * quantidade;
			} else if (produto == 6) {
				vt += 3.21 * quantidade;
			} else if (produto == 7) {
				vt += 5.50 * quantidade;
			} else if (produto == 8) {
				vt += 7.30 * quantidade;
			} else if (produto == 9) {
				vt += 0.65 * quantidade;
			} else if (produto == 10) {
				vt += 1.19 * quantidade;
			} else if (produto == 11) {
				vt += 1.89 * quantidade;
			} else if (produto == 12) {
				vt += 2.88 * quantidade;
			} else if (produto == 13) {
				vt += 2.06 * quantidade;
			} else if (produto == 14) {
				vt += 9.67 * quantidade;
			} else if (produto == 15) {
				vt += 11.99 * quantidade;
			} else if (produto == 16) {
				vt += 1.94 * quantidade;
			} else if (produto == 17) {
				vt += 3.34 * quantidade;
			} else if (produto == 18) {
				vt += 4.89 * quantidade;
			} else if (produto == 19) {
				vt += 2.19 * quantidade;
			} else if (produto == 20) {
				vt += 2.09 * quantidade;
			} else if (produto == 16) {

				JOptionPane.showMessageDialog(null, "obrigado");

			} else {
				JOptionPane.showMessageDialog(null, "Produto invalido");
			}

			// Código do produto
			produto = Integer.parseInt(JOptionPane.showInputDialog(menu));
		}

	}

}
