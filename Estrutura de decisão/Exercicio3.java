import java.util.Scanner;

public class Exercicio3{



	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);

		double num, quadrado;

		System.out.println("Entre com um numero para calcular seu quadrado e sua raiz:");
		num = entrada.nextDouble();

		quadrado = Math.pow(num,2);
		double raiz = Math.sqrt(num);

		System.out.println("O quadrado do numero " + num +" é: " + quadrado);
		System.out.println("o raiz quadrado do numero " + - num + " é: " + raiz);
	}
}
