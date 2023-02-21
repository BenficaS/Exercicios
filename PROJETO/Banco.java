import java.util.Scanner;
	public class Banco
	{
		public static void main(String[]args)
		{
			Scanner ler = new Scanner(System.in);

			String nome = "Pedro Dutra";

			int opcao=0, numCC=20330, numPP=20340, saldoCC=100, saldoPP=200, valor=0;

			System.out.println("Entre com o nome do cliente: " + nome);
			nome="Pedro Dutra";
			System.out.println("Cadastre o Numero da conta corrente: " + numCC); // conta corrente.
			numCC=20330;
			System.out.println("Entre com o saldo inicial da conta corrente; " + saldoCC);  // conta corrente.
			saldoCC=100;
			System.out.println("Cadastre o numero da conta poupan�a: " + numPP); // conta poupan�a.
			numPP=20340;

			System.out.println("Entre com o saldo inicial da conta poupan�a" + saldoPP); // conta poupan�a.
			saldoPP=200;

			do{
				System.out.println("Qual operação deseja realizar:  " + nome);
				System.out.println("    1 – Creditar");
				System.out.println("    2 – Debitar");
				System.out.println("    3 – Transferir");
				System.out.println("    4 - Saldo");
				System.out.println("    5 – Sair");
				opcao=ler.nextInt();

				switch(opcao){
					case 1:
				System.out.println("Conta poupan�a digite - 1");
				System.out.println("Conta corrente digite - 2");
				opcao=ler.nextInt();

				if(opcao==2){

				System.out.println("Entre com o valor a creditar em sua conta corrente");
				valor=ler.nextInt();
				saldoCC+=valor;

				System.out.println("o valor creditado na conta corrente � " + saldoCC);
				}
				if(opcao==1){

				System.out.println("Qual valor a creditar na conta poupan�a " + numPP + ";");
				valor=ler.nextInt();
				saldoPP+=valor;

				System.out.println("o valor creditado na conta corrente � " + saldoPP);
				}
				break;
				case 2:
				System.out.println("Conta poupan�a digite - 1");
				System.out.println("Conta corrente digite - 2");
				opcao=ler.nextInt();
				
				if(opcao==2){
				System.out.println( "Qual o valor a debitar da conta corrente " + numCC);
				valor=ler.nextInt();
				
				saldoCC-=valor;
				System.out.println("O saldo atual da conta corrente é:" + saldoCC);
			}
				if(opcao==1){
				System.out.println("Qual o valor a debitar da conta poupança " + numPP);
				valor=ler.nextInt();
				if(valor>saldoPP){
				System.out.println("operação invalida");
				}
				else{
					saldoPP-=valor;
					System.out.println("O saldo atual da conta poupança é:" + saldoPP);
				}
				}
					break;
				case 3:
				System.out.println("Conta poupan�a digite - 1");
				System.out.println("Conta corrente digite - 2");
				opcao=ler.nextInt();

				if(opcao==1){
					System.out.println("qual o valor a transferir da conta CP" + numPP + " para conta CC " + numCC + "->"); 
					valor=ler.nextInt();

                    if(valor>saldoPP){
                        System.out.println("você não possui fundos na conta para realizar a operação;");
					}
					else{
						saldoPP-=valor;
						saldoCC+=valor;
						System.out.println("saldo atual na conta corrente " + saldoCC);
						System.out.println("saldo atuall na conta poupança"+ saldoPP);
					}
				}
				if(opcao==2){
					System.out.println("qual o valor a transferir da conta CC" + numCC + " para conta CP " + numPP + "->");
					valor=ler.nextInt();
					saldoCC+=valor;
					saldoPP-=valor;
					System.out.println("saldo atual na conta corrente " + saldoCC);
					System.out.println("saldo atuall na conta poupança"+ saldoPP);
				}
					break;
				case 4:
				System.out.println(nome);
				System.out.println("Saldo da sua Conta Corrente " + numCC + "->  " + saldoCC);
				System.out.println("Saldo da sua Conta Poupança  " + numPP + "->  "+ saldoPP);
					break;
				case 5:
				System.out.println("obrigado por trabalhar com nosso banco");
					break;
				default:
					System.out.println("op��o invalida");
					break;
			}
		}while(opcao!=5);
		ler.close();
		}	
	}