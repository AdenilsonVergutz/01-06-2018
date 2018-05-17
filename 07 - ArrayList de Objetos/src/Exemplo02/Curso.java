package Exemplo02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Curso {

	// Atributos da classe
	private String nome, segmento;
	private int cargaHoraria;
	private double valor;

	// ArrayList
	ArrayList<Curso> dados = new ArrayList<>();

	// Menu
	public void menu() {
		
		//Opções do menu
		String estruturaMenu = "***Menu***\n\n";
				estruturaMenu += "1) Cadastrar curso\n";
				estruturaMenu += "2) Listar\n";
				estruturaMenu += "3) Sair";
				
		//Obter opção selecionada
				int opcao;
				
		//Exibir menu
		do {
					opcao = Integer.parseInt(JOptionPane.showInputDialog(estruturaMenu));
				
					switch (opcao) {
					case 1:
						cadastrarCurso();
						break;
					case 2:
						listarCurso();
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema");
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida");
					}
			
				}while (opcao != 3);
	}

//Cadastrar curso
	private void cadastrarCurso() {
		
		//Instanciar um objeto da classe Curso
		Curso c = new Curso();
		
		//Atribuir valores ao objeto
		c.nome = JOptionPane.showInputDialog("Informe o nome do curso");
		c.segmento = JOptionPane.showInputDialog("Informe o segmento do curso");
		c.cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Carga horária do curso"));
		c.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o nome do curso"));
		
		//Adicionar curso ao ArrayList
		dados.add(c);
		
		//Mensagem
		JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso.");
	}
	
	//Listar curso
	private void listarCurso() {
		
		//Estrutura para listar
		String estrutura = "Cursos cadastrados: \n\n";
				estrutura += "Foram cadastrados "+dados.size()+"  cursos.\n\n";
				
		//Laço
				for(int i=0; i<dados.size(); i++) {
					estrutura += (i+1)+"º curso cadastrado:\n";
					estrutura += dados.get(i).nome+"\n";
					estrutura += dados.get(i).segmento+"\n";
					estrutura += dados.get(i).cargaHoraria+"\n";
					estrutura += dados.get(i).valor+"\n";
					estrutura += "--------------------\n\n";
					
				}
				//Exibir estrutura
				JOptionPane.showMessageDialog(null, estrutura);
	}
}

