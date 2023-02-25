import java.util.Scanner;
    public class Exercicio21 { 
        public static void main(String[]args){
            Scanner ler = new Scanner(System.in);
            int valA, valB;

            System.out.println("Entre com 2 numeros em ordem crescente");
            valA=ler.nextInt();
            valB=ler.nextInt();

            if(valA>valB){
            System.out.println("os numeros em ordem crescente são: " + valB  + "  " + valA);
            }
            else
                System.out.println("os numeros são   :"  + valA + "  " + valB);
                ler.close();
        }
    }

