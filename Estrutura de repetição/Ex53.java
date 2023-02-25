import java.util.Scanner;
	public class Ex53{

		public static void main(String[] args){

			Scanner ler = new Scanner(System.in);

			int nuM=0, meD=0, somA=0, quant=0;

			do{

			System.out.println("Entre com o numero e digite o zero <0> para finalizar");
			nuM=ler.nextInt();

			if(nuM!=0){

			quant++;
			somA=somA+nuM;

			}
			}
			while(nuM!=0);
			meD=somA/quant;

				System.out.println("a media é: " + meD);
		}
	}