package Tabele;
import java.util.Scanner;
public class cNaloga8 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] tabela = new int[n];

            int max = ustvarjanjeTabeleInMax(tabela, sc);
            int[] delitelji = new int[max + 1];

            seštevanjeDeliteljev(tabela, delitelji);
            izpisovanjeIzstopajočih(tabela, delitelji);
        }
    }

    public static int ustvarjanjeTabeleInMax(int[] tabela, Scanner sc) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = sc.nextInt();
            if (tabela[i] > max) {
                max = tabela[i];
            }
        }
        return max;
    }

    public static void seštevanjeDeliteljev(int[] tabela, int[] delitelji) {
        for (int i = 0; i < tabela.length; i++) {
            for (int j = 2; j < delitelji.length; j++) {
                if (tabela[i] % j == 0) {
                    delitelji[j]++;
                }
            }
        }
    }

    public static void izpisovanjeIzstopajočih(int[] tabela, int[] delitelji) {
        int[] tabelaIzstopajočih = new int[tabela.length];
        int izstopajoča = 0;
        boolean[] uporaba = new boolean[tabela.length];
        for (int j = delitelji.length - 1; j > 1; j--) {
            if (delitelji[j] == tabela.length - 1) {
                for (int i = 0; i < tabela.length; i++) {
                    if ((tabela[i] % j != 0) && (!uporaba[i])) {
                        tabelaIzstopajočih[i] = tabela[i];
                        izstopajoča++;
                        uporaba[i] = true;
                    }
                }
            }
        }
        if (izstopajoča == 0) {
            System.out.print("NIC");
        }
        else {
            for (int i = 0; i < tabela.length; i++) {
                for (int j = 0; j < tabela.length; j++) {
                    if (tabela[i] == tabelaIzstopajočih[j]) {
                        System.out.println(tabela[i]);
                    }
                }
            }
        }
    }
}