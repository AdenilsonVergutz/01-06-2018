package Exemplo01;

import javax.swing.JOptionPane;

public class Acao {

	//Construtor
	public Acao(String nomeProduto, String formaPagamento, String valorProduto) {
		
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
