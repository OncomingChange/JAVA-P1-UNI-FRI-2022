package JavaOdZačetka;

import java.util.Arrays;

public class Naloga26 {
    public static void main(String[] args) {
        int[][] a = {
            {2, 0},
            {-1, -2},
            {3, 1}
        };
        int[][] b = {
            {4, 5, 0},
            {-1, -2, 3}
        };

        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(zmnozi(a, b)[i]));
        }
    }

    public static int[][] zmnozi(int[][] a, int [][] b) {
        int[][] rezultat = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int r = 0; r < a[i].length; r++) {
                    rezultat[i][j] += a[i][r] * b[r][j];
                }
            }
        }
        return rezultat;
    }
}
