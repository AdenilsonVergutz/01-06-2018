/*12. Para esse exerc�cio precisaremos desenvolver um algoritmo (projeto de um sistema), para comparar
tipos de investimentos.
O usu�rio ir� informar um valor inicial para investimento e o tempo de investimento em meses. N�o
pode ser aceito comparativos inferiores a um m�s e superiores a 48 meses.
Dever� ser exibido quanto a pessoa ganha em cada m�s e o montante total ao t�rmino das
aplica��es.
As aplica��es utilizadas s�o as seguintes: Poupan�a que tem rendimento 0,37% ao m�s e CDB de
6,39% ao ano.
Para o CDB h� uma tabela importante a ser seguida:
Tempo Percentual de desconto
At� 6 meses 22,5%
Entre 7 meses e 12 meses 20%
Entre 13 meses e 24 meses 17,54%
Acima de 24 meses 15%
Dependendo do tempo informado dever� ser dado o percentual de desconto mensalmente nas
aplica��es em CDB.
Os c�lculos mensais s�o juros compostos, sendo assim se voc� colocar na poupan�a no m�s de abril
R$1.000,00 voc� receber� 0,37% desse valor que � de 3,70, j� no m�s seguindo o c�lculo ser� sobre
R$1.003,70. */



package Lista08.OO;

public class Ex12Principal {

	public static void main(String[] args) {
		
		Ex12 e12 = new Ex12();
		
		e12.obterDados();
		e12.exibirInvestimento();
    

	}

}
