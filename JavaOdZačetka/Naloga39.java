package JavaOdZačetka;

import java.util.Scanner;

public class Naloga39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        int a = scanner.nextInt();
        System.out.println("m: ");
        int m = scanner.nextInt();
        int i = 1;
        while ((a * i) <= m) {
            System.out.println(a * i);
            i = i + 1;
        }
    }
    
}
