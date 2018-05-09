/* Desenvolver um algoritmo de perguntas e respostas. Haver� trinta quest�es j� definidas em um vetor.
Cada quest�o possui quatro alternativas e apenas uma resposta correta.
O jogador ter� que informar seu nome e responder dez quest�es. 
Al�m de ter as quatro op��es de resposta
o jogador ter� uma op��o chamada pular que poder� ser utilizada at� tr�s vezes por jogador cadastrado.
Quando utilizada a op��o pular uma nova quest�o � exibida. 
N�o contabilize a quest�o pulada.
As quest�es dever�o ser aleat�rias e n�o podem ser repetidas. 
Crie um vetor para armazenar treze
quest�es (10 que m�nimas necess�rias e 3 extras caso alguma seja pulada.)
Quando as dez quest�es forem devidamente respondidas informe a quantidade de acertos e erros (informe
o enunciado da quest�o que foi errada, a resposta dada pelo jogador e a resposta correta).
Ap�s obter a quantidade de acertos e erros pedidos no par�grafo anterior perguntar se deseja continuar a
jogar. 
Caso afirmativo pe�a um nome e realize novamente as perguntas, caso contr�rio exibir um ranking
contendo o nome dos jogadores e a quantidade de acertos. 
Classifique da maior quantidade de acertos
para a menor.
Valide o nome informado, pois n�o ser�o aceitos nomes iguais no vetor. 
Sendo assim antes de realizar as
perguntas o nome informado n�o pode conter no vetor.
Poder�o jogar at� cinco pessoas.
Pontua��o:
1 ponto: Coment�rios e indenta��o.
1 ponto: Validar o nome para n�o haver repeti��o no vetor.
1 ponto: Implementar os tr�s pulos.
1 ponto: Exibir a quantidade de acertos e erros.
1 ponto: Sair do la�o caso o usu�rio informe que n�o queira participar ou atingir cinco jogadores.
1 ponto: Exibir o ranking de maneira decrescente exibindo o nome e a quantidade de acertos por jogador.
2 pontos: Exibir quais as quest�es erradas, junto com a resposta informada e a resposta correta.
2 pontos: Gerar 13 quest�es aleat�rias sem repeti��o.    */

package Prova02;

import java.util.Random;

import javax.swing.JOptionPane;

public class Prova02Adenilson {

