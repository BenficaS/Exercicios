import java.util.Scanner;
	public class Exercicio24{

		public static void main(String[] args){

			int valA, valB, somA;

				Scanner ler = new Scanner(System.in);

				System.out.println("Entre com 2 valores:");
				valA=ler.nextInt();
				valB=ler.nextInt();

				somA=valB+valA;

				if 	(somA>10)

						System.out.println("o valor da adição é " + somA);
				else
						System.out.println("o valor é inferior a 10.");
		}
	}