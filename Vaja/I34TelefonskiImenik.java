import java.util.Scanner;
import java.util.Arrays;

public class I34TelefonskiImenik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] imenik = new String[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            imenik[i] = sc.next();
        }
        // System.out.println(Arrays.toString(imenik));

        int k = sc.nextInt();

        String[] klicatelji = new String[k];
        for (int i = 0; i < k; i++) {
            klicatelji[i] = sc.next();
        }
        // System.out.println(Arrays.toString(klicatelji));

        for (int i = 0; i < k; i++) {
            System.out.println(številka(klicatelji[i], imenik));
        }
    }

    public static String številka(String klicatelj, String[] imenik) {
        String številka = "NEZNANA";
        for (int i = 0; i < imenik.length; i += 2) {
            if (imenik[i].equals(klicatelj)) {
                številka = imenik[i + 1];
            }
        }
        return številka;
    }
}
