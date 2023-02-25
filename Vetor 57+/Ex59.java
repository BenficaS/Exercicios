import java.util.Scanner;
	public class Ex59{
		public static void main(String[]args){
			Scanner ler = new Scanner(System.in);

			String[] vetNome = new String[8];

			int i;

			for(i=0;i<vetNome.length;++i){

			System.out.println("entre com nome:");
			vetNome[i]=ler.nextLine();

			}
			for(i=vetNome.length-1;i>-1;--i){
			System.out.println("os nomes digitados foram: " + vetNome[i]);
			}
		}
	}
