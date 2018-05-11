/*Desenvolver um algoritmo que armazene as seguintes informações:
a. Nome
b. Sexo
c. Primeira nota
d. Segunda nota
e. Terceira nota
f. Quarta nota.
Enquanto o nome for diferente de SAIR o programa deverá perguntar os dados acima.
Após informada a quarta nota deverá ser dado a média e a condição do aluno (usar a segunda tabela
abaixo para informar sua situação).
Quando digitado SAIR deverá aparecer as seguintes estatísticas:
Quantidade e percentual de:
Homens
Mulheres
Quantidade e percentual de Notas
de alunos que tiraram 10-------------------------------------------Parabéns
de alunos que tiraram média entre 9.0 e 9.9------------------Ótimo
de alunos que tiraram média entre 8.0 e 8.9------------------Bom
de alunos que tiraram média entre 7.0 e 7.9------------------Satisfatório
de alunos que tiraram média entre 5.0 e 6.9------------------Recuperação
de alunos que tiraram média abaixo de 5----------------------Reprovado*/


package Lista08.OO;

public class Ex06Principal {

	public static void main(String[] args) {

		Ex06 a1 = new Ex06();
		
		a1.laco();
		a1.exibirResultados();

		
	}

}
