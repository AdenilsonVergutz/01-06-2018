/*Desenvolver um algoritmo que armazene as seguintes informa��es:
a. Nome
b. Sexo
c. Primeira nota
d. Segunda nota
e. Terceira nota
f. Quarta nota.
Enquanto o nome for diferente de SAIR o programa dever� perguntar os dados acima.
Ap�s informada a quarta nota dever� ser dado a m�dia e a condi��o do aluno (usar a segunda tabela
abaixo para informar sua situa��o).
Quando digitado SAIR dever� aparecer as seguintes estat�sticas:
Quantidade e percentual de:
Homens
Mulheres
Quantidade e percentual de Notas
de alunos que tiraram 10-------------------------------------------Parab�ns
de alunos que tiraram m�dia entre 9.0 e 9.9------------------�timo
de alunos que tiraram m�dia entre 8.0 e 8.9------------------Bom
de alunos que tiraram m�dia entre 7.0 e 7.9------------------Satisfat�rio
de alunos que tiraram m�dia entre 5.0 e 6.9------------------Recupera��o
de alunos que tiraram m�dia abaixo de 5----------------------Reprovado*/


package Lista08.OO;

public class Ex06Principal {

	public static void main(String[] args) {

		Ex06 a1 = new Ex06();
		
		a1.laco();
		a1.exibirResultados();

		
	}

}
