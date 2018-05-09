package Lista03Arrays;

import javax.swing.JOptionPane;

public class Ex09test {

	public static void main(String[] args) {

		// Vetores
		String nomeProduto[] = new String[20];
		double valorProduto[] = new double[20];
		int estoqueProduto[] = new int[20];

		// Vari�veis
		int i = 0;
		boolean continuar = true;

		// La�o principal
		do {

			// Op��es
			String opcoes = "OP��ES\n\n";
			opcoes += "1. Cadastrar Produto\n";
			opcoes += "2. Listar Produtos\n";
			opcoes += "3. Alterar Produto\n";
			opcoes += "4. Excluir Produto\n";
			opcoes += "5. Sair";

			// Obtendo op�� escolhida
			int escolhido = Integer.parseInt(JOptionPane.showInputDialog(opcoes));

			// Verificando qual op��o foi escolhida
			switch (escolhido) {
			case 1:

				// Obtendo dados do produto
				nomeProduto[i] = JOptionPane.showInputDialog("Informe o nome do produto");
				valorProduto[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
				estoqueProduto[i] = Integer
						.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto em estoque"));

				// Incrementando contador
				i++;

				break;
			case 2:

				// Concatenando produtos
				String info = "PRODUTOS\n\n";
				for (int j = 0; j < i; j++) {

					info += nomeProduto[j] + " - R$" + String.format("%.2f", valorProduto[j]) + " - "
							+ estoqueProduto[j] + " em estoque\n";

				}

				// Exibindo produtos
				JOptionPane.showMessageDialog(null, info);

				break;
			case 3:

				// Obtendo nome do produto que deseja atualizar
				String nome = JOptionPane.showInputDialog("Informe o nome do produto que voc� deseja atualizar");

				// Procurando pelo nome
				int posicao = -1;
				for (int j = 0; j < i; j++) {

					// Verificando se o nome informado est� na lista
					if (nomeProduto[j].equals(nome)) {

						posicao = j;
						break;
					}

				}

				// Atualizando produto
				if (posicao > -1) {

					nomeProduto[posicao] = JOptionPane.showInputDialog("Informe o novo nome");
					valorProduto[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Informe o novo valor"));
					estoqueProduto[posicao] = Integer
							.parseInt(JOptionPane.showInputDialog("Informe a quantidade em estoque"));

				} else {

					JOptionPane.showMessageDialog(null, "O produto " + nome + " n�o foi encontrado");

				}

				break;
			case 4:

				// Obtendo nome do produto que deseja excluir
				nome = JOptionPane.showInputDialog("Informe o nome do produto que voc� deseja excluir");

				// Procurando pelo nome
				boolean encontrado = false;
				for (int j = 0; j < i; j++) {

					// Verificando se o nome informado est� na lista
					if (nomeProduto[j].equals(nome)) {
						encontrado = true;

						// Trocando informa��es dos produtos
						for (int k = j; k < i; k++) {
							nomeProduto[k] = nomeProduto[k + 1];
							valorProduto[k] = valorProduto[k + 1];
							estoqueProduto[k] = estoqueProduto[k + 1];
						}

						// Decrementando contador de produtos cadastrados
						i--;

						// Informando que o produto foi exclu�do
						JOptionPane.showMessageDialog(null, nome + " foi exclu�do");

						break;
					}
				}

				// Caso o nome n�o seja encontrado � mostrada uma mensagem
				// informando
				if (!encontrado) {
					JOptionPane.showMessageDialog(null, "O produto " + nome + " n�o foi encontrado");
				}

				break;
			case 5:
				continuar = false;
				break;
			}

		} while (continuar);
	}

}
