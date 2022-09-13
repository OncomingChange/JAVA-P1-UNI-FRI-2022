
public class Test06 {

    public static void main(String[] args) {
        NaravnoStevilo ena = new Ena();
        NaravnoStevilo stiri = new Naslednik(new Naslednik(new Naslednik(ena)));
        NaravnoStevilo devet = new Naslednik(new Naslednik(new Naslednik(new Naslednik(new Naslednik(stiri)))));

        System.out.println(koliko( ena.zmnozek(stiri) ));
        System.out.println(koliko( stiri.zmnozek(ena) ));
        System.out.println(koliko( stiri.zmnozek(devet) ));
        System.out.println(koliko( devet.zmnozek(stiri) ));
        System.out.println(koliko( devet.zmnozek(devet) ));
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
