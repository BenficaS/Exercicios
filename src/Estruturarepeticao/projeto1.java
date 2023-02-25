package Estruturarepeticao;

import java.util.Scanner;

public class projeto1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = -10, result = 0;
        while (num != 0) {

            System.out.println("digite um numero");
            num = ler.nextInt();
            result += num;

        }

        System.out.println("o resultado da soma é" + result);

    }
}
