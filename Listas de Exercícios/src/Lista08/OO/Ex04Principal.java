/*4.	O filme Alice no pa�s das maravilhas est� fazendo uma enquete para saber o que o p�blico achou do filme, ser� necess�rio desenvolver um programa que tenha 5 op��es (excelente, �timo, bom, regular, ruim), e dever� informar a idade.

Ap�s informados os dados (idade e voto) de todos os indiv�duos dever� ser exibido:
Percentual de Votos
% Excelente
% �timo
% Bom
% Regular
% Ruim

Quantidade de:
Crian�as (0 � 9 anos)
Adolescentes (10 � 17 anos)
Adultos (Acima de 17 anos)

Valide caso a idade seja inferior a 0 ou superior a 100, crie uma valida��o tamb�m para a nota.*/


package Lista08.OO;

public class Ex04Principal {

	public static void main(String[] args) {


		Ex04 e1 = new Ex04();
		
		e1.laco();
		e1.resultados();
	}

}
