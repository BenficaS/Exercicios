import java.util.Scanner;
public class Exercicio62 {
    public static void main(String[] args) {

        double [] numValor = new double [10];
        double [] result = new double [10];
        
        Scanner ler = new Scanner(System.in);
        int i=0;
        double porcenT=0;
        
        
        for(i=0;i<10;i++){
                    System.out.println("entre com o valor do " + i + " e obtenha o valor com 10 porcento de acrescimo: ");
                    numValor[i]=ler.nextDouble();
                    porcenT=numValor[i]*10/100;
                    result[i]=numValor[i] + porcenT;
        
        }
        System.out.println("imprimindo vetor atualizado:");
        for(i=0;i<10;i++){
            double f;
            f=result[i];
        System.out.printf("%.2f        " ,  f );
        }
    }
    
}
