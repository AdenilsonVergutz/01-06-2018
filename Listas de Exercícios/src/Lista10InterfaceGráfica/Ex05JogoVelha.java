package Lista10InterfaceGráfica;



	import java.awt.Color;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

	public class Ex05JogoVelha {

		public Ex05JogoVelha() {

			// JFrame
			JFrame frm = new JFrame("JOGO DA VELHA");

			frm.setSize(300, 220);
			frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frm.setLocationRelativeTo(null);
			frm.setLayout(null);
			frm.getContentPane().setBackground(Color.DARK_GRAY);

			// JLabel
			JLabel lblTitulo = new JLabel("Quem será que vai ganhar?");
			lblTitulo.setBounds(65, 20, 220, 20);
			lblTitulo.setForeground(Color.WHITE);

			// JComboBox
			JComboBox<String> combo = new JComboBox<>();
			combo.setBounds(225, 150, 40, 20);
			combo.addItem("X");
			combo.addItem("O");

			// JButton
			JButton btn1 = new JButton(" ");
			btn1.setBounds(70, 60, 43, 20);

			// JButton
			JButton btn2 = new JButton(" ");
			btn2.setBounds(120, 60, 43, 20);

			// JButton
			JButton btn3 = new JButton(" ");
			btn3.setBounds(170, 60, 43, 20);

			// JButton
			JButton btn4 = new JButton(" ");
			btn4.setBounds(70, 90, 43, 20);

			// JButton
			JButton btn5 = new JButton(" ");
			btn5.setBounds(120, 90, 43, 20);

			// JButton
			JButton btn6 = new JButton(" ");
			btn6.setBounds(170, 90, 43, 20);

			// JButton
			JButton btn7 = new JButton(" ");
			btn7.setBounds(70, 120, 43, 20);

			// JButton
			JButton btn8 = new JButton(" ");
			btn8.setBounds(120, 120, 43, 20);

			// JButton
			JButton btn9 = new JButton(" ");
			btn9.setBounds(170, 120, 43, 20);

			// Adicionando ações ao botão 01
			btn1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					// Obter o dia que o usuário selecionou
					String jogada = combo.getSelectedItem().toString();

					// Verificando a jogada do usuário
					if (jogada.equals("X")) {
						btn1.setText("X");
					} else if (jogada.equals("O")) {
						btn1.setText("O");
					}

				}
			});

			// Adicionando ações ao botão 02
			btn2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					// Obter o dia que o usuário selecionou
					String jogada = combo.getSelectedItem().toString();

					// Verificando a jogada do usuário
					if (jogada.equals("X")) {
						btn2.setText("X");
					} else if (jogada.equals("O")) {
						btn2.setText("O");
					}

				}
			});

			// Adicionando ações ao botão 01
			btn3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					// Obter o dia que o usuário selecionou
					String jogada = combo.getSelectedItem().toString();

					// Verificando a jogada do usuário
					if (jogada.equals("X")) {
						btn3.setText("X");
					} else if (jogada.equals("O")) {
						btn3.setText("O");
					}

				}
			});

			// Adicionando ações ao botão 01
			btn4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					// Obter o dia que o usuário selecionou
					String jogada = combo.getSelectedItem().toString();

					// Verificando a jogada do usuário
					if (jogada.equals("X")) {
						btn4.setText("X");
					} else if (jogada.equals("O")) {
						btn4.setText("O");
					}

				}
			});

			// Adicionando ações ao botão 01
			btn5.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					// Obter o dia que o usuário selecionou
					String jogada = combo.getSelectedItem().toString();

					// Verificando a jogada do usuário
					if (jogada.equals("X")) {
						btn5.setText("X");
					} else if (jogada.equals("O")) {
						btn5.setText("O");
					}

				}
			});

			// Adicionando ações ao botão 01
			btn6.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					// Obter o dia que o usuário selecionou
					String jogada = combo.getSelectedItem().toString();

					// Verificando a jogada do usuário
					if (jogada.equals("X")) {
						btn6.setText("X");
					} else if (jogada.equals("O")) {
						btn6.setText("O");
					}

				}
			});

			// Adicionando ações ao botão 01
			btn7.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					// Obter o dia que o usuário selecionou
					String jogada = combo.getSelectedItem().toString();

					// Verificando a jogada do usuário
					if (jogada.equals("X")) {
						btn7.setText("X");
					} else if (jogada.equals("O")) {
						btn7.setText("O");
					}

				}
			});

			// Adicionando ações ao botão 01
			btn8.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					// Obter o dia que o usuário selecionou
					String jogada = combo.getSelectedItem().toString();

					// Verificando a jogada do usuário
					if (jogada.equals("X")) {
						btn8.setText("X");
					} else if (jogada.equals("O")) {
						btn8.setText("O");
					}

				}
			});

			// Adicionando ações ao botão 01
			btn9.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					// Obter o dia que o usuário selecionou
					String jogada = combo.getSelectedItem().toString();

					// Verificando a jogada do usuário
					if (jogada.equals("X")) {
						btn9.setText("X");
					} else if (jogada.equals("O")) {
						btn9.setText("O");
					}

				}
			});

			//Verificando as jogadas para o ganhador
			String ganhador;
			
			if (btn1.equals(btn2) && btn2.equals(btn3)) {
				ganhador = "O Jogo acabou!";
			}
			
			if (btn4.equals(btn5) && btn5.equals(btn6)) {
				ganhador = "O Jogo acabou!";
			}
			
			if (btn7.equals(btn8) && btn8.equals(btn9)) {
				ganhador = "O Jogo acabou!";
			}
			
			if (btn1.equals(btn4) && btn4.equals(btn7)) {
				ganhador = "O Jogo acabou!";
			}
			
			if (btn2.equals(btn5) && btn5.equals(btn8)) {
				ganhador = "O Jogo acabou!";
			}
			
			if (btn3.equals(btn6) && btn6.equals(btn9)) {
				ganhador = "O Jogo acabou!";
			}
			
			if (btn1.equals(btn5) && btn5.equals(btn9)) {
				ganhador = "O Jogo acabou!";
			}
			
			if (btn3.equals(btn5) && btn5.equals(btn7)) {
				ganhador = "O Jogo acabou!";
			}
			
			// Exibindo a minha janela do jogo
			frm.setVisible(true);

			// Adicionado componentes ao JFrame
			frm.add(lblTitulo);
			frm.add(btn1);
			frm.add(btn2);
			frm.add(btn3);
			frm.add(btn4);
			frm.add(btn5);
			frm.add(btn6);
			frm.add(btn7);
			frm.add(btn8);
			frm.add(btn9);
			frm.add(combo);

		}

	}
