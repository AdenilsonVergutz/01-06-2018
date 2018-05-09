package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex06test {

	public static void main(String[] args) {


		//vetores
				String[][] jogo = new String[3][3];
				
				//Vari�veis
				String ganhador = "";
				
				//La�o para receber jogadas
				for (int i = 0; i < 9; i++) {
					
					//Montando estrutura da matriz
					String estrutura = "";
					for (int linha = 0; linha < 3; linha++) {
						for (int coluna = 0; coluna < 3; coluna++) {
							
							estrutura += (jogo[coluna][linha] == null ? "..." : jogo[coluna][linha]) + (coluna < 2 ? " | " : "");
						}
						
						estrutura += "\n";
					}
					
					estrutura += "\n\nVoc� pode jogar nas casas onde existem \"...\"";
					
					//Verificando se o jogador atual � O ou X
					estrutura += "\nVez do " + (i % 2 == 0 ? "O" : "X"); 
					
					//Recebendo jogada
					while (true) {
						
						//Recebendo linha
						int linha = Integer.parseInt(JOptionPane.showInputDialog(estrutura + "\nEscolha uma linha")) - 1;
						
						//Validando linha
						while ((linha < 0) || (linha > 2)) {
							JOptionPane.showMessageDialog(null, "Linha n�o encontrada, tente com 1, 2 ou 3");
							linha = Integer.parseInt(JOptionPane.showInputDialog(estrutura + "\nEscolha uma linha")) - 1;
						}
						
						//Recebendo coluna
						int coluna = Integer.parseInt(JOptionPane.showInputDialog(estrutura + "\nEscolha uma coluna")) - 1;
						
						//Validando coluna
						while ((coluna < 0) || (linha > 2)) {
							JOptionPane.showMessageDialog(null, "Coluna n�o encontrada, tente com 1, 2, ou 3");
							coluna = Integer.parseInt(JOptionPane.showInputDialog(estrutura + "\n2Escolha uma coluna")) - 1;
						}
						
						//Verificando se a casa escolhida est� vaga
						if (jogo[coluna][linha] == null) {
							jogo[coluna][linha] = (i % 2 == 0 ? "O" : "X");
							break;
						} else {
							JOptionPane.showMessageDialog(null, "Essa casa j� est� preenchida. Tente outra");
						}
					}
					
					//Verificando se algu�m ganhou
					ganhador = "";
					for (int k = 0; k < 3; k++) {
					
						//Verificando por coluna
						try {
							if ((jogo[0][k].equals(jogo[1][k])) && (jogo[0][k].equals(jogo[2][k]))) {
								ganhador = jogo[0][k];
								break;
							}
						} catch (Exception e) {}
						
						//Verificando por linha
						try {
							if ((jogo[k][0].equals(jogo[k][1])) && (jogo[k][0].equals(jogo[k][2]))) {
								ganhador = jogo[k][0];
								break;
							}
						} catch (Exception e) {}
					}
					
					//Verificando pela diagonal esquerda -> direita
					try {
						if ((jogo[0][0].equals(jogo[1][1])) && (jogo[0][0].equals(jogo[2][2]))) {
							ganhador = jogo[0][0];
						}
					} catch(Exception e) {}
					
					//Verificando pela diagonal direita -> esquerda
					try {
						if ((jogo[0][2].equals(jogo[1][1])) && (jogo[0][2].equals(jogo[2][0]))) {
							ganhador = jogo[0][2];
						}
					} catch(Exception e) {}
					
					
					if (!ganhador.equals("")) {
						JOptionPane.showMessageDialog(null, "Ganhador: " + ganhador);
						break;
					}
				}
				
				//Verificando se algu�m ganhou
				if (ganhador.equals("")) {
					JOptionPane.showMessageDialog(null, "Ningu�m ganhou :c");
				}
			}
		}