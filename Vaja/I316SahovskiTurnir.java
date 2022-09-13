import java.util.*;

public class I316SahovskiTurnir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] igralci = new int[n][2];

        for (int i = 1; i <= n; i++) {
            igralci[i - 1][1] = i;
        }

        while (sc.hasNext()) {
            int beli = sc.nextInt();
            int črni = sc.nextInt();
            int rezultat = sc.nextInt();
            switch (rezultat) {
                case 1:
                igralci[beli - 1][0] += 2;
                break;
                case -1:
                igralci[črni - 1][0] += 2;
                break;
                case 0:
                igralci[beli - 1][0] += 1;
                igralci[črni - 1][0] += 1;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d%n", urejanjeTabel(igralci)[i][1], urejanjeTabel(igralci)[i][0]);
        }

    }

    public static int[][] urejanjeTabel(int[][] tabela) {
        for (int i = 1; i < tabela.length; i++) {
            int[] element = tabela[i];
            int k = i;
            while (k > 0 && element[0] > tabela[k - 1][0]) {
                tabela[k] = tabela[k - 1];
                k--;
            }
            if (tabela[i] != element) {
                tabela[k] = element;
            }
        }
        return tabela;
    }
}
