package ex10_JTextArea;

import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("JTextArea");
		formulario.setSize(400, 250);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);

		// JTextArea
		JTextArea caixaDeTexto = new JTextArea("Esse componente tem a capacidade de escrever textos grandes. Faça um teste e escreva mais =)");
		caixaDeTexto.setBounds(10, 10, 364, 190);
		caixaDeTexto.setLineWrap(true); //Função para a quebra de linha
		
		// Atribuir componente ao JFrame
		formulario.add(caixaDeTexto);
		
		// Exibir o formulário e os componentes
		formulario.setVisible(true);
		
	}

}
