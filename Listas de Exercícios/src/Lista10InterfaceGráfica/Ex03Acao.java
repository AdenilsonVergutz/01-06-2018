package Lista10InterfaceGr�fica;



	import javax.swing.JOptionPane;

	public class Ex03Acao {
		
		//Contrutor
			public Ex03Acao(String numero, String segundoNumero, String operacao){
				
				
				//M�todo para calcular
				
					int calculo;
					int number = Integer.parseInt(numero);
					int number2 = Integer.parseInt(segundoNumero);
					
					if(operacao.equals("+")){
						calculo = (number+number2);
						JOptionPane.showMessageDialog(null, "A soma dos n�meros �: "+calculo);
					}else if(operacao.equals("-")){
						calculo = (number-number2);
						JOptionPane.showMessageDialog(null, "A subtra��o dos n�meros �: "+calculo);
					}else if(operacao.equals("*")){
						calculo = (number*number2);
						JOptionPane.showMessageDialog(null, "A multiplica��o dos n�meros �: "+calculo);
					}else if(operacao.equals("/")){
						calculo = (number/number2);
						JOptionPane.showMessageDialog(null, "A divis�o dos n�meros �: "+calculo);
				}
				
			}

	}
