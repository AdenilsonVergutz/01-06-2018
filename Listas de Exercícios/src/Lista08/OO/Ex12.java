/*12. Para esse exerc�cio precisaremos desenvolver um algoritmo (projeto de um sistema), para comparar
tipos de investimentos.
O usu�rio ir� informar um valor inicial para investimento e o tempo de investimento em meses. N�o
pode ser aceito comparativos inferiores a um m�s e superiores a 48 meses.
Dever� ser exibido quanto a pessoa ganha em cada m�s e o montante total ao t�rmino das
aplica��es.
As aplica��es utilizadas s�o as seguintes: Poupan�a que tem rendimento 0,37% ao m�s e CDB de
6,39% ao ano.
Para o CDB h� uma tabela importante a ser seguida:
Tempo Percentual de desconto
At� 6 meses 22,5%
Entre 7 meses e 12 meses 20%
Entre 13 meses e 24 meses 17,54%
Acima de 24 meses 15%
Dependendo do tempo informado dever� ser dado o percentual de desconto mensalmente nas
aplica��es em CDB.
Os c�lculos mensais s�o juros compostos, sendo assim se voc� colocar na poupan�a no m�s de abril
R$1.000,00 voc� receber� 0,37% desse valor que � de 3,70, j� no m�s seguindo o c�lculo ser� sobre
R$1.003,70. */



package Lista08.OO;

import javax.swing.JOptionPane;

public class Ex12 {

	//Vari�veis
    double investimento = 0;
    int tempoInvestimento = 0, indice;
    boolean valida;
    double valorPoup = 0, valorCDB = 0, totalCDB = 0, totalPoup = 0;
    String extratoPoup = "", extratoCDB = "";

    
    public void obterDados(){
    	
    	 //Obter o investimento
        valida = false;
        do{

            try{
                investimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o investimento inicial."));
                valida = true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Favor informar um valor num�rico.");
            }

        }while(valida == false);



        //Obter o prazo
        valida = false;
        do{

            try{
                tempoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de investimento."));

                //Validar m�s
                if((tempoInvestimento >= 1) && (tempoInvestimento <= 48)){
                    valida = true;
                }else{
                    JOptionPane.showMessageDialog(null, "O tempo precisa ser entre 1 e 48 meses.");
                }

                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Favor informar um tempo num�rico em meses.");
            }

        }while(valida == false);
    
    }
    
    public void exibirInvestimento(){
    
    	//Poupan�a
        indice = 1;

        //Extrato
        extratoPoup = "*****POUPAN�A*****\n";

        do{
            //Obter o valor da poupan�a no m�s
            if(indice == 1){
                valorPoup = investimento * 0.0037;
            }else{
                valorPoup = (investimento + valorPoup) * 0.0037;
            }

            totalPoup += valorPoup;

            investimento += valorPoup;

            extratoPoup += "\n"+indice+"� m�s ter� R$ "+String.format("%.2f",investimento);

            indice++;

        }while(indice <= tempoInvestimento);

        //Poupan��
        extratoPoup+="\n\nOs juros ganhos na poupan�a s�o de R$"+String.format("%.2f",totalPoup);

        //Exibir extrato
        JOptionPane.showMessageDialog(null, extratoPoup);
      //Reset investimento
        investimento -= totalPoup;

        //CDB
        indice = 1;

        //Extrato
        extratoCDB = "*****CDB*****\n";

        do{
            //Obter o valor do CDB no m�s
            if(indice == 1){
                valorCDB = investimento * (0.0639/12);
                System.out.print(valorCDB);
            }else{
                valorCDB += (investimento + valorCDB) * (0.0639/12);
            }

            //Percentual de desconto de tempo
            if(tempoInvestimento <= 6){
                valorCDB = valorCDB * 0.775;
            }else if(tempoInvestimento <= 12){
                valorCDB = valorCDB * 0.80;
            }else if(tempoInvestimento <= 24){
                valorCDB = valorCDB * 0.825;
            }else{
                valorCDB = valorCDB * 0.85;
            }

            totalCDB += valorCDB;
           

            extratoCDB += "\n"+indice+"� m�s ter� R$ "+String.format("%.2f",investimento + valorCDB);

            indice++;

        }while(indice <= tempoInvestimento);

        //Poupan�a
        extratoCDB+="\n\nOs juros ganhos no CDB s�o de R$"+String.format("%.2f",totalCDB);

        //Exibir extrato
        JOptionPane.showMessageDialog(null, extratoCDB);

    }
	  
    
    
    public void laco(){
    	
    	obterDados();
    	exibirInvestimento();
    	
    }

	
		
	}
	

