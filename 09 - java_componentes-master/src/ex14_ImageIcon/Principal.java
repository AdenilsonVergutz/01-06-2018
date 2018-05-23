package ex14_ImageIcon;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {

	public static void main(String[] args) {
		
		/*
		 	DICAS IMPORTANTES PARA TRABALHAR COM IMAGENS, LEIA COM ATENÇÃO!
		 	
		 	1) Precisamos lembrar que quando exportamos um projeto devemos enviar as imagens junto, caso contrário não conseguiremos efetuar o carregamento delas.
		  
		    2) Para isso crie uma pasta no seu projeto (Botão direito sobre o projeto -> New -> Folder)
		    
		    3) Nessa pasta adicione as imagens que você quer exportar com o seu projeto
		    
		    4) Depois que você fez isso siga o exemplo abaixo para exibir a imagem.
		    
		    Essa técnica não serve apenas para imagens, você pode utilizar para aquivos de áudio, vídeo, textos....
		*/
		
		// JFrame
		JFrame formulario = new JFrame("Manipulando imagens");
		formulario.setSize(273, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		// Obtendo o caminho da imagem (Com a classe URL você pode criar um objeto que tenha o caminho para qualquer tipo de arquivo)
		URL caminhoDaImagem = Principal.class.getResource("/imagens/icone_java.png");
		
		// Objeto para obter a imagem
		ImageIcon imagem = new ImageIcon(caminhoDaImagem);		
		
		// JLabel
		JLabel exibirImagem = new JLabel();
		exibirImagem.setIcon(imagem);
		exibirImagem.setBounds(0, 0, 256, 256);
		
		// Adicionar ao JFrame
		formulario.add(exibirImagem);
		
		// Exibir formulário
		formulario.setVisible(true);
	}

}
