
public class Test06 {

    public static void main(String[] args) {
        Seznam seznam = izdelaj(new int[]{5, 3, 6, 2, 5, 8});
        izpisi(seznam);
        for (int k = 1;  k <= 10;  k++) {
            System.out.println(seznam.vsebuje(k));
        }
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
