package JavaOdZačetka;

import java.util.*;

public class Naloga514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("naraščajoče == 1, padajoče != 1: ");
        int naraščanje = sc.nextInt();

        int[] tabela = {6, 3, 4, 8, 5, 7};
        uredi(tabela, naraščanje);

        System.out.println(Arrays.toString(tabela));
    }

    public static void uredi(int[] t, int naraščanje) {
        // naraščanje
        if (naraščanje == 1) {
            for (int i = 1; i < t.length; i++) {
                int el = t[i];
                int j = i - 1;
                while (j >= 0 && t[j] > el) {
                    t[j + 1] = t[j];
                    j--;
                }
                t[j + 1] = el;
            }
        }   
        // padanje
        else {
            for (int i = 1; i < t.length; i++) {
                int el = t[i];
                int j = i - 1;
                while (j >= 0 && t[j] < el) {
                    t[j + 1] = t[j];
                    j--;
                }
                t[j + 1] = el;
            }
        } 
    }
}

