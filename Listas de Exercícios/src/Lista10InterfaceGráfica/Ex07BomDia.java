/*. Elabore um algoritmo que leia a hora e dê as seguintes mensagens nos seguintes horários:
Mensagens
0 as 6 – Boa Madrugada
7 as 11 – Bom Dia
12 as 18 – Boa Tarde
19 as 23 – Boa noite
OBS: somente números inteiros.*/


package Lista10InterfaceGráfica;



	import java.awt.Color;
	import java.awt.Font;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.GregorianCalendar;

	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.SwingConstants;

	public class Ex07BomDia {

		public Ex07BomDia() {
			
			JFrame frame = newFrame();
			
			JLabel lbl = newLabel();
			
			frame.add(lbl);
			
			frame.setVisible(true);
		}
		
		public JFrame newFrame() {
			
			JFrame frame = new JFrame();
			frame.setSize(350, 150);
			frame.setLayout(null);
			frame.setLocationRelativeTo(null);
			frame.setResizable(false);
			
			return frame;
		}
		
		public JLabel newLabel() {
			
			JLabel lbl = new JLabel();
			lbl.setBounds(0, 0, 350, 115);
			lbl.setHorizontalAlignment(SwingConstants.CENTER);
			lbl.setVerticalAlignment(SwingConstants.CENTER);
			lbl.setFont(new Font("Arial", Font.PLAIN, 50));
			lbl.setText(getSaudacao());
			
			return lbl;
		}
		
		public String getSaudacao() {
			
			int hora = getHora();
			String saudacao = "";
			
			if (hora < 12) {
				saudacao = "Bom Dia!";
			} else if (hora < 18) {
				saudacao = "Boa Tarde!";
			} else {
				saudacao = "Boa Noite!";
			}
			
			return saudacao;
		}
		
		public int getHora() {
			
			Date data = new Date();
			Calendar calendario = new GregorianCalendar();
			calendario.setTime(data);
			
			return calendario.get(Calendar.HOUR_OF_DAY);
		}
		
	}

