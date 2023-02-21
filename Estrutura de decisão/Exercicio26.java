import java.util.Scanner;
	public class Exercicio26{

		public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		double valV , lucro , valC;

		String nome;

		System.out.println("Entre com o nome do produto" );
		nome=ler.nextLine();
		System.out.println("Entre com o valor do produto");
		valC=ler.nextDouble();

		if (valC<100)
		{
			lucro=valC*70/100;
				valV=lucro+valC;
				System.out.println("o nome do produto é " + nome + "O valor do pruduto " + valC + "O valor de venda + o lucro é: " + valV);
		}
		else if (valC>=100&&valC<=200)
		{
			lucro=valC*50/100;
			 	valV=lucro+valC;
				System.out.println("o nome do produto é " + nome + "O valor do pruduto " + valC + "O valor de venda + o lucro é: " + valV);
		}
		else
		{
			lucro=valC*30/100;
				valV=lucro+valC;
				System.out.println("o nome do produto é " + nome + "O valor do pruduto " + valC + "O valor de venda + o lucro é: " + valV);
		}
		}
	}
