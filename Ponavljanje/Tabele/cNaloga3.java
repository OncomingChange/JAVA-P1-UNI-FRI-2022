package Tabele;
import java.util.Scanner;

public class cNaloga3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int[][] tabela = new int[n + 1][31];

            pascalovaTabela(tabela, n + 1);
            izpisTabele(tabela, n + 1);
        }
    }

    public static void pascalovaTabela(int[][] tabela, int višina) {
        for (int i = 0; i < višina; i++) {
            tabela[i][0] = 1;
        }
        for (int i = 1; i < višina; i++) {
            for (int j = 1; j <= i; j++) {
                tabela[i][j] = tabela[i-1][j-1] + tabela[i-1][j];
            }
        }
    }

    public static void izpisTabele(int[][] tabela, int višina) {
        for (int i = 0; i < višina; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    System.out.printf("%d%n", tabela[i][j]);
                }
                else {
                    System.out.printf("%d ", tabela[i][j]);
                }
            }
        }
    }
}
