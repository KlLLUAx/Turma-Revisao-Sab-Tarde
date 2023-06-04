package banco;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner n = new Scanner(System.in);
		// s.next();
		int opc = 0;

		ContaCorrente cc = new ContaCorrente();

		do {
			System.out.println("Menu do Banco");
			System.out.println("1 - Criar Conta");
			System.out.println("2 - Depositar");
			System.out.println("3 - Sacar");
			System.out.println("4 - extrato");
			System.out.println("0 - sair");
			System.out.println("Digite a opção desejada:");
			opc = n.nextInt();

			switch (opc) {
			case 1:
				System.out.println("Informe seu nome: ");

				String nome = s.nextLine();

				cc.setNome(nome);

				cc.setNumeroConta("783658723");

				System.out.println("Deseja fazer um deposito inicial?");
				System.out.println("1 - sim");
				System.out.println("2 - não");
				opc = n.nextInt();

				if (opc == 1) {
					
					System.out.println("Informe Quanto quer depositar: ");
					
					double depositoInicial = n.nextDouble();
					
					cc.depositar(depositoInicial);
					
					System.out.printf("Seu saldo é: R$ %.2f ", cc.getSaldo());
					System.out.println();
					
				} else if (opc == 2) {
					
					System.out.printf("Seu saldo é: R$ %.2f ", cc.getSaldo());
					System.out.println();
				}
				break;
				
			case 2:
				System.out.println("Informe o valor que deseja depositar: ");
				double valor = n.nextDouble();
				cc.depositar(valor);
				System.out.printf("Seu saldo atual é: R$ %.2f ", cc.getSaldo());
				System.out.println();
				
				break;
				
			case 3: 
					System.out.println("Informe o valor que você deseja sacar: ");
					double valorSaque = n.nextDouble();
					double saldoAtual = cc.getSaldo();
					if(saldoAtual >= valorSaque) {
						cc.sacar(valorSaque);
					System.out.printf("Seu saldo atual é: R$ %.2f ", cc.getSaldo());
					}else {
						System.out.println("Saldo insuficiente! ");
					}
					break;
			case 4:
				System.out.printf("Seu saldo atual é: R$ %.2f ", cc.getSaldo());
				System.out.println();
				break;
				default : 
					System.err.println("Opção Invalida! ");
					break;
					
			}

		} while (opc != 0);

	}

}
