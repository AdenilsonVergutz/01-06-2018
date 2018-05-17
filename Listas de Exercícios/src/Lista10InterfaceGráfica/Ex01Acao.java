/*Desenvolva um algoritmo onde o usu�rio informar tr�s dados: Nome de um produto, valor e forma de
pagamento. Vamos supor que os dados foram: Celular, 800, � vista.
Ap�s informados os tr�s dados dever� ser realizada a seguinte verifica��o: Caso o produto tenha o valor
superior � R$500,00 e a forma de pagamento for � vista dever� ser dado um desconto de 10%, caso
contr�rio n�o haver� desconto.
Ao t�rmino da captura das informa��es e do poss�vel desconto dever� ser exibida uma frase como por
exemplo: O produto celular custar� R$ 720.*/

package Lista10InterfaceGr�fica;

import javax.swing.JOptionPane;

public class Ex01Acao {

	//Construtor
	public Ex01Acao(String nomeProduto, String formaPagamento, String valorProduto) {
		
		//Obter a valida��o dos campos
		boolean valida = validarCampos(nomeProduto, valorProduto);
		
		//Verificar se os campos est�o validando
		if(valida == true) {
			JOptionPane.showMessageDialog(null, "Favor verificar os campos");
		}else{
			double pagamento = calculo(formaPagamento, valorProduto);
			JOptionPane.showMessageDialog(null, "O pagamento ser� de R$ "+pagamento);
		}
	}
	
	//M�todo para validar os campos
	private boolean validarCampos(String nomeProduto,  String valorProduto) {
		
		//Vari�vel
		boolean valida = false;
		
		//Validar campos
		if(nomeProduto.equals("")) {
			valida = true;
		}
		
		if(valorProduto.equals("")) {
			valida = true;
		}
		
		//Retorno
		return valida;
	}
	
	
	//M�todos para retornar o c�lculo
	private double calculo(String formaPagamento,String valorProduto) {
		
		double pagamento;
		double valorPagamento = Double.parseDouble(valorProduto);
		
		if(formaPagamento.equals("A Vista") && (valorPagamento > 500)) {
			pagamento = valorPagamento * 0.90;
		}else{
			pagamento = valorPagamento;
		}
		
		return pagamento;
	}
}
