package Tabele;
import java.util.Arrays;
import java.util.Scanner;
public class cNaloga15 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[][] vektorji = new int[n][d];

            for (int i = 0; i < vektorji.length; i++) {
                for (int j = 0; j < vektorji[i].length; j++) {
                    vektorji[i][j] = sc.nextInt();
                }
            }

            urediVektorje(vektorji);
            
            for (int i = 0; i < vektorji.length; i++) {
                System.out.println(Arrays.toString(vektorji[i]));
            }
        }
    }

    public static void urediVektorje(int[][] vektorji) {
        for (int i = 1; i < vektorji.length; i++) {
            int[] element = vektorji[i];
            int vrstica = i;
            for (int j = 0; j < vektorji[i].length && vrstica > 0; j++) {
                if (element[j] == vektorji[vrstica - 1][j]) {
                    continue;
                }
                else if (element[j] < vektorji[vrstica - 1][j]) {
                    vektorji[vrstica] = vektorji[vrstica - 1];
                    vrstica--;
                    j = -1;
                }
                else if (element[j] > vektorji[vrstica - 1][j]) {
                    break;
                }
            }
            vektorji[vrstica] = element;
        }
    }
}
