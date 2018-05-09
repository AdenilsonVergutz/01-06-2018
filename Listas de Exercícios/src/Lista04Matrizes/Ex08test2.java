package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex08test2 {

	public static void main(String[] args) {

		// Vetores
		String infoAlunos[][] = new String[4][10];

		// Variáveis
		int i = 0, homens = 0, mulheres = 0;

		String opcoes = "SISTEMA ESCOLAR\n\n";
		opcoes += "A. Cadastrar Aluno\n";
		opcoes += "B. Excluir Aluno\n";
		opcoes += "C. Estatísticas\n";
		opcoes += "D. Sair Do Sistema";

		// Obtendo escolha
		String escolha = JOptionPane.showInputDialog(opcoes).toUpperCase();

		// Laço principal
		while (!escolha.equals("D")) {

			// Verificando qual foi a escolha
			switch (escolha) {

			case "A": {

				// Verificando se foi cadastrado o número máximo
				if (i > 9) {
					JOptionPane.showMessageDialog(null, "Não é possível cadastrar mais alunos");
					break;
				}

				// Obtendo nome do novo aluno
				String nome = JOptionPane.showInputDialog("Informe o nome do aluno");

				// Validando nome
				boolean existe = false;
				for (int a = 0; a < i; a++) {
					if (nome.equals(infoAlunos[a][0])) {
						existe = true;
					}
				}
				while (existe) {
					JOptionPane.showMessageDialog(null, "Nome já cadastrado");

					// Obtendo nome do novo aluno
					nome = JOptionPane.showInputDialog("Informe o nome do aluno");

					// Validando
					existe = false;
					for (int a = 0; a < i; a++) {
						if (nome.equals(infoAlunos[a][0])) {
							existe = true;
							break;
						}
					}
				}

				// Obtendo sexo
				String sexo = JOptionPane.showInputDialog("Informe o sexo do aluno (M/F)").toUpperCase();

				// validando sexo
				while ((!sexo.equals("M") && (!sexo.equals("F")))) {

					JOptionPane.showMessageDialog(null, "Sexo inválido");
					// Obtendo sexo
					sexo = JOptionPane.showInputDialog("Informe o sexo do aluno (M/F)").toUpperCase();
				}

				// Verificando qual foi o sexo escolhido
				if (sexo.equals("M")) {
					homens++;
				} else {
					mulheres++;
				}

				// pedindo notas
				double total = 0;
				for (int a = 0; a < 3; a++) {

					// Pedindo nota
					double nota = Double
							.parseDouble(JOptionPane.showInputDialog("Informe a " + (a + 1) + "ª nota do aluno"));
					total += nota;
				}

				// Calculando
				total /= 3;

				// Verificando situacao
				String situacao;
				if (total >= 7) {
					situacao = "Aprovado";
				} else if (total >= 5) {
					situacao = "Em Exame";
				} else {
					situacao = "Reprovado";
				}

				// Exibindo situação
				JOptionPane.showMessageDialog(null, "O aluno está " + situacao);

				// Atribuindo varíaveis ao vetor
				infoAlunos[i][0] = nome;
				infoAlunos[i][1] = sexo;
				infoAlunos[i][2] = String.format("%.2f", total);
				infoAlunos[i][3] = situacao;

				// Incrementando contador
				i++;

				break;
			}

			case "B": {

				// Obtendo nome do aluno
				String nome = JOptionPane.showInputDialog("Informe o nome do aluno");

				// pesquisando pelo aluno
				int index = -1;
				for (int a = 0; a < i; a++) {
					if (nome.equals(infoAlunos[a][0])) {
						index = a;
						break;
					}
				}

				// Verificando se aluno foi encontrado
				if (index > -1) {

					if (infoAlunos[index][1].equals("M")) {
						homens--;
					} else {
						mulheres--;
					}

					for (int a = index; a < i; a++) {

						// Verificando qual o sexo do aluno excluído

						infoAlunos[a][0] = infoAlunos[a + 1][0];
						infoAlunos[a][1] = infoAlunos[a + 1][1];
						infoAlunos[a][2] = infoAlunos[a + 1][2];
						infoAlunos[a][3] = infoAlunos[a + 1][3];
					}

					i--;

					JOptionPane.showMessageDialog(null, "Aluno excluído com sucesso");
				} else {
					JOptionPane.showMessageDialog(null, "Aluno não encontrado");
				}
				break;
			}

			case "C": {

				// Verificando quantidade de reprovados, aprovados e em exame
				int reprov = 0, aprov = 0, emexame = 0;
				for (int a = 0; a < i; a++) {
					switch (infoAlunos[a][3]) {
					case "Aprovado":
						aprov++;
						break;
					case "Em Exame":
						emexame++;
						break;
					case "Reprovado":
						reprov++;
					}
				}

				// Juntando informações
				String info = "ESTATÍSTICAS\n\n";
				info += "Homens: " + homens + " - " + (100 / i * homens) + "%\n";
				info += "Mulheres: " + mulheres + " - " + (100 / i * mulheres) + "%\n";
				info += "Aprovados: " + aprov + "\n";
				info += "Em Exame: " + emexame + "\n";
				info += "Reprovado: " + reprov + "\n";

				// Exibindo informações
				JOptionPane.showMessageDialog(null, info);
			}
			}

			// Obtendo escolha
			escolha = JOptionPane.showInputDialog(opcoes).toUpperCase();

		}

	}

}