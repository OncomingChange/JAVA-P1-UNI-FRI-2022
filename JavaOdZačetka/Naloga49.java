package JavaOdZačetka;

import java.util.Scanner;

public class Naloga49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 3;

        System.out.println("2");
        // (1) klic metode, ki gre skozi vsa liha števila

        // (2) znotraj metode (1) klic metode (2), ki preveri, če je število deljivo z več 
        // kot le št. 1 in samim sabo

        // 1
        
        preverjanjeStevil(n, i);
    }

    public static void preverjanjeStevil(int n, int i) {
        if (i <= n) {
            if (preverjanjeDeliteljev(i, 3, n)) { // 2
                System.out.println(i);
            }
            i += 2;
            preverjanjeStevil(n, i);
        }
        else {
            return;
        }
    }
    
    public static boolean preverjanjeDeliteljev(int i, int j, int n) {
        if (j >= i) {
            if (j <= n) {
                return true;
            }
            else {
                return false;
            }
        }
        if (i % j != 0) {
            j += 2;
            return (preverjanjeDeliteljev(i, j, n));
        }
        else {
            return false;
        }
    }
}
