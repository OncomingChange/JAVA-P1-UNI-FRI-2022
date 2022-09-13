package JavaOdZačetka;

import java.util.Scanner;

public class Primer35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        int a = scanner.nextInt();
        System.out.println("b: ");
        int b = scanner.nextInt();

        while (a <= b) {
            System.out.println(a);
            a = (a + 1);
        }
    }   
}
