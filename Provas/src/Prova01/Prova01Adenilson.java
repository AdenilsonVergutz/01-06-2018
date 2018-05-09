package Prova01;

import javax.swing.*;

public class Prova01Adenilson {
    public static void main(String[] args) {

        //Variáveis
        String nmaiorsalario = "";
        String nmenorsalario = "";
        String texto = "Selecione uma opção:";
        String nome = "";
        Object[] opcao = {"Folha de Pagamento", "Finalizar e ver resultados"};
        Object[] sexo = {"Masculino", "Feminino"};
        Object[] clube = {"Sim", "Não"};
        Object[] cargo = {"Desenvolvedor Java Júnior", "Desenvolvedor Java Pleno", "Desenvolvedor Jana Sênior", "Administrador de Banco de Dados", "Analista Júnior", "Analista Pleno", "Analista Sênior", "Arquiteto de Software", "Gerente de Projetos"};
        Object escolha = "";
        Object esc_carg = "";
        Object esc_sex = "";
        Object esc_clube="";
        double salario = 0.0;
        double salario_hr = 0.0;
        double valetransp = 0.0;
        double inss= 0.0;
        double bonus = 0.0;
        double salario_liq = 0.0;
        double maiorsalario = 0.0;
        double menorsalario = 0.0;
        boolean validahrExtra = false;
        boolean validadadosinteiros = false;
        int hrExtra50 = 0;
        int hrExtra100 = 0;
        int contador = 0;
        int cont_men = 0;
        int cont_femi = 0;
        int idade = 0;
        int faltas = 0;
        int filhos = 0;
        int idade_18a26 = 0;
        int idade_27a40 = 0;
        int idade_41a50 = 0;
        int idade_50 = 0;
        int cargo1 = 0;
        int cargo2 = 0;
        int cargo3 = 0;
        int cargo4 = 0;
        int cargo5 = 0;
        int cargo6 = 0;
        int cargo7 = 0;
        int cargo8 = 0;
        int cargo9 = 0;
        int adclube = 0;
        int contcarg = 0;


        
        do{
            escolha = JOptionPane.showInputDialog(null, texto, "Folha de pagamento", JOptionPane.PLAIN_MESSAGE, null, opcao, "");
            if(!escolha.equals("Finalizar e ver resultados")){
                nome  = JOptionPane.showInputDialog(null, "Informe o nome do funcionário");
                esc_carg = JOptionPane.showInputDialog(null, "Selecione o cargo do funcionário", "Folha de pagamento", JOptionPane.PLAIN_MESSAGE, null, cargo, "");
                if(esc_carg.equals(cargo[0])){
                    salario = 1450.0;
                    cargo1++;
                }else if(esc_carg.equals(cargo[1])){
                    salario = 2220.0;
                    cargo2++;
                }else if(esc_carg.equals(cargo[2])){
                    salario = 3300.0;
                    cargo3++;
                }else if(esc_carg.equals(cargo[3])){
                    salario = 3560.0;
                    cargo4++;
                }else if(esc_carg.equals(cargo[4])){
                    salario = 2800.0;
                    cargo5++;
                }else if(esc_carg.equals(cargo[5])){
                    salario = 3400.0;
                    cargo6++;
                }else if(esc_carg.equals(cargo[6])){
                    salario = 4500.0;
                    cargo7++;
                }else if(esc_carg.equals(cargo[7])){
                    salario = 5280.0;
                    cargo8++;
                }else{
                    salario = 6000.0;
                    cargo9++;
                }
                salario_hr = salario/160;
                valetransp = salario*0.06;
                if(salario<=2000){
                    inss= salario*0.05;
                }else if(salario<=3500){
                    inss= salario*0.07;
                }else if(salario<=5600){
                    inss= salario*0.08;
                }else{
                    inss= salario*0.1;
                }
                while(validahrExtra==false){
                    try {
                        hrExtra50 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de horas com 50% de adicional"));
                        hrExtra100 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de horas com 100% de adicional"));
                        validahrExtra = true;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "O valor informado não é valido, digite novamente as horas extras");
                    }
                }
                esc_sex = JOptionPane.showInputDialog(null,"Selecione o sexo do funcionário", "Folha de pagamento", JOptionPane.PLAIN_MESSAGE, null, sexo, "");
                if(esc_sex.equals("Masculino")){
                    cont_men++;
                }else{
                    cont_femi++;
                }
                while(validadadosinteiros==false){
                    try {
                        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do funcionário"));
                        faltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Numero de faltas do funcionário"));
                        filhos = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de filhos do funcionário"));
                        validadadosinteiros = true;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Informe novamente idade, faltas e quantidade de filhos, algum dado foi adicionado incorreto");
                    }
                    if(faltas==0){
                        bonus = 200.0;
                    }
                    bonus += (filhos*50.0);

                    if((idade>=18)&&(idade<=26)){
                        idade_18a26++;

                    }else if((idade>=27)&&(idade<=40)){
                        idade_27a40++;
                    }else if((idade>=41)&&(idade<=50)){
                        idade_41a50++;
                    }else{
                        idade_50++;
                    }
                }
                esc_clube = JOptionPane.showInputDialog(null, "Funcionário associado ao clube de fidelidade", "Folha de pagamento", JOptionPane.PLAIN_MESSAGE, null, clube, "");
                salario_liq = (salario+((salario_hr*1.5)*hrExtra50)+((salario_hr*2)*hrExtra100)+bonus)-(valetransp+inss);
                if(esc_clube.equals("Sim")){
                    salario_liq -= 110.0;
                    adclube++;
                }
                if(salario_liq>maiorsalario){
                    maiorsalario = salario_liq;
                    nmaiorsalario = nome;
                }
                if(salario_liq<menorsalario){
                    menorsalario = salario_liq;
                    nmenorsalario = nome;

                }
                texto = "O salário liquido do funcionário é R$ "+String.format("%.2f", salario_liq)+"\nSelecione nova opção";
                validahrExtra=false;
                validadadosinteiros=false;
                contador++;
            }
            

        }while(!escolha.equals("Finalizar e ver resultados"));
        if(contador>0){
            texto = "Número de funcionários cadastrados "+ contador;
            texto += "\nQuantidade de Homens "+cont_men+" percentual: "+String.format("%.2f",((cont_men*100)/(double)contador));
            texto += "\nQuantidade de Mulhere "+cont_femi+" percentual: "+String.format("%.2f",((cont_femi*100)/(double)contador));
            texto += "\nO número de funcionários com idade entre 18 a 26 anos "+idade_18a26;
            texto += "\nO número de funcionários com idade entre 27 a 40 anos "+idade_27a40;
            texto += "\nO número de funcionários com idade entre 41 a 50 anos "+idade_41a50;
            texto += "\nO número de funcionários com idade maior de 50 anos "+idade_50;
            while(contcarg<9){
                texto += "\nCargo "+cargo[contcarg]+" com ";
                if(contcarg==0){
                    texto += cargo1+" colaboradores sendo percentual "+String.format("%.2f",((cargo1*100)/(double)contador));
                }
                if(contcarg==1){
                    texto += cargo2+" colaboradores sendo percentual "+String.format("%.2f",((cargo2*100)/(double)contador));
                }
                if(contcarg==2){
                    texto += cargo3+" colaboradores sendo percentual "+String.format("%.2f",((cargo3*100)/(double)contador));
                }
                if(contcarg==3){
                    texto += cargo4+" colaboradores sendo percentual "+String.format("%.2f",((cargo4*100)/(double)contador));
                }
                if(contcarg==4){
                    texto += cargo5+" colaboradores sendo percentual "+String.format("%.2f",((cargo5*100)/(double)contador));
                }
                if(contcarg==5){
                    texto += cargo6+" colaboradores sendo percentual "+String.format("%.2f",((cargo6*100)/(double)contador));
                }
                if(contcarg==6){
                    texto += cargo7+" colaboradores sendo percentual "+String.format("%.2f",((cargo7*100)/(double)contador));
                }
                if(contcarg==7){
                    texto += cargo8+" colaboradores sendo percentual "+String.format("%.2f",((cargo8*100)/(double)contador));
                }
                if(contcarg==8){
                    texto += cargo9+" colaboradores sendo percentual "+String.format("%.2f",((cargo9*100)/(double)contador));
                }
                contcarg++;

            }
            texto += "\nFuncionario com maior salário "+nmaiorsalario;
            texto += "\nFuncionario com menor salário "+nmenorsalario;
            texto += "\nFuncionarios que aderem ao clube "+adclube+" com percentual "+String.format("%.2f",((adclube*100)/(double)contador));
        }else{
            texto = "Nenhum dado foi adicionado";
        }
        
        JOptionPane.showMessageDialog(null, texto);
    } 
}