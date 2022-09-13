import java.util.Scanner;

public class I120LedeneSvece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stevec = 2;
        int k = 1;

        // stevec -> število znakov na vrstico
        for (int x = 2; x <= n; x++) {
            stevec += stevec - 1;
        }
        // vrstice
        for (int x = 1; x <= n; x++) {
            System.out.print("*");
            for (int y = 1; y < stevec; y++) {
                if (y == stevec - 1) {
                    System.out.println("*");
                }
                else if (y % k == 0) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            k = 2 * k;
        }
    }
}
