/*O usuário poderá informar uma palavra ou uma frase. Após informado deverá ser exibida a
quantidade de vogais encontradas*/


package Lista05ClasseString;

import javax.swing.*;

public class Ex02 {

	public static void main(String args[]) {

		//Variáveis
		String frase;
		int vogais = 0;

		//Obtendo frase
		frase = JOptionPane.showInputDialog("Insira uma palavra ou frase");

		//Verificando quantidade de vogais
		String letras[] = frase.split("");
		for (int i = 0; i < frase.length(); i++) {
			if ((letras[i].toUpperCase().equals("A")) || (letras[i].toUpperCase().equals("E")) || (letras[i].toUpperCase().equals("I")) || (letras[i].toUpperCase().equals("O")) || (letras[i].toUpperCase().equals("U"))) {
				vogais++;
			}
		}

		JOptionPane.showMessageDialog(null, "Quantidade de vogais = " + vogais, "Vogais", -1);
	}

}
