/*1. Implemente um sistema para uma lanchonete, esse sistema ter� as seguintes op��es:
	a. Cadastrar produtos (Nome e valor)
	b. Realizar pedidos
	c. Hist�rico � Exibir o nome do cliente, data, hora, produtos consumidos e quantidade
	d. Estat�sticas � Poder listar todos os hist�ricos e tamb�m realizar filtragens atrav�s de data
	ou nome dos clientes
	Nessas filtragens fa�a com que sejam exibidos os produtos e as quantidades vendidas em
	um determinado per�odo, al�m de somar os valores ganhos.
	e. Sair � Finalizar o sistema
*/



package  Lista11Sistemas;
public class Main {

	static Lanchonete lanchonete = new Lanchonete();
	
	public static void main(String[] args) {
		
		Frame.getMainFrame(lanchonete);
	}
	
	public static void cadastrarProduto(SmartField nome, SmartField valor) {
		
		lanchonete.cadastrar(nome.getText(), valor.getDouble());
	}
	
}