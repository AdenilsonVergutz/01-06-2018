/*4.	O filme Alice no país das maravilhas está fazendo uma enquete para saber o que o público achou do filme, será necessário desenvolver um programa que tenha 5 opções (excelente, ótimo, bom, regular, ruim), e deverá informar a idade.

Após informados os dados (idade e voto) de todos os indivíduos deverá ser exibido:
Percentual de Votos
% Excelente
% Ótimo
% Bom
% Regular
% Ruim

Quantidade de:
Crianças (0 à 9 anos)
Adolescentes (10 à 17 anos)
Adultos (Acima de 17 anos)

Valide caso a idade seja inferior a 0 ou superior a 100, crie uma validação também para a nota.*/

package Lista08.OO;

import javax.swing.JOptionPane;

public class Ex04 {

	int opcao;
	int porcentageBom = 0;
	int porcentageExce = 0;
	int porcentageOtim = 0;
	int porcentageReg = 0;
	int porcentageRuim = 0;
	int excelente = 0;
	int otimo = 0;
	int bom = 0;
	int regular = 0;
	int ruim = 0;

	int contNota = 0;
	int idade;
	int criancas = 0;
	int adolescentes = 0;
	int adultos = 0;

	public void obterDados() {

		opcao = Integer.parseInt(JOptionPane.showInputDialog(
				"O que você achou do filme Alice no País das Maravilhas? \n1 - Excelente \n2 - Ótimo \n3 - Bom \n4 - Regular\n 5 - Ruim \n6 - Exibir Resultados"));

		while (opcao != 6) {
			obterOpiniao();
			idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
			obterIdade();
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"O que você achou do filme Alice no País das Maravilhas? \n1 - Excelente \n2 - Ótimo \n3 - Bom \n4 - Regular\n 5 - Ruim \n6 - Exibir Resultados"));
			
		}
	}

	public void obterOpiniao() {

		// Contador de Nota
			contNota++;

		if (opcao == 1) {
			excelente++;
		} else if (opcao == 2) {
			otimo++;
		} else if (opcao == 3) {
			bom++;
		} else if (opcao == 4) {
			regular++;
		} else if (opcao == 5) {
			ruim++;
		}

	}

	public void obterIdade() {

		if (idade <= 9) {
			criancas++;
		} else if (idade <= 17) {
			adolescentes++;
		} else {
			adultos++;
		}

	}

	public void laco() {

		obterDados();

	}

	public void resultados() {

		porcentageExce = excelente * 100 / contNota;
		porcentageOtim = otimo * 100 / contNota;
		porcentageBom = bom * 100 / contNota;
		porcentageReg = regular * 100 / contNota;
		porcentageRuim = ruim * 100 / contNota;

		String texto = "****RESULTADO DOS DADOS!****\n\n";
		texto += "\nA porcentagem que acharam o filme Excelente: " +porcentageExce;
		texto += "\nA porcentagem que acharam o filme Ótimo: " +porcentageOtim;
		texto += "\nA porcentagem que acharam o filme Bom: " +porcentageBom;
		texto += "\nA porcentagem que acharam o filme Regular " +porcentageReg;
		texto += "\nA porcentagem que acharam o filme Ruim: " +porcentageRuim;
		texto += "\nA Quantidade de Crianças é: " +criancas;
		texto += "\nA quantidade de Adolescente é: " +adolescentes;
		texto += "\nA quantidade de Adulto é: " +adultos;

		JOptionPane.showMessageDialog(null, texto);
	}

}
