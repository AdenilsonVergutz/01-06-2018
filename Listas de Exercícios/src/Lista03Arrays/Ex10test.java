package Lista03Arrays;

import javax.swing.JOptionPane;

public class Ex10test {

	public static void main(String[] args) {


		//Vetores
				String nomeContato[] = new String[10];
				String sobrenomeContato[] = new String[10];
				String emailContato[] = new String[10];
				String enderecoContato[] = new String[10];
				String categoriaContato[] = new String[10];
				int celularContato[] = new int[10];
				int diaNascimentoContato[] = new int[10];
				int mesNascimentoContato[] = new int[10];
				int anoNascimentoContato[] = new int[10];
				Object categorias[] = new Object[10];
				
				//Variáveis
				int contContato = 0, contCategoria = 0;
				boolean continuar = true;
				
				//Laço principal
				while (continuar) {
					
					//Opções
					Object[] opcoes = {"Cadastrar contatos", "Alterar contatos", "Excluir contatos", "Pesquisar contatos", "Cadastrar categoria", "Alterar categoria", "Excluir categoria", "Lembrete de aniversário", "Sair"};
					
					//Recebendo opção escolhida
					Object escolhida = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, opcoes, "");
					
					//Verificando qual opção foi escolhida
					switch (escolhida.toString()) {
						case "Cadastrar contatos":
							
							//Verificando se a lista de contatos não está cheia
							if (contContato < 10) {
								//Obtendo dados do novo contato
								
								//Nome
								nomeContato[contContato] = JOptionPane.showInputDialog("Informe o nome do contato");
								
								//Validando nome
								while (nomeContato[contContato].isEmpty()) {
									JOptionPane.showMessageDialog(null, "Nome inválido");
									nomeContato[contContato] = JOptionPane.showInputDialog("Informe o nome do contato");
								}
								
								//Sobrenome
								sobrenomeContato[contContato] = JOptionPane.showInputDialog("Informe o sobrenome do contato");
								
								//Validando sobrenome
								while (sobrenomeContato[contContato].isEmpty()) {
									JOptionPane.showMessageDialog(null, "Nome inválido");
									sobrenomeContato[contContato] = JOptionPane.showInputDialog("Informe o sobrenome do contato");
								}
								
								//Dia de nascimento
								diaNascimentoContato[contContato] = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia de nascimento do contato"));
								
								//Validando dia
								while ((diaNascimentoContato[contContato] < 0) || (diaNascimentoContato[contContato] > 30)) {
									JOptionPane.showMessageDialog(null, "Dia inválido");
									diaNascimentoContato[contContato] = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia de nascimento do contato"));
								}
								
								//Mês de nascimento
								mesNascimentoContato[contContato] = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês de nascimento do contato"));
								
								//Validando mês
								while ((mesNascimentoContato[contContato] < 0) || (mesNascimentoContato[contContato] > 12)) {
									JOptionPane.showMessageDialog(null, "Mês inválido");
									mesNascimentoContato[contContato] = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês de nascimento do contato"));
								}
								
								//Ano de nascimento
								anoNascimentoContato[contContato] = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento do contato"));
								
								//Validando ano
								while (anoNascimentoContato[contContato] < 0) {
									JOptionPane.showMessageDialog(null, "Ano inválido");
									anoNascimentoContato[contContato] = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento do contato"));
								}
								
								//E-mail
								emailContato[contContato] = JOptionPane.showInputDialog("Informe o email do contato");
								
								//Validando e-mail
								while (emailContato[contContato].isEmpty()) {
									JOptionPane.showMessageDialog(null, "E-mail inválido");
									emailContato[contContato] = JOptionPane.showInputDialog("Informe o email do contato");
								}
								
								//Endereço
								enderecoContato[contContato] = JOptionPane.showInputDialog("Informe o endereço do contato");
								
								//Validando endereço
								while (enderecoContato[contContato].isEmpty()) {
									JOptionPane.showMessageDialog(null, "Endereço inválido");
									enderecoContato[contContato] = JOptionPane.showInputDialog("Informe o endereço do contato");
								}
								
								//Celular
								celularContato[contContato] = Integer.parseInt(JOptionPane.showInputDialog("Informe o celular do contato"));
								
								//Validando celular
								while (Integer.toString(celularContato[contContato]).length() < 8) {
									JOptionPane.showMessageDialog(null, "Celular inválido");
									celularContato[contContato] = Integer.parseInt(JOptionPane.showInputDialog("Informe o celular do contato"));
								}
								
								//Categoria
								//Verifica se alguma categoria foi registrada
								if (contCategoria == 0) {
									JOptionPane.showMessageDialog(null, "Nenhuma categoria foi registrada. Não será possível fazer o cadastro do contato");
									break;
								}
								//Juntando categorias existentes
								Object opcoesCategoria[] = new Object[contCategoria];
								for (int i = 0; i < contCategoria; i++) {
									opcoesCategoria[i] = categorias[i];
								}
								
								categoriaContato[contContato] = JOptionPane.showInputDialog(null, "Escolha uma categoria", "Categoria", JOptionPane.PLAIN_MESSAGE, null, opcoesCategoria, "").toString();
								
								//Incrementando contador
								contContato++;
								
							} else {
								JOptionPane.showMessageDialog(null, "A lista de contatos está cheia");
							}
						break;
						case "Alterar contatos":
						
							//Obtendo nome do contato para alteração
							String nome = JOptionPane.showInputDialog("Informe o nome e sobrenome do contato que você deseja alterar");
							
							//Procurando indice do contato
							int indice = -1;
							for (int i = 0; i < contContato; i++) {
								if (nome.equals(nomeContato[i] + " " + sobrenomeContato[i])) {
									indice = i;
									break;
								}
							}
							
							//Verificando se o contato foi encontrado
							if (indice > -1) {
								
								//Obtendo dados do novo contato
								
								//Nome
								nomeContato[indice] = JOptionPane.showInputDialog("Informe o novo nome do contato");
								
								//Validando nome
								while (nomeContato[indice].isEmpty()) {
									JOptionPane.showMessageDialog(null, "Nome inválido");
									nomeContato[indice] = JOptionPane.showInputDialog("Informe o novo nome do contato");
								}
								
								//Sobrenome
								sobrenomeContato[indice] = JOptionPane.showInputDialog("Informe o novo sobrenome do contato");
								
								//Validando sobrenome
								while (sobrenomeContato[indice].isEmpty()) {
									JOptionPane.showMessageDialog(null, "Nome inválido");
									sobrenomeContato[indice] = JOptionPane.showInputDialog("Informe o novo sobrenome do contato");
								}
								
								//Dia de nascimento
								diaNascimentoContato[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe o novo dia de nascimento do contato"));
								
								//Validando dia
								while ((diaNascimentoContato[indice] < 0) || (diaNascimentoContato[indice] > 30)) {
									JOptionPane.showMessageDialog(null, "Dia inválido");
									diaNascimentoContato[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe o novo dia de nascimento do contato"));
								}
								
								//Mês de nascimento
								mesNascimentoContato[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe o novo mês de nascimento do contato"));
								
								//Validando mês
								while ((mesNascimentoContato[indice] < 0) || (mesNascimentoContato[indice] > 12)) {
									JOptionPane.showMessageDialog(null, "Mês inválido");
									mesNascimentoContato[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe o novo mês de nascimento do contato"));
								}
								
								//Ano de nascimento
								anoNascimentoContato[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe o novo ano de nascimento do contato"));
								
								//Validando ano
								while (anoNascimentoContato[indice] < 0) {
									JOptionPane.showMessageDialog(null, "Ano inválido");
									anoNascimentoContato[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe o novo ano de nascimento do contato"));
								}
								
								//E-mail
								emailContato[indice] = JOptionPane.showInputDialog("Informe o novo email do contato");
								
								//Validando e-mail
								while (emailContato[indice].isEmpty()) {
									JOptionPane.showMessageDialog(null, "E-mail inválido");
									emailContato[indice] = JOptionPane.showInputDialog("Informe o novo email do contato");
								}
								
								//Endereço
								enderecoContato[indice] = JOptionPane.showInputDialog("Informe o novo endereço do contato");
								
								//Validando endereço
								while (enderecoContato[indice].isEmpty()) {
									JOptionPane.showMessageDialog(null, "Endereço inválido");
									enderecoContato[indice] = JOptionPane.showInputDialog("Informe o novo endereço do contato");
								}
								
								//Celular
								celularContato[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe o novo celular do contato"));
								
								//Validando celular
								while (Integer.toString(celularContato[indice]).length() < 8) {
									JOptionPane.showMessageDialog(null, "Celular inválido");
									celularContato[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe o novo celular do contato"));
								}
								
								//Categoria
								//Verifica se alguma categoria foi registrada
								if (contCategoria == 0) {
									JOptionPane.showMessageDialog(null, "Nenhuma categoria foi registrada. Não será possível fazer o cadastro do contato");
									break;
								}
								//Juntando categorias existentes
								Object opcoesCategoria[] = new Object[contCategoria];
								for (int i = 0; i < contCategoria; i++) {
									opcoesCategoria[i] = categorias[i];
								}
								
								categoriaContato[indice] = JOptionPane.showInputDialog(null, "Escolha uma categoria", "Categoria", JOptionPane.PLAIN_MESSAGE, null, opcoesCategoria, "").toString();
								
								
							} else {
								JOptionPane.showMessageDialog(null, "O contato não pôde ser encontrado");
							}
							
						break;
						case "Excluir contatos":
							
							//Obtendo nome do contato para excluir
							nome = JOptionPane.showInputDialog("Informe o nome e sobrenome do contato para ser excluído");
							
							//procurando contato
							boolean encontrado = false;
							for (int j = 0; j < contContato; j++) {
								if (nome.equals(nomeContato[j] + " " + sobrenomeContato[j])) {
									
									for (int i = j; i < contContato; i++) {
										encontrado = true;
										
										//Trocando dados dos contatos
										nomeContato[i] = nomeContato[i+1];
										sobrenomeContato[i] = sobrenomeContato[i+1];
										diaNascimentoContato[i] = diaNascimentoContato[i+1];
										mesNascimentoContato[i] = mesNascimentoContato[i+1];
										anoNascimentoContato[i] = anoNascimentoContato[i+1];
										emailContato[i] = emailContato[i+1];
										enderecoContato[i] = enderecoContato[i+1];
										celularContato[i] = celularContato[i+1];
										categoriaContato[i] = categoriaContato[i+1];
										
									}		
								}
							}
							
							//Avisando caso o contato não seja encontrado
							if (!encontrado) {
								JOptionPane.showMessageDialog(null, "O contato não pôde ser encontrado");
							}
							
						break;
						case "Pesquisar contatos":
							
							//Obtendo nome do contato para pesquisa
							nome = JOptionPane.showInputDialog("Informe o nome e sobrenome do contato para ser pesquisado");
							
							//Procurar por contato
							encontrado = false;
							for (int i = 0; i < contContato; i++) {
								
								//Verificando se o nome informado é igual ao nome atual
								if (nome.equals(nomeContato[i] + " " + sobrenomeContato[i])) {
									encontrado = true;
									
									//Juntando informações sobre o contato
									String info = "INFORMAÇÕES DO CONTATO\n\n";
										   info+= "Nome: " + nomeContato[i] + " " + sobrenomeContato[i];
										   info+= "\nCelular: " + celularContato[i];
										   info+= "\nEmail: " + emailContato[i];
										   info+= "\nCategoria: " + categoriaContato[i];
									
									//Exibindo informações
									JOptionPane.showMessageDialog(null, info);
								}
							}
							
							//Avisando caso o contatio não seja encontrado
							if (!encontrado) {
								JOptionPane.showMessageDialog(null, "O contato não pôde ser encontrado");
							}
							
						break;
						case "Cadastrar categoria":
							
							//Obtendo nome da categoria
							categorias[contCategoria] = JOptionPane.showInputDialog("Informe o nome da categoria");
							
							//Validando nome da categoria
							while(categorias[contCategoria].toString().isEmpty()) {
								JOptionPane.showMessageDialog(null, "Nome inválido");
								categorias[contCategoria] = JOptionPane.showInputDialog("Informe o nome da categoria");
							}
							
							//Incrementando contador de categorias
							contCategoria++;
							
						break;
						case "Alterar categoria":
							
							//Obtendo nome da categoria
							nome = JOptionPane.showInputDialog("Informe o nome da categoria para ser alterada");
							
							//Procurando pela categoria
							encontrado = false;
							for (int i = 0; i < contCategoria; i++) {
								if (nome.equals(categorias[i].toString())) {
									encontrado = true;
									
									//Obtendo novo nome
									String novoNome = JOptionPane.showInputDialog("Informe o novo nome da categoria");
									categorias[i] = novoNome;
									
									//Atualizando contatos
									for (int j = 0; j < contContato; j++) {
										if (categoriaContato[i].equals(nome)) {
											categoriaContato[i] = novoNome;
										}
									}
								}
							}
							
							//Avisando caso a categoria não seja encontrada
							JOptionPane.showMessageDialog(null, "A categoria não pôde ser encontrada");
							
						break;
						case "Excluir categoria":
							
							//Obtendo nome da categoria
							nome = JOptionPane.showInputDialog("Informe o nome da categoria para ser excluída");
							
							//Procurando pela categoria
							encontrado = false;
							for (int i = 0; i < contCategoria; i++) {
								
								//Verificando se a categoria informada é igual a categoria atual
								if (nome.equals(categorias[i].toString())) {
									encontrado = true;
									
									//Verificando se não existe nenhum contato nessa categoria
									boolean nenhumContato = true;
									for (int j = 0; j < contContato; j++) {
										if (categoriaContato[j].equals(categorias[i].toString())) {
											nenhumContato = false;
											break;
										}
									}
									
									//Este código sera executado caso nenhum contato esteja nessa categoria
									if (nenhumContato) {
										
										//Trocando valores das categorias
										for (int j = 0; j < contCategoria; j++) {
											categorias[j] = categorias[j+1];
										}
									} else {
										
										//Avisando ao usuário caso a categoria esteja sendo usada por algum contato
										JOptionPane.showMessageDialog(null, "Não é possível excluir a categoria pois algum contato está nela");
									}
								}
							}
							
							//Avisando ao usuário caso a categoria não tenha sido encontrada
							if (!encontrado) {
								JOptionPane.showMessageDialog(null, "A categoria não pôde ser encontrada");
							}
							
						break;
						case "Lembrete de aniversário":
							
							//Obtendo mês
							int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês que você deseja saber"));
							
							//procurando por aniversariantes
							String info = "ANIVERSARIANTES\n\n";
							for (int i = 0; i < contContato; i++) {
								
								//Verificando se o contato faz aniversário naquela data
								if (mesNascimentoContato[i] == mes) {
									info += "Nome: " + nomeContato[i] + " " + sobrenomeContato[i];
									info += "\nData: " + diaNascimentoContato[i] + "/" + mesNascimentoContato[i] + "/" + anoNascimentoContato[i] + "\n\n";
								}
							}
							
							//Exibindo informações
							if (info.equals("ANIVERSARIANTES\n\n")) {
								JOptionPane.showMessageDialog(null, "Nenhum dos seus contatos faz aniversário nesse mês");
							} else {
								JOptionPane.showMessageDialog(null, info);
							}
							
						break;
						case "Sair":
							
							continuar = false;
							
						break;
							
					}
					
				}

			}

		

	}


