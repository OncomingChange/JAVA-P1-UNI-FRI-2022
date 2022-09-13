package JavaOdZačetka;

import java.util.Scanner;

public class Naloga342 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int x = 1; n >= 1; x++) {
            if (n % 2 != 0) {
                System.out.print("1");
            }
            else {
                System.out.print("0");
            }
            n /= 2;
        }
    }
}
