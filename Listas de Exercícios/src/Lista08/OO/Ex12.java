/*12. Para esse exercício precisaremos desenvolver um algoritmo (projeto de um sistema), para comparar
tipos de investimentos.
O usuário irá informar um valor inicial para investimento e o tempo de investimento em meses. Não
pode ser aceito comparativos inferiores a um mês e superiores a 48 meses.
Deverá ser exibido quanto a pessoa ganha em cada mês e o montante total ao término das
aplicações.
As aplicações utilizadas são as seguintes: Poupança que tem rendimento 0,37% ao mês e CDB de
6,39% ao ano.
Para o CDB há uma tabela importante a ser seguida:
Tempo Percentual de desconto
Até 6 meses 22,5%
Entre 7 meses e 12 meses 20%
Entre 13 meses e 24 meses 17,54%
Acima de 24 meses 15%
Dependendo do tempo informado deverá ser dado o percentual de desconto mensalmente nas
aplicações em CDB.
Os cálculos mensais são juros compostos, sendo assim se você colocar na poupança no mês de abril
R$1.000,00 você receberá 0,37% desse valor que é de 3,70, já no mês seguindo o cálculo será sobre
R$1.003,70. */



package Lista08.OO;

import javax.swing.JOptionPane;

public class Ex12 {

	//Variáveis
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
                JOptionPane.showMessageDialog(null, "Favor informar um valor numérico.");
            }

        }while(valida == false);



        //Obter o prazo
        valida = false;
        do{

            try{
                tempoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de investimento."));

                //Validar mês
                if((tempoInvestimento >= 1) && (tempoInvestimento <= 48)){
                    valida = true;
                }else{
                    JOptionPane.showMessageDialog(null, "O tempo precisa ser entre 1 e 48 meses.");
                }

                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Favor informar um tempo numérico em meses.");
            }

        }while(valida == false);
    
    }
    
    public void exibirInvestimento(){
    
    	//Poupança
        indice = 1;

        //Extrato
        extratoPoup = "*****POUPANÇA*****\n";

        do{
            //Obter o valor da poupança no mês
            if(indice == 1){
                valorPoup = investimento * 0.0037;
            }else{
                valorPoup = (investimento + valorPoup) * 0.0037;
            }

            totalPoup += valorPoup;

            investimento += valorPoup;

            extratoPoup += "\n"+indice+"º mês terá R$ "+String.format("%.2f",investimento);

            indice++;

        }while(indice <= tempoInvestimento);

        //Poupançã
        extratoPoup+="\n\nOs juros ganhos na poupança são de R$"+String.format("%.2f",totalPoup);

        //Exibir extrato
        JOptionPane.showMessageDialog(null, extratoPoup);
      //Reset investimento
        investimento -= totalPoup;

        //CDB
        indice = 1;

        //Extrato
        extratoCDB = "*****CDB*****\n";

        do{
            //Obter o valor do CDB no mês
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
           

            extratoCDB += "\n"+indice+"º mês terá R$ "+String.format("%.2f",investimento + valorCDB);

            indice++;

        }while(indice <= tempoInvestimento);

        //Poupança
        extratoCDB+="\n\nOs juros ganhos no CDB são de R$"+String.format("%.2f",totalCDB);

        //Exibir extrato
        JOptionPane.showMessageDialog(null, extratoCDB);

    }
	  
    
    
    public void laco(){
    	
    	obterDados();
    	exibirInvestimento();
    	
    }

	
		
	}
	

