/*Criar um sistema onde o usuário terá as seguintes opções:
e. Cadastrar filme
f. Cadastrar usuário
g. Locar filme
h. Excluir filme
i. Excluir usuário
j. Filmes locados
a. Cadastrar filme: Deverá ser pedido o nome do filme, gênero e valor do filme alugado.
b. Cadastrar usuário: Deverá ser pedido, nome, idade, endereço, telefone e e-mail. Não poderá ter nomes
repetidos.
c. Locar filme: Deverá ser pedido o nome do usuário e o nome do filme, especificar a quantidade de dias
que será alugado. Cadastre em uma matriz o nome do usuário, filme, dias alugados, valor do filme e o
total a pagar.
d. Excluir usuário: Poderá ser excluído o usuário apenas se não houver nenhum filme locado.
e. Excluir filme: Poderá ser excluído o filme, caso não esteja sendo locado.
f. Filmes locados: Exibir os filmes locados, juntamente com o nome do usuário, quantidade de dias e total
a pagar. Os filmes e usuários excluídos não deverão aparecer nessa listagem.*/


package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex09 {

	public static void main(String[] args) {


		//Vetores
		String filmes[][] = new String[3][10];
		String usuarios[][] = new String[5][10];
		String locacoes[][] = new String[5][10];
		
		//Variaveis
		int cadF = 0, cadU = 0, cadL = 0;
		String opcoes = "LOCADORA\n\n";
			   opcoes+= "A. Cadastrar Filme\n";
			   opcoes+= "B. Cadastrar Usuário\n";
			   opcoes+= "C. Locar Filme\n";
			   opcoes+= "D. Excluir Filme\n";
			   opcoes+= "E. Excluir Usuário\n";
			   opcoes+= "F. Filmes Locados\n";
			   opcoes+= "G. Sair";
		
		//Laço principal
		String escolha = "";
		do {
			
			//Obtendo escolha
			escolha = JOptionPane.showInputDialog(opcoes).toUpperCase();
			
			//Verificando escolha
			switch(escolha) {
			
				case "A": {
					
					//Obtendo nome do filme
					filmes[0][cadF] = JOptionPane.showInputDialog("Informe o nome do filme");
					
					//Obtendo gênero do filme
					filmes[1][cadF] = JOptionPane.showInputDialog("Informe o gênero do filme");
					
					//Obtendo valor do filme
					double valor = 0;
					while (true) {
						try {
							valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de locação do filme"));
							break;
						} catch(Exception e) {
							JOptionPane.showMessageDialog(null, "Valor inválido");
						}
					}
					filmes[2][cadF] = String.format("%.2f", valor);
					
					JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso");
					
					//Incrementando contador
					cadF++;
					break;
				}
				
				case "B": {
					
					//Obtendo nome do usuário
					String nome = JOptionPane.showInputDialog("Informe o nome do usuário");
					
					//Validando nome do usuário
					boolean existe = false;
					for (int i = 0; i < cadU; i++) {
						if (nome.equals(usuarios[0][i])) {
							existe = true;
							break;
						}
					}
					while (existe) {
						JOptionPane.showMessageDialog(null, "Nome já existente");
						
						//Recebendo nome de usuario novamente
						nome = JOptionPane.showInputDialog("Informe o nome do usuário");
						
						//Validando nome do usuário
						existe = false;
						for (int i = 0; i < cadU; i++) {
							if (nome.equals(usuarios[0][i])) {
								existe = true;
								break;
							}
						}
					}
					
					//Obtendo idade do usuário
					String idade;
					while (true) {
						try {
							int i = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do usuário"));
							idade = Integer.toString(i);
							break;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Idade inválida");
						}
					}
					
					//Obtendo endereço
					String endereco = JOptionPane.showInputDialog("Informe o endereço do usuário");
					
					//Obtendo telefone
					String telefone = JOptionPane.showInputDialog("Informe o telefone do usuário");
					
					//Obtendo email
					String email = JOptionPane.showInputDialog("Informe o email do usuário");
					
					JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
					
					//Atribuindo valores ao vetor
					usuarios[0][cadU] = nome;
					usuarios[1][cadU] = idade;
					usuarios[2][cadU] = endereco;
					usuarios[3][cadU] = telefone;
					usuarios[4][cadU] = email;
					
					//Incrementando contador
					cadU++;
					break;
				}
				
				case "C": {
					
					//Obtendo nome do usuário
					String user = JOptionPane.showInputDialog("Informe o nome do usuário");
					
					//Verificando se o usuário existe
					boolean existe = false;
					
					for (int i = 0; i < cadU; i++) {
						if (user.equals(usuarios[0][i])) {
							
							existe = true;
							break;
						}
					}
					if (!existe) { 
						JOptionPane.showMessageDialog(null, "Usuário não encontrado");
						break; 
					}
					
					//Obtendo nome do filme
					String filme = JOptionPane.showInputDialog("Informe o nome do filme");
					
					//Verificando se o filme existe
					existe = false;
					int indexF = 0;
					for (int i = 0; i < cadF; i++) {
						if (filme.equals(filmes[0][i])) {
							indexF = i;
							existe = true;
							break;
						}
					}
					if (!existe) {
						JOptionPane.showMessageDialog(null, "Filme não encontrado");
						break;
					}
					
					//Obtendo quantidade de dias
					int dias;
					while (true) {
						try {
							dias = Integer.parseInt(JOptionPane.showInputDialog("Informe por quantos dias o filme será alugado"));
							break;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Valor inválido");
						}
					}
					
					//Exibindo valor total
					String valorTotal = String.format("%.2f", dias * Double.parseDouble(filmes[2][indexF].replaceAll(",", ".")));
					JOptionPane.showMessageDialog(null, "Valor total da locação: R$" + valorTotal);
					
					//Atribuindo valores ao vetor
					locacoes[0][cadL] = user;
					locacoes[1][cadL] = filme;
					locacoes[2][cadL] = Integer.toString(dias);
					locacoes[3][cadL] = filmes[indexF][2];
					locacoes[4][cadL] = valorTotal;
					
					//Incrementando contador
					cadL++;
					break;
				}
				
				case "D": {
					
					//Obtendo nome do filme
					String nome = JOptionPane.showInputDialog("Informe o nome do filme");
					
					//Prcurando pelo filme
					int index = -1;
					for (int i = 0; i < cadF; i++) {
						if (nome.equals(filmes[0][i])) {
							index = i;
							break;
						}
					}
					
					//Verificando se o filme foi encontrado
					if (index > -1) {
						
						//Procurando por locações do filme
						boolean alugado = false;
						for (int i = 0; i < cadL; i++) {
							if (nome.equals(locacoes[0][i])) {
								alugado = true;
								break;
							}
						}
						
						//Verificando se o filme foi alugado
						if (!alugado) {
							
							//Trocando valores do array
							for (int i = 0; i < cadF; i++) {
								filmes[0][i] = filmes[0][i+1];
								filmes[1][i] = filmes[1][i+1];
								filmes[2][i] = filmes[2][i+1];
							}
							
							JOptionPane.showMessageDialog(null, "Filme excluído com sucesso");
							
						} else {
							JOptionPane.showMessageDialog(null, "O filme não pode ser excluído pois está alugado");
						}
						
					} else {
						JOptionPane.showMessageDialog(null, "Filme não encontrado");
					}
					
					//Decrementando contandor
					cadF--;
					break;
					
				}
				
				case "E": {
					
					//Obtendo nome do usuário
					String nome = JOptionPane.showInputDialog("Informe o nome do usuário");
					
					//Procurando pelo usuário
					int index = -1;
					for (int i = 0; i < cadU; i++) {
						if (nome.equals(usuarios[0][i])) {
							index = i;
							break;
						}
					}
					
					//Verificando se o usuário foi encontrado
					if (index > -1) {
						
						//Procurando por locações em nome do usuário
						boolean alugou = false;
						for (int i = 0; i < cadL; i++) {
							if (nome.equals(locacoes[0][i])) {
								alugou = true;
								break;
							}
						}
						
						//Verificando se alguma locação foi encontrada
						if (alugou) {
							JOptionPane.showMessageDialog(null, "O usuário não pode ser excluído pois está com um filme alugado");
							break;
						}
						
						//Arrumando array
						for (int i = 0; i < cadU; i++) {
							usuarios[0][i] = usuarios[0][i+1];
							usuarios[1][i] = usuarios[1][i+1];
							usuarios[2][i] = usuarios[2][i+1];
							usuarios[3][i] = usuarios[3][i+1];
							usuarios[4][i] = usuarios[4][i+1];
						}
						
						JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");
						
					} else {
						JOptionPane.showMessageDialog(null, "Usuário não encontrado");
					}
					
					//Decrementando contador
					cadU--;
					break;
				}
				
				case "F": {
					
					String info = "LOCAÇÕES\n\n";
					
					//Concatenando filmes locados
					for (int i = 0; i < cadL; i++) {
						info += locacoes[1][i] + " foi alugado por " + locacoes[0][i] + " pelo período de " + locacoes[2][i] + " dias com o valor total de R$" + locacoes[4][i] + "\n"; 
					}
					
					//Exibindo informações
					JOptionPane.showMessageDialog(null, info);
					
				}
			}
			
		} while (!escolha.equals("G"));

	}

}