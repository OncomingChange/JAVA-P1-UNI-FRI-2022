
public class Test07 {

    public static void main(String[] args) {
        Seznam seznam = izdelaj(new int[]{7, 3, 6, 3, 2, 3});
        izpisi(seznam);
        izpisi(seznam.odstrani(7));
        izpisi(seznam.odstrani(6));
        izpisi(seznam.odstrani(2));
        izpisi(seznam.odstrani(3));
        izpisi(seznam.odstrani(1));
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
