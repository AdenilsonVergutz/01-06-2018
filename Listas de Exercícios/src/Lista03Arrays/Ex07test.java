package Lista03Arrays;

import javax.swing.JOptionPane;

public class Ex07test {

	public static void main(String[] args) {


		//Variáveis
				int[] numeros = new int[7];
				int indicePrincipal = 0;
				int obterNumero;
				boolean existe = false;
				
				//Inicializar pro kbelo não falar merda =)
				for(int indice=0; indice<7; indice++) {
					numeros[indice] = -9999;
				}
				
				//Laço principal
				do {
					
					//Obter o número
					obterNumero = Integer.parseInt(JOptionPane.showInputDialog((indicePrincipal+1)+"º número"));
					
					//Verificar se o número existe no vetor
					existe=false;
					for(int indice=0; indice<7; indice++) {
						if(obterNumero == numeros[indice]) {
							existe = true;
						}
					}
					
					//Adicionar ao vetor se necessário
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














