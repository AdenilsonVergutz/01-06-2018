/*13. Desenvolver um algoritmo onde o usuário informa um número, exemplo 5.
Após informado deverá ser realizada a multiplicação com o antecessor, após isso utilizar o valor com
os antecessores até chegar a 1.
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
