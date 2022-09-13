package KrmilniKonstrukti;
import java.util.Scanner;
public class Naloga120 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int dolzinaVrstice = 2;
            int korak = 1;


            for (int i = 1; i < n; i++) {
                dolzinaVrstice = dolzinaVrstice * 2 - 1;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < dolzinaVrstice; j++) {
                    if (j % korak == 0) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                korak *= 2;
            }
        }
    }
}
