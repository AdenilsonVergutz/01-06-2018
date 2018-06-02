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

public class Produto {

	private String nome;
	private double valor;
	
	public Produto (String nome, double valor) {
		
		this.nome = nome;
		
		String valS = String.format("%.2f", valor);
		
		this.valor = Double.parseDouble(valS.replaceAll(",", "."));
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	public String[] getAll() {
		
		return new String[] {getNome(), String.format("%.2f", getValor())};
	}
	
}
