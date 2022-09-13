import java.util.*;

public class I317Determinanta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] determinanta = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                determinanta[i][j] = sc.nextInt();
            }
        }

        int rezultat = vrednostDeterminante(determinanta);
        System.out.print(rezultat);
    }

    public static int vrednostDeterminante(int[][] determinanta) {
        int rezultat = 0;
        if (determinanta.length == 1) {
            return determinanta[0][0];
        }
        for (int i = 0; i < determinanta.length; i++) {
            int[][] delDeterminante = new int[determinanta.length - 1][determinanta.length - 1];
            for (int vrstica = 1; vrstica < determinanta.length; vrstica++) {
                int stolpec = 0;
                for (int j = 0; j < determinanta.length; j++) {
                    if (i != j) {
                        delDeterminante[vrstica - 1][stolpec] = determinanta[vrstica][j];
                        stolpec++;
                    }
                }
            }
            /*
            for (int j = 0; j < delDeterminante.length; j++) {
                System.out.println(Arrays.toString(delDeterminante[j]));
            }
            System.out.printf("%n");
            */
            rezultat += Math.pow(-1, i) * determinanta[0][i] * (vrednostDeterminante(delDeterminante));
        }
        return rezultat;
    }
}
