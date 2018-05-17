package Lista10InterfaceGráfica;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex02Calendario {
	
		
	//Calendario
	public  Ex02Calendario(){
		
		JFrame frm = new JFrame("Calendário");
		frm.setSize(200, 150);		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLocationRelativeTo(null);
		frm.setLayout(null);
		
		
		//Label
		JLabel lblData = new JLabel("Informe o dia: ");
		lblData.setBounds(20, 20, 80, 20);
		
		
		//ComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(110, 20, 40, 20);
		combo.addItem("01");
		combo.addItem("02");
		combo.addItem("03");
		combo.addItem("04");
		combo.addItem("05");
		combo.addItem("06");
		combo.addItem("07");
		combo.addItem("08");
		combo.addItem("09");
		combo.addItem("10");
		combo.addItem("11");
		combo.addItem("12");		
		combo.addItem("13");
		combo.addItem("14");
		combo.addItem("15");
		combo.addItem("16");
		combo.addItem("17");
		combo.addItem("18");
		combo.addItem("19");
		combo.addItem("20");
		combo.addItem("21");
		combo.addItem("22");
		combo.addItem("23");
		combo.addItem("24");
		combo.addItem("25");
		combo.addItem("26");
		combo.addItem("27");
		combo.addItem("28");
		
		//JButton
		JButton b = new JButton("Continuar");
		b.setBounds(75, 60, 100, 20);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String fev = combo.getSelectedItem().toString();
				
				//Intanciar
				Ex02Acao a = new Ex02Acao(fev);			
				
			}
		} );
		
		
		//Adcionar componente ao JFrame
		frm.add(lblData);
		
		frm.add(combo);		
		frm.add(b);
		
		frm.setVisible(true);
	}
	
	

}
