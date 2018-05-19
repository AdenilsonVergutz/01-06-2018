/*Fa�a um algoritmo onde o usu�rio dever� digitar dois n�meros, caso os dois n�meros sejam iguais dever�
ser realizada a soma, caso contr�rio dever� ser realizado a multiplica��o. N�o se esque�a de exibir o
resultado ap�s obtido os dois n�meros
*/


package Lista10InterfaceGr�fica;

	import java.awt.Color;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;



	public class Ex04Soma {
		
		
			
			//Construtor
			public Ex04Soma() {
				
				//JFrame
				JFrame frm = new JFrame();
						
				frm.setSize(500, 300);
				frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frm.setLocationRelativeTo(null);
				frm.setLayout(null);
				frm.getContentPane().setBackground(Color.GRAY);
				
				//JLabel
				JLabel lblnumero = new JLabel("Informe um n�mero inteiro:");
				lblnumero.setBounds(20, 20, 180, 20);
				lblnumero.setForeground(Color.BLACK);
				lblnumero.setBackground(Color.BLUE);
						
				JLabel lblsegundoNumero = new JLabel("Informe outro n�mero inteiro:");
				lblsegundoNumero.setBounds(20, 60, 180, 20);
				lblsegundoNumero.setForeground(Color.BLACK);
				lblsegundoNumero.setBackground(Color.BLUE);
				
				//JTEXTFIELD
				JTextField txtnumero = new JTextField();
				txtnumero.setBounds(180, 20, 180, 20);
				
				JTextField txtsegundoNumero = new JTextField();
				txtsegundoNumero.setBounds(190, 60, 180, 20);
				
				//JButton
				JButton btn = new JButton("Calcular");
				btn.setBounds(160, 150, 150, 30);
				
				//Adicionar a��o ao btn
				btn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						//Obter os dados informados pelo usu�rio
						String number = txtnumero.getText();
						String number2 = txtsegundoNumero.getText();
						
						//Instanciar
						Ex04Acao a = new Ex04Acao(number, number2);
						
						//Limpar os campos
						txtnumero.setText("");
						txtsegundoNumero.setText("");
						
						//Selecionar o campo
						txtnumero.requestFocus();
					}
				});
				
				//ADD COMPONENTES AO JFRAM
				frm.add(lblnumero);
				frm.add(lblsegundoNumero);
				
				frm.add(txtnumero);
				frm.add(txtsegundoNumero);
				frm.add(btn);
						
				//Exibir o formul�rio e seus componentes
				frm.setVisible(true);
			}

		}



