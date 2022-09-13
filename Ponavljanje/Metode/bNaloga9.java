package Metode;
import java.util.*;

public class bNaloga9 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int seme = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int p = sc.nextInt();
            int z = sc.nextInt();
            int d = sc.nextInt();
            Random rand = new Random(seme);

            for (int i = 1; i <= d; i++) {
                System.out.printf("%d. dan: ", i);
                partije(a, b, p, z, rand);
            }
        }
    }

    public static void partije(int a, int b, int p, int z, Random rand) {
        int zmageAndrej = 0;
        int zmageBranko = 0;
        int steviloPartij = 0;
        for (int i = 1; i <= p; i++) {
            steviloPartij++;
            int zmagovalnoStevilo = rand.nextInt(100);
            if (zmagovalnoStevilo < a) {
                System.out.print("A");
                zmageAndrej++;
            }
            else if (zmagovalnoStevilo >= a && zmagovalnoStevilo < a + b) {
                System.out.print("B");
                zmageBranko++;
            }
            else {
                System.out.print("r");
            }
            if (zmageAndrej == z || zmageBranko == z) {
                break;
            }
        }
        System.out.printf(" (%d)%n", steviloPartij);
    }
}
