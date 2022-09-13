package JavaOdZačetka;

import java.util.Scanner;

public class Naloga56 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Koliko števil želite vnesti? ");
        int n = sc.nextInt();

        int[] stevila = new int[n];
        for (int i = 0; i < n; i++) {
            // System.out.print("Vnesite število: ");
            stevila[i] = sc.nextInt();
        }

        int maksimum = stevila [0];
        int stMaksimumov = 0;

        for (int trenutnoStevilo: stevila) {
            if (trenutnoStevilo > maksimum) {
                maksimum = trenutnoStevilo;
                stMaksimumov = 1;
            }
            else if (trenutnoStevilo == maksimum) {
                stMaksimumov++;
            }
        }
        System.out.printf("%d %d%n", maksimum, stMaksimumov);
    }
}
