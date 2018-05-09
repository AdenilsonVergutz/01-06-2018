/*Criar um vetor 20x6 onde o usuário irá informar os seguintes dados:
a. Nome
b. Sexo
c. Altura
d. Peso
Nome, sexo, altura e peso ficarão nas colunas de posição 0,1,2 e 3, a coluna de posição 4 deverá ser
calculado o IMC (peso / altura^2) e a posição 5 deverá conter a situação de cada indivíduo.
Faça um laço para que sejam cadastrados um determinado número de pessoas (a quantidade pode
variar).
Ao término exiba:
a) Nome, imc e situação de todos os participantes.
b) Quantidade e percentual de homens e mulheres que participaram
c) Quantidade de cada situação (quantidade de pesos normais, abaixo, sobrepeso…)
IMC Situações
Abaixo de 17 Muito abaixo do peso
Entre 17 e 18,49 Abaixo do peso
Entre 18,5 e 24,99 Peso normal
Entre 25 e 29,99 Acima do peso
Entre 30 e 34,99 Obesidade I
Entre 35 e 39,99 Obesidade II (severa)
Acima de 40 Obesidade III (mórbida)**/

package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {

		// Vetores
		String[][] informacoes = new String[6][20];

		// Variáveis
		int i = 0, homens = 0, mulheres = 0, muitoAbaixo = 0, abaixo = 0, normal = 0, acima = 0, ob1 = 0, ob2 = 0,
				ob3 = 0;
		String nome;

		// Obtendo nome
		nome = JOptionPane.showInputDialog("Informe o seu nome ou SAIR para finalizar");

		// Laço principal
		while ((!nome.toUpperCase().equals("SAIR")) && (i < 20)) {

			// Atribuindo nome
			informacoes[0][i] = nome;

			// Obtendo sexo

			informacoes[1][i] = JOptionPane.showInputDialog("Informe seu sexo (M/F)").toUpperCase();

			// Verificando qual sexo foi inserido
			if (informacoes[1][i].equals("M")) {
				homens++;
			} else {
				mulheres++;
			}

			// Obtendo altura e peso
			String altura = String.format("%.2f",
					Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura")));
			String peso = String.format("%.2f", Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso")));
			informacoes[2][i] = altura;
			informacoes[3][i] = peso;

			// Calculando imc
			double imc = Double.parseDouble(peso.replace(',', '.'))
					/ (Math.pow(Double.parseDouble(altura.replace(',', '.')), 2));
			informacoes[4][i] = Double.toString(imc);

			// Verificando situação do participante
			if (imc < 17) {
				informacoes[5][i] = "Muito abaixo do peso";
				muitoAbaixo++;
			} else if (imc < 18.5) {
				informacoes[5][i] = "Abaixo do peso";
				abaixo++;
			} else if (imc < 25) {
				informacoes[5][i] = "Peso normal";
				normal++;
			} else if (imc < 30) {
				informacoes[5][i] = "Acima do peso";
				acima++;
			} else if (imc < 35) {
				informacoes[5][i] = "Obesidade I";
				ob1++;
			} else if (imc < 40) {
				informacoes[5][i] = "Obesidade II (Severa)";
				ob2++;
			} else {
				informacoes[5][i] = "Obesidade III (Mórbida)";
				ob3++;
			}

			// Concatenando informações
			String info = "INFORMAÇÕES DO PARTICIPANTE\n\n";
			info += "Nome: " + nome + "\n";
			info += "IMC: " + String.format("%.2f", imc) + "\n";
			info += "Situação: " + informacoes[5][i];

			JOptionPane.showMessageDialog(null, info);

			// Obtendo nome
			nome = JOptionPane.showInputDialog("Informe o seu nome ou SAIR para finalizar");

			// Incrementado contador
			i++;

		}

		// Concatenando informações sobre o programa
		String info = "INFORMAÇÕES COLETADAS\n\n";
		info += "Homens: " + homens + " - " + (100 / i * homens) + "%\n";
		info += "Mulheres: " + mulheres + " - " + (100 / i * mulheres) + "%\n";
		info += "Pessoas muito abaixo do peso: " + muitoAbaixo + "\n";
		info += "Pessoas abaixo do peso: " + abaixo + "\n";
		info += "Pessoas com peso normal: " + normal + "\n";
		info += "Pessoas acima do peso: " + acima + " \n";
		info += "Pessoas com obesidade I: " + ob1 + "\n";
		info += "Pessoas com obesidade II: " + ob2 + "\n";
		info += "Pessoas com obesidade III: " + ob3 + "\n";

		// Exibindo informações
		JOptionPane.showMessageDialog(null, info);

	}

}
