//de 0 a 1100: 5.00%
//de 1101 a 2500: 10.0%
//maior que 2500: 15.00%
import java.util.Scanner;
public class Desafio {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o valor do salário");
    float valorSalario = scan.nextFloat();
    System.out.println("Digite o valor dos benefícios");
    float valorBeneficios = scan.nextFloat();
    float valorImposto = 0;
    
    if (valorSalario <= 1100) {
      valorImposto = 0.05F * valorSalario;
    } else if (valorSalario > 1100 && valorSalario <=2500) {
      valorImposto = 0.10F * valorSalario;
    } else {
      valorImposto = 0.15F * valorSalario;
    }
    
    float total = valorSalario - valorImposto + valorBeneficios;
    System.out.printf(" Valor do salário: %.2f%n valor do imposto: %.2f%n Salario liquido + beneficios: %.2f",valorSalario,valorImposto,total);
  }
}