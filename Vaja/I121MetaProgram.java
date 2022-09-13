import java.util.Scanner;

public class I121MetaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;

        System.out.println("public class Nizi {");
        System.out.println("    public static void main(String[] args) {");
        for (x = 1; x <= n + 1; x++) {
            int presledki = (x + 1) * 4;
            for (int y = 1; y <= presledki; y++) {
                System.out.print(" ");
            }
            if (x == n + 1) {
                System.out.printf("System.out.println(\"\"");
                for (int i = 1; i <= n; i++) {
                    System.out.printf(" + c%d", i);
                }
                System.out.println(");");
            }
            else {
                System.out.printf("for (char c%d = \'A\';  c%d <= \'Z\';  c%d++) {%n", x, x, x);
            }
        }
        for (x = n; x >= -1; x--) {
            int presledki = (x + 1) * 4;
            for (int y = 1; y <= presledki; y++) {
                System.out.print(" ");
            }
            System.out.println("}");
        }
    }
}
