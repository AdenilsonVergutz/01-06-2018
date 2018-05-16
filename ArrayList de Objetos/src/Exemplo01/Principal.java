package Exemplo01;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		// ArrayList
		ArrayList<String> cursos = new ArrayList<>();

		// Adicionar cursos
		cursos.add("Java Desktop");
		cursos.add("Java Web");
		cursos.add("Java Android");
		cursos.add("Oracle");
		cursos.add("HTML");
		cursos.add("CSS");

		// Exibir a quantidade de cursos cadastrados
		System.out.println("Há " + cursos.size() + " cursos cadastrados.");
		
		//Listar todos os cursos
		for(int i=0; i<cursos.size(); i++) {
			System.out.println((i+1)+"º curso é "+cursos.get(i));
		}

	}

}
