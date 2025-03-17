import java.util.Scanner;
public class Desafio {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] nomes = {"Ana","Bruno","Carlos","Daniela","Eduardo","Fernanda","Gabriel","Helena","Igor"};
    Cliente[] clientes = new Cliente[9];
    
    for (int i=0; i<clientes.length;i++) {
      float valor = 0;
      clientes[i] = new Cliente();
      clientes[i].setNome(nomes[i]);
      System.out.printf("Cliente %s%nInsira o valor de sua conta: ",clientes[i].getNome());
      valor = scan.nextFloat();
      clientes[i].setSaldo(valor);
      System.out.printf("Cliente %s, seu saldo é de %.2f%n%n",clientes[i].getNome(),clientes[i].getSaldo());
    }
    
    for (Cliente pessoa : clientes) {
      if (pessoa.getSaldo() < 0) {
        System.out.printf("Cliente %s. Sua classificação é: Negativado%n%n",pessoa.getNome());
      } else if (pessoa.getSaldo() >= 0 && pessoa.getSaldo() < 500) {
        System.out.printf("Cliente %s. Sua classificação é: Baixo%n%n",pessoa.getNome());
      } else {
        System.out.printf("Cliente %s. Sua classificação é: Confortável%n%n",pessoa.getNome());
      }
    }//endfor
  }
}