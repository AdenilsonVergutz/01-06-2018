


/*Crie um algoritmo de perguntas e respostas. Dever� ser pedido o nome e realizada dez perguntas
contendo SIM ou N�O. Ap�s informadas as dez respostas exibir quantos acertos e erros foram feitos.
Exiba a pergunta e a resposta correta daquelas que foram erradas.
Ap�s informado a quantidade de erros e acertos pergunte se mais algu�m queira jogar.
Poder� participar at� dez jogadores, o jogo finaliza ap�s dez pessoas jogarem ou n�o quiser mais jogar.
Assim que finalizar o jogo exiba um ranking com o nome do jogador e a quantidade de acertos. Ordene
esse ranking pela quantidade de acertos.*/
	
		
		package Lista03Arrays;

		import javax.swing.JOptionPane;

		public class Ex06 {

			public static void main(String[] args) {
				
						
				//Vetores
				int[] pontuacao = new int[10];
				int[] respostas = new int[10];
				String[] perguntas = new String[10];
				int[] respostaC = new int[10];
				String[] nomes=new String[10];
				int[] respostaE= new int[10];
				String[] perguntasE = new String[10];
				
				
				//Vari�veis
				int cont=0, sair=0,contaNomes=0, maiorAcertos=0;
				String nomeZika="";
				String respostaCorreta="";
				
				//Atribui��es
				perguntas[0]="Capital de SC � Florian�polis?.";
				respostaC[0]=0;
				perguntas[1]="O criador do Java se chama James Gosling? ";
				respostaC[1]=0;
				perguntas[2]="Atual propriet�rio  do Java � Bil Gates?";
				respostaC[2]=1;
				perguntas[3]="Atual empresa dona do Java, � a Oracle?";
				respostaC[3]=0;
				perguntas[4]="asas1";
				respostaC[4]=1;
				perguntas[5]="sasa1";
				respostaC[5]=1;
				perguntas[6]="sasa0";
				respostaC[6]=0;
				perguntas[7]="sasa0";
				respostaC[7]=0;
				perguntas[8]="sasa1";
				respostaC[8]=1;
				perguntas[9]="asas0";
				respostaC[9]=0;
				JOptionPane.showMessageDialog(null, "									BEM-VINDO\n\n\nNORMAS\n\nAs normas s�o simples, clica em sim ou n�o\n\n\n");
				do{
					do{
						nomes[contaNomes]=JOptionPane.showInputDialog("Digite seu nome");
					}while(nomes[contaNomes].equals(""));
					do{
						do{				
							respostas[cont]=JOptionPane.showConfirmDialog(null, perguntas[cont],"Peruntas",0);
						}while(respostas[cont]==-1);
					
					if(respostas[cont]==respostaC[cont]){
						pontuacao[contaNomes]++;
					}else{
						perguntasE[cont]=perguntas[cont];
						respostaE[cont]=respostaC[cont];
					}
					
						cont++;
					}while(cont<10);
					
					//Exibir as quest�es que errou e as respostas corretas
					for(int i1=0; i1<10;i1++){
						if(respostaE[i1]==0){
							respostaCorreta="sim";
						}else{
							respostaCorreta="n�o";
						}
						if(perguntasE[i1]!=null){
							JOptionPane.showMessageDialog(null, "Voc� Errou a Quest�o:\n"+perguntasE[i1]+"\nA respostas correta era "+respostaCorreta );
						}
					}
					
					sair=JOptionPane.showConfirmDialog(null, "Outra Pessoa deseja Jogar ?","Reload",0);
					for(int i1=0; i1<10;i1++){
						perguntasE[i1]=null;
					}
					//Resetar Programa
					cont=0;
					contaNomes++;
					if(contaNomes==9){
						sair=0;
					}
				}while(sair==0);
				
				for(int i1 = 0; i1 < 9; i1++){
					for(int i2 = i1+1; i2 < 10; i2++){
						if(pontuacao[i1]<pontuacao[i2]){
							maiorAcertos = pontuacao[i1];
							nomeZika = nomes[i1];
							pontuacao[i1]  = pontuacao[i2];
							nomes[i1] = nomes[i2];
							pontuacao[i2] = maiorAcertos;
							nomes[i2] = nomeZika;
						}
					}
				}
				JOptionPane.showMessageDialog(null, "A Maior quantidade de acertos foi: "+maiorAcertos+"\n e foi feita por: "+nomeZika);

				
			}

		}



