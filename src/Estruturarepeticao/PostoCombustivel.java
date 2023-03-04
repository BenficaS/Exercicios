package Estruturarepeticao;
import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero=0,alcool=0,gasolina=0,diesel=0;
        while (numero !=4){
            System.out.println("Escolha o combustivel a abastecer 1 alcool, 2 gasolina, 3 diesel.");
            numero=ler.nextInt();

            if (numero == 1){
                System.out.println("Você escolheu alcool.");
                alcool++;
            }
            else if(numero == 2){
                System.out.println("Você escolheu gasolina.");
                gasolina++;
            }
            else if (numero == 3){
                System.out.println("Você escolheu diesel.");
                diesel++;
            }

            else
                System.out.println("Digito invalido.");

        }
        System.out.println("Muito obrigado por utilizar nosso sistema.");
        System.out.println("Alcool :"+ alcool);
        System.out.println("Gasolina :" + gasolina);
        System.out.println("Diesel: :" + diesel);

    }
}
