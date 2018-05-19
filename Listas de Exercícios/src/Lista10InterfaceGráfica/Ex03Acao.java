package Lista10InterfaceGráfica;



	import javax.swing.JOptionPane;

	public class Ex03Acao {
		
		//Contrutor
			public Ex03Acao(String numero, String segundoNumero, String operacao){
				
				
				//Método para calcular
				
					int calculo;
					int number = Integer.parseInt(numero);
					int number2 = Integer.parseInt(segundoNumero);
					
					if(operacao.equals("+")){
						calculo = (number+number2);
						JOptionPane.showMessageDialog(null, "A soma dos números é: "+calculo);
					}else if(operacao.equals("-")){
						calculo = (number-number2);
						JOptionPane.showMessageDialog(null, "A subtração dos números é: "+calculo);
					}else if(operacao.equals("*")){
						calculo = (number*number2);
						JOptionPane.showMessageDialog(null, "A multiplicação dos números é: "+calculo);
					}else if(operacao.equals("/")){
						calculo = (number/number2);
						JOptionPane.showMessageDialog(null, "A divisão dos números é: "+calculo);
				}
				
			}

	}
