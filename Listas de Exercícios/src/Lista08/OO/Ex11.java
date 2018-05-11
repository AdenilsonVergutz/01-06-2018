/*. Desenvolver um sistema que peça diversos nomes. Quando digitada a palavra sair deverá ser exibido
todos os nomes cadastrados em uma única variável do tipo String.
Exemplo: Ralf, Ana e Júlia.
 Jaison, Christine, Stella, Maira, Priscila e Caio.
 Nayara e Gustavo.
 Jéssica.
Note que se houver apenas um novo deverá aparecer apenas aquele nome, caso haja dois haverá um
e entre os nomes, e caso três ou mais deverá haver uma separação com vírgulas entre os nomes,
exceto o último e o penúltimo que precisa ser e.*/


package Lista08.OO;

import javax.swing.JOptionPane;

public class Ex11 {

	String nome;
	String nome1 = "";
    String nome2 = "";
    String nome2maisnome1 = "";
    String nome3 = "";
    String nome3maisnomes = "";
    String final1 = "";
    String ultimonome = "";
    int indice = 1;
    
    boolean valida = false;
    
    public void obterNome(){
    	
    	nome = JOptionPane.showInputDialog("Informe um nome ou SAIR para finalizar.");
    	
    }
    
    public void verificarNome(){
    	
    	if((indice == 1)&&(!nome.equals("sair"))){
            nome1 += nome;
            indice++;
        }else if((indice ==2)&&(!nome.equals("sair"))){
            nome2 += nome;
            nome2maisnome1 += " e "+(nome2);
            indice++;
        }else if ((indice ==3)&&(!nome.equals("sair"))){
            nome3 += nome;
            nome3maisnomes += ", "+(nome3)+", ";
            indice++;
        }else if((indice >3)&&(!nome.equals("sair"))){
            indice++;
            ultimonome += nome+", ";
        }

        if (!nome.equals("sair")) {
        final1 =(ultimonome)+(nome1)+ (nome3maisnomes)+(nome2maisnome1);
        }
        
        if(nome.toLowerCase().equals("sair")){
        	
        	valida = true;
        	
        }
    	
    }
    
    public void laco(){
    	
    	do{
    		
    		obterNome();
    		verificarNome();
    		
    	}while(valida != true);
    	
    	JOptionPane.showMessageDialog(null, final1);
    	
    }

}
