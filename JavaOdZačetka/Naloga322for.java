package JavaOdZačetka;

import java.util.Scanner;
import java.util.Random;

public class Naloga322for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random uporabnik = new Random();

        System.out.print("Napišite zgornjo mejo (spodnja je 1): ");
        int zgMeja = sc.nextInt();
        int izmisljenoSt = uporabnik.nextInt(zgMeja);
        System.out.println("Izmišljena številka je: " + izmisljenoSt);
        int odgovor = 1;
        int ugibanoSt = zgMeja / 2;

        for (int korak = 2; odgovor != 0; ++korak) {
            System.out.println("Ali je izmišljeno število " + ugibanoSt + "?");
            odgovor = sc.nextInt();
            if (odgovor == 1) {
                ugibanoSt += (zgMeja / Math.pow(2,korak));
            } else if (odgovor == 0) {
                System.out.println("Odgovor je pravilen!");
            } else if (odgovor == -1) {
                ugibanoSt -= (zgMeja / Math.pow(2,korak));
            } else {
                System.out.println("Napaka.");
                break;
            }
        }
    }
}