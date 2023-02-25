import java.util.Scanner;
	public class Ex55{
		public static void main(String[] args){

			Scanner ler = new Scanner(System.in);

			String descriprodutO="aa";

			int quantProdu=0, precoUnit=0,somA=0;

			do{
				System.out.println("Entre com o nome do produto");
				descriprodutO=ler.next();

				if(!"FIM".equals(descriprodutO)){
				System.out.println("Entre com o valor unitario do produto");
				precoUnit=ler.nextInt();
				System.out.println("digite a quantidade de produtos");
				quantProdu=ler.nextInt();

				somA=somA+precoUnit*quantProdu;

				}

			}
			while(!"FIM".equals(descriprodutO));

				System.out.println("O valor total do produto é	:" + somA);

				ler=new Scanner(System.in);

		}
	}