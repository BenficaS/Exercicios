import java.util.Scanner;
	public class Exercicio14{

		public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int valA;

		System.out.println("Digite um numero:");
		valA=ler.nextInt();

		if (valA==0)
			System.out.println("O numero é nulo");

		else if (valA%2==0)
			System.out.println("O numero é par");

		else
			System.out.println("O numero é impar");


		}
	}