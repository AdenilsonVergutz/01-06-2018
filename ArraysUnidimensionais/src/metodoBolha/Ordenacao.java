package metodoBolha;

public class Ordenacao {

	public static void main(String[] args) {
		
		//Array de números inteiros
		int[] numeros = {5, 9, 2, 7, 6};
		
		//Laço principal
		for (int i = 0; i < numeros.length - 1; i++) {
			
			//Laço secundário
			for (int j = i + 1; j < numeros.length; j++) {

				//Validação
				if (numeros[j] < numeros[i]) {
					int n = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = n;
				}
			}
		}
		
		//Exibir array
		for (int n : numeros) {
			System.out.println(n);
		}

	}

}
