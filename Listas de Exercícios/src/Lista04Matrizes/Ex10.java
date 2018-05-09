/*Desenvolver um sistema para cadastrar at� 30 produtos. Antes de realizar as fun��es dever� ser
pedido um usu�rio e uma senha. Deixe pr�-cadastrado um array com usu�rio e senha, se o usu�rio e a
senha informados pertencerem ao mesmo �ndice ser� liberada a �rea contendo as fun��es do sistema,
caso contr�rio ir� pedir o usu�rio e a senha novamente.
Fun��es do sistema:
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
a. Pedir o nome do produto, fabricante, quantidade em estoque e valor unit�rio.
b. Para alterar produtos dever� ser pedido o nome do produto. Caso o produto exista ser� pedido
para recadastrar o nome, quantidade, fabricante e valor unit�rio.
c. Para excluir o produto basta pedir o nome e realizar a exclus�o.
d. Exibir o nome do produto, fabricante, quantidade em estoque e valor unit�rio.
e. Cadastro de clientes consiste em: Nome, sobrenome, email, telefone e endere�o.
f. Procurar pelo nome do cliente e alterar todos os campos.
g. Excluir clientes atrav�s do nome.
h. Exibir a lista contendo todos os clientes cadastrados.
i. Pedir o c�digo da venda, nome do produto, quantidade e se deseja continuar o la�o ou n�o.
Quando sair do la�o pedir o nome do cliente e vincular os produtos adquiridos em um vetor.
Quando realizada uma compra valide se a quantidade em estoque seja maior ou igual a pedida,
caso contr�rio n�o poder� ser efetuada a compra.
N�o esque�a de subtrair da quantidade em estoque ap�s realizar a compra dos produtos.
O c�digo da venda � referente a compra de todos os produtos daquela venda. Isso vai auxiliar
a excluir os produtos.
Voc� pode digitar um c�digo para a venda ou deixar que o sistema crie automaticamente uma
sequ�ncia num�rica.
j. Atrav�s do c�digo da venda ser� exclu�do todos os produtos vendidos naquela transa��o.
Incremente o estoque quando realizar uma exclus�o de produtos.
k. Exibir todos os produtos vendidos, juntamente com o nome do cliente, valor unit�rio,
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

		// Vari�veis
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

		// Pedindo usu�rio e senha
		String usuario = JOptionPane.showInputDialog("Informe o nome de usu�rio");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		while ((!usuario.equals(user[0])) && (!senha.equals(user[1]))) {

			JOptionPane.showMessageDialog(null, "Usu�rio ou senha incorretos");

			// Pedindo usu�rio e senha
			usuario = JOptionPane.showInputDialog("Informe o nome de usu�rio");
			senha = JOptionPane.showInputDialog("Informe a senha");
		}

		// La�o principal
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
				String nome = JOptionPane.showInputDialog("Informe o nome do produto que voc� deseja alterar");

				// Procurando por produto
				int indice = procurar(nome, produtos, cadastrarProd);

				// Verificando se o produto foi encontrado
				if (indice > -1) {
					alterarProduto(indice);
				} else {
					JOptionPane.showMessageDialog(null, "Produto n�o encontrado");
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
					JOptionPane.showMessageDialog(null, "Produto n�o encontrado");
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
					infoProd = "Nenhum produto est� cadastrado";
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
				String nome = JOptionPane.showInputDialog("Informe o nome do cliente que voc� deseja alterar");

				// Procurando cliente
				int indice = procurar(nome, clientes, cadastrarClient);

				// Verificando se o cliente foi encontrado
				if (indice > -1) {
					alterarCliente(indice);
				} else {
					JOptionPane.showMessageDialog(null, "Cliente n�o encontrado");
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
					JOptionPane.showMessageDialog(null, "Cliente n�o encontrado");
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
					infoClient = "Nenhum cliente est� cadastrado";
				}

				// Exibindo informa��es
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
						JOptionPane.showMessageDialog(null, "Produto n�o encontrado");
						continue;
					}

					if (produtos[2][indice].equals("0")) {
						JOptionPane.showMessageDialog(null, "Este produto n�o est� em estoque");
						continue;
					}

					// Obtendo quantidade
					int qnt = 0;
					while (true) {
						try {
							qnt = Integer.parseInt(JOptionPane.showInputDialog(
									"Informe a quantidade do produto (m�x." + produtos[2][indice] + ")"));

							// Verificando se a quantidade � v�lida
							if (qnt > Integer.parseInt(produtos[2][indice])) {
								JOptionPane.showMessageDialog(null,
										"O cliente n�o pode comprar mais do que h� em estoque");
								continue;
							}
							produtos[2][indice] = String.valueOf(Integer.parseInt(produtos[2][indice]) - qnt);
							break;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Valor inv�lido");
						}
					}

					// Atribuindo valores aos vetores
					vendas[1][qntProdCad][cadV] = nome;
					vendas[2][qntProdCad][cadV] = String.valueOf(qnt);

					double total = Double.parseDouble(produtos[3][indice].replace(',', '.')) * qnt;
					vendas[3][qntProdCad][cadV] = String.format("%.2f", total);

					// Incrementando contador de produtos cadastrados
					qntProdCad++;

					// Verificando se a quantidade m�xima de produtos
					// cadastrados foi atingida
					if (qntProdCad == 10) {
						JOptionPane.showMessageDialog(null, "A quantidade m�xima de produtos cadastrados foi atingida");
						break;
					}

					// Verificando se ainda h� algum produto em estoque
					boolean estoque = false;
					for (int i = 0; i < cadastrarProd; i++) {
						if (!produtos[2][i].equals("0")) {
							estoque = true;
						}
					}

					if (!estoque) {
						JOptionPane.showMessageDialog(null, "N�o h� mais produtos em estoque");
						break;
					}

					// Verificando se � para continuar
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

				// Obtendo c�digo da venda
				int codigo = 0;
				while (true) {
					try {
						codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo da venda"));

						// Verificando se o c�digo � v�lido
						if (codigo >= cadV) {
							JOptionPane.showMessageDialog(null, "C�digo inv�lido");
							continue;
						}
						break;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Valor inv�lido");
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

				// Vari�vel estoque
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

				// Verificando se h� algum produto em estoque
				if (estoque.equals("VENDAS\n\n")) {
					estoque = "O estoque est� intacto";
				}

				// Exibindo estoque
				JOptionPane.showMessageDialog(null, estoque);

				break;
			}

			case "L": {

				// Vari�vel de extrato
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

	// Fun��o utilizada para cadastrar ou alterar clientes
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
				JOptionPane.showMessageDialog(null, "Valor inv�lido");
			}
		}

		// Obtendo valor unit�rio
		while (true) {
			try {
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor unit�rio do produto"));
				produtos[3][i] = String.format("%.2f", valor);
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Valor inv�lido");
			}
		}

		JOptionPane.showMessageDialog(null, "Produto alterado com sucesso");
	}

	// Fun��o utilizada para cadastrar ou alterar clientes
	public static void alterarCliente(int i) {

		// Obtendo nome
		clientes[0][i] = JOptionPane.showInputDialog("Informe o nome completo do cliente");

		// Obtendo email
		clientes[1][i] = JOptionPane.showInputDialog("Informe o email do cliente");

		// Obtendo o telefone do cliente
		clientes[2][i] = JOptionPane.showInputDialog("Informe o telefone do cliente");

		// Obtendo o endere�o do cliente
		clientes[3][i] = JOptionPane.showInputDialog("Informe o endere�o do cliente");

		JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso");
	}

	// Fun��o utilizada para organizar arrays
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