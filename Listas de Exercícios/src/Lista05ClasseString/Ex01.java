/*O usu�rio ir� informar uma palavra ou uma frase. Ap�s informada dever� aparecer o que
foi digitado alternando entre mai�sculas e min�sculas.*/



package Lista05ClasseString;

import javax.swing.*;

public class Ex01 {

	public static void main(String args[]) {

		//Vari�veis
		String palavra, fim = "";

		//Obtendo palavra
		palavra = JOptionPane.showInputDialog("Digite uma palavra");

		//Alternando letras
		String[] separadas = palavra.split("");
		for (int i = 0; i < palavra.length(); i++) {
			if (i % 2 == 0) {
				fim += separadas[i].toUpperCase();
			} else {
				fim += separadas[i].toLowerCase();
			}
		}

		//Exibindo palavra
		JOptionPane.showMessageDialog(null, fim, palavra, -1);
	}

}