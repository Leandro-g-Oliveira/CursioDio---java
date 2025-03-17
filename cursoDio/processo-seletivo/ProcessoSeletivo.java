import java.util.Random;
public class ProcessoSeletivo {
  public static void main (String[] args) {
    System.out.println("Bem-vindo ao processo seletivo");
    String[] candidatos = {"Felipe","Marcia","Julia","Paulo","Sabrina","João","Mateus","William","Larissa","Felipe"};
    Candidato[] candidato = new Candidato[10];
    for (int i=0; i<candidatos.length; i++) {
      candidato[i] = new Candidato();
      candidato[i].setNome(candidatos[i]);
      candidato[i].setPretensaoSalarial(salarioDesejado());
    }
    selecionarCandidatos(candidato);
    for (Candidato cand : candidato) {
      if (cand.getSelecao()) {
        entrarEmContato(cand);
      }
    }
  }
  
  static void entrarEmContato (Candidato candidato) {
    int qtdTentativas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
    do {
      atendeu = atender();
      continuarTentando = !atendeu;
      if (continuarTentando) {
        qtdTentativas++;
        System.out.printf("tentativa %d de entrar em contato com o candidato %s falhada.%n",qtdTentativas,candidato.getNome());
      }
    } while (continuarTentando && qtdTentativas < 3);
    if (atendeu) {
      System.out.printf("Conseguimos contato com o candidato %s na tentativa %d %n",candidato.getNome(),qtdTentativas);
    } else {
      System.out.printf("Não conseguimos contato com o candidato %s na tentativa %d %n",candidato.getNome(),qtdTentativas);
    }
  }
  
  static boolean atender () {
    return new Random().nextInt(3)==1;
  }
  
  static void selecionarCandidatos (Candidato[] candidato) {
    int numeroCandidatos = 0;
    int indiceCandidato = 0;
    double salarioBase = 2000.0;
    
    while (numeroCandidatos < 5 && indiceCandidato < candidato.length) {
      if (candidato[indiceCandidato].getPretensaoSalarial() <= salarioBase) {
        candidato[indiceCandidato].setSelecao(true);
        System.out.printf("Candidato %s aprovado! %n%n",candidato[indiceCandidato].getNome());
        numeroCandidatos++;
      }
      indiceCandidato++;
    }
    
  }
  
  static double salarioDesejado () {
    Random random = new Random();
    double randomNumber = 1800 + (random.nextDouble() * (2100 - 1800));
    return randomNumber;
  }
  
  static void pretensaoSalarial (double salarioPretendido) {
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido) {
      System.out.println("Ligar para o candidato");
    } else if (salarioBase == salarioPretendido) {
      System.out.println("Ligar para o candidato com uma contra proposta");
    } else {
      System.out.println("Aguardando o resultado dos demais candidatos");
    }
  }
}