import java.util.Scanner;
public class Exercicio11 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double caR, cC, iD, imP;

		System.out.println("Entre com o valor de fabrica do carro: ");
		caR=ler.nextDouble();

		iD=(caR*12)/100;
		imP=(caR*45)/100;

		cC=caR+iD+imP;

		System.out.printf("O custo ao consumidor é %2.2f ", cC);
	}
}