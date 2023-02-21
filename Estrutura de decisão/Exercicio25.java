import java.util.Scanner;
	public class Exercicio25{

		public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int idadE;

		System.out.println("Entre com a idade: ");
		idadE=ler.nextInt();

		if (idadE<18)
			System.out.println("Menor de idade");

		else if (idadE>=18&&idadE<65)
			System.out.println("Maior de idade");

		else
			System.out.println("Idoso");


		}
	}