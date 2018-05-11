/*Desenvolver um algoritmo que armazene as seguintes informações:
a. Nome
b. Sexo
c. Primeira nota
d. Segunda nota
e. Terceira nota
f. Quarta nota.
Enquanto o nome for diferente de SAIR o programa deverá perguntar os dados acima.
Após informada a quarta nota deverá ser dado a média e a condição do aluno (usar a segunda tabela
abaixo para informar sua situação).
Quando digitado SAIR deverá aparecer as seguintes estatísticas:
Quantidade e percentual de:
Homens
Mulheres
Quantidade e percentual de Notas
de alunos que tiraram 10-------------------------------------------Parabéns
de alunos que tiraram média entre 9.0 e 9.9------------------Ótimo
de alunos que tiraram média entre 8.0 e 8.9------------------Bom
de alunos que tiraram média entre 7.0 e 7.9------------------Satisfatório
de alunos que tiraram média entre 5.0 e 6.9------------------Recuperação
de alunos que tiraram média abaixo de 5----------------------Reprovado*/


package Lista08.OO;

import javax.swing.JOptionPane;

public class Ex06 {

	String nome = "";
	int sexo;
	double primeiranota = 0;
	double segundanota = 0;
	double terceiranota = 0;
	double quartanota = 0;
	double quantidadenotas = 0;
	double quanthomens = 0;
	double quantmulheres = 0;
	double quantalunos = 0;
	double tiraram10 = 0;
	double tiraram99 = 0;
	double tiraram89 = 0;
	double tiraram79 = 0;
	double tiraram69 = 0;
	double abaixo5 = 0;
	double totalsexo = 0;
	String erro;
	double mediaaluno = 0;
	boolean valida = false;

	int continuar = 0;

	public void ObterDados() {

		try {
			nome = JOptionPane.showInputDialog("Informe o nome.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Falha: " + e.getMessage());
		}

		// Tratamento de erros
		do

		{
			try {
				
				//Obter Sexo
				sexo = Integer
						.parseInt(JOptionPane.showInputDialog("Informe o sexo: \n 1 - Masculino \n 2 - Feminino")); 
																													
				valida = true; 
				if (sexo == 1) {
					quanthomens++;
				} else if (sexo == 2) {
					quantmulheres++;
				}
			} catch (Exception e) {
		
				JOptionPane.showMessageDialog(null, "Número/caráctere inválido." + e.getMessage()); 
																									
																									
				valida = false;
			}
		} while (!valida);

		// Obter primeira nota
		do {
			try {
				primeiranota = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota."));
				quantidadenotas++;
				valida = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Número/caráctere inválido.");
				valida = false;
			}
		} while (!valida);

		// Obter segunda nota
		do {
			try {
				segundanota = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota."));
				quantidadenotas++;
				valida = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Número/caráctere inválido.");
				valida = false;
			}
		} while (!valida);

		// Obter terceira nota
		do {
			try {
				terceiranota = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota."));
				quantidadenotas++;
				valida = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Número/caráctere inválido.");
				valida = false;
			}
		} while (!valida);

		// Obter quarta nota
		do {
			try {
				quartanota = Double.parseDouble(JOptionPane.showInputDialog("Informe a quarta nota."));
				quantidadenotas++;
				valida = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Número/caráctere inválido." + e.getMessage());
				valida = false;
			}
		} while (!valida);

	}

	public void calcularMedia() {

		// Cálculo da média do aluno
		mediaaluno = (primeiranota + segundanota + terceiranota + quartanota) / 4;

		// Condicional para informar as condições do aluno de acordo com a sua
		// media
		if (mediaaluno == 10) {
			JOptionPane.showMessageDialog(null, "Média: " + mediaaluno + "\nParabéns! Você atingiu nota máxima.");
			tiraram10++;
		} else if ((mediaaluno < 10) && (mediaaluno > 8.9)) {
			JOptionPane.showMessageDialog(null, "Média: " + mediaaluno + "\nSua média está ótima!");
			tiraram99++;
		} else if ((mediaaluno < 8.9) && (mediaaluno > 7.9)) {
			JOptionPane.showMessageDialog(null, "Média: " + mediaaluno + "\nSua média está boa.");
			tiraram89++;
		} else if ((mediaaluno < 7.9) && (mediaaluno > 6.9)) {
			JOptionPane.showMessageDialog(null, "Média: " + mediaaluno + "\nSua média é satisfatória.");
			tiraram79++;
		} else if ((mediaaluno < 6.9) && (mediaaluno > 5)) {
			JOptionPane.showMessageDialog(null,
					"Média: " + mediaaluno + "\nVocê não está na média e terá que recuperá-la.");
			tiraram69++;
		} else if (mediaaluno < 5) {
			JOptionPane.showMessageDialog(null,
					"Média: " + mediaaluno + "\nVocê não atingiu a média mínima e está reprovado.");
			abaixo5++;
		}

		quantalunos++;

	}

	public void exibirResultados() {

		// Total de pessoas informadas
		totalsexo = (quanthomens) + (quantmulheres);
		// Variáveis para
		double porcenthomens = (100 / totalsexo) * quanthomens;
		double porcentmulheres = (100 / totalsexo) * quantmulheres;
		String mensagemfinal = "";
		mensagemfinal += "Quantidade e percentual de homens e mulheres:\nHomens:" + quanthomens + " (" + porcenthomens
				+ "%)";
		mensagemfinal += "\nMulheres: " + quantmulheres + " (" + porcentmulheres + "%)";
		mensagemfinal += "\n\n Alunos que tiraram 10: " + tiraram10 + " (" + (100 / quantalunos) * tiraram10
				+ "%) Parabéns!";
		mensagemfinal += "\nAlunos que tiraram média entre 9.0 e 9.9: " + tiraram99 + " ("
				+ (100 / quantalunos) * tiraram99 + "%) Ótimo!";
		mensagemfinal += "\nAlunos que tiraram média entre 8.0 e 8.9: " + tiraram89 + " ("
				+ (100 / quantalunos) * tiraram89 + "%) Bom!";
		mensagemfinal += "\nAlunos que tiraram média entre 7.0 e 7.9: " + tiraram79 + " ("
				+ (100 / quantalunos) * tiraram79 + "%) Satisfatório!";
		mensagemfinal += "\nAlunos que tiraram média entre 6.0 e 6.9: " + tiraram69 + " ("
				+ (100 / quantalunos) * tiraram69 + "%) Recuperação!";
		mensagemfinal += "\nAlunos que tiraram média abaixo de 5: " + abaixo5 + " (" + (100 / quantalunos) * abaixo5
				+ "%) Reprovado!";

		JOptionPane.showMessageDialog(null, mensagemfinal);

	}

	public void laco() {

		do {
			ObterDados();
			calcularMedia();

			continuar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro aluno?", "", 0);

		} while (continuar == 0);

	}

}

