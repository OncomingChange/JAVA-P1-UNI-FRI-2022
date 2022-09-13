package JavaOdZačetka;

import java.util.*;

public class Naloga522 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n + 1; i++) {
            System.out.println(Arrays.toString(tabela(n)[i]));
        }
    }

    public static int[][] tabela (int n) {
        int [][] t = new int [n + 1][];
        for (int i = 0; i < t.length; i++) {
            t [i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                t [i][j] = vrednost(i, j);
            }
        }
        return t;
    }

    public static int vrednost(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        else if (k == 0 || k == n) {
            return 1;
        }
        else {
            return (vrednost(n - 1, k) + vrednost(n - 1, k - 1));
        }
    }
}
