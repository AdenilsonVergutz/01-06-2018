/*13. Desenvolver um algoritmo onde o usu�rio informa um n�mero, exemplo 5.
Ap�s informado dever� ser realizada a multiplica��o com o antecessor, ap�s isso utilizar o valor com
os antecessores at� chegar a 1.
5 x 4 = 20
20 x 3 = 60
60 x 2 =120
120 x 1 = 120 */


package Lista08.OO;

public class Ex13Principal {

	public static void main(String[] args) {


		Ex13 n1 = new Ex13();
		
		n1.obterNumero();
		n1.gerarCalculos();
	}

}
