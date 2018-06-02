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
