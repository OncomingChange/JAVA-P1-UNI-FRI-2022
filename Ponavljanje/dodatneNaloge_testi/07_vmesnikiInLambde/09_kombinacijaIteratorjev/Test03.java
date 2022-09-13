
import java.util.List;
import java.util.Iterator;

public class Test03 {

    public static void main(String[] args) {
        List<String> a = List.of("Andrej", "Barbara", "Cene", "Darja");
        List<String> b = List.of("Artnik", "Babnik", "Cvikl", "Dolenc");
        List<String> c = List.of("Leva 1", "Zgornja 2", "Desna 3", "Spodnja 4");
        List<String> d = List.of("1000", "2000", "3000", "4000");
        List<String> e = List.of("Ljubljana", "Maribor", "Celje", "Kranj");

        Iterator<String> it = KombinacijaIteratorjev.kombinacija(
                List.of(a.iterator(), b.iterator(), c.iterator(), d.iterator(), e.iterator()));
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
