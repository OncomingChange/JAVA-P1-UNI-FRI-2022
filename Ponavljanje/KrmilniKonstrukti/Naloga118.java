package KrmilniKonstrukti;
import java.util.Scanner;

public class Naloga118 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for (int i = 1; i <= a || i <= b || i <= c; i++) {
                if (i <= a) {
                    for (int j = 1; j <= a; j++) {
                        System.out.print(a);
                    }
                    if (i <= b) {
                        System.out.print(" ");
                    }
                }
                else {
                    for (int j = 1; j <= a + 1; j++) {
                        System.out.print(" ");
                    }
                }
                if (i <= b) {
                    for (int j = 1; j <= b; j++) {
                        System.out.print(b);
                    }
                    if (i <= c) {
                        System.out.print(" ");
                    }
                }
                else {
                    if (i <= c) {
                        for (int j = 1; j <= b + 1; j++) {
                            System.out.print(" ");
                        }
                    }
                }
                if (i <= c) {
                    for (int j = 1; j <= c; j++) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
                else {
                    System.out.println();
                }
            }
        }
    }
}