	public static void main(String[] args) {

		// Vetores
		
		String[][] infoJogadores = new String[5][2];
		int[] indiceQuestao = new int[13];
		String[][] questoes = new String[30][6];
		

		questoes[0][0] = "Quem era o homem mais sedutor do mundo?";
		questoes[0][1] = "a)Ralf";
		questoes[0][2] = "b)Dom Ralf";
		questoes[0][3] = "c)Dom Marco";
		questoes[0][4] = "d)Dom Carlos";
		questoes[0][5] = "a";

		questoes[1][0] = "De quantos anos � constitu�do um s�culo?";
		questoes[1][1] = "a)50";
		questoes[1][2] = "b)100";
		questoes[1][3] = "c)1000";
		questoes[1][4] = "d)1500";
		questoes[1][5] = "b";

		questoes[2][0] = "Qual � o coletivo de c�es?";
		questoes[2][1] = "a)Matilha";
		questoes[2][2] = "b)Rebanho";
		questoes[2][3] = "c)Cardume";
		questoes[2][4] = "d)Manada";
		questoes[2][5] = "a";

		questoes[3][0] = "Segundo a B�blia, em que rio Jesus foi batizado por Jo�o Batista?";
		questoes[3][1] = "a)Rio Nilo";
		questoes[3][2] = "b)Rio Sena";
		questoes[3][3] = "c)Rio Reno";
		questoes[3][4] = "d)Rio Jord�o";
		questoes[3][5] = "d";

		questoes[4][0] = "Qual � a maior floresta do planeta?";
		questoes[4][1] = "a)Negra";
		questoes[4][2] = "b)Sherwood";
		questoes[4][3] = "c)Tijuca";
		questoes[4][4] = "d)Amaz�nica";
		questoes[4][5] = "d";

		questoes[5][0] = "Qual � o naipe do baralho que tem o desenho de cora��o?";
		questoes[5][1] = "a)Ouros";
		questoes[5][2] = "b)Paus";
		questoes[5][3] = "c)Copas";
		questoes[5][4] = "d)Espadas";
		questoes[5][5] = "c";

		questoes[6][0] = "Qual atriz estrelou no filme: 'A lagoa azul'?";
		questoes[6][1] = "a)Alicia Silverstone";
		questoes[6][2] = "b)Brooke Shields";
		questoes[6][3] = "c)Julia Roberts";
		questoes[6][4] = "d)Jessica Lange";
		questoes[6][5] = "b";

		questoes[7][0] = "Qual casal foi expulso do Para�so?";
		questoes[7][1] = "a)Sans�o de Dalila";
		questoes[7][2] = "b)Jos� e Maria";
		questoes[7][3] = "c)Sara e Abra�o";
		questoes[7][4] = "d)Ad�o e Eva";
		questoes[7][5] = "d";

		questoes[8][0] = "Segundo os contos, qual animal ao ser beijado se transforma em pr�ncipe?";
		questoes[8][1] = "a)Cavalo";
		questoes[8][2] = "b)C�o";
		questoes[8][3] = "c)Gato";
		questoes[8][4] = "d)Sapo";
		questoes[8][5] = "d";

		questoes[9][0] = "Qual � o santo que s� acreditou vendo?";
		questoes[9][1] = "a)Santo Ant�nio";
		questoes[9][2] = "b)S�o Judas Tadeu";
		questoes[9][3] = "c)S�o Pedro";
		questoes[9][4] = "d)S�o Tom�";
		questoes[9][5] = "d";

		questoes[10][0] = "Qual � o fruto conhecido no nordeste do Brasil como 'jerimum'?";
		questoes[10][1] = "a)Caju";
		questoes[10][2] = "b)Ab�bora";
		questoes[10][3] = "c)Chuchu";
		questoes[10][4] = "d)Coco";
		questoes[10][5] = "b";

		questoes[11][0] = "Em qual parte do corpo humano s�o implantadas as 'pontes de safena'?";
		questoes[11][1] = "a)Est�mago";
		questoes[11][2] = "b)Intestino";
		questoes[11][3] = "c)Pulm�o";
		questoes[11][4] = "d)Cora��o";
		questoes[11][5] = "d";

		questoes[12][0] = "Como � conhecido o jogador Edmundo?";
		questoes[12][1] = "a)Tigr�o";
		questoes[12][2] = "b)Gatinho";
		questoes[12][3] = "c)Animal";
		questoes[12][4] = "d)Cobra";
		questoes[12][5] = "c";

		questoes[13][0] = "Na literatura, quem foi o criador da boneca Em�lia?";
		questoes[13][1] = "a)Monteiro Lobato";
		questoes[13][2] = "b)Maur�cio de Souza";
		questoes[13][3] = "c)Walt Disney";
		questoes[13][4] = "d)Jorge Amado";
		questoes[13][5] = "a";

		questoes[14][0] = "Quem � o primeiro substituto do Presidente?";
		questoes[14][1] = "a)Veriador";
		questoes[14][2] = "b)Vice-presidente";
		questoes[14][3] = "c)Senador";
		questoes[14][4] = "d)Deputado";
		questoes[14][5] = "b";

		questoes[15][0] = "Segundo o romance, que animal era 'Moby Dick'?";
		questoes[15][1] = "a)Tubar�o";
		questoes[15][2] = "b)Golfinho";
		questoes[15][3] = "c)Polvo";
		questoes[15][4] = "d)Baleia";
		questoes[15][5] = "d";

		questoes[16][0] = "Que animal � o Pateta?";
		questoes[16][1] = "a)Cavalo";
		questoes[16][2] = "b)Burro";
		questoes[16][3] = "c)Cachorro";
		questoes[16][4] = "d)Raposa";
		questoes[16][5] = "c";

		questoes[17][0] = "Em qual cidade est� o Cristo Redentor do Corcovado?";
		questoes[17][1] = "a)Rio de Janeiro";
		questoes[17][2] = "b)S�o Paulo";
		questoes[17][3] = "c)Curitiba";
		questoes[17][4] = "d)Belo Horizonte";
		questoes[17][5] = "a";

		questoes[18][0] = "Quem � conhecido como o 'playboy brasileiro'?";
		questoes[18][1] = "a)Jo�ozinho Trinta";
		questoes[18][2] = "b)Zeca Pagodinho";
		questoes[18][3] = "c)Chiquinho Scarpa";
		questoes[18][4] = "d)Chico Buarque";
		questoes[18][5] = "c";

		questoes[19][0] = "Quantos cent�metros equivalem a um metro?";
		questoes[19][1] = "a)10";
		questoes[19][2] = "b)100";
		questoes[19][3] = "c)1000";
		questoes[19][4] = "d)10000";
		questoes[19][5] = "b";

		questoes[20][0] = "Qual � o nome do macho da abelha?";
		questoes[20][1] = "a)Zang�o";
		questoes[20][2] = "b)Abelh�o";
		questoes[20][3] = "c)Rufi�o";
		questoes[20][4] = "d)Pulg�o";
		questoes[20][5] = "a";

		questoes[21][0] = "Qual � o inseto que transmite a doen�a de Chagas?";
		questoes[21][1] = "a)Abelha";
		questoes[21][2] = "b)Rato";
		questoes[21][3] = "c)Barbeiro";
		questoes[21][4] = "d)Pulga";
		questoes[21][5] = "c";

		questoes[22][0] = "Qual � o nome do conjunto de dados sobre uma popula��o?";
		questoes[22][1] = "a)Censo";
		questoes[22][2] = "b)Montagem";
		questoes[22][3] = "c)Marca��o";
		questoes[22][4] = "d)Registro";
		questoes[22][5] = "a";

		questoes[23][0] = "Qual ator imortalizou o personagem 'Z� Bonitinho'?";
		questoes[23][1] = "a)Roni C�cegas";
		questoes[23][2] = "b)Jorge Loredo";
		questoes[23][3] = "c)Davi Pinheiro";
		questoes[23][4] = "d)Arnaud Rodrigues";
		questoes[23][5] = "b";

		questoes[24][0] = "Qual a cantora conhecida como 'A rainha dos caminhoneiros'?";
		questoes[24][1] = "a)Roberta Miranda";
		questoes[24][2] = "b)Maria Beth�nia";
		questoes[24][3] = "c)Sula Miranda";
		questoes[24][4] = "d)Rita Cadillac";
		questoes[24][5] = "c";

		questoes[25][0] = "Qual � o nome da missa rezada no Natal?";
		questoes[25][1] = "a)Campal";
		questoes[25][2] = "b)Do Galo";
		questoes[25][3] = "c)Do Vaticano";
		questoes[25][4] = "d)Do S�timo Dia";
		questoes[25][5] = "b";

		questoes[26][0] = "Qual � a orix� conhecida como 'A rainha do mar'?";
		questoes[26][1] = "a)Mam�e Oxum";
		questoes[26][2] = "b)Iemanj�";
		questoes[26][3] = "c)Ax�";
		questoes[26][4] = "d)Ians�";
		questoes[26][5] = "b";

		questoes[27][0] = "No julgamento de Jesus, quem disse a frase: 'Eu lavo minhas m�os'?";
		questoes[27][1] = "a)Barrab�s";
		questoes[27][2] = "b)Tib�rio";
		questoes[27][3] = "c)P�ncio Pilatos";
		questoes[27][4] = "d)Judas";
		questoes[27][5] = "c";

		questoes[28][0] = "O que est� no centro da Terra?";
		questoes[28][1] = "a)Manto";
		questoes[28][2] = "b)N�cleo";
		questoes[28][3] = "c)Hidrosfera";
		questoes[28][4] = "d)Litosfera";
		questoes[28][5] = "b";

		questoes[29][0] = "Qual � o animal que representa o signo de �ries?";
		questoes[29][1] = "a)Touro";
		questoes[29][2] = "b)Le�o";
		questoes[29][3] = "c)Caneiro";
		questoes[29][4] = "d)Bode";
		questoes[29][5] = "c";


		// Vari�veis
		int indiceJog = 0;
		int maxpulos;

		// Obter resposta se deseja jogar
		int jogar = JOptionPane.showConfirmDialog(null, "Deseja participar do jogo?", "Entrada", 0);

		// La�o
		while (jogar == 0) {

			// random
			Random random = new Random();

			for (int i = 0; i < 13; i++) {
				indiceQuestao[i] = -1;
			}

			for (int i = 0; i < 13; i++) {
				boolean Vetor = true;
				int indice = 0;

				// La�o para verificar se o n�mero est� no vetor
				while (Vetor) {

					Vetor = false;

					// Random valor
					indice = random.nextInt(30);

					for (int a = 0; a < i; a++) {

						if (indice == indiceQuestao[a]) {
							Vetor = true;
						}
					}
				}

				// Atribuindo indice ao vetor
				indiceQuestao[i] = indice;
			}

			maxpulos = 3;

			//Obtendo/ guardando nome do jogador
			String nome = "";

			boolean Vetor = true;
			while (Vetor) {

				nome = JOptionPane.showInputDialog("Informe o nome do jogador");

				while (nome.isEmpty()) {

					if (nome.isEmpty()) {
						JOptionPane.showMessageDialog(null, "O campo n�o pode estar vazio!");

						nome = JOptionPane.showInputDialog("Informe o nome do jogador");
					}
				}

				Vetor = false;
				for (int i = 0; i < indiceJog; i++) {

					if (nome.equals(infoJogadores[i][0])) {

						JOptionPane.showMessageDialog(null, "Esse jogador j� participou");
						Vetor = true;
					}
				}
			}

			//Obtendo respostas informadas pelo jogador
			String[][] respostas = new String[10][2];

			//�ndices de perguntas e respostas
			int indicePerg = 0, indiceResp = 0;

			//Obtendo as perguntas
			for (int i = 0; i < 10; i++) {

				String perguntas = "";
				for (int a = 0; a < 5; a++) {
					perguntas += questoes[indiceQuestao[indicePerg]][a] + "\n";
				}

				String pular = "";

				if (maxpulos > 0) {
					perguntas += "P para pular, ainda tem " + maxpulos + " pulos\n";
					pular = "P";
				}

				// Obtendo resposta
				String resposta = JOptionPane.showInputDialog(perguntas).toUpperCase();
				while ((!resposta.equals("A")) && (!respostas.equals("B")) && (!respostas.equals("C"))
						&& (!resposta.equals("D")) && (!resposta.equals(pular))) {

					// Informa que a resposta inserida foi inv�lida
					JOptionPane.showMessageDialog(null, "Resposta inv�lida!");

					resposta = JOptionPane.showInputDialog(perguntas).toUpperCase();

				}
				// obter resposta se � para pular
				if (resposta.equals("P")) {

					// Incrementando
					indicePerg++;
					i--;
					maxpulos--;

					continue;
				}

				// Guardar os indice
				respostas[indiceResp][0] = resposta;

				respostas[indiceResp][1] = String.valueOf(indiceQuestao[indicePerg]);

				// Incrementando contadores
				indicePerg++;
				indiceResp++;
			}

			// Verifica respostas do jogador
			String correcao = "RESULTADOS\n\n";
			int acertos = 0, erros = 0;
			for (int i = 0; i < 10; i++) {

				int indice = Integer.parseInt(respostas[i][1]);
				System.out.println(indice);

				if (respostas[i][0].equals(questoes[indice][5].toUpperCase())) {

					// Incrementa a quantidade de respostas certas
					acertos++;
				} else {

					// Incrementa a quantidade de respostas erradas
					erros++;

					correcao += "Quest�o: " + questoes[i][0] + "\n";
					correcao += "Resposta escolhida: " + respostas[i][0] + "\n";
					correcao += "Resposta correta: " + questoes[i][5].toUpperCase() + "\n\n";
				}
			}

			//resultados do jogador participante 
			
			String info = "O jogador  " + nome + "  acertou  " + acertos + "  quest�es e errou  " + erros
					+ "  quest�es";
			JOptionPane.showMessageDialog(null, info);

			JOptionPane.showMessageDialog(null, correcao);

			infoJogadores[indiceJog][0] = nome;
			infoJogadores[indiceJog][1] = String.valueOf(acertos);

			// Perguntando se deseja jogar

			jogar = JOptionPane.showConfirmDialog(null, "Deseja participar do jogo?", "Entrada", 0);

			// Incrementando contador de jogadores
			indiceJog++;

			if (indiceJog == 5) {
				jogar = 1;
			}
		}

		// ranking

		for (int i = 0; i < indiceJog - 1; i++) {

			// Vari�vel que ir� guardar os pontos do jogador
			int pontosjog1 = Integer.parseInt(infoJogadores[i][1]);
			for (int a = i + 1; a < indiceJog; a++) {

				int pontosjog2 = Integer.parseInt(infoJogadores[a][1]);

				if (pontosjog2 > pontosjog1) {

					String[] jog1 = infoJogadores[i];
					infoJogadores[i] = infoJogadores[a];
					infoJogadores[a] = jog1;
				}
			}
		}

		// Concatenando informa��es
		String infomacoes = "RANKING DE ACERTOS DOS JOGADORES\n\n";

		for (int i = 0; i < indiceJog; i++) {

			infomacoes += (i + 1) + "�   " + infoJogadores[i][0] + "  -  " + infoJogadores[i][1];
		}
		JOptionPane.showMessageDialog(null, infomacoes);
	}
}
