package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex01test {

	
public static void main(String[] args) {
		
		//Criando array
		int[][] numeros = new int[5][6];
		int parNumeros = 0, imparNumeros = 0, soma = 0, quant = 0, media = 0;
		
		//Obter números
		for(int linha = 0; linha < 5; linha ++){
					
			for(int coluna = 0; coluna < 6; coluna ++){
						
				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro."));
			}
		}
		
		//Obter números pares e ímpares
		for(int linha = 0; linha < 5; linha++){
			
			for(int coluna = 0; coluna < 6; coluna++){
				
				if(numeros[linha][coluna] % 2 == 0){
					parNumeros++;
				}else{
					imparNumeros++;
				}
			}
		}
		
		//Obter média dos números
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
		
		//Obter quantidade de números maiores ou iguais a média
			for(int linha = 0; linha < 5; linha++){
				
				for(int coluna = 0; coluna < 6; coluna++){
					
					if(numeros[linha][coluna] >= media){
						quant++;
				}
			}
		}	
				
		//Exibir matriz
		String texto = "RESULTADO: \n\n";
			   texto+= "\nNúmeros pares: "+parNumeros;
			   texto+= "\nNúmeros ímpares: "+imparNumeros;
			   texto+= "\nA média dos números é: "+media;
			   texto+= "\nA quantidade de números igual ou maiores que a média é: "+quant+" \n";
			   for(int linha = 0; linha < 5; linha++){
					
					for(int coluna = 0; coluna < 6; coluna++){
						
						texto+= numeros[linha][coluna]+ "";
					}
			    texto+= "\n";
			   }
			
		JOptionPane.showMessageDialog(null, texto);
		
	
			}
		}




