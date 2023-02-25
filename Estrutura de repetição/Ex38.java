import java.util.Scanner;
	public class Ex38
	{

		public static void main(String[] args)
		{

			int cnT=1 ,poS=0, neG=0, num, somaP=0, somaN=0;

			Scanner ler = new Scanner (System.in);

			while (cnT<=15)
			{
				System.out.println("Entre com " + cnT + " valores inteiros:  ");

				num=ler.nextInt();

				if (num<0)
				{
					neG=neG+1;
					somaN=somaN+num;
				}
				else if	(num>0)
				{
					poS=poS+1;
					somaP=somaP+num;
				}
				else
					System.out.println("O numero zero não pode ser aceito.");

				cnT++;
			}
					System.out.println("A quantidade de numeros positivos é " + poS + " e a soma dos numeros é: " + somaP);

					System.out.println("A quantidade de numeros negativos é " + neG + " e a soma dos numeros negativos é: " + somaN);
		}
	}