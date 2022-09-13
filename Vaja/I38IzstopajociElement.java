import java.util.*;

public class I38IzstopajociElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tabela = new int[n];

        int max = Integer.MIN_VALUE;

        // tabela vseh števil
        for (int i = 0; i < n; i++) {
            tabela[i] = sc.nextInt();
            if (tabela[i] > max) {
                max = tabela[i];
            }           
        }
        int[] tabelica = indeksIzstopajocihStevil(delitelji(tabela, max));

        System.out.print(Arrays.toString(tabelica));

        int števec = 0;
        for (int i = 0; i < tabela.length; i++) {
            if (tabelica[i] != 0) {
                števec++;
                System.out.println(tabela[i]);
            }
            if (i == tabela.length - 1 && števec == 0) {
                System.out.print("NIC");
            }
        }
    }

    public static boolean[][] delitelji(int[] tabelaStevil, int najvecjeStevilo) {
        boolean[][] tabelaDeliteljev = new boolean[tabelaStevil.length][najvecjeStevilo]; 
        for (int i = 0; i < tabelaStevil.length; i++) {
            int deljenec = tabelaStevil[i];
            for (int j = 2; j < najvecjeStevilo; j++) {
                if (deljenec % j == 0) {
                    tabelaDeliteljev[i][j] = true;
                }
            }
        }
        return tabelaDeliteljev;
    }

    public static int[] indeksIzstopajocihStevil(boolean[][] tabelaDeliteljev) {
        int[] indeksIzstopajocihStevil = new int[tabelaDeliteljev.length];
        int stevecFalse;
        int trenutniIndeks;
        for (int i = tabelaDeliteljev[0].length - 1; i > 1; i--) {
            trenutniIndeks = 0;
            stevecFalse = 0;
            for (int j = 0; j < tabelaDeliteljev.length; j++) {
                if (!tabelaDeliteljev[j][i]) {
                    stevecFalse++;
                    if (stevecFalse > 1) {
                        break;
                    }
                    trenutniIndeks = j;
                }
                if (j == tabelaDeliteljev.length - 1 && stevecFalse == 1 && indeksIzstopajocihStevil[j] == 0) {
                    indeksIzstopajocihStevil[j - 1] = trenutniIndeks;
                }
            }
        }
        return indeksIzstopajocihStevil;
    }
}
