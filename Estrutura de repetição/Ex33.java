import java.util.Scanner;
	public class Ex33
	{

		public static void main(String[] args)
		{

			double conT=0 , num, dobro, meD, soma=0;

			Scanner ler = new Scanner(System.in);

			System.out.println("Entre com os 5 numeros: ");

			while (conT<5)
			{

				num=ler.nextDouble();
				soma=soma+num;

			conT++;
			}
			meD=soma/5;
			dobro=soma*2;

			System.out.printf("o resultado da soma: %.2f\n" , soma);

			System.out.printf("o resultado da media: %.2f\n" , meD);

			System.out.printf("o resultado do dobro: %.2f\n", dobro);
		}
	}