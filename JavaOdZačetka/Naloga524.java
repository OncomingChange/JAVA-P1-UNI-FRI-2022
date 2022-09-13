package JavaOdZačetka;

import java.util.Arrays;

public class Naloga524 {
    public static void main(String[] args) {
        int[][] tabela = {
            {1, 2, 3, 4},
            {-5, 6, -10, 0},
            {-13, 2, -8, 5}
        };

        System.out.println(Arrays.toString(globalniMaksimum(tabela)));
    }

    public static int[] globalniMaksimum(int[][] t) {
        int[] lokacijaMaksimuma = new int[2];
        int maksimum = t[0][0];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (maksimum < t[i][j]) {
                    maksimum = t[i][j];
                    lokacijaMaksimuma [0] = i;
                    lokacijaMaksimuma [1] = j;
                }
            }
        }
        return lokacijaMaksimuma;
    }
}
