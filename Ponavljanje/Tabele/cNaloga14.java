package Tabele;
import java.util.Scanner;
public class cNaloga14 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int d = sc.nextInt();
            int n = sc.nextInt();
            int[][] seznam = new int[n][2];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    seznam[i][j] = sc.nextInt();
                }
            }

            pravilniTrikotniki(d, seznam);
        }
    }

    public static void pravilniTrikotniki(int d, int[][] seznam) {
        int steviloPravilnih = 0;
        for (int i = 0; i < seznam.length - 2; i++) {
            for (int j = i + 1; j < seznam.length - 1; j++) {
                for (int k = j + 1; k < seznam.length; k++) {
                    double[] stranice = new double[3];
                    stranice[0] = razdalja(seznam[i], seznam[j]);
                    stranice[1] = razdalja(seznam[i], seznam[k]);
                    stranice[2] = razdalja(seznam[j], seznam[k]);
                    if (trikotnikPravilen(stranice, d)) {
                        System.out.printf("%d %d %d%n", i, j, k);
                        steviloPravilnih++;
                    }
                }
            }
        }
        if (steviloPravilnih == 0) {
            System.out.print("BREZ");
        }
    }

    public static double razdalja(int[] točka1, int[] točka2) {
        return Math.sqrt(Math.pow(točka1[0] - točka2[0], 2) + Math.pow(točka1[1] - točka2[1], 2));
    }

    public static boolean trikotnikPravilen(double[] stranice, int d) {
        double max = 0;
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            if (stranice[i] > max) {
                max = stranice[i];
            }
            if (stranice[i] < min) {
                min = stranice[i];
            }
        }
        double razlika = max - min;
        double dopustnoOdstopanje = min * Math.pow(10, -d);
        return (razlika < dopustnoOdstopanje);
    }
}
