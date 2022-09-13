import java.util.Scanner;

public class I22MnozenjeZZapSes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int dosedanjaVsota = b;

        for (int i = 2; i <= a; i++) {
            dosedanjaVsota = seštevanje(dosedanjaVsota, b);
        }
        System.out.print(dosedanjaVsota);
    }

    public static int seštevanje(int a, int b) {
        int seštevek = a + b;
        return seštevek;
    }
}
