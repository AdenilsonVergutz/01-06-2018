/*Criar uma matriz 10x2. Na primeira coluna dever� conter dez nomes e na segunda dez idades. 
Esses dados dever�o estar j� cadastrado na matriz.
Desenvolva um random que gere n�meros entre 0 e 9 e armazene tr�s n�meros aleat�rios sem repeti��o.
Em seguida exiba os tr�s nomes e as tr�s idades correspondentes a posi��o da matriz*/


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
						{"Let�cia","30"}};
		
		// Vetores
		int[] valores = new int[3];
		
		//Alterando o valor do vetor (pois zero pode ser um valor)
		for(int i =0; i <3; i++) {
			valores[i] = -1;
		}
		
		//Random
		Random r = new Random();
		
		//Gerar os tr�s n�meros aleat�rios sem repeti��o
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
		
		//Exibir os tr�s dados
		String exibirDados = "DADOS: \n";
		for(int i=0; i<3; i++) {
			exibirDados += "\nNome: "+dados[valores[i]][0];
			exibirDados += "  Idade: "+dados[valores[i]][1];
		}
		
		JOptionPane.showMessageDialog(null, exibirDados);
		
		}

}
