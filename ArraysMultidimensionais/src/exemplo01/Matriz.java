package exemplo01;

import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {

		
		//Criando array multidimensional num. linhas / num colunas
		String[][] dados = new String[3][3];
		
		//Obter dados
		for(int indice = 0; indice < 3; indice++) {
			
			dados[indice][0] = JOptionPane.showInputDialog("Informe o "+(indice+1)+"º nome");
			dados[indice][1] = JOptionPane.showInputDialog("Informe a "+(indice+1)+"ª idade");
			dados[indice][2] = JOptionPane.showInputDialog("Informe a "+(indice+1)+"º cidade");
		
		}

		//Exibir dados
		String exibir = "****EXIBIR DADOS****\n";
		for(int indice = 0; indice < 3; indice++) {
			exibir+= (indice+1)+"º nome é: "+dados[indice][0];
			exibir+= "\nIdade: "+dados[indice][1];
			exibir+= "\nCidade: "+dados[indice][2];
			exibir+= "\n\n";
			
		}
		
		
		
		JOptionPane.showMessageDialog(null, exibir);
	}

}
