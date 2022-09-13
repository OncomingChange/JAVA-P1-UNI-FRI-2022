import java.util.*;

public class I313MaksimumiPoStolpcihDve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] tabela = new int[n][100];
        int sMax = 0;
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            if (s > sMax) {
                sMax = s;
            }
            for (int j = 0; j < s; j++) {              
                tabela[i][j] = sc.nextInt();
            }
            for (int j = s; j < 100; j++) {
                tabela[i][j] = Integer.MIN_VALUE;
            }
        }
        /*
        for (int i = 0; i < n; i++) {
            System.out.print(Arrays.toString(tabela[i]));
        }
        */
        System.out.print(Arrays.toString(maximumi(tabela, n, sMax)));
    }
    public static int[] maximumi(int[][] tabela, int v, int s) {
        int[] maximumi = new int[s];
        for (int i = 0; i < s; i++) {
            maximumi[i] = Integer.MIN_VALUE;
        }
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < s; j++) {
                if (tabela[i][j] > maximumi[j]) {
                    maximumi[j] = tabela[i][j];
                }
            }
        }
        return maximumi;
    }
}
