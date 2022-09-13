package Tabele;
import java.util.Scanner;

public class cNaloga1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] tabela = new int[n];

        izpolniTabelo(sc, tabela);
        System.out.println(indeksNajbližjegaStevilaVTabeli(k, tabela));
    }

    public static void izpolniTabelo(Scanner sc, int[] tabela) {
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = sc.nextInt();
        }
    }

    public static int indeksNajbližjegaStevilaVTabeli(int k, int[] tabela) {
        int indeks = 0;
        int najmanjšeOdstopanje = Integer.MAX_VALUE;
        for (int i = 0; i < tabela.length; i++) {
            int odstopanje = (int) Math.abs(k - tabela[i]);
            if (najmanjšeOdstopanje > odstopanje) {
                najmanjšeOdstopanje = odstopanje;
                indeks = i;
            }
        }
        return indeks;
    }
}
