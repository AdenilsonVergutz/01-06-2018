/*13. Desenvolver um algoritmo onde o usu�rio informa um n�mero, exemplo 5.
Ap�s informado dever� ser realizada a multiplica��o com o antecessor, ap�s isso utilizar o valor com
os antecessores at� chegar a 1.
5 x 4 = 20
20 x 3 = 60
60 x 2 =120
120 x 1 = 120 */


package Lista08.OO;

import javax.swing.JOptionPane;

public class Ex13 {
	
	int numero = 0;
	int antecessor = 0;
	int resultado = 0;
	int conta = 0;
	int conta1 = 0;
	
	String exibir = "";
	
	public void obterNumero(){
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero"));
		
	}
	
	public void gerarCalculos(){
		
		do{
			
			antecessor = numero-1;
			conta = numero*antecessor;
			exibir += numero + " X " + antecessor + " = " + conta+"\n\n";
			
			do{
				antecessor = antecessor-1;
				conta1 = conta;
				conta = conta1*antecessor;
				exibir += conta1 + " X "+ antecessor + " = " + conta + "\n\n";
				
			}while(antecessor>1);
			
		}while(antecessor>1);
		
		JOptionPane.showMessageDialog(null, exibir);
	}
	
}



