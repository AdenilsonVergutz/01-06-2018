/*Criar uma matriz 10x2. Na primeira coluna deverá conter dez nomes e na segunda dez idades. 
Esses dados deverão estar já cadastrado na matriz.
Desenvolva um random que gere números entre 0 e 9 e armazene três números aleatórios sem repetição.
Em seguida exiba os três nomes e as três idades correspondentes a posição da matriz*/


package Lista04Matrizes;

import java.util.Random;

import javax.swing.JOptionPane;

public class ExBonus2 {

	public static void main(String[] args) {

	
		String[][] dados = {
						{"Adenilson","26"},
						{"Bruna","21"},
						{"Ana", "18"},
						{"Caio","16"},
						{"Bianca","13"},
						{"Anna","48"},
						{"Taty","25"},
						{"Bruno","22"},
						{"Pedro","15"},
						{"Letícia","30"}};
		
		// Vetores
		int[] valores = new int[3];
		
		//Alterando o valor do vetor (pois zero pode ser um valor)
		for(int i =0; i <3; i++) {
			valores[i] = -1;
		}
		
		//Random
		Random r = new Random();
		
		//Gerar os três números aleatórios sem repetição
		int indice = 0;
		int obterNumero;
		boolean validaNumero;
		
		do {
			obterNumero = r.nextInt(10);
			
			validaNumero = false;
			
			for(int i =0; i<3; i++) {
				if(obterNumero == valores[i]) {
					validaNumero = true;
				}
			}
			
			if(validaNumero == false) {
				indice++;
				
				for(int i=0; i<3; i++) {
					if(valores[i] == -1) {
						valores[i] = obterNumero;
						break;
					}
				}
			}
			
		}while(indice < 3);
		
		//Exibir os três dados
		String exibirDados = "DADOS: \n";
		for(int i=0; i<3; i++) {
			exibirDados += "\nNome: "+dados[valores[i]][0];
			exibirDados += "  Idade: "+dados[valores[i]][1];
		}
		
		JOptionPane.showMessageDialog(null, exibirDados);
		
		}

}
