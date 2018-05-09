/*Desenvolver um sistema para cadastrar até 30 produtos. Antes de realizar as funções deverá ser
pedido um usuário e uma senha. Deixe pré-cadastrado um array com usuário e senha, se o usuário e a
senha informados pertencerem ao mesmo índice será liberada a área contendo as funções do sistema,
caso contrário irá pedir o usuário e a senha novamente.
Funções do sistema:
a. Cadastrar produtos.
b. Alterar produtos.
c. Excluir produtos.
d. Listar produtos.
e. Cadastrar clientes.
f. Alterar clientes.
g. Excluir clientes.
h. Listar clientes.
i. Realizar venda.
j. Excluir venda.
k. Verificar estoque.
l. Extrato.
a. Pedir o nome do produto, fabricante, quantidade em estoque e valor unitário.
b. Para alterar produtos deverá ser pedido o nome do produto. Caso o produto exista será pedido
para recadastrar o nome, quantidade, fabricante e valor unitário.
c. Para excluir o produto basta pedir o nome e realizar a exclusão.
d. Exibir o nome do produto, fabricante, quantidade em estoque e valor unitário.
e. Cadastro de clientes consiste em: Nome, sobrenome, email, telefone e endereço.
f. Procurar pelo nome do cliente e alterar todos os campos.
g. Excluir clientes através do nome.
h. Exibir a lista contendo todos os clientes cadastrados.
i. Pedir o código da venda, nome do produto, quantidade e se deseja continuar o laço ou não.
Quando sair do laço pedir o nome do cliente e vincular os produtos adquiridos em um vetor.
Quando realizada uma compra valide se a quantidade em estoque seja maior ou igual a pedida,
caso contrário não poderá ser efetuada a compra.
Não esqueça de subtrair da quantidade em estoque após realizar a compra dos produtos.
O código da venda é referente a compra de todos os produtos daquela venda. Isso vai auxiliar
a excluir os produtos.
Você pode digitar um código para a venda ou deixar que o sistema crie automaticamente uma
sequência numérica.
j. Através do código da venda será excluído todos os produtos vendidos naquela transação.
Incremente o estoque quando realizar uma exclusão de produtos.
k. Exibir todos os produtos vendidos, juntamente com o nome do cliente, valor unitário,
quantidade e total da compra.**/

