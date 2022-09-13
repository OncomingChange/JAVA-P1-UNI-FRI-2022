package KrmilniKonstrukti;
import java.util.Scanner;
public class Naloga122 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            int steviloStevkM = 0;
            int stevkaSteviloN = 19;
            long delitelj = 10;
            int kvocient = 1;

            while (kvocient != 0) {
                steviloStevkM++;
                kvocient = (int) (m / delitelj);
                delitelj *= 10;
            }

            kvocient = 0;

            while (kvocient == 0) {
                stevkaSteviloN--;
                kvocient = (int) (n / Math.pow(10, (double) stevkaSteviloN - 1));
            }

            for (long i = steviloStevkM; i >= 1; i--) {
                kvocient = (int) (m / Math.pow(10, (double) i - 1));
                m -= (long) kvocient * Math.pow(10, (double) i - 1);
                for (int j = (int) kvocient; j >= 1; j--) {
                    kvocient = (int) (n / Math.pow(10, (double) stevkaSteviloN - 1));
                    System.out.print((long) (n / Math.pow(10, (double) stevkaSteviloN - 1)));
                    n -= kvocient * (long) (Math.pow(10, (double) stevkaSteviloN - 1));
                    stevkaSteviloN--;
                }
                System.out.println();
            }
        }
    }
}
