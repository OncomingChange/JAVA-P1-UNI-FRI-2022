package JavaOdZačetka;

import java.util.Scanner;

public class Naloga42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        System.out.print(fakultetaSPreskokom(n, p));
    }

    public static long fakultetaSPreskokom(int n, int p) {
        int zmnožek = n;
        for (int i = 1; n - i * p > 0; i++) {
            zmnožek *= (n - i * p);
        }
        return zmnožek;
    }
}
