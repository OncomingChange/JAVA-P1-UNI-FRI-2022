
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Map<Cas, String> slovar = Map.of(
                new Cas(6, 20), "hrana",
                new Cas(7, 15), "vlak",
                new Cas(8, 30), "sestanek",
                new Cas(10, 15), "vaje",
                new Cas(12, 30), "hrana",
                new Cas(13, 15), "vaje",
                new Cas(17, 20), "vlak",
                new Cas(18, 30), "hrana",
                new Cas(19, 20), "gospodinjstvo",
                new Cas(22, 0), "knjiga"
        );
        Map<String, Set<Cas>> obrat = ObratSlovarja.obrni(slovar);
        izpisi(obrat);
    }

    private static <V, K> void izpisi(Map<V, Set<K>> slovar) {
        Map<V, Set<K>> novi = new TreeMap<>(slovar);
        for (V v: novi.keySet()) {
            novi.put(v, new TreeSet<>(slovar.get(v)));
        }
        for (V v: novi.keySet()) {
            System.out.printf("%s -> %s%n", v, novi.get(v));
        }
    }

    private static class Cas implements Comparable<Cas> {

        private int ura;
        private int minuta;

        public Cas(int h, int min) {
            this.ura = h;
            this.minuta = min;
        }

        @Override
        public String toString() {
            return String.format("%d:%02d", this.ura, this.minuta);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cas)) {
                return false;
            }
            Cas drugi = (Cas) obj;
            return (this.ura == drugi.ura && this.minuta == drugi.minuta);
        }

        @Override
        public int hashCode() {
            return (60 * this.ura + this.minuta);
        }

        @Override
        public int compareTo(Cas drugi) {
            if (this.ura != drugi.ura) {
                return (this.ura - drugi.ura);
            }
            return (this.minuta - drugi.minuta);
        }
    }
}
