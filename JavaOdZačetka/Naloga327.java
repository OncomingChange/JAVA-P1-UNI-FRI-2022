package JavaOdZačetka;

import java.util.Scanner;

public class Naloga327 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // velikost šahovnice (n * n)
        int n = sc.nextInt();
        // x koordinata "p"
        int p = sc.nextInt();
        // y koordinata "q"
        int q = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // vrsta z damo
            if (i == q) {
                for (int stolpec = 1; stolpec <= n; stolpec++) {
                    if (stolpec == p) {
                        System.out.printf("%2c", 'D');
                    }
                    else {
                        System.out.printf("%2c", 'N');
                    }
                }
            }
            // liha vrsta
            else if ((i + 1) % 2 == 0) {
                for (int lihaVrsta = 1; lihaVrsta <= n; lihaVrsta++) {
                    if (((p - lihaVrsta) == (q - i) || (p - lihaVrsta) == (i - q)) || (lihaVrsta == p)) {
                        System.out.printf("%2c", 'N');
                    }
                    else if ((lihaVrsta + 1) % 2 == 0) {

                        System.out.printf("%2c", 'o');
                    }
                    else {
                        System.out.printf("%2c", 'x');
                    }
                }
            }
            // soda vrsta
            else {
                for (int sodaVrsta = 1; sodaVrsta <= n; sodaVrsta++) {
                    if (((p - sodaVrsta) == (q - i) || (p - sodaVrsta) == (i - q)) || (sodaVrsta == p)) {
                        System.out.printf("%2c", 'N');
                    }
                    else if ((sodaVrsta + 1) % 2 == 0) {
                        System.out.printf("%2c", 'x');
                    }
                    else {
                        System.out.printf("%2c", 'o');
                    }
                }
            }
            // prehod v naslednjo vrstico
            System.out.println();
        }


    }
}
