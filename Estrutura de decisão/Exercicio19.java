import java.util.Scanner;
	public class Exercicio19{

		public static void main(String[] args){

			Scanner ler = new Scanner(System.in);

			int valA;

			System.out.println("informe sua idade para descobrir sua classe eleitoral:");
			valA=ler.nextInt();

			if (valA<=16)
			System.out.println("Não eleitor");

			else if(valA>=18&&valA<=65)
			System.out.println("Eleitor obrigatorio");

			else
			System.out.println("O eleitor é facultativo");
		}
	}

