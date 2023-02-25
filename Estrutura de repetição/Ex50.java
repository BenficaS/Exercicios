import java.util.Scanner;
	public class Ex50{

		public static void main(String[] args){

			Scanner ler = new Scanner(System.in);

			String nomE="aa";

			int valProdut=0, preçO=0, quanT=0, valT=0;

			while(!"FIM".equals(nomE)){
				System.out.println("Entre com o nome do produto:");
				nomE=ler.nextLine();

				if(!"FIM".equals(nomE)){
				System.out.println("Entre com o valor do produto:");
				valProdut=ler.nextInt();
				System.out.println("Entre com a quantidade de produtos:");
				quanT=ler.nextInt();

				valT=valProdut*quanT;

				System.out.println("O valor total do produto é : " + valT);

				}
				ler = new Scanner(System.in);
			}
		}
	}