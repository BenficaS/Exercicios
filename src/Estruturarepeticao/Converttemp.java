package Estruturarepeticao;

import java.util.Scanner;

public class Converttemp {
    public static void main(String[] args) {
        String nao="aa";
        Scanner ler = new Scanner(System.in);
        double c , f;
        do {
            System.out.println("entre com a temperatura em C: ");
            c=ler.nextDouble();
            c=(c*(1.8)+ 32.0);
            System.out.printf("a temperatura em F é : %.2f%n" , c);
            System.out.print("deseja repetir a operação s/n.");
            nao= ler.next();
        }while (!"n".equals(nao));
        System.out.println("obrigado por utilizar nosso conversor.");
    }
}