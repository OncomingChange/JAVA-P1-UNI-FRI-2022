import java.util.*;

public class I36VsiRazlicni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tabelica = new int[n];
        // System.out.println(Arrays.toString(tabelica));

        for (int i = 0; i < n; i++) {
            tabelica[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toStrin(tabelica));

        urediTabelo(tabelica);
        System.out.println(prviPodvojeniElement(urediTabelo(tabelica)));
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

    public static String prviPodvojeniElement(int[] urejenaTabela) {
        String element = "RAZLICNI";
        for (int i = 1; i < urejenaTabela.length; i++) {
            if (urejenaTabela[i - 1] == urejenaTabela[i]) {
                element = Integer.toString(urejenaTabela[i]);
                return element;
            }
        }
        return element;
    }
}
