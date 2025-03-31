
public class Conta {
	private double saldo;
	private double chequeEspecial;
	private double usoChequeEspecial;
	
	public Conta (double saldoInicial) {
		this.saldo = saldoInicial;
		this.calcularChequeEspecial(saldoInicial);
	}
	
	public void depositar (double valor) {
		if (valor < 1) {
			System.out.println("Você só pode fazer um depósito a partir de R$1.00%n%n");
			return;
		}
		
		if (this.usoChequeEspecial > 0) {
			if (valor >= this.usoChequeEspecial) {
			  valor -= this.usoChequeEspecial;
			  this.usoChequeEspecial = 0;
			} else {
			  this.usoChequeEspecial -= valor;
			  System.out.printf("Depósito de R$%.2f realizado!%nSeu saldo ainda é R$0.00%nE seu cheque especial atual está em R$%.2f%n%n",valor,this.usoChequeEspecial);
			  return;
			}
		}
		this.saldo += valor;
		System.out.printf("Depósito de R$%.2f realizado! Seu novo saldo é de R$%.2f%n%n");
	}
	
	public void sacar (double valor) {
		if (valor <= 0) {
			System.out.println("Você deve inserir um valor válido, a partir de R$ 1.00%n%n");
			return ;
		}
		if (valor > this.saldo + (this.chequeEspecial - this.usoChequeEspecial)) {
			System.out.printf("Você não pode fazer essa operação.%n O valor requisitado é de %.2f%nO valor de sua conta + cheque especial é de %.2f%n%n",valor,this.saldo + (this.chequeEspecial - this.usoChequeEspecial));
		} else if (valor <= this.saldo + (this.chequeEspecial - this.usoChequeEspecial)) {
			valor -= this.saldo;
			this.saldo = 0;
			this.usoChequeEspecial += valor;
			System.out.printf("Saque de R$%.2f realizado! O saldo de sua conta agora é R$%.2f, e você usou R$%.2f de seu cheque especial.%nVocê ainda tem R$%.2f de cheque especial%n%n",valor,this.saldo,this.usoChequeEspecial,this.chequeEspecial-this.usoChequeEspecial);
		} else if (valor <= this.saldo){
			this.saldo -= valor;
			System.out.printf("Você realizou um saque de R$%.2f e não utilizou seu cheque especial. Seu saldo é de R$%.2f %n%n",valor,this.saldo);
		}
	}
	
	public void consultarSaldo () {
		System.out.printf("Seu saldo atual é de: R$%.2f%n%n",this.saldo);
	}
	
	public void consultarChequeEspecial () {
		System.out.printf("Seu cheque especial está em: R$%.2f%n%n",this.usoChequeEspecial);
	}
	
	private void cobrarChequeEspecial () {
		if (this.usoChequeEspecial > 0 && this.saldo > 0) {
			double valorTaxa = this.usoChequeEspecial * 0.2;
			this.usoChequeEspecial += valorTaxa;
			System.out.printf("Taxa de R$ %.2f cobrada por uso do Cheque Especial%n%n");
		}
	}
	
	private void calcularChequeEspecial (double valor) {
		if (valor <= 500) {
			this.chequeEspecial = 50;
		} else if (valor > 500) {
			this.chequeEspecial = valor/2;
		}
	}
	
}