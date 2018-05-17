package Exemplo02;

import javax.swing.JOptionPane;

public class Aluno {

	// Atributos
	String nome;
	double nota1, nota2, nota3;
	int aprovados = 0, reprovados = 0;

	// Métodos para realizar as perguntas
	public void perguntas() {
		
		nome = JOptionPane.showInputDialog("Informe o nome do aluno");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("1ª nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("2ª nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("3ª nota"));

	}

	// Método de repetição
	public void laco() {

		// Variável
		int continuar = 0;

		// Laço
		do {
			perguntas();
			exibirSituacao();
			contarAprovadosReprovados();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
		} while (continuar == 0);
		
		//Exibir aprovados e reprovados
		exibirAprovadosReprovados();
	}

	// Método para retornar o cálculo de média
	public double calculodeMedia() {

		double media = (nota1+nota2+nota3)/3;

		return media;
		
	}
	
	//Método para retornar a situação do aluno
	public String situacaoAluno() {
		
		String situacao = calculodeMedia() >= 7 ? "Aprovado" : "Reprovado";
		
		return situacao;
				
	}
	
	//Exibir média e situação
	public void exibirSituacao() {
		
		//Messagem
		String  msg = "****Informações do aluno****";
				msg += "\nSua média é: "+String.format("%.2f", calculodeMedia());
				msg += "\nSua situação é: "+situacaoAluno();
				
		//Exibir mensagem
				JOptionPane.showMessageDialog(null, msg);
	}
	
	//Contar aprovados e reprovados
	public void contarAprovadosReprovados() {
		
		if(calculodeMedia() >= 7) {
			aprovados++;
		}else {
			reprovados++;
		}
	}
	
	//Exibir a quantidade de aprovados e reprovados
	public void exibirAprovadosReprovados() {
		
		String msg = "Aprovados X Reprovados";
			   msg += "\nAlunos aprovados: "+aprovados;
			   msg += "\nAlunos reprovados: "+reprovados;
			   
	JOptionPane.showMessageDialog(null, msg);
	}
}
