package Lista03Arrays;

import javax.swing.JOptionPane;

public class Ex07test {

	public static void main(String[] args) {


		//Vari�veis
				int[] numeros = new int[7];
				int indicePrincipal = 0;
				int obterNumero;
				boolean existe = false;
				
				//Inicializar pro kbelo n�o falar merda =)
				for(int indice=0; indice<7; indice++) {
					numeros[indice] = -9999;
				}
				
				//La�o principal
				do {
					
					//Obter o n�mero
					obterNumero = Integer.parseInt(JOptionPane.showInputDialog((indicePrincipal+1)+"� n�mero"));
					
					//Verificar se o n�mero existe no vetor
					existe=false;
					for(int indice=0; indice<7; indice++) {
						if(obterNumero == numeros[indice]) {
							existe = true;
						}
					}
					
					//Adicionar ao vetor se necess�rio
					if(existe == false) {
						
						for(int indice=0; indice<7;indice++) {
							if(numeros[indice] == -9999) {
								numeros[indice] = obterNumero;
								indicePrincipal++;
								break;
							}
						}
						
					}
						
				}while(indicePrincipal < 7);
				
			}

		}














