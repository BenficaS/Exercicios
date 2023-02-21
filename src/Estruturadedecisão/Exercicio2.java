package Estruturadedecisão;

import java.util.Scanner;
 public class Exercicio2 {
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         int num;
         System.out.println("entre com um numero e descubra se ele é par ou impar");
         num=ler.nextInt();
         if (num %2==0)
             System.out.println("o numero é par");
         else
             System.out.println("o numero é impar");
     }
}
