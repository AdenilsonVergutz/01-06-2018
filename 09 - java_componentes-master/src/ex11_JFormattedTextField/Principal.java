package ex11_JFormattedTextField;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("JFormattedTextField");
		formulario.setSize(280, 80);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		// JLabel
		JLabel rotulo = new JLabel("CPF");
		rotulo.setBounds(10, 10, 50, 20);
		
		//Elaboração da máscara (O Try/Catch é obrigatório para o funcionamento da máscara)
		MaskFormatter mascaraCpf = null;
		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Falha na máscara.");
		}

		// JFormattedTextField
		JFormattedTextField campoFormatado = new JFormattedTextField(mascaraCpf);
		campoFormatado.setBounds(50, 10, 200, 20);
		
		// Adicionar elementos no JFrame
		formulario.add(rotulo);
		formulario.add(campoFormatado);
		
		// Exibir formulário
		formulario.setVisible(true);
		
	}

}

/*
"#" indica que qualquer número poderá ser inserido (0-9);
"U" indica que qualquer letra (a-z) poderá ser inserida. A máscara converterá letras minúsculas em maiúsculas;
"L" indica qualquer letra (a-z) poderá ser inserida. A máscara converterá letras maiúsculas em minúsculas;
"?" indica qualquer letra (a-z) poderá ser inserida. A máscara manterá a letra inserida;
"A" indica qualquer letra ou numero (0-9 e a-z) poderá ser inserido;
"H" indica qualquer caracter hexadecimal (0-9 a-f) poderá ser inserido;
"*" indica qualquer coisa, incluindo caracteres especiais poderão ser inseridos. 
Fontes: https://www.devmedia.com.br/java-swing-conheca-os-componentes-jtextfield-e-jformattedtextfield/30981
        https://docs.oracle.com/javase/tutorial/uiswing/components/formattedtextfield.html
*/