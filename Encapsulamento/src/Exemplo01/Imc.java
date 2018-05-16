package Exemplo01;

import javax.swing.JOptionPane;

public class Imc {
	
	/*
	 DEFAULT :   Atributos e m�todos s�o exibidos em todas as classes no mesmo pacote.
	 PUBLIC :    Atributos e m�todos s�o exibidos em todo o projeto.
	 PRIVATE :   Atributos e m�todos s�o exibidos apenas na classe onde s�o criados.
	 PROTECTED : Atributos e m�todos s�o exibidos nas classes onde s�o criados ou herdados.
	 */

	// Atributos
	private double peso, altura;

	// M�todo para pedir o peso e a altura
	private void obterDados() {
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
	}

	// M�todo para realizar o c�lculo de imc
	private double calculoIMC() {

		double resultado = peso / Math.pow(altura, 2);
		return resultado;
	}

	// M�todo para retornar a situa��o do imc
	private String situacaoIMC() {

		double resultado = calculoIMC();
		String situacao = "";

		if (resultado < 17) {
			situacao = "Muito abaixo do peso.";
		} else if (resultado < 18.5) {
			situacao = "Abaixo do peso.";
		} else if (resultado < 25) {
			situacao = "Peso Normal.";
		} else if (resultado < 30) {
			situacao = "Acima do peso.";
		} else if (resultado < 35) {
			situacao = "Obesidade I.";
		} else if (resultado < 40) {
			situacao = "Obesidade II.";
		} else {
			situacao = "Obesidade III.";
		}

		return situacao;

	}

	// M�todo para exibir a situa��o do imc
	private void exibirDados() {
		String mensagem = "***IMC***\n\n";
		mensagem += "Seu imc � de " + String.format("%.2f", calculoIMC());
		mensagem += "\nSua situa��o � " + situacaoIMC();

		JOptionPane.showMessageDialog(null, mensagem);
	}

	// M�todo principal
	public void principal() {
		obterDados();
		exibirDados();

	}
}
