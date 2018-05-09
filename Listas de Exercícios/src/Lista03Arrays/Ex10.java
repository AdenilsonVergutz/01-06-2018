
/*10. Criar uma agenda. Nessa agenda dever� ter as seguintes op��es:
a. Cadastrar contatos
b. Alterar contatos
c. Excluir contatos
d. Pesquisar contatos
e. Cadastrar categoria
f. Alterar categoria
g. Excluir categoria
h. Lembrete de anivers�rio
a. Para o cadastro ser� pedido: Nome, sobrenome, data de nascimento (separe em tr�s vetores), email,
celular, endere�o e categoria. Valide os campos, � obrigat�rio tudo estar preenchido.
b. Atrav�s do nome do contato ser�o pedidos novamente os dados para realizar a altera��o.
c. Atrav�s do nome ser� pedido para excluir o contato. Pe�a para confirmar se realmente deseja
alterar o contato. Valida os campos, pois tudo deve estar preenchido.
d. Pesquisar com contatos atrav�s dos nomes.
e. Cadastrar categoria permite que voc� crie uma categoria nova. Cada contato obrigatoriamente
precisa ter uma categoria. O nome da categoria deve ser diferente de vazio.
f. Para alterar a categoria ser� pedido o nome, em seguida pedido o novo nome. O nome da
categoria precisa ser diferente de vazio.
g. Excluir categoria ser� pedido o nome da categoria. Caso exista algu�m cadastrado nessa
categoria voc� n�o conseguir� alterar o nome dela. Em outras palavras vc n�o pode ter nenhum
contato cadastrado para realizar a exclus�o da categoria, pois os contatos n�o podem ficar sem
categoria.
h. Para o lembrete de anivers�rio ser� pedido o m�s que a pessoa quer saber os aniversariantes.
Exiba o nome completo, dia, m�s e ano de nascimento.*/

