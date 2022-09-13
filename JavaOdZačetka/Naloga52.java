package JavaOdZačetka;

import java.util.Scanner;

public class Naloga52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Koliko števil želite vnesti? ");
        int n = sc.nextInt();

        int[] stevila = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Vnesite število: ");
            stevila[i] = sc.nextInt();
        }

        obratniVrstniRed(stevila);
    }

    public static void obratniVrstniRed(int[] tabela) {
        for (int i = 1; i <= tabela.length; i++) {
            System.out.println(tabela [tabela.length - i]);
        }
    }
}
