import java.util.Scanner;
public class Contador {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int parametro1,parametro2;
    System.out.println("Digite o parametro 1: ");
    parametro1 = scan.nextInt();
    System.out.println("Digite o parametro 2");
    parametro2 = scan.nextInt();
    
    try {
      contar(parametro1, parametro2);
    } catch (ParametrosInvalidosException exception) {
      System.out.println(exception.getMessage());
    }
    
  }
  static void contar (int parametro1, int parametro2) throws ParametrosInvalidosException {
    if (parametro1 >= parametro2) {
      throw new ParametrosInvalidosException();
    }
    int contagem = parametro2 - parametro1;
    for (int i=0; i<=contagem; i++) {
      System.out.println(i);
    }
  }
}