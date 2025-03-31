import java.util.Scanner;
public class ContaBancaria {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valorInicial = 0;
		System.out.println("Bem-vindo(a) ao Bradesco!\nAcabamos de criar sua conta. Digite o valor do primeiro depósito");
		valorInicial = scan.nextDouble();
		Conta conta = new Conta(valorInicial);
		int oper = 0;
		while (oper != 5) {
			System.out.println("Digite sua operação desejada:");
			System.out.println("1 - Depósito");
			System.out.println("-----------------------------");
			System.out.println("2 - Saque");
			System.out.println("-----------------------------");
			System.out.println("3 - Consultar saldo");
			System.out.println("-----------------------------");
			System.out.println("4 - Consultar cheque especial");
			oper = scan.nextInt();
			try {
			switch (oper) {
				case 1:
					depositar(conta,scan);
					break;
				case 2:
					sacar(conta,scan);
					break;
				case 3:
					consultarSaldo(conta);
					break;
				case 4:
					consultarChequeEspecial(conta);
					break;
				default:
					System.out.println("Opção inválida!\n");
			}
			} catch (IllegalArgumentException e) {
				System.out.println("Erro "+e.getMessage());
			}
		}
	}
	
	static void depositar (Conta conta,Scanner scan) {
		System.out.println("Digite um valor para depositar:");
		double valor = scan.nextDouble();
		conta.depositar(valor);
	}
	
	static void sacar (Conta conta, Scanner scan) {
		System.out.println("Digite um valor para sacar");
		double valor = scan.nextDouble();
		conta.sacar(valor);
	}
	static void consultarSaldo(Conta conta) {
		conta.consultarSaldo();
	}
	static void consultarChequeEspecial(Conta conta) {
		conta.consultarChequeEspecial();
	}
}