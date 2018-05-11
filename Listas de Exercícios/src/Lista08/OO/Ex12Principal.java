/*12. Para esse exercício precisaremos desenvolver um algoritmo (projeto de um sistema), para comparar
tipos de investimentos.
O usuário irá informar um valor inicial para investimento e o tempo de investimento em meses. Não
pode ser aceito comparativos inferiores a um mês e superiores a 48 meses.
Deverá ser exibido quanto a pessoa ganha em cada mês e o montante total ao término das
aplicações.
As aplicações utilizadas são as seguintes: Poupança que tem rendimento 0,37% ao mês e CDB de
6,39% ao ano.
Para o CDB há uma tabela importante a ser seguida:
Tempo Percentual de desconto
Até 6 meses 22,5%
Entre 7 meses e 12 meses 20%
Entre 13 meses e 24 meses 17,54%
Acima de 24 meses 15%
Dependendo do tempo informado deverá ser dado o percentual de desconto mensalmente nas
aplicações em CDB.
Os cálculos mensais são juros compostos, sendo assim se você colocar na poupança no mês de abril
R$1.000,00 você receberá 0,37% desse valor que é de 3,70, já no mês seguindo o cálculo será sobre
R$1.003,70. */



package Lista08.OO;

public class Ex12Principal {

	public static void main(String[] args) {
		
		Ex12 e12 = new Ex12();
		
		e12.obterDados();
		e12.exibirInvestimento();
    

	}

}
