import java.util.Scanner;
	public class Exercicio23{

		public static void main(String[] args){

			int resulN, valA, valB, valC;

				Scanner ler = new Scanner(System.in);

				System.out.println("Entre com os lados: ");
				valA=ler.nextInt();
				valB=ler.nextInt();
				valC=ler.nextInt();

				if (valA<(valB+valC)&&valB<(valC+valA)&&valC<(valA+valB)){
					if (valA==valB&&valB==valC)
						System.out.println("O Triangulo � equilatero");
					else if (valA==valB||valB==valC||valA==valC)
						System.out.println("O Triangulo � is�sceles");
					else
						System.out.println("O Triangulo � escaleno.");
				}
				else
					System.out.println("os valores n�o correspondem a um triangulo");
		}
	}