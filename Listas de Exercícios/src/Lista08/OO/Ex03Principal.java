/*3.	Uma lanchonete precisa de um sistema para calcular o troco que ser� dado aos clientes, para isso fa�a com que seja informado um c�digo a quantidade pedida daquele produto (que pertence ao c�digo informado). Crie um la�o onde o cliente ir� informar c�digos e quantidades infinitamente.

Ap�s informados os c�digos e suas respectivas quantidades informe o total consumido e pe�a o valor que o cliente ir� pagar (Se o cliente tentar pagar menos que o total pe�a novamente o pagamento at� ele informar um valor igual ou superior consumido).

Ao t�rmino informe o troco que ser� dado ao cliente.

C�DIGO	PEDIDO	VALOR
1	Hamb�rguer + Suco de Laranja	R$ 5,00
2	Sandu�che natural + Suco de Uva	R$ 4,50
3	Prato do dia	R$ 8,00
4	Pizza	R$12,00
5	Lasanha	R$ 16,50
6	P�o de queijo	R$ 1,00
7	Bolo	R$ 2,50
*/


package Lista08.OO;

public class Ex03Principal {

	public static void main(String[] args) {


		Ex03 p1 = new Ex03();
		
		p1.laco();
	}

}
