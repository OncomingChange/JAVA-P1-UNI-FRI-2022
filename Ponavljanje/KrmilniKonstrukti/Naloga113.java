package KrmilniKonstrukti;
import java.util.*;

public class Naloga113 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int rezultat = 1;

            if (b == 0) {
                System.out.println(rezultat);
            }
            else {
                rezultat = a;
                for (int i = 1; i < b; i++) {
                    rezultat *= a;
                }
                System.out.println(rezultat);
            }
        }
    }
}
