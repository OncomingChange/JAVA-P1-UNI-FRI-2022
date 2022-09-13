
import java.util.Random;

public class Test01 {

    public static void main(String[] args) {
        // delali bomo s tabelo dol"zine 10
        int a = 10;

        Ptabela p = new Ptabela(new int[]{a});

        Random random = new Random(1234567);
        for (int i = 0;  i < a;  i++) {
            p.nastavi(new int[]{i}, random.nextInt(19999) - 9999);
        }

        for (int i = 0;  i < a;  i++) {
            System.out.println(p.vrni(new int[]{i}));
        }
    }
}
