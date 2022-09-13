package KrmilniKonstrukti;
import java.util.*;
public class Naloga112 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            if ((k == 0) || ((a < b) && (k < 0)) || ((a > b) && (k > 0))) {
                System.out.println("NAPAKA");
            }
            else if (a == b) {
                System.out.println(a);
            }
            else if (a <= b) {
                while (a <= b) {
                    System.out.println(a);
                    a += k;
                }
            }
            else {
                while (a >= b) {
                    System.out.println(a);
                    a += k;
                }
            }
        }
    }
}
