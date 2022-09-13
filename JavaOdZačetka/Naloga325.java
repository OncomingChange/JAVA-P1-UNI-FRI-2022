package JavaOdZačetka;

import java.util.Scanner;

public class Naloga325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

        for (int j = 1; j <= n; j++) {
            int zmnozek = i * j;
            System.out.printf("%9d", zmnozek);
            }
            System.out.println();
        
        }
    }
}
