package Estruturadedecisão;

import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int valA, valB;
        System.out.println(" Entre com um valor e descubra se o numero é multiplos entre sí");
        valA=ler.nextInt();
        valB=ler.nextInt();
        if(valA % valB ==0 && valB % valA ==0)
        System.out.println("os numeros são multiplos");
        else
        System.out.println("os numeros não sao multiplos");


    }
}
