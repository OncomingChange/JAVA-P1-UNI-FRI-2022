import java.util.*;

public class I312MaksimumiPoStolpcih {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int s = sc.nextInt();

        int[][] tabela = new int[v][s];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < s; j++) {
                tabela[i][j] = sc.nextInt();
            }
        }

        System.out.print(Arrays.toString(maximumi(tabela, v, s)));
    }
    public static int[] maximumi(int[][] tabela, int v, int s) {
        int[] maximumi = new int[s];
        for (int j = 0; j < s; j++) {
            maximumi[j] = Integer.MIN_VALUE;
            for (int i = 0; i < v; i++) {
                if (maximumi[j] < tabela[i][j])
                    maximumi[j] = tabela[i][j];
            }
        }
        return maximumi;
    }
}
