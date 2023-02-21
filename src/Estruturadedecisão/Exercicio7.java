package Estruturadedecisão;

import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[]args){
        Scanner ler = new Scanner (System.in);
        double val = 0, val1=0;
        System.out.printf("entre com o primeiro valores e descubra em qual parte do plano ele está :" );
        val=ler.nextDouble();
        System.out.printf("entre com o segunda valor e e destaque onde ele se encontra : /n");
        val1=ler.nextDouble();

        if(val==0&&val1==0) {
            System.out.printf("O valor se encontra no ponto de origem %.2f/n :" );
        }
        else if (val<0&&val1<0) {
            System.out.printf("o valor se encontra no plano Q1");
        }
        else if(val>0&&val1>0) {
                System.out.printf("o valor se encontra no plano Q2 ");
        }
        else if (val<-4&&val1<-10) {
            System.out.printf("O Valor se encontra no quadrante Q3");

        }
        else {
            System.out.printf("o valor se encontra no quadrante Q4");
        }
    }
}

