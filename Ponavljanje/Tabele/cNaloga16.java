package Tabele;
import java.util.*;
public class cNaloga16 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] točke = new int[2][n];

            for (int i = 0; i < n; i++) {
                točke[0][i] = i + 1;
            }

            while (sc.hasNext()) {
                int beli = sc.nextInt();
                int črni = sc.nextInt();
                int rezultat = sc.nextInt();
                dopolniTočke(točke, beli, črni, rezultat);
            }

            urejanjeTabele(točke);

            for (int i = n - 1; i >= 0; i--) {
                System.out.printf("%d %d%n", točke[0][i], točke[1][i]);
            }
        }
    }

    public static void dopolniTočke(int[][] točke, int beli, int črni, int rezultat) {
        switch (rezultat) {
            case 1:
                točke[1][beli - 1] += 2;
                break;
            case 0:
                točke[1][beli - 1]++;
                točke[1][črni - 1]++;
                break;
            case -1:
                točke[1][črni - 1] += 2;
                break;
        }
    }

    public static void urejanjeTabele(int[][] točke) {
        for (int i = 1; i < točke[0].length; i++) {
            int element = točke[1][i];
            int mesto = točke[0][i];
            int primerjava = i;
            while (primerjava > 0 && element <= točke[1][primerjava - 1]) {
                točke[0][primerjava] = točke[0][primerjava - 1];
                točke[1][primerjava] = točke[1][primerjava - 1];
                primerjava--;
            }
            točke[0][primerjava] = mesto;
            točke[1][primerjava] = element;
        }
    }
}
