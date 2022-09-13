
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Map<String, Integer> slovar = Map.of(
            "Slovenija", 4,
            "Avstrija", 8,
            "Italija", 6,
            "Hrvaska", 5,
            "Ceska", 4,
            "Slovaska", 5,
            "Srbija", 8,
            "Belgija", 4
        );
        Map<Integer, Set<String>> obrat = ObratSlovarja.obrni(slovar);
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
}
