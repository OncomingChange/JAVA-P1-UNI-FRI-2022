
import java.util.NoSuchElementException;

public class Test03 {

    public static void main(String[] args) {
        NaravnoStevilo ena = new Ena();
        NaravnoStevilo dve = ena.naslednik();
        NaravnoStevilo tri = dve.naslednik();

        try {
            System.out.println(ena.predhodnik().jeEna());
        } catch (NoSuchElementException ex) {
            System.out.println("izjema");
        }

        System.out.println(dve.predhodnik().jeEna());
        System.out.println(tri.predhodnik().jeEna());
        System.out.println(tri.predhodnik().predhodnik().jeEna());
    }
}
