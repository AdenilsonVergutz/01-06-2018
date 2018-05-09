/*Desenvolver um algoritmo para uma escola. Nesse algoritmo deverá ser possível:
a. Cadastrar alunos
b. Excluir alunos
c. Estatísticas
d. Sair do sistema
Cadastrar alunos: Deverá ser pedido pelo nome, sexo e mais três notas, após cadastrados os dados deverá ser
realizada a média e dada a situação do aluno (aprovado, em exame ou reprovado). A média e a situação deverão
ser cadastradas em uma posição do vetor.
Não poderá haver nomes repetidos, sendo assim valide o nome.
Excluir alunos: Deverá ser pedido o nome do aluno, e em seguida excluir o aluno. Caso não haja aluno com
determinado nome cadastrado deverá ser exibido que o nome procurado não existe.
Estatísticas: Informar a quantidade e o percentual de homens e mulheres.
Informar o percentual e a quantidade de alunos nas situações (aprovado, em exame e reprovado).
Sair do sistema: Sair do laço.*/

package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex08test {

	public static void main(String[] args) {

		// Vetores
		String infAlunos[][] = new String[4][10];

		// Variáveis
		String situacao;
		String sexo;
		String escolha;
		String nome;
		boolean existe = false;
		double nota;
		double total = 0;
		int reprov = 0, aprov = 0, exam = 0;
		int index = -1;
		int i = 0, homens = 0, mulheres = 0;

		String opcoes = "SISTEMA ESCOLAR\n\n";
		opcoes += "A. Cadastrar Aluno\n";
		opcoes += "B. Excluir Aluno\n";
		opcoes += "C. Estatísticas\n";
		opcoes += "D. Sair Do Sistema";

		// Obtendo escolha
		escolha = JOptionPane.showInputDialog(opcoes).toUpperCase();

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
				nome = JOptionPane.showInputDialog("Informe o nome do aluno");

				// Validando nome

				for (int a = 0; a < i; a++) {
					if (nome.equals(infAlunos[a][0])) {
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
						if (nome.equals(infAlunos[a][0])) {
							existe = true;
							break;
						}
					}
				}

				// Obtendo sexo
				sexo = JOptionPane.showInputDialog("Informe o sexo do aluno (M/F)").toUpperCase();

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

				for (int a = 0; a < 3; a++) {

					// Pedindo nota
					nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (a + 1) + "ª nota do aluno"));
					total += nota;

					// Calculando
					total /= 3;

					// Verificando situacao
				}
				
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

					infAlunos[i][0] = nome;
					infAlunos[i][1] = sexo;
					infAlunos[i][2] = String.format("%.2f", total);
					infAlunos[i][3] = situacao;

					// Incrementando contador
					i++;

					break;
				}
			

			case "B": {

				// Obtendo nome do aluno

				nome = JOptionPane.showInputDialog("Informe o nome do aluno");

				// pesquisando pelo aluno

				for (int a = 0; a < i; a++) {
					if (nome.equals(infAlunos[a][0])) {
						index = a;
						break;
					}
				}

				// Verificando se aluno foi encontrado
				if (index > -1) {

					// Verificando qual o sexo do aluno excluído
					for (int a = index; a < i; a++) {
						if (infAlunos[a][1].equals("M")) {
							homens--;
						} else {
							mulheres--;
						}

						infAlunos[a][0] = infAlunos[a + 1][0];
						infAlunos[a][1] = infAlunos[a + 1][1];
						infAlunos[a][2] = infAlunos[a + 1][2];
						infAlunos[a][3] = infAlunos[a + 1][3];
						i--;
					}
					JOptionPane.showMessageDialog(null, "Aluno excluído com sucesso");
				} else {
					JOptionPane.showMessageDialog(null, "Aluno não encontrado");
				}
				break;
			}

			case "C": {

				// Verificando quantidade de reprovados, aprovados e em exame

				for (int a = 0; a < i; a++) {
					switch (infAlunos[a][3]) {
					case "Aprovado":
						aprov++;
						break;
					case "Em Exame":
						exam++;
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
				info += "Em Exame: " + exam + "\n";
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
