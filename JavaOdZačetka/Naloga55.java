package JavaOdZačetka;

import java.util.Scanner;

public class Naloga55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Koliko števil želite vnesti? ");
        int n = sc.nextInt();

        int[] stevila = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Vnesite število: ");
            stevila[i] = sc.nextInt();
        }

        for (int st: komulativnaVsota(stevila)) {
            System.out.println(st);
        }
    }

    public static int[] komulativnaVsota(int[] tabela) {
        int vsota = 0;
        for (int i = 0; i < tabela.length; i++) {
            vsota += tabela[i];
            tabela[i] = vsota;
        }
        return tabela;
    }
}
