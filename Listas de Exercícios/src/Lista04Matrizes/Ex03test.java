package Lista04Matrizes;

import javax.swing.JOptionPane;

public class Ex03test {

	public static void main(String[] args) {

		//Vetores
				int[][] matriz = new int[3][2];
				
				//Laço pra obter numeros
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 2; j++) {
						
						//Obtendo valor
						matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("informe um número inteiro"));
					}
				}
				
				//Fazendo proporção 3x2
				String prop = "";
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 3; j++) {
						
						//Concatenando valor
						prop += matriz[j][i] + " ";
					}
					
					//Pulando linha
					prop += "\n";
				}
				
				//Exibindo proporção 3x2
				JOptionPane.showMessageDialog(null, "3x2\n\n" + prop);

				//Fazendo proporção 2x3
				prop = "";
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 2; j++) {
						
						//Concatenando valor
						prop += matriz[i][j] + " ";
					}
					
					//Pulando linha
					prop += "\n";
				}
						
				//Exibindo proporção 3x2
				JOptionPane.showMessageDialog(null, "2x3\n\n" + prop);
				
			}

		}
