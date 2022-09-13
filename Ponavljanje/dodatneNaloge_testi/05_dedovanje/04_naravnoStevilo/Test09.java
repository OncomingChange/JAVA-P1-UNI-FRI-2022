
public class Test09 {

    public static void main(String[] args) {
        System.out.println(koliko( NaravnoStevilo.ustvariIzInt(1) ));
        System.out.println(koliko( NaravnoStevilo.ustvariIzInt(10) ));
        System.out.println(koliko( NaravnoStevilo.ustvariIzInt(42) ));
    }

    private static int koliko(NaravnoStevilo stevilo) {
        int n = 1;
        while (!stevilo.jeEna()) {
            stevilo = stevilo.predhodnik();
            n++;
        }
        return n;
    }
}
