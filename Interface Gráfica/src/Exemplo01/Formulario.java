package Exemplo01;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario {

	// Construtor
	public Formulario() {

		// JFrame
		JFrame frm = new JFrame("Exercício 01");
		frm.setVisible(true);
		frm.setSize(500, 300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLocationRelativeTo(null);
		frm.setLayout(null);
		
		//JLabel
		JLabel lblNomeProduto = new JLabel("Informe o produto");
		lblNomeProduto.setBounds(20, 20, 150, 20);
		
		JLabel lblPagamentoProduto = new JLabel("Informe a forma de pagamento");
		lblPagamentoProduto.setBounds(20, 60, 180, 20);
		
		JLabel lblValorProduto = new JLabel("Informe o valor produto");
		lblValorProduto.setBounds(20, 100, 150, 20);
		
		
		//JTextField
		JTextField txtNomeProduto = new JTextField();
		txtNomeProduto.setBounds(130, 20, 200, 20);
		
		JTextField txtValorProduto = new JTextField();
		txtValorProduto.setBounds(180, 100, 150, 20);
		
		//Adicionar componentes ao JFrame
		frm.add(lblNomeProduto);
		frm.add(lblPagamentoProduto);
		frm.add(lblValorProduto);
		
		frm.add(txtNomeProduto);
		frm.add(txtValorProduto);
		
		//Exibir o formulário e seus componentes
		frm.setVisible(true);

	}

}
