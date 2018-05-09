package jOptionPane;

import javax.swing.JOptionPane;

public class Escola {

	public static void main(String[] args) {
		
		//Vetores
		String[] nomes = new String[10], situacao = new String[10];
		double[] nota1 = new double[10], nota2 = new double[10], nota3 = new double[10], media = new double[10];
		
		//Vari�vel
		int continuar = 0;
		int indice = 0;
		
		//La�o
		do {

			//Obter o nome
			nomes[indice] = JOptionPane.showInputDialog("Informe o nome do aluno");
			
			//Obter as notas
			nota1[indice] = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
			nota2[indice] = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
			nota3[indice] = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota"));
			
			//Calcular m�dia
			media[indice] = (nota1[indice] + nota2[indice] + nota3[indice]) / 3;
			
			//Situa��o
			situacao[indice] = media[indice] > 7 ? "Aprovado" : "Reprovado";
			
			//Incrementando indice
			indice++;
			
			//Verificar se quer cadastrar mais algu�m
			continuar = JOptionPane.showConfirmDialog(null, "Continuar?", "", 0);
			
		} while (continuar != 1);
		
		//Estat�ticas
		String texto = "*****ESTAT�STICA*****\n\n";
		
		for (int i = 0; i < indice; i++) {
			texto += nomes[i] + " obteve m�dia " + String.format("%.2f", media[i]);
			texto += ". Sua condi��o � de " + situacao[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, texto);
	}

}