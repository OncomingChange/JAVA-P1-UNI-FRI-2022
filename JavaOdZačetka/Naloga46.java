package JavaOdZačetka;

import java.util.Scanner;

public class Naloga46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meja = sc.nextInt();

        int stPitagorejskih = 0;
        for (int c = 1; c <= meja; c++) {
            if (jePitagorejsko(c)) {
                stPitagorejskih++;
            }
        }
        System.out.println(stPitagorejskih);
    }
    public static boolean jePitagorejsko(int c) {
        for (int a = 1; a < c; a++) {
            double b = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
            if (b % 1 == 0) {
                return true;
            }
        }
        return false;
    }
}