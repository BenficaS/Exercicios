import java.util.Scanner;
	public class Ex37
	{

		public static void main(String[] args)
		{

			Scanner ler = new Scanner(System.in);

			int par=0, imp=0, num, cnT=0;

			System.out.println("Entre com 10 numeros: " );

				while (cnT<10)
				{


					num=ler.nextInt();

					if (num%2==0)
						par=par+1;

					else if(num%2==1)
						imp=imp+1;

					cnT++;
				}
					System.out.println("A quantidade de numeros pares é: " + par);

					System.out.println("A quantidade de numeros impares: " + imp);
		}
	}
