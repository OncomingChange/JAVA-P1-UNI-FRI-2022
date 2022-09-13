import java.util.*;

public class I31NajblizjiElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] tabela = new int[n];
        for (int i = 0; i < n; i++) {
            tabela[i] = sc.nextInt();
        }

        System.out.println(najblizjiElement(tabela, k));
    }

    public static int najblizjiElement(int[] tabela, int k) {
        int najblizji = 0;
        int odstopek = Math.abs(tabela[0] - k);
        for (int i = 1; i < tabela.length; i++) {
            if (Math.abs(tabela[i] - k) < odstopek) {
                odstopek = Math.abs(tabela[i] - k);
                najblizji = i;
            }
        }
        return najblizji;
    }
}
