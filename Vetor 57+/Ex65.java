import java.util.Scanner;
	public class Ex65{
		public static void main(String[] args){

			int i ;
			int [] nuM = new int[6];
			int [] resulT = new int[6];

			Scanner ler = new Scanner(System.in);

			for(i=0;i<5;i++){
				System.out.println("digite 5 numeros");
				nuM[i]=ler.nextInt();

				if(i%2==1)
				nuM[i]*=10;
				resulT[i]=nuM[i];

			}
			for(i=0;i<5;i++){

			System.out.println("O resultado é:  " + resulT[i]);
			}

		}
	}

