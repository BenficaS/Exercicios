import java.util.Scanner;
	public class Ex58{

		public static void main(String[] args){

			Scanner ler = new Scanner(System.in);

			int i=0 ;
			int [] numVet1 = new int[10];
			int [] numVet2 = new int[10];
			int [] numVet3 = new int[10];


			for(i=0;i<10;i++){

			System.out.println("entre com a primeira coluna de vetor:" );
			numVet1[i]=ler.nextInt();

			}
			for(i=0;i<10;i++){
			System.out.println("entre com a segunda  coluna de vetor:" );
			numVet2[i]=ler.nextInt();

			numVet3[i]+=numVet1[i]+numVet2[i];
			}
			for(i=0;i<10;i++){
			System.out.println("A soma dos vetores é :" + numVet3[i] + " ");


			}

		}
	}