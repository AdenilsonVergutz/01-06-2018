/*4.	O filme Alice no pa�s das maravilhas est� fazendo uma enquete para saber o que o p�blico achou do filme, ser� necess�rio desenvolver um programa que tenha 5 op��es (excelente, �timo, bom, regular, ruim), e dever� informar a idade.

Ap�s informados os dados (idade e voto) de todos os indiv�duos dever� ser exibido:
Percentual de Votos
% Excelente
% �timo
% Bom
% Regular
% Ruim

Quantidade de:
Crian�as (0 � 9 anos)
Adolescentes (10 � 17 anos)
Adultos (Acima de 17 anos)

Valide caso a idade seja inferior a 0 ou superior a 100, crie uma valida��o tamb�m para a nota.*/

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
				"O que voc� achou do filme Alice no Pa�s das Maravilhas? \n1 - Excelente \n2 - �timo \n3 - Bom \n4 - Regular\n 5 - Ruim \n6 - Exibir Resultados"));

		while (opcao != 6) {
			obterOpiniao();
			idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
			obterIdade();
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"O que voc� achou do filme Alice no Pa�s das Maravilhas? \n1 - Excelente \n2 - �timo \n3 - Bom \n4 - Regular\n 5 - Ruim \n6 - Exibir Resultados"));
			
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
		texto += "\nA porcentagem que acharam o filme �timo: " +porcentageOtim;
		texto += "\nA porcentagem que acharam o filme Bom: " +porcentageBom;
		texto += "\nA porcentagem que acharam o filme Regular " +porcentageReg;
		texto += "\nA porcentagem que acharam o filme Ruim: " +porcentageRuim;
		texto += "\nA Quantidade de Crian�as �: " +criancas;
		texto += "\nA quantidade de Adolescente �: " +adolescentes;
		texto += "\nA quantidade de Adulto �: " +adultos;

		JOptionPane.showMessageDialog(null, texto);
	}

}
