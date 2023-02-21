import java.util.Scanner;
	public class Ex39
	{

		public static void main(String[] args)
		{

			Scanner ler = new Scanner(System.in);

			int num, somaPar=0, quanTpar=0, somaImpar=0, quanTimpar=0;

			for (int i=1; i<=10;)
			{

				System.out.println("Entre com o "+i+"° numero: ");

				num=ler.nextInt();

				if(num!=0)
				{

					if(num%2==0)
					{
						quanTpar++;
						somaPar=somaPar+num;
					}

					if(num%2==1)
					{
						quanTimpar++;
						somaImpar=somaImpar+num;
					}
				i++;
				}
				else
					System.out.println("Digito invalido");
			}
					System.out.println("A quantidade de numeros pares é: " + quanTpar);
					System.out.println("A soma dos numeros pares é:" + somaPar);
					System.out.println("A Quantidade de numeros impares é:" + quanTimpar);
					System.out.println("A soma dos numeros impares é:" + somaImpar);
		}
	}