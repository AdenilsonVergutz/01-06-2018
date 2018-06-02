/*1. Implemente um sistema para uma lanchonete, esse sistema terá as seguintes opções:
	a. Cadastrar produtos (Nome e valor)
	b. Realizar pedidos
	c. Histórico – Exibir o nome do cliente, data, hora, produtos consumidos e quantidade
	d. Estatísticas – Poder listar todos os históricos e também realizar filtragens através de data
	ou nome dos clientes
	Nessas filtragens faça com que sejam exibidos os produtos e as quantidades vendidas em
	um determinado período, além de somar os valores ganhos.
	e. Sair – Finalizar o sistema
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