package Lista03Arrays;

import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] numeross = new int[15];
		String texto = "";
		int soma = 0;
		int neutro = 0;
		int negativo = 0;
		int positivo = 0;
		int maiormedia = 0;
	

		
		for(int i=0; i<15; i++) {
			try{
				numeross[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o "+(i+1)+"º número"));
				soma += numeross[i];
				if(numeross[i]>0) {
					positivo++;
				}else if(numeross[i]<0) {
					negativo++;
				}else {
					neutro++;
				}
			}catch(Exception exc) {
				JOptionPane.showMessageDialog(null, "informação invalida, somente numeros inteiros");
				i--;
			}
		}
		int maiornum = numeross[14];
		int menornum = numeross[14];
		texto = "Soma dos números "+soma;
		texto +="\nMédia dos números "+String.format("%.2f",(soma/15.0));
		texto += "\nNúmeros Pares\n";
		for (int a : numeross) {
			if(a>=(soma/15.0)) {
				maiormedia++;
			}
			if(a>maiornum) {
				maiornum=a;
			}
			if(a<menornum) {
				menornum=a;
			}
			if(a%2==0) {
				texto += a+" ";
			}
			
		}
		texto += "\n\nNúmeros Ímpares\n";
		for (int i : numeross) {
			if(i%2!=0) {
				texto+=i+" ";
			}
		}
		texto +="\nQuantidade de números maiores ou iguais a média "+maiormedia;
		texto +="\nQuantidades negativos: "+negativo;
		texto +="\nQuantidade de números neutros "+neutro;
		texto +="\nQuantidade de números positivos "+positivo;
		texto +="\nMaior número "+maiornum;
		texto +="\nMenor número "+menornum;
		
		JOptionPane.showMessageDialog(null, texto);
		
		
	}

}


