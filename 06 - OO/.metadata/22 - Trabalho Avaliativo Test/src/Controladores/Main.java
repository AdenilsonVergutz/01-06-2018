package Controladores;

import Formularios.Frame;

public class Main {

	static ArmazemDaCerveja armazemDaCerveja = new ArmazemDaCerveja();
	
	public static void main(String[] args) {
		
		Frame.getMainFrame(armazemDaCerveja);
	}
	
	public static void cadastrarProduto(SmartField nome, SmartField valor) {
		
		armazemDaCerveja.cadastrar(nome.getText(), valor.getDouble());
	}
	
}