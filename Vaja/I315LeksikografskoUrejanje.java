import java.util.*;

public class I315LeksikografskoUrejanje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int[][] tabelaVektorjev = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                tabelaVektorjev[i][j] = sc.nextInt();
            }
        }

        int[][] novaTabela = urejanjeTabel(tabelaVektorjev);
        for (int i = 0; i < novaTabela.length; i++) {
            System.out.println(Arrays.toString(novaTabela[i]));
        }
    }

    public static int[][] urejanjeTabel(int[][] tabela) {
        for (int i = 1; i < tabela.length; i++) {
            int j = 0;
            int[] element = tabela[i];
            int k = i;
            while (k > 0 && element[j] <= tabela[k - 1][j]) {
                if (element[j] == tabela[k - 1][j]) {
                    j++;
                    if (j == element.length) {
                        break;
                    }
                }
                else {
                    tabela[k] = tabela[k - 1];
                    k--;
                    j = 0;
                }
            }
            if (tabela[i] != element) {
                tabela[k] = element;
            }
        }
        return tabela;
    }   
}
