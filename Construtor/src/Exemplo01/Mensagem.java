package Exemplo01;

public class Mensagem {

	// Construtor #01
	public Mensagem() {
		System.out.println("Boa noite!");
	}
	
	//Construtor #02
	public Mensagem(String nome) {
		System.out.println("Boa noite "+nome);
	}

	//Construtor #03
	public Mensagem(String nome, int hora) {
		
		if(hora < 12) {
			System.out.println("Bom dia "+nome);
		}else if(hora < 18) {
			System.out.println("Boa tarde "+nome);
		}else {
			System.out.println("Boa noite "+nome);
		}
		
	}
}
