package Exemplo01;

import javax.swing.JOptionPane;

public class Imc {
	
	/*
	 DEFAULT :   Atributos e métodos são exibidos em todas as classes no mesmo pacote.
	 PUBLIC :    Atributos e métodos são exibidos em todo o projeto.
	 PRIVATE :   Atributos e métodos são exibidos apenas na classe onde são criados.
	 PROTECTED : Atributos e métodos são exibidos nas classes onde são criados ou herdados.
	 */

	// Atributos
	private double peso, altura;

	// Método para pedir o peso e a altura
	private void obterDados() {
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
	}

	// Método para realizar o cálculo de imc
	private double calculoIMC() {

		double resultado = peso / Math.pow(altura, 2);
		return resultado;
	}

	// Método para retornar a situação do imc
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

	// Método para exibir a situação do imc
	private void exibirDados() {
		String mensagem = "***IMC***\n\n";
		mensagem += "Seu imc é de " + String.format("%.2f", calculoIMC());
		mensagem += "\nSua situação é " + situacaoIMC();

		JOptionPane.showMessageDialog(null, mensagem);
	}

	// Método principal
	public void principal() {
		obterDados();
		exibirDados();

	}
}
