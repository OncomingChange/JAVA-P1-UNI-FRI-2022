package JavaOdZačetka;

import java.util.Scanner;

public class Naloga53 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int[] stevila = new int[100];
        for (int i = 0; i < 100; i++) {
            System.out.print("Vnesite število: ");
            stevila[i] = sc.nextInt();
            if (stevila[i] == 0) {
                break;
            }
        }

        for (int stevilo: stevila) {
            if (stevilo != 0) {
                System.out.println(stevilo);
            }
            else {
                break;
            }
        }
    }
}
