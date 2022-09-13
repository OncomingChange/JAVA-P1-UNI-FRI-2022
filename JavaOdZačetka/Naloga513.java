package JavaOdZačetka;

import java.util.*;

public class Naloga513 {
    public static void main(String[] args) {
        int[] tabela = {6, 3, 4, 8, 5, 7};
        uredi(tabela);
        System.out.println(Arrays.toString(tabela));
    }

    public static void uredi(int[] t) {
        for (int i = 1; i < t.length; i +=2) {
            int el = t[i];
            int j = i - 2;
            while (j >= 0 && t[j] < el) {
                t[j + 2] = t[j];
                j -= 2;
            }
        t[j + 2] = el;
        }

        for (int i = 2; i < t.length; i += 2) {
            int el = t[i];
            int j = i - 2;
            while (j >= 0 && t[j] > el) {
                t[j + 2] = t[j];
                j -= 2;
            }
        t[j + 2] = el;
        }
    }
}
