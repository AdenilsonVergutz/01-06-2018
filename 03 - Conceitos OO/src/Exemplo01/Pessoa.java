//Classe = Molde

package Exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	// Atributos
	String nome;
	int idade;
	double peso, altura;

	// M�todo de apresenta��o
	public void apresentacao() {
		JOptionPane.showMessageDialog(null, "Ol�, meu nome �  " + nome);
	}

	// Calculo de IMC
	public double calculoImc() {

		double imc = peso / Math.pow(altura, 2);

		return imc;
	}

	// Situa��o do IMC
	public String situacaoImc() {

		// Vari�vel contendo a situa��o
		String situacao;

		// Obter o valor do imc
		double imc = calculoImc();

		// Situa��o
		if (imc < 17) {
			situacao = "Muito abaixo do peso.";
		} else if (imc < 18.5) {
			situacao = "Abaixo do peso.";
		} else if (imc < 25) {
			situacao = "Peso Normal.";
		} else if (imc < 30) {
			situacao = "Acima do peso.";
		} else if (imc < 35) {
			situacao = "Obesidade I.";
		} else if (imc < 40) {
			situacao = "Obesidade II.";
		} else {
			situacao = "Obesidade III.";
		}

		// Retorno
		return situacao;
	}

	// M�todo para exibir o IMC e a situa��o
	public void exibirImc() {

		// Messagem
		String msg = "****IMC****";
		msg += "\nSeu IMC � de: " + String.format("%.2f", calculoImc());
		msg += "\nSua situa��o �: " + situacaoImc();

		// Exibir Mensagem
		JOptionPane.showMessageDialog(null, msg);
	}
}
