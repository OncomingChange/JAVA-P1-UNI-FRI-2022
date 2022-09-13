package JavaOdZačetka;

import java.util.Scanner;

public class Naloga41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n = dolžine/višina šahovnice
        int n = sc.nextInt();
        // k = dolžina/višina polj
        int k = sc.nextInt();

        for (int i = 1; i <= n * k; i++) {
            int stVrstice = 1;
            if (stVrstice % 2 != 0) {
                lihaVrstica(n);
            }
            else {
                sodaVrstica(n);
            }
            if (i % k == 0) {
                stVrstice++;
            }
        }
    }

    public static void lihaVrstica(int n) {
        for (int j = 1; j <= n; j++) {
            if (j == n) {
                zaporedje(n, '-', true);
            }
            else if (j % 2 != 0) {
                zaporedje(n, '-', false);
            }
            else {
                zaporedje(n, '*', false);
            }
        }
    }
    
    public static void sodaVrstica(int n) {
        for (int j = 1; j <= n; j++) {
            if (j == n) {
                zaporedje(n, '*', true);
            }
            else if (j % 2 != 0) {
                zaporedje(n, '*', false);
            }
            else {
                zaporedje(n, '-', false);
            }
        }
    }

    public static void zaporedje(int n, char barva, boolean konecVrstice) {
        for (int i = 1; i <= n; i++) {
            System.out.print(barva);
        }
        if (konecVrstice) {
            System.out.println();
        }
        
    }
}
