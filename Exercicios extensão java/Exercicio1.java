import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {

        int val1, val2, val3, val4,result;

        Scanner ler = new Scanner(System.in);

        System.out.println("digite o numero 1:  \n");
        val1 = ler.nextInt();
        System.out.println("digite o numero 2; \n");
        val2 = ler.nextInt();
        System.out.println("digite o numero 3;  \n");
        val3 = ler.nextInt();
        System.out.println("digite o numero 4;  \n");
        val4 = ler.nextInt();
        result=+val1+val2+val3+val4;

        System.out.println("a soma dos numeros = " + result);
    }
}
