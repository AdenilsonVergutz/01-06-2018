


		/*Criar um sistema de login e senha. Crie um vetor contendo três usuários e um vetor contendo três
senhas. Enquanto não for digitado o usuário e a senha correspondentes ao índice dos dois vetores
deverá aparecer a mensagem: Usuário ou senha incorretos, caso contrário exiba: Login realizado com
sucesso!.*/

package Lista03Arrays;

import javax.swing.JOptionPane;

public class Ex08 {

	public static void main(String[] args) {

		//Vetores
		String[] logins = {"Adenilson1", "Adenilson2", "Adenilson3"};
		String[] senhas = {"Adenilson1", "Adenilson2", "Adenilson3"};
		
		//Variáveis
		String login = "";
		String senha = "";
		boolean valido = false;
		boolean acertou = false;
		
		while (acertou == false) {
			
			do{
				login = JOptionPane.showInputDialog("Digite o login");
				valido = true;
				if(login.isEmpty()){
					valido = false;
				}
			}while(valido == false);
			
			valido = false;
			do{
				senha = JOptionPane.showInputDialog("Digite a senha");
				valido = true;
				if(senha.isEmpty()){
					valido = false;
				}
			}while(valido == false);
			
			for (int i = 0; i < senhas.length; i++) {
				if(login.equals(logins[i]) && (senha.equals(senhas[i]))){
					acertou = true;
				}else{
					valido = false;
				}
			}
			
			if(acertou == false){
				JOptionPane.showMessageDialog(null, "Login ou senha incorretos.");
			}
		}
		
		JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
	}
}
