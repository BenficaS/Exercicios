import java.util.Scanner;
	public class Ex35
		{

		public static void main(String[] args)
			{
			Scanner ler = new Scanner(System.in);

			int num, poS=0, cnT=1;

			System.out.println("Entre com 10 numero: ");

			while (cnT<=10)
			{
			num=ler.nextInt();

				if (num<=40)
					poS=poS+num;


			cnT++;
			}

			System.out.println("O valor dos numeros inferiores a 40 é: " + poS);
			}
		}


