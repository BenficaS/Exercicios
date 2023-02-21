package Estruturadedecisão;

import java.util.Scanner;
public class Exercicio8 {
    public static  void main(String[]args){
        Scanner ler = new Scanner(System.in);
        double salario,result;
        System.out.printf("entre com o valor do seu salario : ");
        salario=ler.nextDouble();
        if(salario>0&&salario<2000){
            System.out.printf(" o cidadão é isento.");
        }
        else if (salario>2000.01&&salario<3000.00){
            salario=(salario*8)/100;
            result=salario;
            System.out.printf("o valor do imposto a ser pago é  de  %.2f : " , result);
        }
        else if(salario>3000.01&&salario<4500.00){
            salario=(salario*18)/100;
            result=salario;
            System.out.printf("o valor a ser pago de sua faixa salarial é  %.2f : " , result);
        }
        else {
            salario=(salario*28)/100;
            result=salario;
            System.out.printf("o valor a ser pago é de : %.2f " , result);

        }
    }
}
