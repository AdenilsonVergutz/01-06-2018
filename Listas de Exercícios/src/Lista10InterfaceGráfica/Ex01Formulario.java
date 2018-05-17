/*Desenvolva um algoritmo onde o usuário informar três dados: Nome de um produto, valor e forma de
pagamento. Vamos supor que os dados foram: Celular, 800, à vista.
Após informados os três dados deverá ser realizada a seguinte verificação: Caso o produto tenha o valor
superior à R$500,00 e a forma de pagamento for à vista deverá ser dado um desconto de 10%, caso
contrário não haverá desconto.
Ao término da captura das informações e do possível desconto deverá ser exibida uma frase como por
exemplo: O produto celular custará R$ 720.*/



package Lista10InterfaceGráfica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex01Formulario {

	// Construtor
	public Ex01Formulario() {

		// JFrame
		JFrame frm = new JFrame("Exercício 01");
		frm.setVisible(true);
		frm.setSize(500, 300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLocationRelativeTo(null);
		frm.setLayout(null);
		frm.getContentPane().setBackground(Color.BLUE);
		
		//JLabel
		JLabel lblNomeProduto = new JLabel("Informe o produto");
		lblNomeProduto.setBounds(20, 20, 150, 20);
		lblNomeProduto.setForeground(Color.red);
		lblNomeProduto.setForeground(Color.GREEN);
		lblNomeProduto.setOpaque(true);
		
		JLabel lblPagamentoProduto = new JLabel("Informe a forma de pagamento");
		lblPagamentoProduto.setBounds(20, 60, 180, 20);
		
		JLabel lblValorProduto = new JLabel("Informe o valor produto");
		lblValorProduto.setBounds(20, 100, 150, 20);
		
		
		//JTextField
		JTextField txtNomeProduto = new JTextField();
		txtNomeProduto.setBounds(130, 20, 200, 20);
		
		JTextField txtValorProduto = new JTextField();
		txtValorProduto.setBounds(180, 100, 150, 20);
		
		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(200, 60, 130, 20);
		combo.addItem("A Vista");
		combo.addItem("A Prazo");
		
		//JButton
		JButton btn = new JButton("Calcular");
		btn.setBounds(120, 150, 130, 20);
		
		//Adicionando ação ao JButton
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				//Obter os dados informados pelo usuário
				String nomeProduto = txtNomeProduto.getText();
				String formaPagamento = combo.getSelectedItem().toString();
				String valorProduto = txtValorProduto.getText();
				
				//Instanciar objetos
				Ex01Acao a = new Ex01Acao(nomeProduto, formaPagamento, valorProduto);
				
				//Limpar os campos
				txtNomeProduto.setText("");
				combo.setSelectedIndex(0);
				txtValorProduto.setText("");
				
				//Selecionar o campo
				txtNomeProduto.requestFocus();
			}
		});
		
		//Adicionar componentes ao JFrame
		frm.add(lblNomeProduto);
		frm.add(lblPagamentoProduto);
		frm.add(lblValorProduto);
		
		frm.add(txtNomeProduto);
		frm.add(txtValorProduto);
		frm.add(btn);
		frm.add(combo);
		
		//Exibir o formulário e seus componentes
		frm.setVisible(true);

	}

}
