import java.util.Scanner;
	public class Ex56{
		public static void main(String[]args){

		Scanner ler = new Scanner(System.in);

		int nuM=0, somaP=0, somaN=0, numP=0, numNeg=0, i=0;

		do{
			System.out.println("digite 15 numeros :" );
			nuM=ler.nextInt();

			if(nuM!=0){


			if(nuM>0){

				somaP++;
				numP=numP+nuM;
			}
			if(nuM<0){

				somaN++;
				numNeg=numNeg+nuM;
			}
			}
			else{

				System.out.println("Digito invalido n�o digite 0");
			i--;
			}
			i++;
		}
		while (i<15);

			System.out.println("A Quantidade de numeros positivos � :" + somaP);
			System.out.println("A soma dos numeros positivos � : "+ numP);
			System.out.println("A Quantidade de numeros negativos � :" + somaN);
			System.out.println("A soma dos numeros negativos � : " + numNeg);
	}
	}