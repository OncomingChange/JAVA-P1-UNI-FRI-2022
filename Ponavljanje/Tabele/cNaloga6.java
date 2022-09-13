package Tabele;
import java.util.Scanner;

public class cNaloga6 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] tabela = new int[n];

            ustvarjanjeTabele(tabela, sc);
            urejanjeTabele(tabela);
            preverjanjePonavljanja(tabela);
            if (n == 1) {
                System.out.print("RAZLICNI");
            }
        }
    }

    public static void ustvarjanjeTabele(int[] tabela, Scanner sc) {
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = sc.nextInt();
        }
    }

    public static void urejanjeTabele(int[] tabela) {
        for (int i = 1; i < tabela.length; i++) {
            int element = tabela[i];
            int j = i;
            while (j > 0 && element < tabela[j - 1]) {
                tabela[j] = tabela[j - 1];
                j--;
            }
            tabela[j] = element;
        }
    }

    public static void preverjanjePonavljanja(int[] tabela) {
        for (int i = 0; i < tabela.length - 1; i++) {
            if (tabela[i] == tabela[i + 1]) {
                System.out.print(tabela[i]);
                break;
            }
            if (i == tabela.length - 2) {
                System.out.print("RAZLICNI");
            }
        }
    }
}
