
import java.util.Random;

public class Test09 {

    private static final int N = 500;
    private static final int SEME = 20170904;

    public static void main(String[] args) {
        Seznam s1 = izdelaj(new int[]{});
        Seznam s2 = izdelaj(new int[]{42});
        Seznam s3 = izdelaj(new int[]{10, 10, 10, 10, 10, 10});
        Seznam s4 = izdelaj(new int[]{30, 10, 10, 10});
        Seznam s5 = izdelaj(new int[]{10, 30, 10, 30, 10, 30, 10, 30});
        Seznam s6 = izdelaj(new int[]{7, 3, 6, 3, 2, 3, 7, 2, 9});

        Random random = new Random(SEME);
        int[] t = new int[N];
        for (int i = 0;  i < N;  i++) {
            t[i] = random.nextInt(10);
        }
        Seznam s7 = izdelaj(t);

        izpisi(s1.odstraniDuplikate());
        izpisi(s2.odstraniDuplikate());
        izpisi(s3.odstraniDuplikate());
        izpisi(s4.odstraniDuplikate());
        izpisi(s5.odstraniDuplikate());
        izpisi(s6.odstraniDuplikate());
        izpisi(s7.odstraniDuplikate());
    }

    private static Seznam izdelaj(int[] t) {
        return izdelaj(t, 0);
    }

    private static Seznam izdelaj(int[] t, int ixPrvi) {
        if (ixPrvi == t.length) {
            return new Prazen();
        }
        return new Neprazen(t[ixPrvi], izdelaj(t, ixPrvi + 1));
    }

    private static void izpisi(Seznam seznam) {
        boolean prvic = true;
        System.out.print("[");
        while (!seznam.jePrazen()) {
            if (prvic) {
                prvic = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(seznam.glava());
            seznam = seznam.rep();
        }
        System.out.println("]");
    }
}
