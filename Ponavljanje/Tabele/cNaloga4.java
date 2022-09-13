package Tabele;
import java.util.*;
public class cNaloga4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String[][] imenik = new String[2][n];

            //izdelava dvostolpične tabele (0: imena, 1: številke)
            for (int i = 0; i < imenik[0].length; i++) {
                imenik[0][i] = sc.next();
                imenik[1][i] = sc.next();
            }


            int k = sc.nextInt();
            izpisStevilk(imenik, k, sc);
        }
    }

    public static void izpisStevilk(String[][] imenik, int k, Scanner sc) {
        for (int i = 1; i <= k; i++) {
            int indeks = -1;
            String ime = sc.next();
            for (int n = 0; n < imenik[0].length; n++) {
                if (ime.equals(imenik[0][n])) {
                    indeks = n;
                }
            }
            if (indeks == -1) {
                System.out.println("NEZNANA");
            }
            else {
                System.out.println(imenik[1][indeks]);
            }
        }
    }
}
