/*3.	Uma lanchonete precisa de um sistema para calcular o troco que será dado aos clientes, para isso faça com que seja informado um código a quantidade pedida daquele produto (que pertence ao código informado). Crie um laço onde o cliente irá informar códigos e quantidades infinitamente.

Após informados os códigos e suas respectivas quantidades informe o total consumido e peça o valor que o cliente irá pagar (Se o cliente tentar pagar menos que o total peça novamente o pagamento até ele informar um valor igual ou superior consumido).

Ao término informe o troco que será dado ao cliente.

CÓDIGO	PEDIDO	VALOR
1	Hambúrguer + Suco de Laranja	R$ 5,00
2	Sanduíche natural + Suco de Uva	R$ 4,50
3	Prato do dia	R$ 8,00
4	Pizza	R$12,00
5	Lasanha	R$ 16,50
6	Pão de queijo	R$ 1,00
7	Bolo	R$ 2,50
*/


package Lista08.OO;

import javax.swing.JOptionPane;

public class Ex03 {

int pedido = Integer.parseInt(JOptionPane.showInputDialog("Qual o número do pedido?" + "\n" + "1 - Hambúrguer + Suco de laranja (R$5,00)" + "\n" + "2 - Sanduíche natural + Suco de Uva (R$4,50)" + "\n" + "3 - Prato do dia (R$8,00)" + "\n" + "4 - Pizza (R$12,00)" + "\n" + "5 - Lasanha (R$16,50)" + "\n" + "6 - Pão de queijo (R$1,00)" + "\n" + "7 - Bolo (R$2,50)"+"\n 8 - FINALIZAR PEDIDO"));
double pagamento;
double troco;

double quantidade1 = 0;
double quantidade2 = 0;
double quantidade3 = 0;
double quantidade4 = 0;
double quantidade5 = 0;
double quantidade6 = 0;
double quantidade7 = 0;

double preco1 = 0;
double preco2 = 0;
double preco3 = 0;
double preco4 = 0;
double preco5 = 0;
double preco6 = 0;
double preco7 = 0;

double somatotal = 0;


public void contabilizarProduto(){
	 

    while (pedido != 8) {
       
       if(pedido==1){
           try {
               quantidade1 += Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de Hambúrgueres + Sucos de laranja"));
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Falha: "+e.getMessage());
           }
       }else if(pedido==2){
          try {
           quantidade2 += Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de Sanduíches Naturais + Sucos de uva"));
          } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Falha: "+e.getMessage());
          } 
       }else if(pedido==3){
           try {
               quantidade3 += Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de Pratos do dia"));
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Falha: "+e.getMessage());
           }
       }else if(pedido==4){
           try {
               quantidade4 += Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de Pizzas"));
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Falha: "+e.getMessage());
           }
       }else if(pedido==5){
           try {
               quantidade5 += Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de Lasanhas"));
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Falha: "+e.getMessage());
           }
       }else if(pedido==6){
           try {
               quantidade6 += Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de Pães de queijo"));
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Falha: "+e.getMessage());
           }
       }else if(pedido==7){
           try {
               quantidade7 += Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de Bolos"));
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Falha: "+e.getMessage());
           }
       }
           try {
               pedido = Integer.parseInt(JOptionPane.showInputDialog("Qual o número do pedido?" + "\n" + "1 - Hambúrguer + Suco de laranja (R$5,00)" + "\n" + "2 - Sanduíche natural + Suco de Uva (R$4,50)" + "\n" + "3 - Prato do dia (R$8,00)" + "\n" + "4 - Pizza (R$12,00)" + "\n" + "5 - Lasanha (R$16,50)" + "\n" + "6 - Pão de queijo (R$1,00)" + "\n" + "7 - Bolo (R$2,50)"+"\n8 - FINALIZAR PEDIDO"));
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Falha: "+e.getMessage());
           }
	 
    }

}

public void total(){
	 
	 preco1 = quantidade1*5.00;
    preco2 = quantidade2*4.50;
    preco3 = quantidade3*8.00;
    preco4 = quantidade4*12.00;
    preco5 = quantidade5*16.50;
    preco6 = quantidade6*1.00;
    preco7 = quantidade7*2.50;
	 
}

public double somaTotal(){
	 
	 somatotal = (preco1+preco2)+(preco3+preco4)+(preco5+preco6)+(preco7);
	 return somatotal;
	 
}

public void pagamento(){
	 
	 if(pedido == 8){
        pagamento = Double.parseDouble(JOptionPane.showInputDialog("O valor total consumido é: R$"+somatotal+"\nQual o dinheiro fornecido no pagamento?"));
            while (pagamento<somatotal) {
                JOptionPane.showMessageDialog(null, "O valor fornecido pelo cliente é menor que o valor total da compra.");
                pagamento = Double.parseDouble(JOptionPane.showInputDialog("Qual o dinheiro fornecido no pagamento?"));
            }
            troco = pagamento-somatotal;
        JOptionPane.showMessageDialog(null, "O troco do cliente é "+troco);
        }
	 
}


public void laco(){
	 
	 contabilizarProduto();
	 total();
	 somaTotal();
	 pagamento();
	 
}

}
