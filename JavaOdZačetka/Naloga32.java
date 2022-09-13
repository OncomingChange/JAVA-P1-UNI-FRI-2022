package JavaOdZačetka;

import java.util.Scanner;

    public class Naloga32 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Vnesite število točk: ");
            int tocke = sc.nextInt();
            int ocena = 0; // (1)
            if (tocke > 100) {
                System.out.println("Napaka.");
            }
            else if (tocke >= 90) {
            ocena = 10;
            } else if (tocke >= 80) {
            ocena = 9;
            } else if (tocke >= 70) {
            ocena = 8;
            } else if (tocke >= 60) {
            ocena = 7;
            } else if (tocke >= 50) {
            ocena = 6;
            } else if (tocke >= 0) {
            ocena = 5;
            } else{
                System.out.println("Napaka.");
            }
            System.out.println("Ocena: " + ocena); 
            }
         }
