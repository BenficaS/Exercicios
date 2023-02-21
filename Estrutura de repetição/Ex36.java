import java.util.Scanner;
	public class Ex36
	{

		public static void main(String[] args)
		{


			Scanner ler = new Scanner(System.in);

			int cnT=0, idade, maior=0, menor=0;

			System.out.println("Entre com a idade de 10 pessoas: ");

			while (cnT<10)
			{


				idade=ler.nextInt();

				if (idade<21)
					menor=menor+1;

				else if(idade>50)
					maior=maior+1;
				cnT++;
			}
			System.out.println("O total de pessoas menores de 21 anos são: " + menor);

			System.out.println("o total de pessoas com 50 anos: " + maior);
		}
	}