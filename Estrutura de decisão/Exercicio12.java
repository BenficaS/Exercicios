import java.util.Scanner;
	public class Exercicio12{

		public static void main(String[] args){

			Scanner ler = new Scanner(System.in);

			int valA;

			System.out.println("Entre com o numero: ");
			valA=ler.nextInt();

			if (valA>0)
				System.out.println("O numero em questão é positivo: ");

			else
				System.out.println("O numero em questão é negativo: ");
		}
	}