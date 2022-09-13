package JavaOdZačetka;

import java.util.Scanner;

public class Naloga518 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] t = new int[n + 1];
        System.out.println(vrednost(n, k));
    }

    public static int vrednost(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        else if (k == 0 || k == n) {
            return 1;
        }
        else {
            return (vrednost(n - 1, k) + vrednost(n - 1, k - 1));
        }
    }
}