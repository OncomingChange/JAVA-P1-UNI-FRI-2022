package JavaOdZačetka;

import java.util.Scanner;

public class Naloga59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Poved: ");
        char[] vrstica = sc.nextLine().toCharArray();
        int[] abeceda = new int[25];
        
        // izpis tabele vrstica
        /*
        for (char črka: vrstica) {
            System.out.println(črka);
        }
        */
        
        for (char črka: vrstica) {
            if (97 <= (int) črka && (int) črka <= 122) {
                abeceda[(int) črka - 97]++;
            }
        }

        for (int i = 0; i < abeceda.length; i++) {
            System.out.printf("%c: %d%n", (char) i + 97, abeceda[i]);
        }
    }   
}
