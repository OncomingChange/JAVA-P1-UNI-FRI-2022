package JavaOdZačetka;

import java.util.Scanner;

public class Naloga335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print((a < b) ? (c < a ? (a) : ((c < b) ? c : b)) : (c < b ? (b) : ((c < a) ? a : c)));
    }
}
