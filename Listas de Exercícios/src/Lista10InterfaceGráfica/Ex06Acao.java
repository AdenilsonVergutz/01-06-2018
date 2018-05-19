package Lista10InterfaceGráfica;



	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class Ex06Acao implements ActionListener {

		int x, y;
		String txt;

		public Ex06Acao(int x, int y) {
			
			this.x = x;
			this.y = y;
		}
		
		public Ex06Acao(String txt) {
			
			this.txt = txt;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
	
		}
	}