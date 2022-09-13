package Metode;
import java.util.Scanner;
import java.util.Random;

public class bNaloga7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int s = sc.nextInt();
            int n = sc.nextInt();
            Random rand = new Random(s);

            for (int i = 1; i <= n; i++) {
                System.out.printf("%4d (%C): ", i, dan(i));
                if (dan(i) == 'D') {
                    metiKockeDelovnik(s, rand);
                }
                else {
                    metiKockeNedelja(s, rand);
                }
            }

        }
    }

    public static char dan (int i) {
        if (i % 7 == 0) {
            return 'N';
        }
        else {
            return 'D';
        }
    }

    public static void metiKockeDelovnik (int seme, Random rand) {
        int steviloMetovKocke = 0;
        int steviloLihihMetov = 0;

        while (steviloLihihMetov < 3) {
            int stPik = rand.nextInt(6) + 1;
            System.out.print(stPik + " ");
            steviloMetovKocke++;
            if (stPik % 2 != 0) {
                steviloLihihMetov++;
            }
        }
        System.out.printf("[%d]%n", steviloMetovKocke);
    }

    public static void metiKockeNedelja (int seme, Random rand) {
        int steviloMetovKocke = 0;
        int steviloLihihMetov = 0;

        while (steviloLihihMetov < 5) {
            int stPik = rand.nextInt(6) + 1;
            System.out.print(stPik + " ");
            steviloMetovKocke++;
            if (stPik % 2 != 0) {
                steviloLihihMetov++;
            }
        }
        System.out.printf("[%d]%n", steviloMetovKocke);
    }
}
