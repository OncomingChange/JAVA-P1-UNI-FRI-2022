package Tabele;
import java.util.Scanner;
public class cNaloga5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int k = sc.nextInt();
            int[] števila = new int[2 * k + 1];

            ustvarjanjeTabele(števila, sc);
            urejanjeTabele(števila);
            System.out.print(števila[k]);
        }
    }

    public static void ustvarjanjeTabele(int[] tabela, Scanner sc) {
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = sc.nextInt();
        }
    }

    public static void urejanjeTabele(int[] tabela) {
        for (int i = 1; i < tabela.length; i++) {
            int element = tabela[i];
            int j = i;
            while (j > 0 && element < tabela[j - 1]) {
                tabela[j] = tabela[j - 1];
                j--;
            }
            tabela[j] = element;
        }
    }
}
