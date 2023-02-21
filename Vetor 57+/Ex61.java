import java.util.Scanner;
	public class Ex61{
		public static void main(String[]args){

			Scanner ler = new Scanner(System.in);

			String [] nuM1 = new String[10];
			String [] nuM2 = new String[10];
			String [] resulT= new String[20];

			int i ,aux=10;

			for(i=0;i<10;i++){

			System.out.println("Entre com os nomes do primeiro vetor");
			nuM1[i]=ler.nextLine();

			System.out.println("Entre com os nomes do segundo vetor");
			nuM2[i]=ler.nextLine();
			}
			for(i=0;i<20;i++){

			resulT[i]=nuM1[i];
			resulT[aux]=nuM2[i]; // na posição 10 o aux começara a acumular os numeros do segundo vetor;

			aux++;
			}
			for(i=0;i<20;i++){

			System.out.println("O resultado será:" + resulT);
			}
		}
	}