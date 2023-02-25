import java.util.Scanner;
	public class Exercicio27{

		public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int idade;

		String nome;

		System.out.println("Entre com o nome do paciente: ");
		nome=ler.nextLine();
		System.out.println("Entre com a idade do paciente: ");
		idade=ler.nextInt();

		if	(idade<=12)
			System.out.println("o paciente " + nome + " com idade " + idade + "Deve ser encaminhado para Pediatria");

		else if (idade>12&&idade<=59)
			System.out.println("o paciente " + nome + " com idade " + idade + "Deve ser encaminhado para Clinica Geral");

		else
			System.out.println("o paciente " + nome + " com idade " + idade + "Deve ser encaminhado para Geriatria");

		}
	}