package JavaOdZačetka;

import java.util.Scanner;

public class Naloga58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vnesite število učencev: ");
        int stUcencev = sc.nextInt();
        System.out.print("Vnesite spodnjo mejo ocen/točk: ");
        int spodnjaMeja = sc.nextInt();
        System.out.print("Vnesite zgornjo mejo ocen/točk: ");
        int zgornjaMeja = sc.nextInt();
        int[] stevci = new int[zgornjaMeja - spodnjaMeja];

        for (int i = 1; i <= stUcencev; i++) {
            System.out.print("Vnesite oceno/točke: ");
            int ocena = sc.nextInt();
            stevci[ocena - 1]++;
        }

        for (int i = 0; i < stevci.length; i++) {
            System.out.printf("Število ocen %d: %d%n",
            i + 1, stevci[i]);
        }
    }   
}
