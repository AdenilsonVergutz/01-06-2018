package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex02test {

	public static void main(String[] args) {

		//Criando array
		int[][] numeros = new int[5][5];
		int somaLinha = 0, somaColuna = 0, somaDiag = 0, somaDiagonal = 0; 
		
		//Obter números
		for(int linha = 0; linha < 5; linha ++){
							
			for(int coluna = 0; coluna < 5; coluna ++){
								
				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro."));
			}
		}
		//Obter soma dos números da 4ª linha
		somaLinha = (numeros[4][0]+numeros[4][1]+numeros[4][2]+numeros[4][3]+numeros[4][4]);
		
		//Obter soma dos números da 2ª coluna
		somaColuna = (numeros[0][2]+numeros[1][2]+numeros[2][2]+numeros[3][2]+numeros[4][2]);
		
		//Obter soma da diagonal primária
		somaDiag = (numeros[0][0]+numeros[1][1]+numeros[2][2]+numeros[3][3]+numeros[4][4]);
		
		//Obter soma da diagonal secundária
		somaDiagonal = (numeros[4][4]+numeros[3][3]+numeros[2][2]+numeros[1][1]+numeros[0][0]);
		
		//Exibir matriz
				String texto = "RESULTADO: \n\n";
					   texto+= "\nSoma dos números da 4ª linha: "+somaLinha;
					   texto+= "\nSoma dos números da 2ª coluna: "+somaColuna;
					   texto+= "\nSoma da diagonal primária: "+somaDiag;
					   texto+= "\nSoma da diagonal secundária: "+somaDiagonal+" \n";
					   for(int linha = 0; linha < 5; linha++){
							
							for(int coluna = 0; coluna < 5; coluna++){
								
								texto+= numeros[linha][coluna]+ "";
							}
					    texto+= "\n";
					   }
					
				JOptionPane.showMessageDialog(null, texto);
	}

}

