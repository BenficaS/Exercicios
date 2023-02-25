import java.util.Scanner;
	public class Exercicio18{

		public static void main(String[] args){

			Scanner ler = new Scanner(System.in);

			double salarioA, valA, valB, valC;

			System.out.print("Entre com o salario do funcionario.R$:");
			salarioA=ler.nextDouble();

			valA=(salarioA*15)/100;
			valB=(salarioA*10)/100;
			valC=(salarioA*5)/100;

			if (salarioA<500.00)
			System.out.println("O reajuste salarial será de R$:" + valA + " O valor total do reajuste será R$:" + (salarioA+valA));

			else if (salarioA>=500.000&&salarioA<=1000.00)
			System.out.println("O reajuste salarial será de R$:" + valB + " O valor total do reajuste será R$:" + (salarioA+valB));

			else
			System.out.println("O reajuste salarial será de R$:" + valC + " O valor total do reajuste será R$:" + (salarioA+valC));
		}
	}