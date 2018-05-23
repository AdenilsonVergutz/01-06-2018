package ex13_JTable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Principal {

	public static void main(String[] args) {
		
		// JFrame
		JFrame formulario = new JFrame("JScrollPane");
		formulario.setSize(300, 170);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		// DefaultTableModel - Serve para agrupar os dados
		DefaultTableModel exibirDados = new DefaultTableModel();
		
		//Criar colunas
		exibirDados.addColumn("Código");
		exibirDados.addColumn("Nome");
		exibirDados.addColumn("Idade");
		
		// Linhas do DefaultTableModel
		exibirDados.addRow(new Object[]{1, "Ralf", 28});
		exibirDados.addRow(new Object[]{2, "Gabriela", 23});
		exibirDados.addRow(new Object[]{3, "Fernanda", 32});
		exibirDados.addRow(new Object[]{4, "Carla", 30});
		exibirDados.addRow(new Object[]{5, "Júlia", 16});
		exibirDados.addRow(new Object[]{6, "Rubens", 27});
		
		// JTable - Serve para exibir o DefaultTableModel
		JTable tabela = new JTable(exibirDados);
		
		// JScrollPane - Barra de rolagem englobando o JTable
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(10, 10, 260, 100);
		
		// Adicionar elementos ao formulário
		formulario.add(barraRolagem);
		
		// Exibir formulário
		formulario.setVisible(true);
		

	}

}


