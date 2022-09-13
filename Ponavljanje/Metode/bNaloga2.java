package Metode;
import java.util.*;
public class bNaloga2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int trenutnaVrednost = 0;
        
            for (int i = 0; i < a; i++) {
                trenutnaVrednost = vsota(b, trenutnaVrednost);
            }
            System.out.print(trenutnaVrednost);
        }
    }

    public static int vsota (int a, int b) {
        return a + b;
    }
}
