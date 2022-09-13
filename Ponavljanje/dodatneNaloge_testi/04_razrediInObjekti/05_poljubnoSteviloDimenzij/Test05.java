
import java.util.Random;

public class Test05 {

    public static void main(String[] args) {
        // delali bomo s tabelo 4 x 2 x 3 x 1 x 5
        int a = 4, b = 2, c = 3, d = 1, e = 5;

        Ptabela p = new Ptabela(new int[]{a, b, c, d, e});

        Random random = new Random(123456);
        for (int i = 0;  i < a;  i++) {
            for (int j = 0;  j < b;  j++) {
                for (int k = 0;  k < c;  k++) {
                    for (int l = 0;  l < d;  l++) {
                        for (int m = 0;  m < e;  m++) {
                            p.nastavi(new int[]{i, j, k, l, m}, random.nextInt(1999) - 999);
                        }
                    }
                }
            }
        }

        for (int i = 0;  i < a;  i++) {
            for (int j = 0;  j < b;  j++) {
                for (int k = 0;  k < c;  k++) {
                    for (int l = 0;  l < d;  l++) {
                        for (int m = 0;  m < e;  m++) {
                            System.out.println(p.vrni(new int[]{i, j, k, l, m}));
                        }
                    }
                }
            }
        }
    }
}
