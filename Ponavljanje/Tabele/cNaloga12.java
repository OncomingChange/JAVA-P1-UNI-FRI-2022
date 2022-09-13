package Tabele;
import java.util.Arrays;
import java.util.Scanner;
public class cNaloga12 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int v = sc.nextInt();
            int s = sc.nextInt();

            int[][] matrika = new int[v][s];
            polnjenjeMatrike(sc, matrika);

            int[] maksimumi = new int[s];
            maksimumiStolpcev(matrika, maksimumi);
        }
    }

    public static void polnjenjeMatrike(Scanner sc, int[][] matrika) {
        for (int v = 0; v < matrika.length; v++) {
            for (int s = 0; s < matrika[v].length; s++) {
                matrika[v][s] = sc.nextInt();
            }
        }
    }

    public static void maksimumiStolpcev(int[][] matrika, int[] maksimumi) {
        for (int s = 0; s < matrika[0].length; s++) {
            int max = Integer.MIN_VALUE;
            for (int v = 0; v < matrika.length; v++) {
                if (matrika[v][s] > max) {
                    max = matrika[v][s];
                    maksimumi[s] = max;
                }
            }
        }
        System.out.print(Arrays.toString(maksimumi));
    }
}
