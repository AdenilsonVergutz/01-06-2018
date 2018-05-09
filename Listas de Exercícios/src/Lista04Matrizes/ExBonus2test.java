package Lista04Matrizes;

import java.util.Random;

public class ExBonus2test {

	public static void main(String[] args) {
		//Vetores
		String[][] dados = {{"Tetris", "85"}, 
							{"Crepes", "16"}, 
							{"Frisbe", "27"},
							{"TRex", "80123"}, 
							{"Lebres", "34"}, 
							{"Trigonal Plana", "10"}, 
							{"Piramidal", "72"}, 
							{"Picles", "49"}, 
							{"Tetraédrico", "54"}, 
							{"Intérprete", "22"}};
		
		int[] indices = new int[3];
		
		//Randomizando indices
		Random random = new Random();
		
		for (int i = 0; i < 3; i++) {
			
			int indice = 0;
			boolean noVetor = true;
			
			while (noVetor) {
				
				noVetor = false;
				
				indice = random.nextInt(10);
				
				for (int j = 0; j < i; j++) {
					if (indice == indices[j]) {
						noVetor = true;
					}
				}
			}
			
			indices[i] = indice;
		}
		
		//Exibindo nomes e idades
		for (int i = 0; i < indices.length; i++) {
			System.out.println(dados[indices[i]][0] + " - " + dados[indices[i]][1]);		
		}
	}

}