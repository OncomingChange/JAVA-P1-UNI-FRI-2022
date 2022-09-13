package KrmilniKonstrukti;
import java.util.Scanner;
public class Naloga17 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a <= b && b <= c) {
                System.out.print(a + " " + b + " " + c);
            }
            else if (a <= c && c <= b) {
                System.out.print(a + " " + c + " " + b);
            }
            else if (b <= a && a <= c) {
                System.out.print(b + " " + a + " " + c);
            } 
            else if (b <= c && c <= a) {
                System.out.print(b + " " + c + " " + a);
            }
            else if (c <= a && a <= b) {
                System.out.print(c + " " + a + " " + b);
            } 
            else if (c <= b && b <= a) {
                System.out.print(c + " " + b + " " + a);
            }
        }
    }
}
