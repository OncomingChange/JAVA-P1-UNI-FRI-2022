package Tabele;
import java.util.*;
public class cNaloga7 {
    private static final int MAKS_STEVILO = 10000;
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int seme = sc.nextInt();
            int n = sc.nextInt();
            Random random = new Random(seme);
            int[] tabela = new int[n];

            ustvarjanjeTabele(tabela, random);
            preverjanjePonavljanja(tabela);
        }
    }

    public static void ustvarjanjeTabele(int[] tabela, Random random) {
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = random.nextInt(2 * MAKS_STEVILO + 1) - MAKS_STEVILO;
        }
    }

    public static void preverjanjePonavljanja(int[] tabela) {
        int[] ponovitve = new int[20001];

        for (int i = 0; i < tabela.length; i++) {
            ponovitve[tabela[i] + 10000]++;
        }

        int maxPonavljanja = 1;
        int število = 10001;

        for (int i = 0; i < ponovitve.length; i++) {
            if (ponovitve[i] > maxPonavljanja) {
                maxPonavljanja = ponovitve[i];
                število = i - 10000;
            }
        }
        if (maxPonavljanja > 1) {
            System.out.print(število);
        }
        else {
            System.out.print("RAZLICNI");
        }
    }
}

