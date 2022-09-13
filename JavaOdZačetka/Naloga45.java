package JavaOdZačetka;

import java.util.Scanner;

public class Naloga45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int a = 1; a <= n; a++) {
            int b = vsotaDeliteljev(a);
            if (a != b && vsotaDeliteljev(b) == a) {
                System.out.printf("%d -> %d%n", a, b);
            }
        }
        System.out.print(vsotaDeliteljev(n));
    }

    // Vrne vsoto deliteljev podanega števila, pri cemer ˇ
    // števila samega ne vkljuci v vsoto. ˇ
    public static int vsotaDeliteljev(int stevilo) {
        int vsota = 0;
        for (int d = 1; d <= (int) Math.sqrt(stevilo); d++) {
            if (stevilo % d == 0 && d * d != stevilo) {
                vsota += d + (stevilo / d);
            }
            else if (d * d == stevilo) {
                vsota += d;
            }
        }
        vsota -= stevilo;
        return vsota;
    }
}