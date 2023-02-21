package Estruturadedecisão;

import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cod = -11, produto;
        double cachorro = 4.50, salad = 4.50, bacon = 5.00, torra = 2.00, refri = 1.50;
        while (cod != 0) {
            System.out.println("Entre com o codigo do produto ou digite 0 para finalizar a operacação:  ");
            cod = ler.nextInt();


            if (cod == 1) {
                System.out.println("o produto é cachorro quente entre com a quantidade de itens: ");
                cod = ler.nextInt();
                cachorro = cachorro * cod;
                System.out.println("o valor do produto é : " + cachorro);
            }
            else if (cod == 2) {
                System.out.println("O produto é X - salada entre com a quantidade de itens : ");
                cod = ler.nextInt();
                salad = salad * cod;
                System.out.println(" O valor da salada foi de : " + salad);
            }
            else if (cod == 3) {
                System.out.println("o produto escolhido foi X-Bacon entre com a quantidade de itens : ");
                cod = ler.nextInt();
                bacon = bacon * cod;
                System.out.println("O valor do X-bacon é de : " + bacon);
            }
            else if (cod == 4) {
                System.out.println("o produto escolhido é torrada entre com a quantidade : ");
                cod = ler.nextInt();
                torra = torra * cod;
                System.out.println("o valor da torrada a se pagar é de : " + torra);
            }
            else if (cod == 5) {
                System.out.println("o produto escolhido foi refrigerante  entre com a quantidade : ");
                cod = ler.nextInt();
                refri = refri * cod;
                System.out.println("O valor do produto é refrigerante a se pagar é  : " + refri);
            }
            else
                System.out.println("digito invalido");
        }
        System.out.println("obrigado por utilizar nosso sistema.");
    }
}







