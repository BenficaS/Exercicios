import java.util.Scanner;
	public class Exercicio16{

		public static void main(String[] args){

		Scanner ler = new Scanner (System.in);

		int valA;

		System.out.println("insira o numero:");
		valA=ler.nextInt();

		if (valA%5==0)
			System.out.println("O numero � divisivel por 5");
		else
			System.out.println("O numero n�o � divisivel por 5");
		}
	}