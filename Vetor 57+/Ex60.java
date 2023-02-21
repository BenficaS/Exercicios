import java.util.Scanner;
	public class Ex60{
		public static void main(String[] args){

			Scanner ler = new Scanner(System.in);

			String [] vetNome = new String[8];
			String [] vetNome1 = new String[8];

			int i, aux=7;

			for(i=0;i<vetNome.length;i++){

			System.out.println("Entre com 8 nomes: ");
			vetNome[i]=ler.nextLine();

			}
			for(i=0;i<vetNome1.length;i++){

				vetNome1[i]=vetNome[aux];

				aux--;

				System.out.println("Os valores invertidos são " + vetNome1[i]);
			}

		}
	}