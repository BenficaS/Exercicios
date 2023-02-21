package Estruturadedecisão;

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int inicio, fim, duracao=0;
        System.out.println("entre com a hora final do jogo : ");
        inicio=ler.nextInt();
        System.out.println("entre com o horario do inicio do jogo : ");
        fim=ler.nextInt();
        if(inicio<fim) {
            duracao = inicio - fim;
            System.out.println("o jogo durou : " + duracao);
        }
        else{
            System.out.println("o jogo teve a duração : " + duracao + " horas.");
        }
    }
}
