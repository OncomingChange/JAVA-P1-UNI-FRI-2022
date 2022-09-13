
import java.util.NoSuchElementException;

public class Test05 {

    public static void main(String[] args) {
        NaravnoStevilo ena = new Ena();
        NaravnoStevilo stiri = new Naslednik(new Naslednik(new Naslednik(ena)));
        NaravnoStevilo devet = new Naslednik(new Naslednik(new Naslednik(new Naslednik(new Naslednik(stiri)))));

        try {
            System.out.println(koliko( ena.razlika(stiri) ));
        } catch (NoSuchElementException ex) {
            System.out.println("izjema");
        }

        try {
            System.out.println(koliko( stiri.razlika(ena) ));
        } catch (NoSuchElementException ex) {
            System.out.println("izjema");
        }

        try {
            System.out.println(koliko( stiri.razlika(devet) ));
        } catch (NoSuchElementException ex) {
            System.out.println("izjema");
        }

        try {
            System.out.println(koliko( devet.razlika(stiri) ));
        } catch (NoSuchElementException ex) {
            System.out.println("izjema");
        }

        try {
            System.out.println(koliko( devet.razlika(devet) ));
        } catch (NoSuchElementException ex) {
            System.out.println("izjema");
        }
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