package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex10 {

	static String produtos[][] = new String[4][30];
	static String clientes[][] = new String[4][30];

	public static void main(String[] args) {

		// Vetores
		String user[] = { "Admin", "Java" };
		String vendas[][][] = new String[4][10][10];

		// Variáveis
		int cadastrarProd = 0, cadastrarClient = 0, cadV = 0;

		String opcoes = "SISTEMA PRODUTOS.COM\n\n";
		opcoes += "A. Cadastrar Produto\n";
		opcoes += "B. Alterar Produto\n";
		opcoes += "C. Excluir Produto\n";
		opcoes += "D. Listar Produtos\n";
		opcoes += "E. Cadastrar Cliente\n";
		opcoes += "F. Aterar Cliente\n";
		opcoes += "G. Excluir Cliente\n";
		opcoes += "H. Listar Clientes\n";
		opcoes += "I. Realizar Venda\n";
		opcoes += "J. Excluir Venda\n";
		opcoes += "K. Verificar Estoque\n";
		opcoes += "L. Extrato\n";
		opcoes += "M. Sair";

		// Pedindo usuário e senha
		String usuario = JOptionPane.showInputDialog("Informe o nome de usuário");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		while ((!usuario.equals(user[0])) && (!senha.equals(user[1]))) {

			JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");

			// Pedindo usuário e senha
			usuario = JOptionPane.showInputDialog("Informe o nome de usuário");
			senha = JOptionPane.showInputDialog("Informe a senha");
		}

		// Laço principal
		String escolha = "";
		do {

			// Obtendo escolha
			escolha = JOptionPane.showInputDialog(opcoes).toUpperCase();

			// Verificando escolha
			switch (escolha) {

			case "A": {

				// Cadastrando Produto
				alterarProduto(cadastrarProd);

				// Incrementando contador
				cadastrarProd++;
				break;
			}

			case "B": {

				// Obtendo nome
				String nome = JOptionPane.showInputDialog("Informe o nome do produto que você deseja alterar");

				// Procurando por produto
				int indice = procurar(nome, produtos, cadastrarProd);

				// Verificando se o produto foi encontrado
				if (indice > -1) {
					alterarProduto(indice);
				} else {
					JOptionPane.showMessageDialog(null, "Produto não encontrado");
				}

				break;
			}

			case "C": {

				// Obtendo nome
				String nome = JOptionPane.showInputDialog("Informe o nome do produto");

				// Procurando por produto
				int indice = procurar(nome, produtos, cadastrarProd);

				// Verificando se o produto foi encontrado
				if (indice > -1) {
					// Excluindo produto e organizando lista
					produtos = organizar(produtos, indice, cadastrarProd);
				} else {
					JOptionPane.showMessageDialog(null, "Produto não encontrado");
				}

				// Decrementando contador
				cadastrarProd--;
				break;

			}

			case "D": {

				// Concatenando produtos
				String infoProd = "PRODUTOS\n\n";

				// Verificando se existe algum produto cadastrado
				if (cadastrarProd > 0) {
					for (int i = 0; i < cadastrarProd; i++) {
						infoProd += produtos[0][i] + " - " + produtos[1][i] + " - " + produtos[2][i]
								+ " em estoque - R$" + produtos[3][i] + "\n";
					}
				} else {
					infoProd = "Nenhum produto está cadastrado";
				}

				// Exibindo produtos
				JOptionPane.showMessageDialog(null, infoProd);
				break;
			}

			case "E": {

				// Cadastrando cliente
				alterarCliente(cadastrarClient);

				// Incrementando contador
				cadastrarClient++;
				break;
			}

			case "F": {

				// Obtendo nome
				String nome = JOptionPane.showInputDialog("Informe o nome do cliente que você deseja alterar");

				// Procurando cliente
				int indice = procurar(nome, clientes, cadastrarClient);

				// Verificando se o cliente foi encontrado
				if (indice > -1) {
					alterarCliente(indice);
				} else {
					JOptionPane.showMessageDialog(null, "Cliente não encontrado");
				}
				break;

			}

			case "G": {

				// Obtendo nome
				String nome = JOptionPane.showInputDialog("Informe o nome do cliente");

				// Procurando cliente
				int indice = procurar(nome, clientes, cadastrarClient);

				// Verificando se o cliente foi encontrado
				if (indice > -1) {
					organizar(clientes, indice, cadastrarClient);
				} else {
					JOptionPane.showMessageDialog(null, "Cliente não encontrado");
				}

				// Decrementando contador
				cadastrarClient--;
				break;
			}

			case "H": {

				// Concatenando clientes
				String infoClient = "CLIENTES\n\n";

				// Verificando se algum cliente foi cadastrado
				if (cadastrarClient > 0) {
					for (int i = 0; i < cadastrarClient; i++) {
						infoClient += clientes[0][i] + " - " + clientes[1][i] + " - " + clientes[2][i] + " - "
								+ clientes[3][i] + "\n";
					}
				} else {
					infoClient = "Nenhum cliente está cadastrado";
				}

				// Exibindo informações
				JOptionPane.showMessageDialog(null, infoClient);
				break;
			}

			case "I": {

				int continuar = 0;
				int qntProdCad = 0;

				do {

					// Obtendo nome
					String nome = JOptionPane.showInputDialog("Informe o nome do produto");

					// Procurando pelo produto
					int indice = procurar(nome, produtos, cadastrarProd);

					// Verificando se o produto foi encontrado
					if (indice == -1) {
						JOptionPane.showMessageDialog(null, "Produto não encontrado");
						continue;
					}

					if (produtos[2][indice].equals("0")) {
						JOptionPane.showMessageDialog(null, "Este produto não está em estoque");
						continue;
					}

					// Obtendo quantidade
					int qnt = 0;
					while (true) {
						try {
							qnt = Integer.parseInt(JOptionPane.showInputDialog(
									"Informe a quantidade do produto (máx." + produtos[2][indice] + ")"));

							// Verificando se a quantidade é válida
							if (qnt > Integer.parseInt(produtos[2][indice])) {
								JOptionPane.showMessageDialog(null,
										"O cliente não pode comprar mais do que há em estoque");
								continue;
							}
							produtos[2][indice] = String.valueOf(Integer.parseInt(produtos[2][indice]) - qnt);
							break;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Valor inválido");
						}
					}

					// Atribuindo valores aos vetores
					vendas[1][qntProdCad][cadV] = nome;
					vendas[2][qntProdCad][cadV] = String.valueOf(qnt);

					double total = Double.parseDouble(produtos[3][indice].replace(',', '.')) * qnt;
					vendas[3][qntProdCad][cadV] = String.format("%.2f", total);

					// Incrementando contador de produtos cadastrados
					qntProdCad++;

					// Verificando se a quantidade máxima de produtos
					// cadastrados foi atingida
					if (qntProdCad == 10) {
						JOptionPane.showMessageDialog(null, "A quantidade máxima de produtos cadastrados foi atingida");
						break;
					}

					// Verificando se ainda há algum produto em estoque
					boolean estoque = false;
					for (int i = 0; i < cadastrarProd; i++) {
						if (!produtos[2][i].equals("0")) {
							estoque = true;
						}
					}

					if (!estoque) {
						JOptionPane.showMessageDialog(null, "Não há mais produtos em estoque");
						break;
					}

					// Verificando se é para continuar
					continuar = JOptionPane.showConfirmDialog(null, "Continuar?", "", 0);

				} while (continuar == 0);

				// Obtendo nome do cliente
				String nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente");

				// Vinculando nome do cliente aos produtos
				for (int i = 0; i < qntProdCad; i++) {
					vendas[0][i][cadV] = nomeCliente;
				}

				// Incrementando contador de vendas
				cadV++;
				break;
			}

			case "J": {

				// Obtendo código da venda
				int codigo = 0;
				while (true) {
					try {
						codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da venda"));

						// Verificando se o código é válido
						if (codigo >= cadV) {
							JOptionPane.showMessageDialog(null, "Código inválido");
							continue;
						}
						break;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Valor inválido");
					}
				}

				// Excluindo venda
				int i = 0;
				while (vendas[0][i][codigo] != null) {

					int a = i + 1;
					vendas[0][i][codigo] = vendas[0][a][codigo];
					vendas[1][i][codigo] = vendas[1][a][codigo];
					vendas[2][i][codigo] = vendas[2][a][codigo];
					vendas[3][i][codigo] = vendas[3][a][codigo];

					// Incrementando contador
					i++;
				}

				cadV--;
				break;
			}

			case "K": {

				// Variável estoque
				String estoque = "VENDAS\n\n";

				// Concatenando vendas
				for (int i = 0; i < cadV; i++) {

					for (int a = 0; a < 10; a++) {

						// Verificando se a venda atual foi preenchida
						if (vendas[0][a][i] == null) {
							break;
						}

						// Procurando index do produto
						int indice = procurar(vendas[1][a][i], produtos, cadastrarProd);

						estoque += vendas[0][a][i] + " - " + vendas[2][a][i] + " " + vendas[1][a][i] + "(R$"
								+ produtos[3][indice] + ") - " + vendas[3][a][i] + "\n";
					}
				}

				// Verificando se há algum produto em estoque
				if (estoque.equals("VENDAS\n\n")) {
					estoque = "O estoque está intacto";
				}

				// Exibindo estoque
				JOptionPane.showMessageDialog(null, estoque);

				break;
			}

			case "L": {

				// Variável de extrato
				String extrato = "EXTRATO\n\n";
				double total = 0;

				// somando
				for (int i = 0; i < 10; i++) {
					for (int a = 0; a < 10; a++) {
						if (vendas[3][a][i] == null) {
							continue;
						}
						total += Double.parseDouble(vendas[3][a][i].replace(',', '.'));
					}
				}

				extrato += "R$" + String.format("%.2f", total);

				// Exibindo extrato
				JOptionPane.showMessageDialog(null, extrato);
			}
			}

		} while (!escolha.equals("M"));
	}

	// Função utilizada para cadastrar ou alterar clientes
	public static void alterarProduto(int i) {

		// Obtendo nome
		produtos[0][i] = JOptionPane.showInputDialog("Informe o nome do produto");

		// Obtendo fabricante
		produtos[1][i] = JOptionPane.showInputDialog("Informe o fabricante do produto");

		// Obtendo quantidade em estoque
		while (true) {
			try {
				int qnt = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade em estoque do produto"));
				produtos[2][i] = Integer.toString(qnt);
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Valor inválido");
			}
		}

		// Obtendo valor unitário
		while (true) {
			try {
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor unitário do produto"));
				produtos[3][i] = String.format("%.2f", valor);
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Valor inválido");
			}
		}

		JOptionPane.showMessageDialog(null, "Produto alterado com sucesso");
	}

	// Função utilizada para cadastrar ou alterar clientes
	public static void alterarCliente(int i) {

		// Obtendo nome
		clientes[0][i] = JOptionPane.showInputDialog("Informe o nome completo do cliente");

		// Obtendo email
		clientes[1][i] = JOptionPane.showInputDialog("Informe o email do cliente");

		// Obtendo o telefone do cliente
		clientes[2][i] = JOptionPane.showInputDialog("Informe o telefone do cliente");

		// Obtendo o endereço do cliente
		clientes[3][i] = JOptionPane.showInputDialog("Informe o endereço do cliente");

		JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso");
	}

	// Função utilizada para organizar arrays
	public static String[][] organizar(String[][] matriz, int min, int max) {

		for (int i = min; i < max; i++) {
			matriz[0][i] = matriz[0][i + 1];
			matriz[1][i] = matriz[1][i + 1];
			matriz[2][i] = matriz[2][i + 1];
			matriz[3][i] = matriz[3][i + 1];
		}

		return matriz;
	}

	public static int procurar(String nome, String[][] matriz, int max) {

		int indice = -1;

		for (int i = 0; i < max; i++) {
			if (nome.equals(matriz[0][i])) {
				indice = i;
				break;
			}
		}

		return indice;
	}

}