package JavaOdZačetka;

import java.util.Scanner;

public class Naloga314 {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);

        System.out.print("n: ");
        int n = skener.nextInt();
        int vrednost = 0;
        int dodatna = 1;

        for (int i = 1; i <= n; i++) { // i++ ali ++i ??? 
            dodatna = dodatna * i;
            vrednost = dodatna;
        }        
        System.out.println(vrednost);
    }
}