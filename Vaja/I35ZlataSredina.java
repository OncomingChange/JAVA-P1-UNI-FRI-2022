import java.util.*;

public class I35ZlataSredina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] tabela = new int[2 * k + 1];

        for (int i = 0; i < 2 * k + 1; i++) {
            tabela[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(tabela));

        int[] urejenaTabela = urediTabelo(tabela);
        // System.out.println(Arrays.toString(urejenaTabela));

        System.out.println(urejenaTabela[k]);
    }

    public static int[] urediTabelo(int[] tabela) {
        for (int i = 1; i < tabela.length; i++) {
            int element = tabela[i];
            int j = i - 1;
            while (j >= 0 && tabela[j] > element) {
                tabela[j + 1] = tabela[j];
                j--;
            }
            tabela[j + 1] = element;
        }
        return tabela;
    }
}
