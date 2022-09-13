package KrmilniKonstrukti;
import java.util.Scanner;
public class Naloga18 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
