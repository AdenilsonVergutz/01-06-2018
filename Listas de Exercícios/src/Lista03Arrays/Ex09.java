
/*9. Crie um algoritmo com as seguintes op��es:
a. Cadastrar produto � Pedir o nome do produto, valor e quantidade em estoque.
b. Listar produtos � Exibir o nome do produto, valor e quantidade
c. Alterar produto � Pedir o nome do produto, ap�s informado pedir um nome, valor e estoque para
atualizar.
d. Excluir produto � Atrav�s do nome excluir o produto do vetor.
Fa�a com que sejam cadastrados at� 20 produtos no vetor. Caso haja mais de 20 produtos n�o poder�
ser cadastrado.*/

package Lista03Arrays;

import javax.swing.JOptionPane;

public class Ex09 {

	public static void main(String[] args) {

		// Vetores
		int[] quantidades = new int[20];
		Object[] menu = { "Cadastrar produto", "Listar produtos", "Alterar produto", "Excluir produto", "Sair" };
		Object escolha = "";
		String[] produtos = new String[20];
		String produto = "";
		double[] valores = new double[20];

		// Vari�veis
		double valor = 0;
		int quantidade = 0;
		int quantProdutos = 0;
		boolean valido = false;
		

		// Menu de escolha

		while (!escolha.equals("Sair")) {
			do {
				try {
					escolha = JOptionPane.showInputDialog(null, "Escolha uma op��o", "menu", JOptionPane.PLAIN_MESSAGE,
							null, menu, null);
					valido = true;
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erro.");
					valido = false;
				}
			} while (valido == false);

			valido = false;

			// Cadastrar Produto

			if (escolha.equals("Cadastrar produto")) {
				do {
					try {
						produto = JOptionPane.showInputDialog("Digite o nome do produto");
						valido = true;
						if (produto.isEmpty()) {
							valido = false;
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Erro.");
						valido = false;
					}
				} while (valido == false);

				valido = false;
				do {
					try {
						valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
						valido = true;
						if (valor <= 0) {
							valido = false;
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Erro.");
						valido = false;
					}
				} while (valido == false);

				valido = false;
				do {
					try {
						quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o quantidade do produto"));
						valido = true;
						if (quantidade <= 0) {
							valido = false;
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Erro.");
						valido = false;
					}
				} while (valido == false);

				produtos[quantProdutos] = produto;
				valores[quantProdutos] = valor;
				quantidades[quantProdutos] = quantidade;
				quantProdutos++;
			}

			// Lista de produtos cadastrados

			if (escolha.equals("Listar produtos")) {
				for (int i = 0; i < quantProdutos; i++) {

					JOptionPane.showMessageDialog(null, "Produto: " + produtos[i] + "  |  Valor:  " + valores[i]
							+ "  |  Quantidade  " + quantidades[i]);

				}
			}

			valido = false;

			// Alterar produtos cadastrados

			if (escolha.equals("Alterar produto")) {
				do {
					try {
						produto = JOptionPane.showInputDialog("Digite o nome do produto que sera alterado");
						valido = true;
						if (produto.isEmpty()) {
							valido = false;
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Erro.");
						valido = false;
					}
				} while (valido == false);

				boolean existe = false;
				for (int i = 0; i < produtos.length; i++) {
					if (produto.equals(produtos[i])) {
						valido = false;
						do {
							try {
								produto = JOptionPane.showInputDialog("Digite o novo nome do produto");
								valido = true;
								if (produto.isEmpty()) {
									valido = false;
								}
							} catch (Exception e) {
								JOptionPane.showMessageDialog(null, "Erro.");
								valido = false;
							}
						} while (valido == false);

						valido = false;
						do {
							try {
								valor = Double
										.parseDouble(JOptionPane.showInputDialog("Digite o novo valor do produto"));
								valido = true;
								if (valor <= 0) {
									valido = false;
								}
							} catch (Exception e) {
								JOptionPane.showMessageDialog(null, "Erro.");
								valido = false;
							}
						} while (valido == false);

						valido = false;
						do {
							try {
								quantidade = Integer
										.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade do produto"));
								valido = true;
								if (quantidade <= 0) {
									valido = false;
								}
							} catch (Exception e) {
								JOptionPane.showMessageDialog(null, "Erro.");
								valido = false;
							}
						} while (valido == false);

						produtos[i] = produto;
						valores[i] = valor;
						quantidades[i] = quantidade;
						
						existe = true;
					} 
				}
				
				if(existe == false){
					JOptionPane.showMessageDialog(null, "Produto n�o cadastrado");
				}

			}

			// Excluir produto cadastrado

			if (escolha.equals("Excluir produto")) {
				valido = false;
				do {
					try {
						produto = JOptionPane.showInputDialog("Digite o nome do produto que sera exclu�do");
						valido = true;
						if (produto.isEmpty()) {
							valido = false;
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Erro.");
						valido = false;
					}
				} while (valido == false);

				for (int i = 0; i < produtos.length; i++) {
					if (produto.equals(produtos[i])) {
						produtos[i] = null;
						valores[i] = 0;
						quantidades[i] = 0;
					} else {
						JOptionPane.showMessageDialog(null, "Produto n�o encontrado");
					}
				}

			}

			if (escolha.equals("Sair")) {
				break;
			}
		}

	}
}