import java.util.Scanner;
	public class Exercicio10 {


		public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		float  kmL, volC, cM;

		System.out.println("Entre com a distancia total percorrida: ");
		kmL=ler.nextFloat();
		System.out.println("Entre com o volume de combustivel: ");
		volC=ler.nextFloat();

		cM=kmL/volC;

		System.out.printf("O resultado do consumo Medio é: %.3f" , cM);

		}
	}