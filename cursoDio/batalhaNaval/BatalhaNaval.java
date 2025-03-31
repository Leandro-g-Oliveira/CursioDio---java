import java.util.Scanner;

public class BatalhaNaval {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Tabuleiro jogador1 = new Tabuleiro();
        Tabuleiro jogador2 = new Tabuleiro();

        boolean jogador1Turno = true;
        while (jogador1.getNaviosRestantes() > 0 && jogador2.getNaviosRestantes() > 0) {
            if (jogador1Turno) {
                jogador1Turno = turno(1, jogador2);
            } else {
                jogador1Turno = !turno(2, jogador1);
            }
        }

        System.out.println(jogador1.getNaviosRestantes() == 0 ? "Jogador 2 venceu!" : "Jogador 1 venceu!");
    }

    private static boolean turno(int jogador, Tabuleiro oponente) {
        System.out.println("\nVez do Jogador " + jogador);
        oponente.mostrarTabuleiro();

        int linha, coluna;
        do {
            System.out.print("Digite linha e coluna (0-9): ");
            linha = scanner.nextInt();
            coluna = scanner.nextInt();
        } while (linha < 0 || linha >= 10 || coluna < 0 || coluna >= 10);

        boolean acerto = oponente.atirar(linha, coluna);
        System.out.println(acerto ? "Acertou!" : "Errou!");
        return acerto;
    }
}