package Lista03Arrays;

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {

		String[] sobrenomes = new String[1];
		String[] categorias = new String[10];
		String[] infos = new String[10];
		String[] datas = new String[10];
		String[] nomes = new String[1];
		int[] meses = new int[10];
		Object[] menu = { "Cadastrar contatos", "Alterar contatos", "Excluir contatos", "Pesquisar contatos",
				"Cadastrar categoria", "Alterar categoria", "Excluir categoria", "Lembrete de anivers�rio", "Sair" };
		Object escolha = "";
		String email = "";
		String celular = "";
		String endereco = "";
		String categoria = "";
		String data = "";
		String sobrenome = "";
		String nome = "";
		String info = "";
		int dia = 0;
		int mes = 0;
		int ano = 0;
		int quantContatos = 0;
		int confirmacao = 0;
		int quantCategorias = 0;
		boolean valido = false;

		// Menu escolha

		while (!escolha.equals("Sair")) {

			do {
				try {
					escolha = JOptionPane.showInputDialog(null, "Escolha uma op��o", "Menu", JOptionPane.PLAIN_MESSAGE,
							null, menu, "");
					valido = true;
				} catch (Exception e) {
					valido = false;
					JOptionPane.showMessageDialog(null, "Erro.");
				}
			} while (valido == false);

			if (escolha.equals("Sair")) {
				break;
			}

			if (escolha.equals("Cadastrar contatos")) {
				valido = false;
				boolean valido2 = false;
				do {
					do {
						try {
							nome = JOptionPane.showInputDialog("Digite o nome do novo contato");
							valido = true;
							if (nome.isEmpty()) {
								valido = false;
							}
						} catch (Exception e) {
							valido = false;
							JOptionPane.showMessageDialog(null, "Erro.");
						}
					} while (valido == false);

					valido = false;
					do {
						try {
							sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do novo contato");
							valido = true;
							if (sobrenome.isEmpty()) {
								valido = false;
							}
						} catch (Exception e) {
							valido = false;
							JOptionPane.showMessageDialog(null, "Erro.");
						}
					} while (valido == false);
					for (int i = 0; i < nomes.length; i++) {
						if ((nome.equals(nomes[i])) && (sobrenome.equals(sobrenomes[i]))) {
							valido2 = false;
							JOptionPane.showMessageDialog(null, "Pessoas j� cadastrada");
						}
					}
				} while (valido2 == false);

				valido = false;
				do {
					try {
						dia = Integer
								.parseInt(JOptionPane.showInputDialog("Digite o dia do nacimento do novo contato"));
						valido = true;
						if ((dia > 31) && (dia < 0)) {
							valido = false;
						}
					} catch (Exception e) {
						valido = false;
						JOptionPane.showMessageDialog(null, "Erro.");
					}
				} while (valido == false);

				valido = false;
				do {
					try {
						mes = Integer
								.parseInt(JOptionPane.showInputDialog("Digite o m�s do nacimento do novo contato"));
						valido = true;
						if ((mes > 12) && (mes < 0)) {
							valido = false;
						}
					} catch (Exception e) {
						valido = false;
						JOptionPane.showMessageDialog(null, "Erro.");
					}
				} while (valido == false);

				valido = false;
				do {
					try {
						ano = Integer
								.parseInt(JOptionPane.showInputDialog("Digite o ano do nacimento do novo contato"));
						valido = true;
						if (ano < 1900) {
							valido = false;
						}
					} catch (Exception e) {
						valido = false;
						JOptionPane.showMessageDialog(null, "Erro.");
					}
				} while (valido == false);

				valido = false;
				do {
					try {
						email = JOptionPane.showInputDialog("Digite o e-mail do novo contato");
						valido = true;
						if (email.isEmpty()) {
							valido = false;
						}
					} catch (Exception e) {
						valido = false;
						JOptionPane.showMessageDialog(null, "Erro.");
					}
				} while (valido == false);

				valido = false;
				do {
					try {
						celular = JOptionPane.showInputDialog("Digite o celular do novo contato");
						valido = true;
						if (celular.isEmpty()) {
							valido = false;
						}
					} catch (Exception e) {
						valido = false;
						JOptionPane.showMessageDialog(null, "Erro.");
					}
				} while (valido == false);

				valido = false;
				do {
					try {
						endereco = JOptionPane.showInputDialog("Digite o endere�o do novo contato");
						valido = true;
						if (endereco.isEmpty()) {
							valido = false;
						}
					} catch (Exception e) {
						valido = false;
						JOptionPane.showMessageDialog(null, "Erro.");
					}
				} while (valido == false);

				valido = false;
				do {
					try {
						categoria = JOptionPane.showInputDialog("Digite a categoria do novo contato");
						valido = true;
						if (categoria.isEmpty()) {
							valido = false;
						}
					} catch (Exception e) {
						valido = false;
						JOptionPane.showMessageDialog(null, "Erro.");
					}
				} while (valido == false);

				nomes[quantContatos] = nome;
				sobrenomes[quantContatos] = sobrenome;
				meses[quantContatos] = mes;
				data = dia + "/" + mes + "/" + ano;
				datas[quantContatos] = data;
				info = "E-mail: " + email + "\nCelular" + celular + "\nEndere�o: " + endereco + "\nCategoria: "
						+ categoria;
				infos[quantContatos] = info;
				quantContatos++;
				quantCategorias++;
			}

			if (escolha.equals("Alterar contatos")) {
				valido = false;
				do {
					try {
						nome = JOptionPane.showInputDialog("Digite o nome do contato a ser alterado");
						valido = true;
						if (nome.isEmpty()) {
							valido = false;
						}
					} catch (Exception e) {
						valido = false;
						JOptionPane.showInputDialog("Erro.");
					}
				} while (valido == false);

				for (int i = 0; i < nomes.length; i++) {
					if ((nome.equals(nomes[i])) && (sobrenome.equals(sobrenomes[i]))) {

						do {
							try {
								nome = JOptionPane.showInputDialog("Digite o nome do contato a ser alterado");
								valido = true;
								if (nome.isEmpty()) {
									valido = false;
								}
							} catch (Exception e) {
								valido = false;
								JOptionPane.showInputDialog("Erro.");
							}
						} while (valido == false);

						valido = false;
						do {
							try {
								sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do contato a ser exclu�do");
								valido = true;
								if (nome.isEmpty()) {
									valido = false;
								}
							} catch (Exception e) {
								valido = false;
								JOptionPane.showInputDialog("Erro.");
							}
						} while (valido == false);

						valido = false;
						do {
							try {
								dia = Integer.parseInt(
										JOptionPane.showInputDialog("Digite o dia do nacimento do novo contato"));
								valido = true;
								if ((dia > 31) && (dia < 0)) {
									valido = false;
								}
							} catch (Exception e) {
								valido = false;
								JOptionPane.showMessageDialog(null, "Erro.");
							}
						} while (valido == false);

						valido = false;
						do {
							try {
								mes = Integer.parseInt(
										JOptionPane.showInputDialog("Digite o m�s do nacimento do novo contato"));
								valido = true;
								if ((mes > 12) && (mes < 0)) {
									valido = false;
								}
							} catch (Exception e) {
								valido = false;
								JOptionPane.showMessageDialog(null, "Erro.");
							}
						} while (valido == false);

						valido = false;
						do {
							try {
								ano = Integer.parseInt(
										JOptionPane.showInputDialog("Digite o ano do nacimento do novo contato"));
								valido = true;
								if (ano < 1900) {
									valido = false;
								}
							} catch (Exception e) {
								valido = false;
								JOptionPane.showMessageDialog(null, "Erro.");
							}
						} while (valido == false);

						valido = false;
						do {
							try {
								email = JOptionPane.showInputDialog("Digite o e-mail do novo contato");
								valido = true;
								if (email.isEmpty()) {
									valido = false;
								}
							} catch (Exception e) {
								valido = false;
								JOptionPane.showMessageDialog(null, "Erro.");
							}
						} while (valido == false);

						valido = false;
						do {
							try {
								celular = JOptionPane.showInputDialog("Digite o celular do novo contato");
								valido = true;
								if (celular.isEmpty()) {
									valido = false;
								}
							} catch (Exception e) {
								valido = false;
								JOptionPane.showMessageDialog(null, "Erro.");
							}
						} while (valido == false);

						valido = false;
						do {
							try {
								endereco = JOptionPane.showInputDialog("Digite o endere�o do novo contato");
								valido = true;
								if (endereco.isEmpty()) {
									valido = false;
								}
							} catch (Exception e) {
								valido = false;
								JOptionPane.showMessageDialog(null, "Erro.");
							}
						} while (valido == false);

						valido = false;
						do {
							try {
								categoria = JOptionPane.showInputDialog("Digite a categoria do novo contato");
								valido = true;
								if (categoria.isEmpty()) {
									valido = false;
								}
							} catch (Exception e) {
								valido = false;
								JOptionPane.showMessageDialog(null, "Erro.");
							}
						} while (valido == false);

						nomes[i] = nome;
						sobrenomes[i] = sobrenome;
						meses[i] = mes;
						data = dia + "/" + mes + "/" + ano;
						datas[i] = data;
						info = "E-mail: " + email + "\nCelular" + celular + "\nEndere�o: " + endereco + "\nCategoria: "
								+ categoria;
						infos[i] = info;

					} else {
						System.out.println("Pessoa n�o encontrada");
					}

				}
			}
		}

		if (escolha.equals("Excluir contatos")) {

			valido = false;
			do {
				try {
					nome = JOptionPane.showInputDialog("Digite o nome do contato a ser alterado");
					valido = true;
					if (nome.isEmpty()) {
						valido = false;
					}
				} catch (Exception e) {
					valido = false;
					JOptionPane.showInputDialog("Erro.");
				}
			} while (valido == false);

			valido = false;
			do {
				try {
					sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do contato a ser exclu�do");
					valido = true;
					if (nome.isEmpty()) {
						valido = false;
					}
				} catch (Exception e) {
					valido = false;
					JOptionPane.showInputDialog("Erro.");
				}
			} while (valido == false);

			for (int j = 0; j < nomes.length; j++) {
				if ((nome.equals(nomes[j])) && (sobrenome.equals(sobrenomes[j]))) {
					valido = false;
					do {
						try {
							confirmacao = Integer.parseInt(JOptionPane.showInputDialog(
									"Tem certeza que deseja excluir esse contato(digite 1 para sim ou 2 para n�o)?(Todas as informa��es sobre esse contato ser�o perdidas)"));
							valido = true;
							if ((confirmacao != 1) && (confirmacao != 2)) {
								valido = true;
							}
						} catch (Exception e) {
							valido = false;
							JOptionPane.showMessageDialog(null, "Erro.");
						}
					} while (valido == false);

					if (confirmacao == 1) {
						nomes[j] = null;
						sobrenomes[j] = null;
						datas[j] = null;
						meses[j] = 0;
						infos[j] = null;
					}
				} else {
					System.out.println("Pessoa n�o encontrada");
				}
			}
		}

		if (escolha.equals("Pesquisar contatos")) {

			valido = false;
			do {
				try {
					nome = JOptionPane.showInputDialog("Digite o nome do contato a ser pesquisado");
					valido = true;
					if (nome.isEmpty()) {
						valido = false;
					}
				} catch (Exception e) {
					valido = false;
					JOptionPane.showInputDialog("Erro.");
				}
			} while (valido == false);

			for (int j = 0; j < nomes.length; j++) {
				if (nome.equals(nomes[j])) {
					JOptionPane.showMessageDialog(null, "Nome: " + nomes[j] + "\nSobrenome: " + sobrenomes[j]
							+ "\nData de nascimento: " + datas[j] + "\n" + infos[j]);
				}
			}
		}

		if (escolha.equals("Cadastrar categoria")) {
			valido = false;
			do {
				try {
					categoria = JOptionPane.showInputDialog(null, "Digite a nova categoria");
					if (categoria.isEmpty()) {
						valido = false;
					}
				} catch (Exception e) {
					valido = false;
					JOptionPane.showMessageDialog(null, "Erro.");
				}
			} while (valido == false);

			for (int i = 0; i < categorias.length; i++) {
				if (!categoria.equals(categorias[i])) {
					categorias[quantCategorias] = categoria;
					quantCategorias++;
				}
			}
		}

		if (escolha.equals("Alterar categoria")) {
			valido = false;
			do {
				try {
					categoria = JOptionPane.showInputDialog(null, "Digite a categoria a ser alterada");
					if (categoria.isEmpty()) {
						valido = false;
					}
				} catch (Exception e) {
					valido = false;
					JOptionPane.showMessageDialog(null, "Erro.");
				}
			} while (valido == false);

			for (int i = 0; i < categorias.length; i++) {
				if (categoria.equals(categorias[i])) {
					valido = false;
					do {
						try {
							categoria = JOptionPane.showInputDialog(null, "Digite o novo nome da categoria");
							if (categoria.isEmpty()) {
								valido = false;
							}
						} catch (Exception e) {
							valido = false;
							JOptionPane.showMessageDialog(null, "Erro.");
						}
					} while (valido == false);

					categorias[i] = categoria;
				}
			}
		}

		if (escolha.equals("Excluir categoria")) {
			valido = false;
			do {
				try {
					categoria = JOptionPane.showInputDialog(null, "Digite a categoria a ser alterada");
					if (categoria.isEmpty()) {
						valido = false;
					}
				} catch (Exception e) {
					valido = false;
					JOptionPane.showMessageDialog(null, "Erro.");
				}
			} while (valido == false);

			for (int i = 0; i < categorias.length; i++) {
				if (categoria.equals(categorias[i])) {
					categorias[i] = null;
				}
			}
		}

		if (escolha.equals("Lembrete de anivers�rio")) {

		}
	}
}
