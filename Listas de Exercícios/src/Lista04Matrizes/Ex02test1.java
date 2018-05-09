package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex02test1 {

	public static void main(String[] args) {
		//Vetores
				double[][] matriz = new double[5][5];
				
				//Variáveis
				double somaQuartaLinha = 0, somaSegundaColuna = 0, somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0, somaTotal = 0;
				String matrizString = "MATRIZ\n\n";
				
				//Laço para obter valores
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						
						//Obtendo número
						double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o número da " + (i + 1) + "ª linha e " + (j + 1) + "ª coluna"));
						
						//Formatando número
						String numFormatado = String.format("%.2f", num);
						
						//Atribuindo valor
						matriz[i][j] = Double.parseDouble(numFormatado.replace(',', '.'));
						
						//Somando ao total
						somaTotal += matriz[i][j];
						
						//Verificando se a linha é 4
						if (i == 4) {
							somaQuartaLinha += matriz[i][j];
						}
						
						//Verificando se a coluna é 2
						if (j == 2) {
							somaSegundaColuna += matriz[i][j];
						}
						
						//Adicionando à matrisString
						matrizString += numFormatado + " ";
					}
					
					//Pulando linha na matrizString
					matrizString += "\n";
				}
				
				//Fazendo cálculo da diagonal principal
				for (int i = 0; i < 5; i++) {
					somaDiagonalPrincipal += matriz[i][i];
				}
				
				//Fazendo cálculo da diagonal secundária
				for (int i = 0; i < 5; i++) {
					somaDiagonalSecundaria += matriz[i][4 - i];
				}
				
				//Concatenando informações
				String info = "INFORMAÇÕES DA MATRIZ\n\n";
					   info+= "Soma da quarta linha: " + somaQuartaLinha + "\n";
					   info+= "Soma da segunda coluna: " + somaSegundaColuna + "\n";
					   info+= "Soma diagonal principal: " + somaDiagonalPrincipal + "\n";
					   info+= "Soma diagonal secundária: " + somaDiagonalSecundaria + "\n";
					   info+= "Soma total: " + somaTotal;

				//Exibindo informações
				JOptionPane.showMessageDialog(null, info);
				
				//Exibindo matriz
				JOptionPane.showMessageDialog(null, matrizString);
					   
			}

		}
