
public class Test04 {

    public static void main(String[] args) {
        NaravnoStevilo ena = new Ena();
        NaravnoStevilo stiri = new Naslednik(new Naslednik(new Naslednik(ena)));
        NaravnoStevilo devet = new Naslednik(new Naslednik(new Naslednik(new Naslednik(new Naslednik(stiri)))));

        System.out.println(koliko( ena.vsota(stiri) ));
        System.out.println(koliko( stiri.vsota(ena) ));
        System.out.println(koliko( stiri.vsota(devet) ));
        System.out.println(koliko( devet.vsota(stiri) ));
        System.out.println(koliko( devet.vsota(devet) ));
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
