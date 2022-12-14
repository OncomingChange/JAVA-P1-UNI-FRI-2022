package JavaOdZačetka;

import java.util.Arrays;

public class Naloga530 {
    public static void main(String[] args) {
        int[][][] temperatura = {
            {
                {25, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8},
                {25, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8},
                {25, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8},
                {55, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8},
                {25, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8},
                {25, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8}
            },
            {
                {25, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8},
                {25, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8},
                {25, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8},
                {44, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8},
                {25, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8},
                {25, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8}
            },
            {
                {25, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8},
                {25, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8},
                {25, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8},
                {90, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8},
                {25, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8},
                {25, 17, 13, 2, 40, 14, 29, 20, 19, 22, 26, 27, 6, 28, 1, 24, 12, 5, 37, 21, 39, 4, 36, 35, 38, 18, 3, 34, 7, 8}
            }
        };

        System.out.println(Arrays.toString(mesecnoPovprecje(temperatura)));
    }
    
    public static double[] mesecnoPovprecje(int[][][] temperatura) {
        double[] meseci = new double[temperatura[0].length];
        for (int le = 0; le < temperatura.length; le++) {
            for (int me = 0; me < temperatura[le].length; me++) {
                int vsotaMeseca = 0;
                for (int da = 0; da < temperatura[le][me].length; da++) {
                    vsotaMeseca += temperatura[le][me][da];
                }
                meseci[me] += vsotaMeseca / temperatura[le][me].length;
            }
        }
        for (int x = 0; x < temperatura[0].length; x++) {
            meseci[x] /= temperatura.length;
        }
        return meseci;
    }
}
