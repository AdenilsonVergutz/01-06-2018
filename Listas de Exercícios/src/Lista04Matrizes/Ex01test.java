package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex01test {

	
public static void main(String[] args) {
		
		//Criando array
		int[][] numeros = new int[5][6];
		int parNumeros = 0, imparNumeros = 0, soma = 0, quant = 0, media = 0;
		
		//Obter n�meros
		for(int linha = 0; linha < 5; linha ++){
					
			for(int coluna = 0; coluna < 6; coluna ++){
						
				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero inteiro."));
			}
		}
		
		//Obter n�meros pares e �mpares
		for(int linha = 0; linha < 5; linha++){
			
			for(int coluna = 0; coluna < 6; coluna++){
				
				if(numeros[linha][coluna] % 2 == 0){
					parNumeros++;
				}else{
					imparNumeros++;
				}
			}
		}
		
		//Obter m�dia dos n�meros
		for(int linha = 0; linha < 5; linha++){
			
			for(int coluna = 0; coluna < 6; coluna++){
				soma = soma + numeros[linha][coluna]; 
			}
		}
		
		for(int linha = 0; linha < 5; linha++){
			
			for(int coluna = 0; coluna < 6; coluna++){
				media = soma/30; 
			}
		}
		
		//Obter quantidade de n�meros maiores ou iguais a m�dia
			for(int linha = 0; linha < 5; linha++){
				
				for(int coluna = 0; coluna < 6; coluna++){
					
					if(numeros[linha][coluna] >= media){
						quant++;
				}
			}
		}	
				
		//Exibir matriz
		String texto = "RESULTADO: \n\n";
			   texto+= "\nN�meros pares: "+parNumeros;
			   texto+= "\nN�meros �mpares: "+imparNumeros;
			   texto+= "\nA m�dia dos n�meros �: "+media;
			   texto+= "\nA quantidade de n�meros igual ou maiores que a m�dia �: "+quant+" \n";
			   for(int linha = 0; linha < 5; linha++){
					
					for(int coluna = 0; coluna < 6; coluna++){
						
						texto+= numeros[linha][coluna]+ "";
					}
			    texto+= "\n";
			   }
			
		JOptionPane.showMessageDialog(null, texto);
		
	
			}
		}




