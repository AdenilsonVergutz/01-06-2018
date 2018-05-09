package Lista03Arrays;

import javax.swing.JOptionPane;

public class Ex08test {

	public static void main(String[] args) {



		//Vetor
		String logins[] = {"Jaaj", "Java", "Hill"};
		String senhas[] = {"Jooj", "C#", "Bill"};
		
		//Receber login e senha
		String login = JOptionPane.showInputDialog("Login:");
		String senha = JOptionPane.showInputDialog("Senha:");
		
		//Verificando login e senha
		boolean aceitar = false;
		for (int i = 0; i < 3; i++) {
			if ((login.equals(logins[i])) && (senha.equals(senhas[i]))) {
				aceitar = true;
				break;
			}
		}
		
		//Laço para caso o login e senha não forem aceitos
		while (!aceitar) {
			
			JOptionPane.showMessageDialog(null, "Login ou senha incorretos");
			
			//Receber login e senha
			login = JOptionPane.showInputDialog("Login:");
			senha = JOptionPane.showInputDialog("Senha:");
			
			//Verificando login e senha
			aceitar = false;
			for (int i = 0; i < 3; i++) {
				if ((login.equals(logins[i])) && (senha.equals(senhas[i]))) {
					System.out.println("Tic pra tic prey");
					aceitar = true;
					break;
				}
			}
			
		}
		
		//Exibindo mensagem de que o login e senha foram aceitos
		JOptionPane.showMessageDialog(null, "Login realizado com sucesso");

	}

}
