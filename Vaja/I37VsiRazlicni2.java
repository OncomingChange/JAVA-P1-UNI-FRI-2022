import java.util.*;

public class I37VsiRazlicni2 {
    private static final int MAKS_STEVILO = 10000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seme = sc.nextInt();
        int n = sc.nextInt();

        Random random = new Random(seme);
        int[] tabela = new int[n];

        for (int i = 0; i < n; i++) {
            tabela[i] = random.nextInt(2 * MAKS_STEVILO + 1) - MAKS_STEVILO;
        }
        // System.out.println(Arrays.toString(urediTabelo(tabela)));

        // System.out.println(najPonovljeniElement(urediTabelo(tabela)));
        // urediTabelo(tabela);
        System.out.print("done");
    }

    public static String najPonovljeniElement(int[] urejenaTabela) {
        String element = "RAZLICNI";
        int ponovitve = 0;
        int maxPonovitve = 0;
        if (urejenaTabela.length == 1) {
            return element;
        }
        for (int i = 0; i < urejenaTabela.length; i++) {
            if (i == 0) {
                if (urejenaTabela[i + 1] == urejenaTabela[i]) {
                    ponovitve++;
                        if (ponovitve > maxPonovitve) {
                        maxPonovitve = ponovitve;
                        element = Integer.toString(urejenaTabela[i]);
                    }
                }
                else {
                    ponovitve = 0;
                }
                }
            else {
                if (urejenaTabela[i - 1] == urejenaTabela[i]) {
                    ponovitve++;
                        if (ponovitve > maxPonovitve) {
                        maxPonovitve = ponovitve;
                        element = Integer.toString(urejenaTabela[i]);
                    }
                }
                else {
                    ponovitve = 0;
                }
            }
        }
        return element;
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
