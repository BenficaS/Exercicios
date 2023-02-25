import java.util.Scanner;
	public class Exercicio17{

		public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int valA;

		System.out.println("Entre com a idade do nadador: ");
		valA=ler.nextInt();

		if (valA>=5&&valA<=12)
			System.out.println("O nadador é da categoria infantil.");
		else if(valA>=13&&valA<=17)
			System.out.println("O nadador é da categoria juvenil.");
		else if(valA>=18&&valA<=25)
			System.out.println("O nadador é da categoria profissional.");
		else
			System.out.println("O nadador está fora da faixa.");

		}
	}