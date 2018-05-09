package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex01test1 {

	public static void main(String[] args) {
		
		//Vetores
				int[][] matriz = new int[6][5];
				
				//Vari�veis
				int qntPar = 0, qntImpar = 0, maiorIgualMedia = 0;
				double media = 0;
				String matrizString = "";
				
				//La�o para obter valores da matriz
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 5; j++) {
						
						//Obtendo numero
						matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
						
						//Verificando se o n�mero � par ou �mpar
						if (matriz[i][j] % 2 == 0) {
							qntPar++;
						} else {
							qntImpar++;
						}
						
						//Adicionando o n�mero � m�dia
						media += matriz[i][j];
						
						//Adicionando o n�mero � string da matriz
						matrizString += matriz[i][j] + " ";
					}
					
					//Pulando linha na string da matriz
					matrizString += "\n";
				}
				
				//Fazendo calculo de m�dia
				media /= 30;
				
				//Verificando quantos n�meros est� acima ou iguais a m�dia
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 5; j++) {
						if (matriz[i][j] > media) {
							maiorIgualMedia++;
						}
					}
				}
				
				//Concatenando informa��es
				String info = "INFORMA��ES COLETADAS\n\n";
					   info+= "Quantidade de pares: " + qntPar + "\n";
					   info+= "Quantidade de �mpares: " + qntImpar + "\n";
					   info+= "M�dia: " + String.format("%.2f", media) + "\n";
					   info+= "Quantidade de n�meros acima ou na m�dia: " + maiorIgualMedia;
					   
				//Exibindo informa��es
				JOptionPane.showMessageDialog(null, info);
				
				//Exibindo Matriz
				JOptionPane.showMessageDialog(null, "MATRIZ\n\n" + matrizString);
			}

		}
