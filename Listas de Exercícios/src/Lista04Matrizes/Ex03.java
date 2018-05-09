/*Crie uma matriz 3X2, peça para que o usuário escreva os seis números e exiba nas proporções: 3X2 e
2X3. Chamamos isso de matriz transposta.
Imagine que o usuário coloque os números 1,7,4,8,9,3. Deverá exibir:
1 7 4
8 9 3
1 8
7 9
4 3
*/


package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		
		//Criando array
				int[][] numeros = new int[2][3];
				int[][] transposta = new int [3][2];
				
				
				//Obter números
				for(int linha = 0; linha < 2; linha ++){
											
					for(int coluna = 0; coluna < 3; coluna ++){
												
						numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro."));
						
					}
				}
				
				//Matriz transposta
				for(int linha = 0; linha < 3; linha ++){
					
					for(int coluna = 0; coluna < 2; coluna ++){
						transposta[linha][coluna] = numeros[coluna][linha];
					}
				}
				
				//Exibir matriz
				String texto = "***Exibir matriz***\n";
					for(int linha = 0; linha < 2; linha++){
					
						for(int coluna = 0; coluna < 3; coluna++){
						texto+= numeros[linha][coluna]+ "";
					}
						texto+= "\n";
					}	
						texto+= "\n";
					for(int linha = 0; linha < 3; linha ++){
						
						for(int coluna = 0; coluna < 2; coluna ++){
							texto+= transposta[linha][coluna]+ "";
						}
					    texto+= "\n";
							}	
				JOptionPane.showMessageDialog(null, texto);
			}

		}
