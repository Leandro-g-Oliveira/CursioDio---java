import java.util.Scanner;
public class Desafio {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float valorFinal = 0;
    System.out.println("Olá! Bem-vindo(a) ao Bradesco!\n Digite seu saldo inicial!");
    float saldoInicial = scan.nextFloat();
    System.out.printf("Saldo inicial de: %.2f",saldoInicial);
    System.out.printf("Agora, digite a primeira transação: Depósito %n");
    float transacao1 = scan.nextFloat();
    valorFinal = saldoInicial + transacao1;
    System.out.printf("Depósito de R$ %.2f realizado! %nSaldo atual: %.2f.%nAgora, digite a segunda transação: Depósito %n",transacao1,valorFinal);
    float transacao2 = scan.nextFloat();
    valorFinal += transacao2;
    System.out.printf("Depósito de R$ %.2f realizado! %nSaldo atual: %.2f.%nAgora, digite a terceira transação: Saque%n",transacao2,valorFinal);
    float transacao3 = scan.nextFloat();
    valorFinal -= transacao3;
    System.out.printf("Saque de R$ %.2f realizado! %nSaldo atual: %.2f.%n%n",transacao3,valorFinal);
    System.out.printf("Seu saldo atual: %.2f",valorFinal);
  }
}