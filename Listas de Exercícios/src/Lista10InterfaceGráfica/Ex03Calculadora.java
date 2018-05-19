/*Desenvolva uma calculadora simples, o usuário irá informar dois números e uma operação (soma,
subtração, divisão e multiplicação), após informado esses três dados deverá ser exibido o resultado.*/

package Lista10InterfaceGráfica;



	import java.awt.Color;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;

	

	public class Ex03Calculadora {

		//Construtor
				public Ex03Calculadora() {
					
					//JFrame
					JFrame frm = new JFrame();
							
					frm.setSize(500, 250);
					frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frm.setLocationRelativeTo(null);
					frm.setLayout(null);
					frm.getContentPane().setBackground(Color.orange);
					
					//JLabel
					JLabel lblnumero = new JLabel("Informe um número inteiro:");
					lblnumero.setBounds(20, 20, 180, 20);
					lblnumero.setForeground(Color.blue);
					lblnumero.setBackground(Color.red);
							
					JLabel lblsegundoNumero = new JLabel("Informe outro número inteiro:");
					lblsegundoNumero.setBounds(20, 60, 180, 20);
					lblsegundoNumero.setForeground(Color.blue);
					lblsegundoNumero.setBackground(Color.red);
					
					JLabel lbloperacao = new JLabel("Informe o símbolo da operação matemática:");
					lbloperacao.setBounds(20, 100, 250, 20);
					lbloperacao.setForeground(Color.blue);
					lbloperacao.setBackground(Color.red);
					
					//JTEXTFIELD
					JTextField txtnumero = new JTextField();
					txtnumero.setBounds(180, 20, 180, 20);
					
					JTextField txtsegundoNumero = new JTextField();
					txtsegundoNumero.setBounds(190, 60, 180, 20);
					
					JTextField txtoperacao = new JTextField();
					txtoperacao.setBounds(280, 100, 180, 20);
					
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
							String operacao = txtoperacao.getText();
							
							//Instanciar
							Ex03Acao a = new Ex03Acao(number, number2, operacao);
							
							//Limpar os campos
							txtnumero.setText("");
							txtsegundoNumero.setText("");
							txtoperacao.setText("");
							
							//Selecionar o campo
							txtnumero.requestFocus();
						}
					});
					
					
					//ADD COMPONENTES AO JFRAM
					frm.add(lblnumero);
					frm.add(lblsegundoNumero);
					frm.add(lbloperacao);
					
					frm.add(txtnumero);
					frm.add(txtsegundoNumero);
					frm.add(txtoperacao);
					frm.add(btn);
							
					//Exibir o formulário e seus componentes
					frm.setVisible(true);
				}

			}




