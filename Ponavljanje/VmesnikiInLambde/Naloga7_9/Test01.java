
import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {

    public static void main(String[] args) {
        List<Object> a = List.of(1, 2, 3);
        List<Object> b = List.of("ana", "bojan", "cvetka");
        Set<Object> c = new TreeSet<>(List.of('p', 'q', 'r'));
        Iterator<Object> it = KombinacijaIteratorjev.kombinacija(
                List.of(a.iterator(), b.iterator(), c.iterator()));

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
