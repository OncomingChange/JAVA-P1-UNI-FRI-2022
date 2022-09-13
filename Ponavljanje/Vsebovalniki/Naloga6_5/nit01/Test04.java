
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Test04 {

    public static void main(String[] args) {
        Set<Set<String>> mm = PotencnaMnozica.potencna(Set.of("LJ", "MB", "CE", "NM", "KR", "KP"));
        System.out.println(preoblikuj(mm));
    }

    private static <T extends Comparable<T>> List<List<T>> preoblikuj(Set<Set<T>> mm) {
        List<List<T>> ll = new ArrayList<>();
        for (Set<T> m: mm) {
            List<T> l = new ArrayList<>(m);
            l.sort(null);
            ll.add(l);
        }
        ll.sort((p, q) -> primerjaj(p, q));
        return ll;
    }

    private static <T extends Comparable<T>> int primerjaj(List<T> p, List<T> q) {
        if (p.isEmpty() && q.isEmpty()) {
            return 0;
        }
        if (p.isEmpty() || q.isEmpty()) {
            return (p.isEmpty() ? -1 : 1);
        }
        if (p.get(0).compareTo(q.get(0)) != 0) {
            return p.get(0).compareTo(q.get(0));
        }
        return primerjaj(p.subList(1, p.size()), q.subList(1, q.size()));
    }
}
