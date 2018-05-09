/*Criar um sistema onde o usu�rio ter� as seguintes op��es:
e. Cadastrar filme
f. Cadastrar usu�rio
g. Locar filme
h. Excluir filme
i. Excluir usu�rio
j. Filmes locados
a. Cadastrar filme: Dever� ser pedido o nome do filme, g�nero e valor do filme alugado.
b. Cadastrar usu�rio: Dever� ser pedido, nome, idade, endere�o, telefone e e-mail. N�o poder� ter nomes
repetidos.
c. Locar filme: Dever� ser pedido o nome do usu�rio e o nome do filme, especificar a quantidade de dias
que ser� alugado. Cadastre em uma matriz o nome do usu�rio, filme, dias alugados, valor do filme e o
total a pagar.
d. Excluir usu�rio: Poder� ser exclu�do o usu�rio apenas se n�o houver nenhum filme locado.
e. Excluir filme: Poder� ser exclu�do o filme, caso n�o esteja sendo locado.
f. Filmes locados: Exibir os filmes locados, juntamente com o nome do usu�rio, quantidade de dias e total
a pagar. Os filmes e usu�rios exclu�dos n�o dever�o aparecer nessa listagem.*/

package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex09test {

	public static void main(String[] args) {

		// Vetores
		String filmes[][] = new String[3][10];
		String usuarios[][] = new String[5][10];
		String locacoes[][] = new String[5][10];

		// Variaveis
		double valor = 0;
		String filme;
		String user;
		String email;
		String telefone;
		String endereco;
		String idade;
		String nome;
		String escolha = "";
		String valorTotal;
		int index = -1;
		int indexFilme = 0;
		int filmesX = -1;
		int dias;
		int cadastrarFilme = 0, cadastrarUsuario = 0, cadL = 0;
		boolean alugou = false;
		boolean existe = false;
		boolean alugado = false;

		String opcoes = "LOCADORA\n\n";
		opcoes += "A. Cadastrar Filme\n";
		opcoes += "B. Cadastrar Usu�rio\n";
		opcoes += "C. Locar Filme\n";
		opcoes += "D. Excluir Filme\n";
		opcoes += "E. Excluir Usu�rio\n";
		opcoes += "F. Filmes Locados\n";
		opcoes += "G. Sair";

		// La�o principal

		do {

			// Obtendo escolha
			escolha = JOptionPane.showInputDialog(opcoes).toUpperCase();

			// Verificando escolha
			switch (escolha) {

			case "A": {

				// Obtendo nome do filme
				filmes[0][cadastrarFilme] = JOptionPane.showInputDialog("Informe o nome do filme");

				// Obtendo g�nero do filme
				filmes[1][cadastrarFilme] = JOptionPane.showInputDialog("Informe o g�nero do filme");

				// Obtendo valor do filme

				while (true) {
					try {
						valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de loca��o do filme"));
						break;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Valor inv�lido");
					}
				}
				filmes[2][cadastrarFilme] = String.format("%.2f", valor);

				JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso");

				// Incrementando contador
				cadastrarFilme++;
				break;
			}

			case "B": {

				// Obtendo nome do usu�rio
				nome = JOptionPane.showInputDialog("Informe o nome do usu�rio");

				// Validando nome do usu�rio
					existe = false;
				for (int i = 0; i < cadastrarUsuario; i++) {
					if (nome.equals(usuarios[0][i])) {
						existe = true;
						break;
					}
				}
				while (existe) {
					JOptionPane.showMessageDialog(null, "Nome j� existente");

					// Recebendo nome de usuario novamente
					nome = JOptionPane.showInputDialog("Informe o nome do usu�rio");

					// Validando nome do usu�rio
					existe = false;
					for (int i = 0; i < cadastrarUsuario; i++) {
						if (nome.equals(usuarios[0][i])) {
							existe = true;
							break;
						}
					}
				}

				// Obtendo idade do usu�rio

				while (true) {
					try {
						int i = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do usu�rio"));
						idade = Integer.toString(i);
						break;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Idade inv�lida");
					}
				}

				// Obtendo endere�o
				endereco = JOptionPane.showInputDialog("Informe o endere�o do usu�rio");

				// Obtendo telefone
				telefone = JOptionPane.showInputDialog("Informe o telefone do usu�rio");

				// Obtendo email
				email = JOptionPane.showInputDialog("Informe o email do usu�rio");

				JOptionPane.showMessageDialog(null, "Usu�rio cadastrado com sucesso");

				// Atribuindo valores ao vetor
				usuarios[0][cadastrarUsuario] = nome;
				usuarios[1][cadastrarUsuario] = idade;
				usuarios[2][cadastrarUsuario] = endereco;
				usuarios[3][cadastrarUsuario] = telefone;
				usuarios[4][cadastrarUsuario] = email;

				// Incrementando contador
				cadastrarUsuario++;
				break;
			}

			case "C": {

				// Obtendo nome do usu�rio
				user = JOptionPane.showInputDialog("Informe o nome do usu�rio");

				// Verificando se o usu�rio existe
				existe = false;
				
				for (int i = 0; i < cadastrarUsuario; i++) {
					if (user.equals(usuarios[0][i])) {
						
						existe = true;
						break;
					}
				}
				if (!existe) {
					JOptionPane.showMessageDialog(null, "Usu�rio n�o encontrado");
					break;
				}

				// Obtendo nome do filme
				filme = JOptionPane.showInputDialog("Informe o nome do filme");

				// Verificando se o filme existe
				existe = false;

				for (int i = 0; i < cadastrarFilme; i++) {
					if (filme.equals(filmes[0][i])) {
						indexFilme = i;
						existe = true;
						break;
					}
				}
				if (!existe) {
					JOptionPane.showMessageDialog(null, "Filme n�o encontrado");
					break;
				}

				// Obtendo quantidade de dias

				while (true) {
					try {
						dias = Integer
								.parseInt(JOptionPane.showInputDialog("Informe por quantos dias o filme ser� alugado"));
						break;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Valor inv�lido");
					}
				}

				// Exibindo valor total
				valorTotal = String.format("%.2f",
						dias * Double.parseDouble(filmes[2][indexFilme].replaceAll(",", ".")));
				JOptionPane.showMessageDialog(null, "Valor total da loca��o: R$" + valorTotal);

				// Atribuindo valores ao vetor
				locacoes[0][cadL] = user;
				locacoes[1][cadL] = filme;
				locacoes[2][cadL] = Integer.toString(dias);
				locacoes[3][cadL] = filmes[indexFilme][2];
				locacoes[4][cadL] = valorTotal;

				// Incrementando contador
				cadL++;
				break;
			}

			case "D": {

				// Obtendo nome do filme
				nome = JOptionPane.showInputDialog("Informe o nome do filme");

				// Prcurando pelo filme

				for (int i = 0; i < cadastrarFilme; i++) {
					if (nome.equals(filmes[0][i])) {
						filmesX = i;
						break;
					}
				}

				// Verificando se o filme foi encontrado
				if (filmesX > -1) {

					// Procurando por loca��es do filme

					for (int i = 0; i < cadL; i++) {
						if (nome.equals(locacoes[0][i])) {
							alugado = true;
							break;
						}
					}

					// Verificando se o filme foi alugado
					if (!alugado) {

						// Trocando valores do array
						for (int i = 0; i < cadastrarFilme; i++) {
							filmes[0][i] = filmes[0][i + 1];
							filmes[1][i] = filmes[1][i + 1];
							filmes[2][i] = filmes[2][i + 1];
						}

						JOptionPane.showMessageDialog(null, "Filme exclu�do com sucesso");

					} else {
						JOptionPane.showMessageDialog(null, "O filme n�o pode ser exclu�do pois est� alugado");
					}

				} else {
					JOptionPane.showMessageDialog(null, "Filme n�o encontrado");
				}

				// Decrementando contandor
				cadastrarFilme--;
				break;

			}

			case "E": {

				// Obtendo nome do usu�rio
				nome = JOptionPane.showInputDialog("Informe o nome do usu�rio");

				// Procurando pelo usu�rio
				
				for (int i = 0; i < cadastrarUsuario; i++) {
					if (nome.equals(usuarios[0][i])) {
						index = i;
						break;
					}
				}

				// Verificando se o usu�rio foi encontrado
				if (index > -1) {

					// Procurando por loca��es em nome do usu�rio

					for (int i = 0; i < cadL; i++) {
						if (nome.equals(locacoes[0][i])) {
							alugou = true;
							break;
						}
					}

					// Verificando se alguma loca��o foi encontrada
					if (alugou) {
						JOptionPane.showMessageDialog(null,
								"O usu�rio n�o pode ser exclu�do pois est� com um filme alugado");
						break;
					}

					// Arrumando array
					for (int i = 0; i < cadastrarUsuario; i++) {
						usuarios[0][i] = usuarios[0][i + 1];
						usuarios[1][i] = usuarios[1][i + 1];
						usuarios[2][i] = usuarios[2][i + 1];
						usuarios[3][i] = usuarios[3][i + 1];
						usuarios[4][i] = usuarios[4][i + 1];
					}

					JOptionPane.showMessageDialog(null, "Usu�rio exclu�do com sucesso");

				} else {
					JOptionPane.showMessageDialog(null, "Usu�rio n�o encontrado");
				}

				// Decrementando contador
				cadastrarUsuario--;
				break;
			}

			case "F": {

				String info = "LOCA��ES\n\n";

				// Concatenando filmes locados
				for (int i = 0; i < cadL; i++) {
					info += locacoes[1][i] + " foi alugado por " + locacoes[0][i] + " pelo per�odo de " + locacoes[2][i]
							+ " dias com o valor total de R$" + locacoes[4][i] + "\n";
				}

				// Exibindo informa��es
				JOptionPane.showMessageDialog(null, info);

			}
			}

		} while (!escolha.equals("G"));

	}

}