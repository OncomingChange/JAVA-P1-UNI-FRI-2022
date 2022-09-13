package KrmilniKonstrukti;
import java.util.*;
public class Naloga19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int i = 1; i <= b; i++) {
                System.out.println(a * i);
            }
        }
    }
}
