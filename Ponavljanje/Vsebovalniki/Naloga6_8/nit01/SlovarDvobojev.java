import java.util.*;
public class SlovarDvobojev {
    public static NavigableMap<String, NavigableMap<String, Integer>> partije2slovar(List<Partija> partija) {

        NavigableMap<String, NavigableMap<String, Integer>> partije2slovar = new TreeMap<>();
        for (Partija igra: partija) {
            String beli = igra.vrniBelega();
            String crni = igra.vrniCrnega();

            if (beli != crni) {
                if (partije2slovar.containsKey(beli)) {
                    if (partije2slovar.get(beli).containsKey(crni)) {
                        NavigableMap<String, Integer> rezultatiIgralca = partije2slovar.get(beli);
                        rezultatiIgralca.put(crni, rezultatiIgralca.get(crni) + igra.vrniIzid());
                        partije2slovar.put(beli, rezultatiIgralca);
                    }
                    else {
                        NavigableMap<String, Integer> rezultatiIgralca = partije2slovar.get(beli);
                        rezultatiIgralca.put(igra.vrniCrnega(), igra.vrniIzid());
                        partije2slovar.put(beli, rezultatiIgralca);
                    }
                }
                else {
                    NavigableMap<String, Integer> rezultatiIgralca = new TreeMap<String,Integer>();
                    rezultatiIgralca.put(igra.vrniCrnega(), igra.vrniIzid());

                    partije2slovar.put(beli, rezultatiIgralca);
                }


                if (partije2slovar.containsKey(crni)) {
                    if (partije2slovar.get(crni).containsKey(beli)) {
                        NavigableMap<String, Integer> rezultatiIgralca = partije2slovar.get(crni);
                        rezultatiIgralca.replace(beli, rezultatiIgralca.get(beli) + 2 - igra.vrniIzid());
                        partije2slovar.put(crni, rezultatiIgralca);
                    }
                    else {
                        NavigableMap<String, Integer> rezultatiIgralca = partije2slovar.get(crni);
                        rezultatiIgralca.put(igra.vrniBelega(), 2 - igra.vrniIzid());

                        partije2slovar.put(crni, rezultatiIgralca);
                    }
                }
                else {
                    NavigableMap<String, Integer> rezultatiIgralca = new TreeMap<String,Integer>();
                    rezultatiIgralca.put(igra.vrniBelega(), 2 - igra.vrniIzid());

                    partije2slovar.put(crni, rezultatiIgralca);
                }
            }
        }

        for (String igralec1: partije2slovar.keySet()) {
            for (String igralec2: partije2slovar.keySet()) {
                if (!igralec1.equals(igralec2) && !partije2slovar.get(igralec1).containsKey(igralec2)) {
                    NavigableMap<String, Integer> rezultatiIgralca = partije2slovar.get(igralec1);
                    rezultatiIgralca.put(igralec2, 0);
                    partije2slovar.put(igralec1, rezultatiIgralca);
                }
            }
        }
        return partije2slovar;
    }
}
