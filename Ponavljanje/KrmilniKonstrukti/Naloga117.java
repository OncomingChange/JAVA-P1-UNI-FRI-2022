package KrmilniKonstrukti;
import java.util.Scanner;
public class Naloga117 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                int firstNumber = i % 10;
                for (int k = 1; k <= n - i; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(firstNumber);
                    firstNumber++;
                    if (firstNumber == 10) {
                        firstNumber = 0;
                    }
                }
                System.out.println();
            }
        }
    }
}
