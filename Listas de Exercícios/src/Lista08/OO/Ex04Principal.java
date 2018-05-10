/*4.	O filme Alice no país das maravilhas está fazendo uma enquete para saber o que o público achou do filme, será necessário desenvolver um programa que tenha 5 opções (excelente, ótimo, bom, regular, ruim), e deverá informar a idade.

Após informados os dados (idade e voto) de todos os indivíduos deverá ser exibido:
Percentual de Votos
% Excelente
% Ótimo
% Bom
% Regular
% Ruim

Quantidade de:
Crianças (0 à 9 anos)
Adolescentes (10 à 17 anos)
Adultos (Acima de 17 anos)

Valide caso a idade seja inferior a 0 ou superior a 100, crie uma validação também para a nota.*/


package Lista08.OO;

public class Ex04Principal {

	public static void main(String[] args) {


		Ex04 e1 = new Ex04();
		
		e1.laco();
		e1.resultados();
	}

}
