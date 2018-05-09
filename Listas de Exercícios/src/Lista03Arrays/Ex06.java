


/*Crie um algoritmo de perguntas e respostas. Deverá ser pedido o nome e realizada dez perguntas
contendo SIM ou NÃO. Após informadas as dez respostas exibir quantos acertos e erros foram feitos.
Exiba a pergunta e a resposta correta daquelas que foram erradas.
Após informado a quantidade de erros e acertos pergunte se mais alguém queira jogar.
Poderá participar até dez jogadores, o jogo finaliza após dez pessoas jogarem ou não quiser mais jogar.
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
				
				
				//Variáveis
				int cont=0, sair=0,contaNomes=0, maiorAcertos=0;
				String nomeZika="";
				String respostaCorreta="";
				
				//Atribuições
				perguntas[0]="Capital de SC é Florianópolis?.";
				respostaC[0]=0;
				perguntas[1]="O criador do Java se chama James Gosling? ";
				respostaC[1]=0;
				perguntas[2]="Atual proprietário  do Java é Bil Gates?";
				respostaC[2]=1;
				perguntas[3]="Atual empresa dona do Java, é a Oracle?";
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
				JOptionPane.showMessageDialog(null, "									BEM-VINDO\n\n\nNORMAS\n\nAs normas são simples, clica em sim ou não\n\n\n");
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
					
					//Exibir as questões que errou e as respostas corretas
					for(int i1=0; i1<10;i1++){
						if(respostaE[i1]==0){
							respostaCorreta="sim";
						}else{
							respostaCorreta="não";
						}
						if(perguntasE[i1]!=null){
							JOptionPane.showMessageDialog(null, "Você Errou a Questão:\n"+perguntasE[i1]+"\nA respostas correta era "+respostaCorreta );
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



