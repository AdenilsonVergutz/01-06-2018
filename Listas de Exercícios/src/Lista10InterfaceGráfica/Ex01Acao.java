/*Desenvolva um algoritmo onde o usuário informar três dados: Nome de um produto, valor e forma de
pagamento. Vamos supor que os dados foram: Celular, 800, à vista.
Após informados os três dados deverá ser realizada a seguinte verificação: Caso o produto tenha o valor
superior à R$500,00 e a forma de pagamento for à vista deverá ser dado um desconto de 10%, caso
contrário não haverá desconto.
Ao término da captura das informações e do possível desconto deverá ser exibida uma frase como por
exemplo: O produto celular custará R$ 720.*/

package Lista10InterfaceGráfica;

import javax.swing.JOptionPane;

public class Ex01Acao {

	//Construtor
	public Ex01Acao(String nomeProduto, String formaPagamento, String valorProduto) {
		
		//Obter a validação dos campos
		boolean valida = validarCampos(nomeProduto, valorProduto);
		
		//Verificar se os campos estão validando
		if(valida == true) {
			JOptionPane.showMessageDialog(null, "Favor verificar os campos");
		}else{
			double pagamento = calculo(formaPagamento, valorProduto);
			JOptionPane.showMessageDialog(null, "O pagamento será de R$ "+pagamento);
		}
	}
	
	//Método para validar os campos
	private boolean validarCampos(String nomeProduto,  String valorProduto) {
		
		//Variável
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
	
	
	//Métodos para retornar o cálculo
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
