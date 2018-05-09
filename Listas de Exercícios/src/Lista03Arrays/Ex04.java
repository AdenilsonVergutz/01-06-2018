package Lista03Arrays;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {

		//Variáveis
		String[] gabarito = new String[10];
		String[] validadados = { "A", "B", "C", "D" };
		String[] prova = new String[10];
		String texto = "";
		String entrada = "";
		int acertos = 0;
		String[] nomes = new String[100];
		int[] notas = new int[100];
		int contador = 0;
		int contador_alunos = 0;
		boolean valida = false;
		
		for (int x = 0; x < 10; x++) {
			gabarito[x] = JOptionPane.showInputDialog(null, "Informe a resposta da " + (x + 1) + "ª questão");
			valida = false;
			for (int y = 0; y < 4; y++) {
				if (gabarito[x].equalsIgnoreCase(validadados[y])) {
					valida = true;
				}
			}
			if (valida != true) {
				JOptionPane.showMessageDialog(null, "Informe novamente a questão com uma resposta valida");
				x--;
			}
		}
		do {

			entrada = JOptionPane.showInputDialog(null, "Digite o nome do aluno ou sair para ver o resultado");
			if ((!entrada.equalsIgnoreCase("")) && (!entrada.equalsIgnoreCase("sair"))) {
				acertos = 0;
				while (contador < 10) {
					prova[contador] = JOptionPane.showInputDialog(null,
							"Informe a resposta da " + (contador + 1) + "ªquestão");
					valida = false;
					for (int x = 0; x < 4; x++) {
						if (prova[contador].equalsIgnoreCase(validadados[x])) {
							valida = true;
						}
					}
					if (valida == true) {
						contador++;
					} else {
						JOptionPane.showMessageDialog(null, "Informe novamente a questão com uma resposta valida");
					}
				}
				while (contador > 0) {
					contador--;
					if (prova[contador].equalsIgnoreCase(gabarito[contador])) {
						acertos++;
					}
				}
				nomes[contador_alunos] = entrada;
				notas[contador_alunos] = acertos;
				JOptionPane.showMessageDialog(null,
						"O aluno " + entrada + " acertou " + acertos + " e errou " + (10 - acertos));
				contador_alunos++;
			} else if (entrada.equalsIgnoreCase("")) {
				JOptionPane.showMessageDialog(null, "Este nome não é valido");
			}

		} while (!entrada.equalsIgnoreCase("sair"));
		if (contador_alunos == 0) {
			texto = "Nenhuma nota foi adicionada";
		} else {
			texto = "Abaixo acerto dos alunos na sua ordem";
			for (int x = 10; x > 0; x--) {
				contador = contador_alunos - 1;
				while (contador >= 0) {
					if (notas[contador] == x) {
						texto += "\nAluno: " + nomes[contador] + " Acertos: " + notas[contador];
					}
					contador--;
				}
			}

		}
		JOptionPane.showMessageDialog(null, texto);

	}

}
