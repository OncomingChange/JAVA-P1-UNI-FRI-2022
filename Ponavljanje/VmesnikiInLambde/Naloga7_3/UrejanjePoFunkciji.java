import java.util.*;
import java.util.function.*;

public class UrejanjePoFunkciji {
    public static<T, R extends Comparable<R>> void urediPoFunkciji(List<T> seznam, Function<T, R> funkcija) {
        seznam.sort((o1, o2) -> funkcija.apply(o1).compareTo(funkcija.apply(o2)));
    }

    public static void urediPoAbsolutniVrednosti(List<Integer> stevila) {
        urediPoFunkciji(stevila, stevilo -> Math.abs(stevilo));
    }

    public static void urediPoDolzini(List<String> nizi) {
        urediPoFunkciji(nizi, niz -> niz.length());
    }

    public static <T extends Comparable<T>> List<Integer> vrstniRed(List<T> seznam) {
        // nisem naredil z uporabo metode "urediPoFunkciji"...
        List<T> prvotniSeznam = new ArrayList<>(seznam);
        seznam.sort(null);
        List<Integer> list = new ArrayList<>(seznam.size());
        for (T element: seznam) {
            for (T prvotniElement: prvotniSeznam) {
                if (element.equals(prvotniElement)) {
                    list.add(prvotniSeznam.indexOf(prvotniElement));
                }
            }
        }
        return list;
    }
}
