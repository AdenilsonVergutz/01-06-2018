package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex01test1 {

	public static void main(String[] args) {
		
		//Vetores
				int[][] matriz = new int[6][5];
				
				//Variáveis
				int qntPar = 0, qntImpar = 0, maiorIgualMedia = 0;
				double media = 0;
				String matrizString = "";
				
				//Laço para obter valores da matriz
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 5; j++) {
						
						//Obtendo numero
						matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
						
						//Verificando se o número é par ou ímpar
						if (matriz[i][j] % 2 == 0) {
							qntPar++;
						} else {
							qntImpar++;
						}
						
						//Adicionando o número à média
						media += matriz[i][j];
						
						//Adicionando o número à string da matriz
						matrizString += matriz[i][j] + " ";
					}
					
					//Pulando linha na string da matriz
					matrizString += "\n";
				}
				
				//Fazendo calculo de média
				media /= 30;
				
				//Verificando quantos números está acima ou iguais a média
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 5; j++) {
						if (matriz[i][j] > media) {
							maiorIgualMedia++;
						}
					}
				}
				
				//Concatenando informações
				String info = "INFORMAÇÕES COLETADAS\n\n";
					   info+= "Quantidade de pares: " + qntPar + "\n";
					   info+= "Quantidade de ímpares: " + qntImpar + "\n";
					   info+= "Média: " + String.format("%.2f", media) + "\n";
					   info+= "Quantidade de números acima ou na média: " + maiorIgualMedia;
					   
				//Exibindo informações
				JOptionPane.showMessageDialog(null, info);
				
				//Exibindo Matriz
				JOptionPane.showMessageDialog(null, "MATRIZ\n\n" + matrizString);
			}

		}
