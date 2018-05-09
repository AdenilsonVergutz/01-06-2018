package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex02test1 {

	public static void main(String[] args) {
		//Vetores
				double[][] matriz = new double[5][5];
				
				//Vari�veis
				double somaQuartaLinha = 0, somaSegundaColuna = 0, somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0, somaTotal = 0;
				String matrizString = "MATRIZ\n\n";
				
				//La�o para obter valores
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						
						//Obtendo n�mero
						double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero da " + (i + 1) + "� linha e " + (j + 1) + "� coluna"));
						
						//Formatando n�mero
						String numFormatado = String.format("%.2f", num);
						
						//Atribuindo valor
						matriz[i][j] = Double.parseDouble(numFormatado.replace(',', '.'));
						
						//Somando ao total
						somaTotal += matriz[i][j];
						
						//Verificando se a linha � 4
						if (i == 4) {
							somaQuartaLinha += matriz[i][j];
						}
						
						//Verificando se a coluna � 2
						if (j == 2) {
							somaSegundaColuna += matriz[i][j];
						}
						
						//Adicionando � matrisString
						matrizString += numFormatado + " ";
					}
					
					//Pulando linha na matrizString
					matrizString += "\n";
				}
				
				//Fazendo c�lculo da diagonal principal
				for (int i = 0; i < 5; i++) {
					somaDiagonalPrincipal += matriz[i][i];
				}
				
				//Fazendo c�lculo da diagonal secund�ria
				for (int i = 0; i < 5; i++) {
					somaDiagonalSecundaria += matriz[i][4 - i];
				}
				
				//Concatenando informa��es
				String info = "INFORMA��ES DA MATRIZ\n\n";
					   info+= "Soma da quarta linha: " + somaQuartaLinha + "\n";
					   info+= "Soma da segunda coluna: " + somaSegundaColuna + "\n";
					   info+= "Soma diagonal principal: " + somaDiagonalPrincipal + "\n";
					   info+= "Soma diagonal secund�ria: " + somaDiagonalSecundaria + "\n";
					   info+= "Soma total: " + somaTotal;

				//Exibindo informa��es
				JOptionPane.showMessageDialog(null, info);
				
				//Exibindo matriz
				JOptionPane.showMessageDialog(null, matrizString);
					   
			}

		}
