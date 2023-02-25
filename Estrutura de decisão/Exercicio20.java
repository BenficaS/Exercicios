 import  java.util.Scanner;
    public class Exercicio20 {
        public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
    
        int valorA=0, valorB=0, soma=0,multi=0;
        
        System.out.println("Digite 2 valores");
        valorA=ler.nextInt();
        valorB=ler.nextInt();

        if(valorA==valorB){
            soma=valorA+valorB;
            System.out.println("O valor de soma é: " + soma);
        }
        if(valorA!=valorB){
            multi=valorA*valorB;
            System.out.println("O valor da multiplicaçãoé " + multi);
        }

            
      ler.close();  
    }
}
