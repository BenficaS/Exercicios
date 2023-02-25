import java.util.Scanner;
public class Exercicio67 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

    //Faça  um  algoritmo  que  armazene  as  descrições  de  5  produtos,  armazene
    //também os preços de venda dos mesmos.
    //Atualize os preços de venda aplicando  o percentual de 10%. Imprima as
    //descrições e seus novos preços de venda.
        double [] vetpreco = new double [5];
        String [] produto = new String [5];

        int i=0;
        double porcent=0;

        for(i=0;i<5;i++){
        System.out.println(" Entre com o nome do produto");
        produto[i]=ler.next();
        System.out.println(" entre com o preço do produto");
        vetpreco[i]=ler.nextDouble();

        porcent=vetpreco[i]*10/100;
        vetpreco[i]=vetpreco[i]+porcent;
        }
        for(i=0;i<5;i++){
            System.out.println(produto[i]);
            System.out.printf("     %.2f\n" , vetpreco[i]);

        }




    }
}
