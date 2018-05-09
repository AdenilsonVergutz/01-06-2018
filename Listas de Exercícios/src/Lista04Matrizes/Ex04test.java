package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex04test {

	public static void main(String[] args) {


		//Vetores
				String[][] matriz = new String[15][5];
				
				//Preechendo matriz com *
				for (int i = 0; i < 15; i++) {
					matriz[i][0] = "*";
					matriz[i][4] = "*";
				}
				
				for (int i = 0; i < 5; i++) {
					matriz[0][i] = "*";
					matriz[14][i] = "*";
				}
				
				//Criando texto com a matriz
				String matrizString = "";
				for(int i = 0; i < 5; i++) {
					for (int j = 0; j < 15; j++) {
						
						//Concatenando posição atual da matriz
						matrizString += matriz[j][i];
					}
				}
				
				//Exibindo matriz
				JOptionPane.showMessageDialog(null, matrizString);

			}

		}
