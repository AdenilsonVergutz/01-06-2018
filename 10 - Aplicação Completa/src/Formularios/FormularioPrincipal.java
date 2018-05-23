package Formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


import Controladores.Acao;

	//Construtor
public class FormularioPrincipal {

	// OBjeto ação
	Acao a = new Acao();
	

	JFrame formulario = new JFrame();
	JLabel label1 = new JLabel();
	JTextField campo1 = new JTextField();
	JLabel label2 = new JLabel();
	JTextField campo2 = new JTextField();
	JLabel label3 = new JLabel();
	JTextField campo3 = new JTextField();
	JButton botaoCadastro = new JButton();
	JTable tabela = new JTable(a.exibirDados());
	JScrollPane barraRolagem = new JScrollPane(tabela);
	

	public void inicializaFormularioPrincipal() {

		// Formulário Principal
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(600, 400);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Estoque Mercado do Ralf");
		formulario.setLayout(null);

		// Label do produto
		label1.setText("Produto");
		label1.setBounds(10, 20, 150, 20);

		// Campo do produto
		campo1.setBounds(120, 20, 450, 20);

		// Label do valor
		label2.setText("Valor");
		label2.setBounds(10, 40, 110, 20);

		// Campo do valor
		campo2.setBounds(120, 40, 450, 20);

		// Label da quantidade
		label3.setText("Quantidade");
		label3.setBounds(10, 60, 150, 20);

		// Campo da quantidade
		campo3.setBounds(120, 60, 450, 20);

		// Botão de cadastro
		botaoCadastro.setText("Cadastrar");
		botaoCadastro.setBounds(400, 90, 150, 20);

		// Barra de rolagem do Jtable
		barraRolagem.setBounds(60, 130, 460, 200);

		// Ação do botão cadastrar
		botaoCadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String produto = campo1.getText();
				double valor = Double.parseDouble(campo2.getText());
				int quantidade = Integer.parseInt(campo3.getText());

				if ((a.verificaProduto(campo1) == true) && (a.verificaValor(campo2) == true)
						&& (a.verificaQuantidade(campo3) == true)) {
					a.salvaDados(produto, valor, quantidade);
					JOptionPane.showMessageDialog(null, "Produto Salvo com Sucesso!");

				} else {
					JOptionPane.showMessageDialog(null, "Algum dado do produto inserido é inválido");
				}
				
				//Atualizar tabela
				tabela.setModel(a.exibirDados());
				
				barraRolagem.setViewportView(tabela);

				// Limpar campos
				campo1.setText("");
				campo2.setText("");
				campo3.setText("");

				// Cursor no campo nome
				campo1.requestFocus();

			}
		});
		
		//Ação do JTable
		tabela.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				//Obter a linha
				int linha = tabela.getSelectedRow();
				
				//Obter os dados
				String nomeProduto = tabela.getValueAt(linha, 0).toString();
				double valorProduto = Double.parseDouble(tabela.getValueAt(linha, 1).toString());
				int quantidadeProduto = Integer.parseInt(tabela.getValueAt(linha, 2).toString());
				
				// Criar o novo formulário
				FormularioAlteração fa = new FormularioAlteração(nomeProduto, valorProduto, quantidadeProduto ,linha);
				
				// Fechar o FormulárioPrincipal
				formulario.dispose();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		// JFrame
		formulario.add(label1);
		formulario.add(campo1);
		formulario.add(label2);
		formulario.add(campo2);
		formulario.add(label3);
		formulario.add(campo3);
		formulario.add(botaoCadastro);
		formulario.add(barraRolagem);

		// Deixando o formulário visível
		formulario.setVisible(true);
	}

}
