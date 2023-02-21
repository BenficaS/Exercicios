package Estruturadedecisão;

import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double num;
        System.out.println("entre com um numero e descubra se ele se encontra em um dos intervalos: ");
        num=ler.nextDouble();

        if(num>=0&&num<=25){
            System.out.printf("o numero encontra-se dentro de intervalo de 0 a 25: %.2f\n", num);
        }
        else if(num>25&&num<=50){
            System.out.printf("o numero se encontra dentro do intervalo de 25.50 a 50.70 : %.2f\n",num);
        }
        else if (num>50&&num<=75){
            System.out.printf("o numer encontra-se no intervalo de 50 a 75: %.2f\n", num);
        }
        else if (num>75&&num<=100){
            System.out.printf("o numero encontra-se dentro do intervalo de 75 a 100 :   %.2f\n", num);
        }
        else {
            System.out.println("o numero encontra-se fora dos intervalos validos de 0 - 100");
        }
    }

}
