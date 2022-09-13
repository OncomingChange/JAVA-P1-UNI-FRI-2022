
package Tabele;
import java.util.Arrays;
import java.util.Scanner;
public class cNaloga9 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] tabela = new int[k];
            int mesto = 0;

            naloga(mesto, n, k, tabela);
        }
    }

    public static void naloga(int mesto, int max, int dolžina, int[] tabela) {
        for (int i = mesto + 1; i <= max - dolžina + mesto + 1; i++) {
            tabela[mesto] = i;
            if (mesto < dolžina - 1) {
                if (mesto == 0 || tabela[mesto] > tabela[mesto - 1]) {
                    naloga(mesto + 1, max, dolžina, tabela);
                }
            }
            else if ((mesto == 0 || tabela[mesto] > tabela[mesto - 1])) {
                System.out.println(Arrays.toString(tabela));
            }
        }
    }
}
