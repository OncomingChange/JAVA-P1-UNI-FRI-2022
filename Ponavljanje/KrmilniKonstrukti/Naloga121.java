package KrmilniKonstrukti;
import java.util.Scanner;

public class Naloga121 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String presledki = "    ";

            //vrstice
            for (int i = 0; i <= n + 2; i++) {
                //presledki za vsako vrstico z besedilom
                for (int j = 1; j <= i; j++) {
                    System.out.print(presledki);
                }
                //prva in druga vrstica zapis
                switch (i) {
                    case 0:
                    System.out.println("public class Nizi {");
                    break;

                    case 1:
                    System.out.println("public static void main(String[] args) {");
                    break;
                }
                //vrstice po drugi in zapis
                if (i > 1 && i < n + 2) {
                    System.out.printf("for (char c%d = \'A\';  c%d <= \'Z\';  c%d++) {%n", i - 1, i - 1, i - 1);
                }
                else if (i == n + 2) {
                    System.out.print("System.out.println(\"\"");
                    for (int k = 1; k <= n; k++) {
                        System.out.printf(" + c%d", k);
                    }
                    System.out.println(");");
                }
            }
            //vrstice brez besedila
            for (int i = n + 1; i >= 0; i--) {
                for (int j = i; j > 0; j--) {
                    System.out.print(presledki);
                }
                System.out.println("}");
            }
        }
    }
}
