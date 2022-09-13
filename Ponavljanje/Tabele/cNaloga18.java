package Tabele;
import java.util.Scanner;
public class cNaloga18 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();
            int[] tabela = new int[l + d + c];
            int mesto = 1;
            int dolžina = l + d + c;

            System.out.print(naloga(mesto, l, d, c, dolžina, tabela));
        }
    }

    public static long naloga(int mesto, int l, int d, int c, int dolžina, int[] tabela) {
        long možnosti = 0;
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    tabela[mesto - 1] = 'L';
                    break;
                case 2:
                    tabela[mesto - 1] = 'D';
                    break;
                case 3:
                    tabela[mesto - 1] = 'C';
                    break;
            }
            if (mesto < dolžina && ustreznost(tabela, mesto, l, d, c)) {
                možnosti += naloga(mesto + 1, l, d, c, dolžina, tabela);
            }
            else if (ustreznost(tabela, mesto, l, d, c)) {
                možnosti++;
            }
        }
        return možnosti;
    }

    public static boolean ustreznost (int[] tabela, int mesto, int l, int d, int c) {
        int levi = 0;
        int desni = 0;
        int centralni = 0;
        for (int i = 0; i < mesto; i++) {
            switch (tabela[i]) {
                case 'L':
                    levi++;
                    break;
                case 'D':
                    desni++;
                    break;
                case 'C':
                    centralni++;
                    break;
            }
            if (levi > l || desni > d || centralni > c) {
                return false;
            }
        }
        return (
        mesto == 1 ||
        tabela[mesto - 1] == 'L' && tabela[mesto - 2] != 'D' || 
        tabela[mesto - 1] == 'D' && tabela[mesto - 2] != 'L'|| 
        tabela[mesto - 1] == 'C' || 
        tabela[mesto - 2] == 'C'
        );
    }
}
