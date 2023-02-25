import java.util.Scanner;
	public class Ex52{
		public static void main(String[]args){

		Scanner ler = new Scanner(System.in);

		int nuM=99, homem=0, mulher=0,idadeS=0, idadE=0,idadeM=0;

		double peso=0, pesoS=0,pesoM=0;

		while(nuM!=-1){

				System.out.println("Entre com o genero opção 1 homem, opção 2 mulher: ");
				nuM=ler.nextInt();

				if(nuM!=-1){


				if(nuM==1){
						System.out.println("Entre com a idade");
						idadE=ler.nextInt();
					idadeS+=idadE;
					homem++;

				}
				else if(nuM==2){

					System.out.println("Entre com o peso: ");
					peso=ler.nextDouble();

					mulher++;

					pesoS+=peso;

				}
				else{
					System.out.println("Entrada invalida");
				}
				}
				pesoM=pesoS/mulher;
				idadeM=idadeS/homem;
		}

				System.out.println("A quantidade de homens é: " + homem);
				System.out.println("A media da idade dos homens é: " + idadeM);
				System.out.println("A quantidade total de mulheres é : " + mulher);
				System.out.printf("A o peso das mulheres é %.2f\n: " , pesoM);
	}
}