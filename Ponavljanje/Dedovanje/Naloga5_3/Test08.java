
public class Test08 {

    public static void main(String[] args) {
        Seznam s1 = izdelaj(new int[]{});
        Seznam s2 = izdelaj(new int[]{42});
        Seznam s3 = izdelaj(new int[]{5, 3});
        Seznam s4 = izdelaj(new int[]{10, 10, 10, 10, 10, 10});
        Seznam s5 = izdelaj(new int[]{7, 5, 5, 5, 3});
        Seznam s6 = izdelaj(new int[]{10, 30, 10, 30, 10, 30, 10, 30});
        Seznam s7 = izdelaj(new int[]{50, 30, 60, 100, 80, 40, 10, 70, 20, 90});

        izpisi(s1.uredi());
        izpisi(s2.uredi());
        izpisi(s3.uredi());
        izpisi(s4.uredi());
        izpisi(s5.uredi());
        izpisi(s6.uredi());
        izpisi(s7.uredi());
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
