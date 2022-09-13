package JavaOdZačetka;

import java.util.Scanner;

public class Naloga47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.print(n);
        }
        else {
            System.out.print(fib(n));
        }
    }

    public static int fib(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
