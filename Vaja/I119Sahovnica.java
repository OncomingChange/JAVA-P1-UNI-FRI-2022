import java.util.Scanner;

public class I119Sahovnica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // št. vrstic
        int v = sc.nextInt();
        // št stolpcev
        int s = sc.nextInt();
        // stranica kvadratov (d * d)
        int d = sc.nextInt();

        int stVrstice = 0;

        // za vsako vrstico
        for (int i = 0; i <= (v * d) + 1; i++) {
            // prva in zadnja vrstica
            if (i == 0 || i == (v * d) + 1) {
                System.out.print("+ ");
                for (int x = 1; x <= (s * d); x++) {
                    System.out.print("- ");
                }
                System.out.println("+");
            }
            // lihe vrstice
            else if (stVrstice % 2 != 0) {
                int stStolpca = 1;
                System.out.print("| ");
                for (int x = 1; x <= (s * d); x++) {
                    if (stStolpca % 2 != 0) {
                        System.out.print("  ");
                        
                    }
                    else {
                        System.out.print("* ");
                    }
                    if (x % d == 0) {
                        stStolpca++;
                    }
                }
                System.out.println("|");

            }
            // sode vrstice
            else {
                int stStolpca = 1;
                System.out.print("| ");
                for (int x = 1; x <= (s * d); x++) {
                    if (stStolpca % 2 == 0) {
                        System.out.print("  ");
                        
                    }
                    else {
                        System.out.print("* ");
                    }
                    if (x % d == 0) {
                        stStolpca++;
                    }
                }
                System.out.println("|");
            }
            // štetje vrstic (liha/soda)
            if (i % d == 0) {
                stVrstice++;
            }
        }
    }
}
