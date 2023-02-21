import java.util.Scanner;
	public class Ex34{

		public static void main(String[] args){

			Scanner ler = new Scanner(System.in);

			int conT=0, num, poS=0, neG=0;

			System.out.println("Entre com 10 numeros: ");

			while (conT<10){

				num=ler.nextInt();

					if(num>=0)
						poS=poS+num;
					else
						neG=neG+num;
			conT++;
			}
				System.out.println("A soma dos numeros positivos são: " + poS);

				System.out.println("A soma dos numeros negativos são: " + neG);
		}
	}