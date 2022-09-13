package JavaOdZačetka;

import java.util.Scanner;

public class Naloga310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("m: ");
        int m = scanner.nextInt();
        int i = 0;

        while ((Math.pow(a, i)) <= m) {
            System.out.println((int)Math.pow(a, i));
            i = i + 1;
        }
    }
}
