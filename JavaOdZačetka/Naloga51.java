package JavaOdZačetka;

import java.util.Scanner;

public class Naloga51 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Koliko števil želite vnesti? ");
        int n = sc.nextInt();

        int[] stevila = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Vnesite število: ");
            stevila[i] = sc.nextInt();
        }

        System.out.print("Kateri delitelj želite? ");
        int y = sc.nextInt();

        System.out.print(steviloDeljivih(stevila, y));
    }

    public static int steviloDeljivih(int[] t, int delitelj) {
        int stDeljivih = 0;
        for (int število: t) {
            if (število % delitelj == 0) {
                stDeljivih++;
            }
        }
        return stDeljivih;
    }
}
