
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Map<String, String> slovar = Map.of(
                "deska", "board",
                "dobiti", "get",
                "doseci", "get",
                "nacin", "way",
                "odbor", "board",
                "pot", "way",
                "prispeti", "get",
                "risati", "draw",
                "tabla", "board",
                "vleci", "draw"
        );
        Map<String, Set<String>> obrat = ObratSlovarja.obrni(slovar);
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
