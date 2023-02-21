import java.util.Scanner;

	public class Exercicio9{

		public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		double altura, base, area;

		System.out.println("Entre com dois numeros para calcular a area");
		altura = ler.nextInt();
		base = ler.nextInt();

		area = (base + altura)/2;

		System.out.println("O valor a area é:" + area);



		}
	}


