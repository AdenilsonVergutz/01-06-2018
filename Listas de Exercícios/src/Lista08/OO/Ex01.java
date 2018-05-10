/*1.	Desenvolver um algoritmo que peça as seguintes informações: Nome, Idade, Sexo, Cargo, após cadastrar um determinado número de pessoas o programa deverá retornar os seguintes dados:

a)	Quantidade de pessoas do sexo masculino e feminino;

b)	Quantidade de pessoas dos seguintes cargos: gerente, atendente, açougueiro,  secretária, almoxarife, padeiro e estagiário.

c)	Quantidade de pessoas maiores de idade (18+) e quantidade de pessoas menores de idade
*/


package Lista08.OO;

import javax.swing.JOptionPane;

public class Ex01 {

		// Variaveis
		String nome;
		int cargo, sexo, idade, masculino = 0, femenino = 0;
		int al = 0, at = 0, aç = 0, es = 0, ge = 0, pa = 0, se = 0;
		int MaiorIdade = 0, idadeMenor = 0;

		// realizar perguntas
		public void perguntas() {

			nome = JOptionPane.showInputDialog("Informe seu nome.");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua Idade."));

			String inf = "Informe seu sexo\n\n";
			inf += " 1 - Masculino";
			inf += "\n 2 - Femenino";

			sexo = Integer.parseInt(JOptionPane.showInputDialog(inf));

			String carg = "Informe seu cargo\n\n";
			carg += " 1 - Almoxarife";
			carg += "\n 2 - Atendente";
			carg += "\n 3 - Açougueiro";
			carg += "\n 4 - Estagiário";
			carg += "\n 5 - Gerente";
			carg += "\n 6 - Padeiro";
			carg += "\n 7 - Secretário";

			cargo = Integer.parseInt(JOptionPane.showInputDialog(carg));
		}

		// Contabilizar sexo
		public void contadorSexo() {

			if (sexo == 1) {
				masculino++;
			} else {
				femenino++;
			}
		}

		// Contabilizar cargo
		public void contadorCargo() {

			if (cargo == 1) {
				al++;
			} else if (cargo == 2) {
				at++;
			} else if (cargo == 3) {
				aç++;
			} else if (cargo == 4) {
				es++;
			} else if (cargo == 5) {
				ge++;
			} else if (cargo == 6) {
				pa++;
			} else if (cargo == 7) {
				se++;
			}

		}

		// Contabilizar idade
		public void contadorIdade() {

			if (idade >= 18) {
				MaiorIdade++;
			} else {
				idadeMenor++;
			}
		}

		// Metodo de repetição
		public void laco() {

			// Variãvel
			int continuar = 0;

			// Laço
			do {
				perguntas();
				contadorSexo();
				contadorIdade();
				contadorCargo();
				continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
			} while (continuar == 0);
			exibirSexo();
			exibirCargo();
			exibirIdade();
		}

		// Exibir a quantidade de pessoa de cada cargo
		public void exibirCargo() {

			String info = "Quantidade de funcionários de cada cargo.\n\n";
			info += " Almoxarifes: " + al;
			info += "\n Atendentes: " + at;
			info += "\n Açougueiros: " + aç;
			info += "\n Estagiários: " + es;
			info += "\n Gerentes: " + ge;
			info += "\n Padeiros: " + pa;
			info += "\n Secretários: " + se;

			JOptionPane.showMessageDialog(null, info);
		}

		// Metodo para exibir quantidade de pessoas de cada sexo
		public void exibirSexo() {

			String inf = "Quantidade de funcionário de cada sexo.\n\n";
			inf += " Masculino: " + masculino;
			inf += "\n Femenino: " + femenino;

			JOptionPane.showMessageDialog(null, inf);
		}

		// Metodo para exibir maiores e menores de 18
		public void exibirIdade() {

			String tab = "Quantidade de pessoas maiores e menores de 18 anos.\n\n";
			tab += " Maior de 18: " + MaiorIdade;
			tab += "\n Menor de 18: " + idadeMenor;

			JOptionPane.showMessageDialog(null, tab);
		}

	}

