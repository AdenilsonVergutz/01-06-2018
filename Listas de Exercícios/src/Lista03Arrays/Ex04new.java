package Lista03Arrays;

import javax.swing.JOptionPane;

public class Ex04new {

	public static void main(String[] args) {

			
			//Variáveis
			String[] gabarito = new String[10];
			String[] nomes = new String[30];
			int[] acertos = new int[30];
			String questao;
			boolean valida;
			int indiceAluno = 0;
			int continuar = 0;
			int maiorAcerto;
			String maiorNomeAcerto;
			
			//Laço para obter o gabarito
			for(int indice = 0; indice < 10; indice++){
				
				//Realizar perguntas
				valida = false;
				do{
					questao = JOptionPane.showInputDialog("Informe a "+(indice+1)+"ª questão.");
					
					if((questao.equals("a")) || (questao.equals("c")) || (questao.equals("b")) || (questao.equals("d"))){
						gabarito[indice] = questao;
						valida = true;
					}else{
						JOptionPane.showMessageDialog(null, "Resposta inválida!");
					}
					
				}while(valida == false);
				
			}
			
			
			//Obter provas dos alunos
			do{
				
				//Obter o nome
				nomes[indiceAluno] = JOptionPane.showInputDialog("Informe o "+(indiceAluno+1)+"º aluno.");
				
				//Obter as questões do aluno
				for(int indice = 0; indice < 10; indice++){
					questao = JOptionPane.showInputDialog("Informe a "+(indice+1)+"ª questão.");
					
					//Validar
					if(questao.equals(gabarito[indice])){
						acertos[indiceAluno]++;
					}
					
				}
				
				//Exibir quantidade de acertos
				JOptionPane.showMessageDialog(null, nomes[indiceAluno]+" obteve "+acertos[indiceAluno]+" acertos.");
				
				//Incrementar o índice do aluno
				indiceAluno++;
				
				//Verificar se deseja continuar
				if(indiceAluno != 30){
				
					//Verificar se deseja cadastrar mais um aluno
					continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
				}else{
					continuar = 1;
				}
				
			}while(continuar != 1);
			
			
			//Método bolha
			for(int i1 = 0; i1 < 29; i1++){
				
				for(int i2 = i1+1; i2 < 30; i2++){
					
					if(acertos[i2] > acertos[i1]){
						maiorAcerto = acertos[i1];
						acertos[i1] = acertos[i2];
						acertos[i2] = maiorAcerto;
						
						maiorNomeAcerto = nomes[i1];
						nomes[i1] = nomes[i2];
						nomes[i2] = maiorNomeAcerto;
					}
					
				}
				
			}
			
			//Exibir os resultados
			String texto = "Resultado da prova:\n\n";
			int ranking = 1;
			for(int indice = 0; indice < 30; indice++){
				
				if(nomes[indice] != null){
				texto += ranking+"º é "+nomes[indice]+" com nota "+acertos[indice]+"\n";
				ranking++;
				}
				
			}
			
			//Exibir resultado
			
			JOptionPane.showMessageDialog(null, texto);
			
			
	





	}

}
