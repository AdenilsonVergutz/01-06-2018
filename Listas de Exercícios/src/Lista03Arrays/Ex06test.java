package Lista03Arrays;

import javax.swing.JOptionPane;

public class Ex06test {

	public static void main(String[] args) {


		//Variáveis
				String[] perguntas = {"Hoje é terça-feira", "2+2=4?", "Brasília é a capital do Brasil?", "Blumenau tem a Oktoberfest?", "O João é legal?", "O céu é azul?", "A maior cidade do país é São Paulo", "5*5=25?", "7*7=49?", "A capital do Japão é Tóqui?"};
				int[] gabarito = {0,0,0,0,1,0,0,0,0,0};
				String nome;
				int respostaAluno;
				int continuar = 0;
				int acertos;
				boolean[] erros = new boolean[10];
				String exibirMensagem;
				String[] nomesParticipantes = new String[10];
				int[] acertosParticipantes = new int[10];
				int indiceParticipante = 0;
				
				//Laço
				do {
					
					//Zerar os acetos
					acertos = 0;
					
					//Nome
					nome = JOptionPane.showInputDialog("Informe seu nome");
					
					//Obter as 10 respostas do aluno
					for(int indice = 0; indice < 10; indice++) {
						respostaAluno = JOptionPane.showConfirmDialog(null, (indice+1)+"ª questão\n\n"+perguntas[indice],"",0);
						
						//Validar resposta
						if(respostaAluno == gabarito[indice]) {
							acertos++;
							erros[indice] = false;
						}else {
							erros[indice] = true;
						}
						
					}
					
					//Estatísticas
					exibirMensagem = "O aluno "+nome+" acertou: "+acertos+" questões.\n\n";
					
					if(acertos != 10) {
						
						for(int i = 0; i < 10; i++) {
							
							if(erros[i] == true) {
								exibirMensagem += "A questão "+(i+1)+" foi errada.";
								exibirMensagem += "A resposta correta era: "+(gabarito[i] == 0 ? "SIM" : "NÃO");
								exibirMensagem += "\n";
										
							}
							
						}
						
					}
					
					JOptionPane.showMessageDialog(null, exibirMensagem);
					
					//Atribuir nos vetores correspondentes
					nomesParticipantes[indiceParticipante] = nome;
					acertosParticipantes[indiceParticipante] = acertos;
					indiceParticipante++;
					
					//Continuar a verificação
					continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?","",0);
					
					
				}while(continuar != 1);
				
				
				//Ordenar
				int menorAcerto = 0;
				String menorNome = "";
				
				for(int i1=0; i1<9; i1++) {
					
					for(int i2=i1+1; i2<10; i2++) {
						
						if(acertosParticipantes[i2] > acertosParticipantes[i1]) {
							menorAcerto = acertosParticipantes[i1];
							acertosParticipantes[i1] =  acertosParticipantes[i2];
							acertosParticipantes[i2] = menorAcerto;
							
							menorNome = nomesParticipantes[i1];
							nomesParticipantes[i1] =  nomesParticipantes[i2];
							nomesParticipantes[i2] = menorNome;
							
							
						}
						
					}
					
				}
				
				
				//Exibir participantes
				String exibirParticipantes = "*****RANKING*****\n\n";
				int posicao = 1;
				for(int i=0; i<10; i++) {
					if(nomesParticipantes[i] != null) {
					exibirParticipantes += posicao+"º lugar é: "+nomesParticipantes[i]+" com "+acertosParticipantes[i]+" acertos.\n";
					posicao++;
					}
				}
				
				JOptionPane.showMessageDialog(null, exibirParticipantes);
			

			}

		}







