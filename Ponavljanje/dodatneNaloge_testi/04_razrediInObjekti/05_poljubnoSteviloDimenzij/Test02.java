
import java.util.Random;

public class Test02 {

    public static void main(String[] args) {
        // delali bomo s tabelo 7 x 6
        int a = 7, b = 6;

        Ptabela p = new Ptabela(new int[]{a, b});

        Random random = new Random(12345);
        for (int i = 0;  i < a;  i++) {
            for (int j = 0;  j < b;  j++) {
                p.nastavi(new int[]{i, j}, random.nextInt(199) - 99);
            }
        }

        for (int i = 0;  i < a;  i++) {
            for (int j = 0;  j < b;  j++) {
                System.out.println(p.vrni(new int[]{i, j}));
            }
        }
    }
}
