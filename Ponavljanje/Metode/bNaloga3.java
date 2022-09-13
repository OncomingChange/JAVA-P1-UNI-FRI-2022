package Metode;
import java.util.Scanner;
public class bNaloga3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (min (a, b) == min (a, c)) {
                System.out.print(min(b, c));
            }
            else if (min (a, b) == min (b, c)) {
                System.out.print(min(a, c));
            }
            else {
                System.out.print(min (a, b));
            }

            }
        }
        
    public static int min (int a, int b) {
        if (a > b) {
            return b;
        }
        return a;
    }

    public static int max (int a, int b) {
        if (a < b) {
            return b;
        }
        return a;
    }
}



