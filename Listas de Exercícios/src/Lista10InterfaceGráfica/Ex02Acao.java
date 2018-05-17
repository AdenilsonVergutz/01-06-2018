package Lista10InterfaceGráfica;

import javax.swing.JOptionPane;

public class Ex02Acao {
	
	//Bob
	public  Ex02Acao(String fev){
		
		int dia = Integer.parseInt(fev);

			
		if(dia == 3 || dia == 4 || dia == 10 || dia == 11 || dia == 17 || dia == 18 || dia == 24 || dia == 25){
		JOptionPane.showMessageDialog(null, "Final de semana");
		}else{
		JOptionPane.showMessageDialog(null, "Dia de Semana");
		}
		
		
	}

}
