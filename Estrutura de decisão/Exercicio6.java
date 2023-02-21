import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args){

	Scanner ler = new Scanner (System.in);

	float nota1, nota2, nota3, notaF;

	System.out.println("Escreva as notas que a serem somadas");
	nota1=ler.nextFloat();
	nota2=ler.nextFloat();
	nota3=ler.nextFloat();
	notaF=nota1+nota2+nota3;
	if (notaF>=60)
		System.out.println("Aprovado");
	else
		System.out.println("Reprovado");

	}
}