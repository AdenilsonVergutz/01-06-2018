/*Crie uma matriz 5X6 onde o usuário irá informar números inteiros. Após informados deverá ser
exibido:
a. Quantidade de Números Pares.
b. Quantidade de Números Ímpares.
c. Média dos Números Informados.
d. Quantidade de Números Maiores ou Iguais a Média.
e. Exibir a matriz
*/

package Lista04Matrizes;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {

			//Variáveis
			String mensagem="", entrada="", matrizTexto="";
			String linha = new String(new char[20]).replace("\0", "-") + "\n \n";
			double media=0;
			int soma=0, numPares=0, numImpares=0, numero=0, numMaior=0, numMenor=0, numMedia=0;
			boolean cancelar = false, sair=false;
			
			//Criando Array
			int[][] matriz = new int[5][6];
			
			//Obtendo os numeros
			
			for(int ix = 0; ix< matriz.length;ix++){
				for(int jx = 0; jx< matriz[0].length;jx++){
					if(cancelar){break;}
					mensagem = String.format("Insira o número para a linha %1$s e coluna %2$s da matriz.",ix+1,jx+1);
					sair=false;
					
					while(!sair&&!cancelar){
						
						
						try{
							entrada = JOptionPane.showInputDialog(mensagem);
							if (entrada == null || (entrada!= null && entrada.equals(""))){
				                cancelar = true;
				                break;
							}else{
								numero = Integer.parseInt(entrada);
								if(numero>0){
									if(numero % 2 ==0){
										numPares++;
									}else{
										numImpares++;
									}
								}
								soma+=numero;
								matriz[ix][jx]=numero;
								sair=true;
							}
						}catch (Exception exc){
							JOptionPane.showMessageDialog(null, "Digite um valor inteiro!");
							
						}
					}
				}
			}
			
			if(!cancelar){
				mensagem = "Resumo dos numeros apresentados: \n" + linha;
				media = soma/(matriz.length*matriz[0].length);
				for(int[] ix: matriz){
					matrizTexto += Arrays.toString(ix) + "\n";
					for(int jx : ix){
						if(jx>media){
							numMaior++;
						}else if(jx<media){
							numMenor++;
						}else{
							numMedia++;
						}
					}
					
				}
				
				//Concatenando informações
				
				mensagem += "Quantidade de pares: " + numPares + "\n";
				mensagem += "Quantidade de ímpares: " + numImpares + "\n";
				mensagem += "Quantidade de números: \n";
				mensagem += "-Maiores que a média: " + numMaior + "\n";
				mensagem += "-Menores que a média: " + numMenor + "\n";
				mensagem += "-Iguais à média: " + numMedia + "\n";
				mensagem += "Pressione ok para visiualizar a matriz";
				
				//Exibir
				
				JOptionPane.showMessageDialog(null,mensagem);
				JOptionPane.showMessageDialog(null, matrizTexto);
			
			}
			}
}

	
