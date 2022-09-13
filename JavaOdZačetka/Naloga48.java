package JavaOdZačetka;

import java.util.Scanner;

public class Naloga48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char znak = '+';
        boolean prelom = true;

        zaporedje(n, znak, prelom);
    }

    public static void zaporedje(int n, char znak, boolean prelom) {
        int i = 1;
        fora(n, i, znak);
        /*
        for (int i = 1; i <= n; i++) {
            System.out.print(znak);
            }
        */
        if (prelom) {
            System.out.println();
        }
    }

    public static void fora(int n, int i, char znak) {
        if (i <= n) {
            i++;
            System.out.print(znak);
            fora(n, i, znak);
        }
        else {
            return;
        }
    }
}
