import java.util.Scanner;
	public class Ex40{

		public static void main(String[] args)
	{

			int num, quanTpos=0, quanTneg=0, somaPos=0, somaNeg=0, mediaPos, mediaNeg;

			Scanner ler = new Scanner(System.in);

			for (int i=0; i<5;)
			{


				System.out.println("Entre com numeros inteiros:");
				num=ler.nextInt();

				if (num!=0)
				{

					if (num>0)
					{
						quanTpos++;
						somaPos=somaPos+num;
					}
					else
					{
						quanTneg++;
						somaNeg=somaNeg+num;
					}
				i++;
				}
				else
				{
				System.out.println("Digito invalido");
				i++;
				i--;
				}
			}
			mediaPos=somaPos/quanTpos;
			mediaNeg=somaNeg/quanTneg;

				System.out.println("A media dos valores positivos é: " + mediaPos);
				System.out.println("A Media dos valores negativos é: " + mediaNeg);
	}
}