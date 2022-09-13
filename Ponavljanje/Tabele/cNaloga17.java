package Tabele;
import java.util.Scanner;
public class cNaloga17 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] matrika = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrika[i][j] = sc.nextInt();
                }
            }

            System.out.print(Determinanta(matrika));
        }
    }

    public static int Determinanta(int[][] matrika) {
        int determinanta = 0;
        if (matrika.length == 1) {
            return matrika[0][0];
        }
        for (int stolpec = 0; stolpec < matrika.length; stolpec++) {
            int[][] podMatrika = new int[matrika.length - 1][matrika.length - 1];
            for (int i = 1; i < matrika.length; i++) {
                int vertikala = 0;
                for (int j = 0; j < matrika.length; j++) {
                    if (j != stolpec) {
                        podMatrika[i - 1][vertikala] = matrika[i][j];
                        vertikala++;
                    }
                }
            }
            determinanta += (int) Math.pow(-1, stolpec) * matrika[0][stolpec] * Determinanta(podMatrika);
        }
        // determinanta += Determinanta(podMatrika);
        return determinanta;
    }
}
