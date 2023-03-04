package Estruturarepeticao;
import java.util.Scanner;
public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int senha=0;

        while (senha != 2002) {
            System.out.printf("Entre com a senha.");
            senha=ler.nextInt();


            if (senha == 2002) {
                System.out.println("Acesso permitid.");
            } else
                System.out.println("Senha invalida.");
        }
    }
}
