import java.util.Scanner;
    public class Exercicio22 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int valA , valB;

        System.out.println("Entre com 2 valores");
        valA=ler.nextInt();
        valB=ler.nextInt();

        if(valA<valB){
            System.out.println("o valor dos numeros digitados em ordem decrescente é: " + valB + "  " + valA);
        }

        else
            System.out.println(" os numeros são: " + valA+ "  " + valB);
           ler.close(); 
    }
    
}
