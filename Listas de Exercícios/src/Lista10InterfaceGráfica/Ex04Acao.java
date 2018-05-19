package Lista10InterfaceGráfica;


	import javax.swing.JOptionPane;

	public class Ex04Acao {
		
		//Contrutor
		public Ex04Acao(String numero, String segundoNumero){
			
			
			//Método para calcular
				int operacao;
				int number = Integer.parseInt(numero);
				int number2 = Integer.parseInt(segundoNumero);
				
				if(numero.equals(segundoNumero)){
					operacao = (number+number2);
					JOptionPane.showMessageDialog(null, "A soma dos números é: "+operacao);
				}else{
					operacao = (number*number2);
					JOptionPane.showMessageDialog(null, "A multiplicação dos números é: "+operacao);
				}

			}
			
		}





