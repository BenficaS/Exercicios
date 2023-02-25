import java.util.Scanner;
	public class Ex51{

		public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		String nomE = "aa";

		int quanTalu=0, aPalu=0, repAlu=0;

		double noTa1, noTa2, noTa3, sNotas=0, tNotas=0, meD=0;

		while(!"FIM".equals(nomE)){
				System.out.println("Entre com o nome do aluno:");
				nomE=ler.next();


					if(!"FIM".equals(nomE)){

					quanTalu++;

					System.out.println("Entre com as notas dos alunos:");
					noTa1=ler.nextDouble();
					noTa2=ler.nextDouble();
					noTa3=ler.nextDouble();

					sNotas=noTa1+noTa2+noTa3;

					tNotas=tNotas+sNotas;

					if(sNotas>=60)

						aPalu++;
					else

						repAlu++;
				}
			}
					meD=tNotas/quanTalu;
					System.out.printf("A media da classe é %.1f\n",meD);
					System.out.println("A quantidade de alunos aprovados é " + aPalu);
					System.out.println("A quantidade de alunos reprovados é " + repAlu);
		}
	}