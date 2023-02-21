import java.util.Scanner;
    public class Exercicio64 {
        public static void main(String[] args) {
            //Escreva  um  algoritmo  que  leia  um  array  de  5  elementos  inteiros.  Solicite  ao
            //usuário a digitação de um número e verifique se o mesmo se encontra no vetor.
            //Se  sim,  avise  o  que  o  número  foi  encontrado  e  sua  posição,  caso  contrário
            // informe que o número não se encontra no vetor.

            Scanner ler = new Scanner(System.in);

            int [] vetNum = new int [5];

            int i=0, num=0;

            for(i=0;i<vetNum.length;i++){

                System.out.println("entre com 5 numeros e descubra se ele se encontra no vetor: ");
                vetNum[i]=ler.nextInt();
                }
                System.out.println("entre com um numero e descubra se ele se encontra no vetor: ");
                num=ler.nextInt();

            for(i=0;i<vetNum.length;i++){
                if(vetNum[i]==num){

                    System.out.println(" numero encontrado, a posição é " + i);
                }
                else
                    System.out.println(" o numero digitado não esta armazenado no vetor.");
            }
        }


    }




