import java.util.Scanner;
	public class Ex54
		{
		public static void main(String[] args)
			{

			Scanner ler = new Scanner(System.in);

			int nuM=0, somaNum=0;

				do{
					System.out.println("Digite os numeros para descobrir a soma de todos");
					nuM=ler.nextInt();

					if(nuM!=0)
					{

					if(nuM>5)

					somaNum=somaNum+nuM;

					else
						System.out.println("digito invalido entre com um numero acima de 5");


					}
				}
				while (nuM!=0);

					System.out.println("entre com os numeros e some os se forem maiores que 5	:" + somaNum);
			}
		}