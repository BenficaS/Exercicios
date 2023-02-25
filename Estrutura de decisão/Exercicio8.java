import java.util.Scanner;
	public class Exercicio8{

		public static void main(String[] args){

		Scanner ler = new Scanner (System.in);

		int valA, valB, valC, valMedia;

		System.out.println("Entre com os numeros para serem somados:");
		valA = ler.nextInt();
		valB = ler.nextInt();
		valC = ler.nextInt();

	    valMedia = (valA+valB+valC)/3;

	    System.out.println("A media é:" + valMedia);



		}
	}