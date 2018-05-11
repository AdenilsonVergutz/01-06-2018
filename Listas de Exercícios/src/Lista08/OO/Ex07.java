/*7. Crie um jogo da forca com a palavra ESTUDAR.*/

package Lista08.OO;

import javax.swing.JOptionPane;

public class Ex07 {

	int tentativaerro = 0;
    int acertos = 0;

    String forca = "";
    
    String tabuleiro = "JOGO DA FORCA \n\n — — — — — — —"+"\n\n Informe uma letra. \nMax. de tentativas: 6.";
    String novotabuleiro = "JOGO DA FORCA \n\n — — — — — — —"+"\n\n Informe uma letra. \nMax. de tentativas: 6.";
    
    StringBuilder sb = new StringBuilder(tabuleiro);
    
    
    
    public void obterLetra(){
    	
    	try {
            forca = JOptionPane.showInputDialog(novotabuleiro);
         } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha: "+e.getMessage());
         } 
    	
    }
    
    public void validarLetra(){

    	if(forca.equals("e")){
    		sb.delete(17,18);
    		sb.insert(17, "E");
    		novotabuleiro = sb.toString();
            JOptionPane.showMessageDialog(null, novotabuleiro);
            acertos++;
        }else if(forca.equals("s")){
        	sb.delete(19,20);
        	sb.insert(19, "S");
        	novotabuleiro = sb.toString();
            JOptionPane.showMessageDialog(null, novotabuleiro);
            acertos++;
        }else if(forca.equals("t")){
        	sb.delete(21,22);
        	sb.insert(21, "T");
        	novotabuleiro = sb.toString();
            JOptionPane.showMessageDialog(null, novotabuleiro);
            acertos++;
        }else if(forca.equals("u")){
        	sb.delete(23,24);
        	sb.insert(23, "U");
        	novotabuleiro = sb.toString();
            JOptionPane.showMessageDialog(null, novotabuleiro);
            acertos++;
        }else if(forca.equals("d")){
        	sb.delete(25,26);
        	sb.insert(25, "D");
        	novotabuleiro = sb.toString();
            JOptionPane.showMessageDialog(null, novotabuleiro);
            acertos++;
        }else if (forca.equals("a")){
        	sb.delete(27,28);
        	sb.insert(27, "A");
        	novotabuleiro = sb.toString();
            JOptionPane.showMessageDialog(null, novotabuleiro);
            acertos++;
        }else if (forca.equals("r")){
        	sb.delete(29,30);
        	sb.insert(29, "R");
        	novotabuleiro = sb.toString();
            JOptionPane.showMessageDialog(null, novotabuleiro);
            acertos++;
        }else{
            tentativaerro++;
        }

        if (acertos==7) {
            JOptionPane.showMessageDialog(null, "Você ganhou! A palavra era ESTUDAR.");
            tentativaerro+=10;
        }
        
    	
    }
    
    public void laco(){
    	
    	do{
    		
    		obterLetra();
    		
    		if(tentativaerro==5){
            	
            	JOptionPane.showMessageDialog(null, "Você perdeu. A palavra era ESTUDAR.");
            	break;
            	
            }
    		
    		validarLetra();
    		
    	}while(tentativaerro<=5);
    	
    	JOptionPane.showMessageDialog(null, "Fim do jogo.");
    	
    }
    	
	
}

	
