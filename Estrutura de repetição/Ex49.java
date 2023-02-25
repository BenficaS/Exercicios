import java.util.Scanner;
	public class Ex49{

		public static void main(String[] args){

			Scanner ler = new Scanner(System.in);

			int nuM=99, contNeg=0, somaPos=0;

			while(nuM!=0){

			System.out.println("Entre com os numereos:");
			nuM=ler.nextInt();

			if (nuM>0)

				somaPos=somaPos+nuM;


			if(nuM<0)
				contNeg++;


			}
			System.out.println("A quantidade de numeros negativos são: " + contNeg );
			System.out.println("A soma dos numeros positivos são: " + somaPos);
		}
	}