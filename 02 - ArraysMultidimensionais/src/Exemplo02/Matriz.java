package Exemplo02;

import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {
	
		//Criando o array
		int[][] numeros = new int [4][4];
		
		//Texto
		String texto = "";
		
		//Obter números
		for(int linha = 0; linha < 4; linha++) {
			
			for(int coluna = 0; coluna < 4; coluna++) {
				
				texto = "Linha: "+(linha+1)+"\nColuna: "+(coluna+1);
				numeros[linha][coluna]= Integer.parseInt(JOptionPane.showInputDialog(texto));
			}
		}

		
		//Exibir
		texto = "Exibindo a matriz: \n\n";
		texto+= "Quantidade de linhas: "+numeros.length+"\n";
		texto+= "Quantidade de colunas: "+numeros[3].length+"\n\n";
		
		for(int linha = 0; linha < 4; linha++) {
			
			for(int coluna = 0; coluna < 4; coluna++) {
				
				texto += numeros[linha][coluna]+" ";
			}
			
			texto += "\n";
		}
		
		JOptionPane.showMessageDialog(null, texto);
	}

}
