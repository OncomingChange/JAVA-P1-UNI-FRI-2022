package Metode;
import java.util.Scanner;
import java.util.Random;

public class bNaloga6 {
    public static void main (String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            long trenutnoStevilo;
            long maxStevilo = 0;
            int seme = a;

            for (int i = a; i <= b; i++) {
                trenutnoStevilo = 0;
                Random rand = new Random(i);
                for (int j = 1; j <= n; j++) {
                    trenutnoStevilo += (long) Math.pow(10, n - j) * rand.nextInt(10);
                }
                if (trenutnoStevilo > maxStevilo) {
                    maxStevilo = trenutnoStevilo;
                    seme = i;
                }
            }
            System.out.print(seme);
        }
    }
}
