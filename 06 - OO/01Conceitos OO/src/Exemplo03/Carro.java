package Exemplo03;

import javax.swing.JOptionPane;

public class Carro {

	//Atributos
	String[] nomeCarro = new String[5];
	double[] valorCarro = new double[5];
	
	//M�todo para retornar a posi��o livre do vetor
	public int posicaoLivre() {
		
		//Vari�vel
		int posicao = 0;
		
		//La�o
		for(int i=0; i<nomeCarro.length; i++) {
			
			//Condicional
			if(nomeCarro[i] == null) {
				posicao = i;
				break;
			}
		}
		
		return posicao;
	}
	
	//Realizar perguntas
	public void perguntas() {
		
		//Obter a posi��o
		int posicao = posicaoLivre();
		
		nomeCarro[posicao] = JOptionPane.showInputDialog("informe o carro");
		valorCarro[posicao] = Double.parseDouble(JOptionPane.showInputDialog("informe o valor do carro"));
		
	}
	
	//La�o
	public void laco() {
		
		//Vari�vel
		int continuar = 0;
		
		//La�o
		do {
			
			perguntas();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
			
		}while(continuar == 0);
		
		//Ordenar e exibir os ve�culos
		ordenar();
		exibir();
	}
	
	//M�todo de ordena��o
	public void ordenar() {
		
		//Vari�veis
		String nomeMaiorCarro;
		double valorMaiorCarro;
		
		//La�o principal
		for(int i1 = 0; i1 < nomeCarro.length -1; i1++) {
			
			//La�o Secund�rio
			for(int i2 = i1+1; i2 < nomeCarro.length; i2++) {
				
				//Condicional
				if(valorCarro[i2] > valorCarro[i1]) {
					nomeMaiorCarro = nomeCarro[i1];
					nomeCarro[i1] = nomeCarro[i2];
					nomeCarro[i2] = nomeMaiorCarro;
					
					valorMaiorCarro = valorCarro[i1];
					valorCarro[i1] = valorCarro[i2];
					valorCarro[i2] = valorMaiorCarro;
				}
			}
		}
		
	}
	
	//M�todo para exibir os carros e seus valores ordenados
	public void exibir() {
		
		//Vari�vel contendo o texto que ser� exibido
		String msg = "*****CARROS CADASTRADO*****";
		
		//La�o
		for(int i=0; i<nomeCarro.length; i++) {
			
			if(nomeCarro[i] != null) {
				msg += "\n"+nomeCarro[i]+" "+valorCarro[i];
			}
		}
		
		//Exibir msg
		JOptionPane.showMessageDialog(null, msg);
	}
}
