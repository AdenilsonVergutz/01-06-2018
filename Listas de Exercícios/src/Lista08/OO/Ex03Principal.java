/*3.	Uma lanchonete precisa de um sistema para calcular o troco que será dado aos clientes, para isso faça com que seja informado um código a quantidade pedida daquele produto (que pertence ao código informado). Crie um laço onde o cliente irá informar códigos e quantidades infinitamente.

Após informados os códigos e suas respectivas quantidades informe o total consumido e peça o valor que o cliente irá pagar (Se o cliente tentar pagar menos que o total peça novamente o pagamento até ele informar um valor igual ou superior consumido).

Ao término informe o troco que será dado ao cliente.

CÓDIGO	PEDIDO	VALOR
1	Hambúrguer + Suco de Laranja	R$ 5,00
2	Sanduíche natural + Suco de Uva	R$ 4,50
3	Prato do dia	R$ 8,00
4	Pizza	R$12,00
5	Lasanha	R$ 16,50
6	Pão de queijo	R$ 1,00
7	Bolo	R$ 2,50
*/


package Lista08.OO;

public class Ex03Principal {

	public static void main(String[] args) {


		Ex03 p1 = new Ex03();
		
		p1.laco();
	}

}
