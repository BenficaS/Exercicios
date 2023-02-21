import java.util.Scanner;
	public class Exercicio13{

		public static void main(String[] args){

			Scanner ler = new Scanner(System.in);

			int valA;

			System.out.println("Insira o numero: ");
			valA=ler.nextInt();

			if (valA<0)
				System.out.println("O numero é negativo");

			else if (valA==0)
				System.out.println("O numero é nulo");

			else
				System.out.println("O numero é positivo");

			}
		}