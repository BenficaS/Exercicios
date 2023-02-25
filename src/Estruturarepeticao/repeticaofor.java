package Estruturarepeticao;
import java.util.Scanner;

public class repeticaofor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont, num,result=0;
        for (cont=0;cont<=4;cont++){
            System.out.println("entre com seus numeros: ");
            num= ler.nextInt();
            result+=num;

        }
        System.out.println("o resultado da soma é: " + result);

    }
}
