/*Faça um algoritmo onde o usuário deverá digitar dois números, caso os dois números sejam iguais deverá
ser realizada a soma, caso contrário deverá ser realizado a multiplicação. Não se esqueça de exibir o
resultado após obtido os dois números
*/


package Lista10InterfaceGráfica;

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
				JLabel lblnumero = new JLabel("Informe um número inteiro:");
				lblnumero.setBounds(20, 20, 180, 20);
				lblnumero.setForeground(Color.BLACK);
				lblnumero.setBackground(Color.BLUE);
						
				JLabel lblsegundoNumero = new JLabel("Informe outro número inteiro:");
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
				
				//Adicionar ação ao btn
				btn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						//Obter os dados informados pelo usuário
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
						
				//Exibir o formulário e seus componentes
				frm.setVisible(true);
			}

		}



