
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = Map.ofEntries(
                Map.entry(42, 2),
                Map.entry(35, 2),
                Map.entry(782, 3),
                Map.entry(8, 1),
                Map.entry(10, 2),
                Map.entry(651, 3),
                Map.entry(6, 1),
                Map.entry(8712, 4),
                Map.entry(3421, 4),
                Map.entry(873, 3),
                Map.entry(179, 3),
                Map.entry(71, 2),
                Map.entry(9, 1),
                Map.entry(5391, 4),
                Map.entry(0, 0),
                Map.entry(3, 1),
                Map.entry(45, 2),
                Map.entry(98, 2),
                Map.entry(128, 3),
                Map.entry(216, 3)
        );
        Map<Integer, Set<Integer>> obrat = ObratSlovarja.obrni(slovar);
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
