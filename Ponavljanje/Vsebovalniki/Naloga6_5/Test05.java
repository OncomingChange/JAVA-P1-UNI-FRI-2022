
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Test05 {

    private static class Cas implements Comparable<Cas> {
        private int h, min;

        public Cas(int h, int min) {
            this.h = h;
            this.min = min;
        }

        private int vrednost() {
            return 60 * this.h + this.min;
        }

        @Override
        public int compareTo(Cas drugi) {
            return (this.vrednost() - drugi.vrednost());
        }

        @Override
        public String toString() {
            return String.format("%d:%02d", this.h, this.min);
        }
    }

    public static void main(String[] args) {
        Set<Set<Cas>> mm = PotencnaMnozica.potencna(Set.of(
                    new Cas(15, 40), new Cas(19, 20), new Cas(6, 50), new Cas(13, 30)));
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
