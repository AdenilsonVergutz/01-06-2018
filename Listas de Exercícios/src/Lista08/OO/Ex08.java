/*8. Pedir um n�mero inteiro, ap�s obtido exibir os 10 n�meros sucessores e antecessores.*/


package Lista08.OO;

import javax.swing.JOptionPane;

public class Ex08 {

	int numero;
	int indice = 1;
	String numerosresultado;
	
	public void obterNumero(){
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero para obter seus sucessores e antecessores."));
		
	}
	
	public void exibir(){
		
		 numerosresultado = "N�meros sucessores e antecessores de "+numero;
	        numerosresultado += "\nSucessores          Antecessores";
	        
	        while (indice<=10) {
	            numerosresultado += "\n"+(numero+indice)+"����������������..................����������������"+(numero-indice);
	            indice++;
	        }
	        
	        JOptionPane.showMessageDialog(null, numerosresultado);
		
	}
	
}

