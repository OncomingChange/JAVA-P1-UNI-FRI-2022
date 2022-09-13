
import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.List;

public class Test02 {

    public static void main(String[] args) {
        List<Integer> a = List.of(10, 20, 30, 40, 50);
        Iterator<Integer> it = KombinacijaIteratorjev.kombinacija(List.of(a.iterator()));
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
