/*
 * 5.	Crie um programa para uma papelaria que leia o nome e o valor de um produto.

Assim que for informado o nome do produto e o valor do mesmo crie uma tabela informando a quantidade adquirida do produto (1 até 10) e o valor desse produto com desconto.

A cada produto adquirido será dado 5% de desconto, em outras palavras, se for comprado um produto será dado 5% de desconto, se for comprado dois produtos 10%, três produtos 15%....

Veja a tabela abaixo para compreender melhor o que deve ser exibido:
 
Produto: Lápis
Valor: 2,00

1 x R$ 1,90 = R$ 1,90
2 x R$ 1,80 = R$ 3,60
3 x R$ 1,70 = R$ 5,10
4 x R$ 1,60 = R$ 6,40
5 x R$ 1,50 = R$ 7,50
6 x R$ 1,40 = R$ 8,40
7 x R$ 1,30 = R$ 9,10
8 x R$ 1,20 = R$ 9,60
9 x R$ 1,10 = R$ 9,90
10 x R$ 1,00 = R$ 10,00
*/

package Lista08.OO;

import javax.swing.JOptionPane;

public class Ex05 {

	String produto;
	double valor;
	 String texto = "";
    int indice = 1;
	
	public void obterDados(){
		
		produto = JOptionPane.showInputDialog("Informe o nome do produto");
        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto em R$"));
		
	}
	
	public void obterDesconto(){
		
		//Laço

        double valorProduto = 0;
        double valorComDescontoQuantidade = 0;
        double percentual = 0.05;
		while(indice <= 10){

        	
            
			//Obter o desconto do produto
          valorProduto = valor - valor * percentual;
          
          System.out.println(valorProduto);

            //Obter o desconto com a quantidade
            valorComDescontoQuantidade = valorProduto * indice;

            //Criar a tabela
            texto += indice+" | "+produto+" | " +String.format("%.2f",valorProduto)+" | Valor total: "+String.format("%.2f",valorComDescontoQuantidade)+"\n";
            
            
            //Incrementar
            percentual += 0.05;
            indice++;
   	
		
	}

		 JOptionPane.showMessageDialog(null, texto);
	
	
	}
}
