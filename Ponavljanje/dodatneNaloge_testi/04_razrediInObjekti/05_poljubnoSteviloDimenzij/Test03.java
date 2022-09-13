
import java.util.Random;

public class Test03 {

    public static void main(String[] args) {
        // delali bomo s tabelo 3 x 4 x 5
        int a = 3, b = 4, c = 2;  

        Ptabela p = new Ptabela(new int[]{a, b, c});

        Random random = new Random(12345);
        for (int i = 0;  i < a;  i++) {
            for (int j = 0;  j < b;  j++) {
                for (int k = 0;  k < c;  k++) {
                    p.nastavi(new int[]{i, j, k}, random.nextInt(199) - 99);
                }
            }
        }

        for (int i = 0;  i < a;  i++) {
            for (int j = 0;  j < b;  j++) {
                for (int k = 0;  k < c;  k++) {
                    System.out.println(p.vrni(new int[]{i, j, k}));
                }
            }
        }
    }
}
