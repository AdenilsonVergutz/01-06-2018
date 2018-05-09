/*6. Criar um jogo da velha, onde duas pessoas irão jogar*/

package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex06 {

	public static void main(String[] args) {

		// vetores
		String[][] jogo = new String[3][3];

		// Variáveis
		String ganhador = "";

		// Laço para receber jogadas
		for (int i = 0; i < 9; i++) {

			// Montando estrutura da matriz
			String estrutura = "";
			for (int linha = 0; linha < 3; linha++) {
				for (int coluna = 0; coluna < 3; coluna++) {

					estrutura += (jogo[coluna][linha] == null ? "..." : jogo[coluna][linha])
							+ (coluna < 2 ? " | " : "");
				}

				estrutura += "\n";
			}

			estrutura += "\n\nVocê pode jogar nas casas onde existem \"...\"";

			// Verificando se o jogador atual é Player one ou Player two
			estrutura += "\nVez do " + (i % 2 == 0 ? "Jogador1" : "Jogador2");

			// Recebendo jogada
			while (true) {

				// Recebendo linha
				int linha = Integer.parseInt(JOptionPane.showInputDialog(estrutura + "\nEscolha uma linha")) - 1;

				// Validando linha
				while ((linha < 0) || (linha > 2)) {
					JOptionPane.showMessageDialog(null, "Linha não encontrada, tente com 1, 2 ou 3");
					linha = Integer.parseInt(JOptionPane.showInputDialog(estrutura + "\nEscolha uma linha")) - 1;
				}

				// Recebendo coluna
				int coluna = Integer.parseInt(JOptionPane.showInputDialog(estrutura + "\nEscolha uma coluna")) - 1;

				// Validando coluna
				while ((coluna < 0) || (linha > 2)) {
					JOptionPane.showMessageDialog(null, "Coluna não encontrada, tente com 1, 2, ou 3");
					coluna = Integer.parseInt(JOptionPane.showInputDialog(estrutura + "\n2Escolha uma coluna")) - 1;
				}

				// Verificando se a casa escolhida está vaga
				if (jogo[coluna][linha] == null) {
					jogo[coluna][linha] = (i % 2 == 0 ? "X" : "O");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Essa casa já está preenchida. Escolha outra");
				}
			}

			// Verificando se alguém ganhou
			ganhador = "";
			for (int a = 0; a < 3; a++) {

				// Verificando por coluna
				try {
					if ((jogo[0][a].equals(jogo[1][a])) && (jogo[0][a].equals(jogo[2][a]))) {
						ganhador = jogo[0][a];
						break;
					}
				} catch (Exception e) {
				}

				// Verificando por linha
				try {
					if ((jogo[a][0].equals(jogo[a][1])) && (jogo[a][0].equals(jogo[a][2]))) {
						ganhador = jogo[a][0];
						break;
					}
				} catch (Exception e) {
				}
			}

			// Verificando pela diagonal esquerda para direita
		
			try {
				if ((jogo[0][0].equals(jogo[1][1])) && (jogo[0][0].equals(jogo[2][2]))) {
					ganhador = jogo[0][0];
				}
			} catch (Exception e) {
			}

			// Verificando pela diagonal direita para esquerda
	
			try {
				if ((jogo[0][2].equals(jogo[1][1])) && (jogo[0][2].equals(jogo[2][0]))) {
					ganhador = jogo[0][2];
				}
			} catch (Exception e) {
			}

			if (!ganhador.equals("")) {
				JOptionPane.showMessageDialog(null, "Ganhador: " + ganhador);
				break;
			}
		}

		// Verificando se alguém ganhou

		if (ganhador.equals("")) {
			JOptionPane.showMessageDialog(null, "Ninguém ganhou :c");
		}
	}
}
