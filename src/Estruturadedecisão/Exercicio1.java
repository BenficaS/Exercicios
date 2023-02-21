package Estruturadedecisão;

import java.util.Scanner;
public class Exercicio1{
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        int num;
        System.out.println("entre o numero e descubra se o numero é positivo ou negativo");
        num=ler.nextInt();

        if(num<0)
            System.out.println("o numero é negativo");
            else
            System.out.println("o numero é positivo");


    }
}