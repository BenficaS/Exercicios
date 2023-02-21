import java.util.Scanner;
	public class Ex29{

		public static void main(String[] args){


		Scanner ler = new Scanner(System.in);

		int mes;

		System.out.println("Entre com o numero do mês e descubra quantos dias ele tem ");
		mes=ler.nextInt();

		switch (mes){
			case 2:
				System.out.println("O mes tem 29/28 dias");
			break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("Os meses tem 31 dias");
			break;
			case 4: case 6: case 9: case 11:
				System.out.println("O mes tem 30 dias");
			break;

			default:
				System.out.println("digito invalido");
		}
		}
	}