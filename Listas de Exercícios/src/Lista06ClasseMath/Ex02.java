/*Desenvolva um sistema onde irá gerar um número entre 0 e 100. O usuário deverá tentar
acertar esse número, enquanto não acetar o número gerado deverá ser perguntado um
número para realizar o comparativo.
Sempre que o palpite dado pelo usuário for diferente do número gerado deverá ser dado
os seguintes auxílios:
a) Se a diferença entre o número pensado e o chute for de até 10, o computador diz
que está perto.
b) Se a diferença entre o número pensado e o chute for maior que 10 e até 20, o
computador diz que está longe.
c) Se a diferença entre o número pensado e o chute for maior que 20, o computador
diz: "Ihhhhh! Muito longe".
Após acertar o número o computador deve informar o número de palpites que foi
necessário e imprimir as mensagens abaixo de acordo com o número de tentativas.
a) Caso acerte de primeira: "Nossa! Acertou na mosca"
b) Até 5 palpites - "Parabéns! Você é bom de adivinhação"
c) Até 10 - "Muito bom. Continue assim"
d) Até 20 - "Mm... Podia ser melhor. Continue tentando"
e) e) Acima de 20 - "Meio lerdo você, hein?"*/



package Lista06ClasseMath;

import javax.swing.JOptionPane;

public class Ex02 {

public static void main(String[] args) {
		
		//Variáveis
		int chuteNumero = -1, tentativas = 0, numero = (int) Math.round(Math.random() * 100);
		
		//Laço principal
		while (chuteNumero != numero) {
			
			chuteNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número de 0 a 100"));
			
			
			//Calculando diferença
			int diferencaNum = numero > chuteNumero ? numero - chuteNumero : chuteNumero - numero;
			
			//Verificando
			if (diferencaNum <= 10) {
				JOptionPane.showMessageDialog(null, "Está perto");
			} else if (diferencaNum <= 20) {
				JOptionPane.showMessageDialog(null, "Está longe");
			} else {
				JOptionPane.showMessageDialog(null, "Ihhhhh! Muito longe");
			}
			
			//contador de tentativas
			tentativas++;
		}
		
		//Verificando quantas tentativas foram usadas
		if (tentativas == 1) {
			JOptionPane.showMessageDialog(null, "Parabéns! Acertou na mosca");
		} else if (tentativas <= 5) {
			JOptionPane.showMessageDialog(null, "Parabéns! Você é bom de adivinhação");
		} else if (tentativas <= 10) {
			JOptionPane.showMessageDialog(null, "Muito bom. Continue assim");
		} else if (tentativas <= 20) {
			JOptionPane.showMessageDialog(null, "Mm... Podia ser melhor. Continue tentando");
		} else {
			JOptionPane.showMessageDialog(null, "Meio lerdo você, hein?");
		}
	}
}


