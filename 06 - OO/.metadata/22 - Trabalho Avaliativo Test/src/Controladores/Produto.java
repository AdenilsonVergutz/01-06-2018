package Controladores;

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
