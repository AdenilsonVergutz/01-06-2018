package Exemplo02;

public class Principal {

	public static void main(String[] args) {

		//Instanciar objeto
		Pessoa p = new Pessoa();
		
		//Enviar dados
		p.setNome("Adenilson");
		p.setIdade(26);
		
		//Obter Dados
		System.out.println(p.getNome());
		System.out.println(p.getIdade());
	}

}
