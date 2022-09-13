import java.util.*;
public class ObratSlovarja {
    public static<K, V> Map<V, Set<K>> obrni(Map<K, V> slovar) {
        Map<V, Set<K>> obrat = new HashMap<V, Set<K>>();

        for(Map.Entry<K, V> par: slovar.entrySet()) {
            if(obrat.containsKey(par.getValue())) {
                Set<K> vrednostiObrata = new HashSet<>(obrat.get(par.getValue()));
                vrednostiObrata.add(par.getKey());
                obrat.put(par.getValue(), vrednostiObrata);
            }
            else {
                Set<K> vrednostiObrata = new HashSet<>();
                vrednostiObrata.add(par.getKey());
                obrat.put(par.getValue(), vrednostiObrata); 
                }
        }
        return obrat;
    }
}
