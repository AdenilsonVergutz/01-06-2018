package Lista10InterfaceGr�fica;


	import javax.swing.JOptionPane;

	public class Ex04Acao {
		
		//Contrutor
		public Ex04Acao(String numero, String segundoNumero){
			
			
			//M�todo para calcular
				int operacao;
				int number = Integer.parseInt(numero);
				int number2 = Integer.parseInt(segundoNumero);
				
				if(numero.equals(segundoNumero)){
					operacao = (number+number2);
					JOptionPane.showMessageDialog(null, "A soma dos n�meros �: "+operacao);
				}else{
					operacao = (number*number2);
					JOptionPane.showMessageDialog(null, "A multiplica��o dos n�meros �: "+operacao);
				}

			}
			
		}





