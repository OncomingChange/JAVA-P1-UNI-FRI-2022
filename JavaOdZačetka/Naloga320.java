package JavaOdZačetka;

import java.util.Scanner;
import java.util.Random;

public class Naloga320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vnesite zgornjo mejo: ");
        int meja = sc.nextInt();

        Random random = new Random();
        int izbrano = random.nextInt(meja) + 1;
        int poskus = 0;
        int stposkus = 0;

        do {
            System.out.print("Vaš poskus: ");
            poskus = sc.nextInt();
            stposkus++;
            if (poskus < 0) {
                break;
            }
            else if (izbrano > poskus) {
                System.out.println("Izbrano število je večje.");
            } else if (izbrano < poskus) {
                System.out.println("Izbrano število je manjše");
            }
        } while (poskus != izbrano);
        if (poskus >= 0) {
            System.out.println("Čestitke! Število ste ugotovili po " + stposkus + " poskusih!");
        }
        else {
        }
    }
}
