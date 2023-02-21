import java.util.Scanner;
	public class Exercicio15{

		public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		String timE1, timE2;

		int goL1 , goL2;

		System.out.println("Coloque o nome dos time1 :");
		timE1=ler.nextLine();

		System.out.println("Coloque o nome do time2 :");
		timE2=ler.nextLine();

		System.out.println("Coloque os gols do time1 :");
		goL1=ler.nextInt();

		System.out.println("Coloque os gols do time2 :");
		goL2=ler.nextInt();

		if (goL1>goL2)
			System.out.println("Time vencedor é " + timE1);

		else if (goL1==goL2)
			System.out.println("Empate");

		else
			System.out.println("Time Vencedor é" + timE2);


		}
	}