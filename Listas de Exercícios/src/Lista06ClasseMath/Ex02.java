/*Desenvolva um sistema onde ir� gerar um n�mero entre 0 e 100. O usu�rio dever� tentar
acertar esse n�mero, enquanto n�o acetar o n�mero gerado dever� ser perguntado um
n�mero para realizar o comparativo.
Sempre que o palpite dado pelo usu�rio for diferente do n�mero gerado dever� ser dado
os seguintes aux�lios:
a) Se a diferen�a entre o n�mero pensado e o chute for de at� 10, o computador diz
que est� perto.
b) Se a diferen�a entre o n�mero pensado e o chute for maior que 10 e at� 20, o
computador diz que est� longe.
c) Se a diferen�a entre o n�mero pensado e o chute for maior que 20, o computador
diz: "Ihhhhh! Muito longe".
Ap�s acertar o n�mero o computador deve informar o n�mero de palpites que foi
necess�rio e imprimir as mensagens abaixo de acordo com o n�mero de tentativas.
a) Caso acerte de primeira: "Nossa! Acertou na mosca"
b) At� 5 palpites - "Parab�ns! Voc� � bom de adivinha��o"
c) At� 10 - "Muito bom. Continue assim"
d) At� 20 - "Mm... Podia ser melhor. Continue tentando"
e) e) Acima de 20 - "Meio lerdo voc�, hein?"*/



package Lista06ClasseMath;

import javax.swing.JOptionPane;

public class Ex02 {

public static void main(String[] args) {
		
		//Vari�veis
		int chuteNumero = -1, tentativas = 0, numero = (int) Math.round(Math.random() * 100);
		
		//La�o principal
		while (chuteNumero != numero) {
			
			chuteNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero de 0 a 100"));
			
			
			//Calculando diferen�a
			int diferencaNum = numero > chuteNumero ? numero - chuteNumero : chuteNumero - numero;
			
			//Verificando
			if (diferencaNum <= 10) {
				JOptionPane.showMessageDialog(null, "Est� perto");
			} else if (diferencaNum <= 20) {
				JOptionPane.showMessageDialog(null, "Est� longe");
			} else {
				JOptionPane.showMessageDialog(null, "Ihhhhh! Muito longe");
			}
			
			//contador de tentativas
			tentativas++;
		}
		
		//Verificando quantas tentativas foram usadas
		if (tentativas == 1) {
			JOptionPane.showMessageDialog(null, "Parab�ns! Acertou na mosca");
		} else if (tentativas <= 5) {
			JOptionPane.showMessageDialog(null, "Parab�ns! Voc� � bom de adivinha��o");
		} else if (tentativas <= 10) {
			JOptionPane.showMessageDialog(null, "Muito bom. Continue assim");
		} else if (tentativas <= 20) {
			JOptionPane.showMessageDialog(null, "Mm... Podia ser melhor. Continue tentando");
		} else {
			JOptionPane.showMessageDialog(null, "Meio lerdo voc�, hein?");
		}
	}
}


