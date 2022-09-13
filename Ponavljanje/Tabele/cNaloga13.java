package Tabele;
import java.util.Arrays;
import java.util.Scanner;
public class cNaloga13 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] matrika = new int[n][];

            int dolžina = 0;
            for (int i = 0; i < n; i++) {
                int d = sc.nextInt();
                matrika[i] = new int[d];
                if (d > dolžina) {
                    dolžina = d;
                }
                for (int j = 0; j < d; j++) {
                    matrika[i][j] = sc.nextInt();
                }
            }

            int[] maksimumi = new int[dolžina];
            for (int i = 0; i < maksimumi.length; i++) {
                maksimumi[i] = Integer.MIN_VALUE;
            }
            maksimumiStolpcev(matrika, maksimumi);
        }
    }

    public static void maksimumiStolpcev(int[][] matrika, int[] maksimumi) {
        for (int v = 0; v < matrika.length; v++) {
            for (int s = 0; s < matrika[v].length; s++) {
                if (matrika[v][s] > maksimumi[s]) {
                    maksimumi[s] = matrika[v][s];
                }
            }
        }
        System.out.print(Arrays.toString(maksimumi));
    }
}
