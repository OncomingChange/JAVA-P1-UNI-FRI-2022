package JavaOdZačetka;

import java.util.Scanner;

public class Naloga311 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n: ");
        int n = scan.nextInt();
        int i = 0;

        while (n > 0) {
            n = n / 2;
            ++i;
        }
        System.out.println(i);
    }
}
