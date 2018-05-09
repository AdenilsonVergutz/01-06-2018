package Lista04Matrizes;

public class Ex04 {

	public static void main(String[] args){
		
		
		//Criando array multidimensional
				String [][] matriz = new String [5][15];
				
				//Condicionais
				for(int linha = 0; linha < 5; linha ++){
					
					for(int coluna = 0; coluna < 15; coluna ++){
					matriz[0][coluna] = " * ";
					matriz[4][coluna] = " * ";
					matriz[linha][0] = " * ";
					matriz[linha][14] = " * ";
					matriz[3][8] = "  ";
					}
				}
				
		}

	
	
	
}
				
				