package ex09_JPassword;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("JPassword");
		formulario.setSize(400, 80);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		// JLabel
		JLabel rotulo = new JLabel("Informe sua senha");
		rotulo.setBounds(10, 10, 120, 20);
		
		// JTextField
		JPasswordField senha = new JPasswordField();
		senha.setBounds(130, 10, 240, 20);
		
		// Adicionar ao formulário os componentes
		formulario.add(rotulo);
		formulario.add(senha);
		
		//Exibir elementos
		formulario.setVisible(true);

	}

}
