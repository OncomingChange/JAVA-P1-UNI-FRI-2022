package JavaOdZačetka;

import java.util.Scanner;

public class Naloga322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Napišite zgornjo mejo (spodnja je 1): ");
        int zgMeja = sc.nextInt();
        System.out.print("Izmislite si število: ");
        int izmisljenoSt = sc.nextInt();
        int odgovor;
        int korak = 1;
        int ugibanoSt = zgMeja / 2;

        do {
            korak++;
            System.out.println("Ali je izmišljeno število " + ugibanoSt + "?");
            odgovor = sc.nextInt();
            System.out.println(korak);
            if (odgovor == 1) {
                ugibanoSt = ugibanoSt + zgMeja / (2^korak);
            } else if (odgovor == 0) {
                System.out.println("Odgovor je pravilen!");
                break;
            } else if (odgovor == -1) {
                ugibanoSt = ugibanoSt - zgMeja / (2^korak);
            } else {
                System.out.println("Napaka.");
                break;
            }
        } while (odgovor != 0);
    }
}