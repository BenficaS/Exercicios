import java.util.Scanner;
    public class Exercicio63 {
        public static void main(String[] args) {
            int [] vetNum = new int [5];
            int i=0, menor=0, posicao=0;
            Scanner ler = new Scanner(System.in);

            /// Escreva  um  algoritmo  que  leia  um  array  de  5  elementos  inteiros.  Encontre  e mostre o menor elemento e sua posição no array.
            for(i=0;i<5;i++){
                System.out.println("Entre com os numeros e descubra qual é o de menor valor:  ");
                vetNum[i]=ler.nextInt();
                
            }
            for(i=0;i<5;i++){
                menor=vetNum[0];
                
                if(menor>vetNum[i]){

                    menor=vetNum[i];
                    posicao=i;
                }
            }
            System.out.println("o menor numero é: " + menor + " e sua posição é: " + posicao);
        }
    
}
