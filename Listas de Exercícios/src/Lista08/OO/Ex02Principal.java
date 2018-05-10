/*2.	Desenvolver um algoritmo que peça nome, altura, idade, peso dos jogadores de basquete, enquanto o nome do jogador for diferente da palavra SAIR o programa deverá pedir essas informações, após cadastrados deverá aparecer as seguintes informações:

a.	Quantidade de jogadores cadastrados;
b.	Nome e altura do maior Jogador;
c.	Nome e idade do jogador mais velho;
d.	Nome e peso do jogador mais pesado;
e.	Média das alturas jogadores.*/


package Lista08.OO;

public class Ex02Principal {

	public static void main(String[] args) {


		Ex02 p1 = new Ex02();
		
		p1.laco();
		p1.informacoes();
	}

}
