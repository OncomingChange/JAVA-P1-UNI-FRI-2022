
import java.util.Random;

public class Test04 {

    public static void main(String[] args) {
        // delali bomo s tabelo 4 x 2 x 3 x 5
        int a = 4, b = 2, c = 3, d = 5;  

        Ptabela p = new Ptabela(new int[]{a, b, c, d});

        Random random = new Random(12345);
        for (int i = 0;  i < a;  i++) {
            for (int j = 0;  j < b;  j++) {
                for (int k = 0;  k < c;  k++) {
                    for (int l = 0;  l < d;  l++) {
                        p.nastavi(new int[]{i, j, k, l}, random.nextInt(1999) - 999);
                    }
                }
            }
        }

        for (int i = 0;  i < a;  i++) {
            for (int j = 0;  j < b;  j++) {
                for (int k = 0;  k < c;  k++) {
                    for (int l = 0;  l < d;  l++) {
                        System.out.println(p.vrni(new int[]{i, j, k, l}));
                    }
                }
            }
        }
    }
}
