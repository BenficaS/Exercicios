import java.util.Scanner;
	public class Ex45{

		public static void main(String[] args){

			Scanner ler = new Scanner(System.in);

			int nuM=99, contPar=0, contImpar=0, somA=0;

			while(nuM!=-1){

			System.out.println("Entre com os numereos:");
			nuM=ler.nextInt();

			if (nuM%2==0)

				contPar++;


			if(nuM%2==1)
				somA=somA+nuM;


			}
			System.out.println("A quantidade de numeros pares são: " + contPar);
			System.out.println("A soma dos numeros impares são: " + somA);
		}
	}