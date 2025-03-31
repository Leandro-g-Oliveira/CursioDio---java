import java.util.Random;

public class Tabuleiro {
    private static final int TAMANHO = 10;
    private static final char AGUA = '~';
    private static final char NAVIO = 'N';
    private static final char TIRO_CERTO = 'X';
    private static final char TIRO_ERRADO = 'O';

    private char[][] tabuleiro;
    private int[] navios = {5, 4, 3, 2, 1};
    private int naviosRestantes = 5;
    private Random random = new Random();

    public Tabuleiro() {
        tabuleiro = new char[TAMANHO][TAMANHO];
        iniciarTabuleiro();
        posicionarNavios();
    }

    private void iniciarTabuleiro() {
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                tabuleiro[i][j] = AGUA;
            }
        }
    }

    private void posicionarNavios() {
        for (int tamanho : navios) {
            boolean posicionado = false;
            while (!posicionado) {
                int linha = random.nextInt(TAMANHO);
                int coluna = random.nextInt(TAMANHO);
                boolean horizontal = random.nextBoolean();

                if (podePosicionar(linha, coluna, tamanho, horizontal)) {
                    for (int i = 0; i < tamanho; i++) {
                        if (horizontal) {
                            tabuleiro[linha][coluna + i] = NAVIO;
                        } else {
                            tabuleiro[linha + i][coluna] = NAVIO;
                        }
                    }
                    posicionado = true;
                }
            }
        }
    }

    private boolean podePosicionar(int linha, int coluna, int tamanho, boolean horizontal) {
        if (horizontal && coluna + tamanho > TAMANHO) return false;
        if (!horizontal && linha + tamanho > TAMANHO) return false;

        for (int i = 0; i < tamanho; i++) {
            if (horizontal && tabuleiro[linha][coluna + i] == NAVIO) return false;
            if (!horizontal && tabuleiro[linha + i][coluna] == NAVIO) return false;
        }
        return true;
    }

    public boolean atirar(int linha, int coluna) {
        if (tabuleiro[linha][coluna] == NAVIO) {
            tabuleiro[linha][coluna] = TIRO_CERTO;
            if (navioAfundado(linha, coluna)) {
                naviosRestantes--;
                System.out.println("Afundou um navio!");
            }
            return true;
        } else {
            tabuleiro[linha][coluna] = TIRO_ERRADO;
            return false;
        }
    }

    private boolean navioAfundado(int linha, int coluna) {
        int[] direcoes = {-1, 1, 0, 0};
        for (int i = 0; i < 4; i++) {
            int novaLinha = linha + direcoes[i];
            int novaColuna = coluna + direcoes[3 - i];
            if (novaLinha >= 0 && novaLinha < TAMANHO && novaColuna >= 0 && novaColuna < TAMANHO) {
                if (tabuleiro[novaLinha][novaColuna] == NAVIO) return false;
            }
        }
        return true;
    }

    public void mostrarTabuleiro() {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < TAMANHO; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getNaviosRestantes() {
        return naviosRestantes;
    }
}