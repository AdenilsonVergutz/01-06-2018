package Exemplo01;

public class Main {

	public static void main(String[] args) {
		
		//Instanciar
		Pessoa p1 = new Pessoa();
		p1.nome = "Adenilson";
		p1.idade = 26;
		p1.peso = 68.5;
		p1.altura = 1.76;
		
		//Instanciar outro objeto
		Pessoa p2 = new Pessoa();
		p2.nome = "Bruna";
		p2.idade = 21;
		p2.peso = 60;
		p2.altura = 1.55;
		
		//Invocar métodos
		p1.apresentacao();
		p1.exibirImc();
		
		
		
	}
}
