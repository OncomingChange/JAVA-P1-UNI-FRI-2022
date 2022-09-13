import java.util.*;
import java.util.function.*;

public class Kumulativa {
    public static <T> List<T> kumulativa(List<T> seznam, BinaryOperator<T> operator) {
        List<T> kumulativa = new ArrayList<>(seznam.size());
        T vsota = seznam.get(0);
        for (T element: seznam) {
            if (element != seznam.get(0)) {
                vsota = operator.apply(vsota, element);
                kumulativa.add(vsota);
            }
            else {
                kumulativa.add(element);
            }
        }
        return kumulativa;
    }

    public static <T> List<T> doslejNajvecji(List<T> seznam, Comparator<T> primerjalnik) {
        List<T> seznam2 = new ArrayList<>(seznam.size());
        T naj = seznam.get(0);
        for (int i = 0; i < seznam.size(); i++) {
            if (primerjalnik.compare(naj, seznam.get(i)) < 0) {
                naj = seznam.get(i);
                seznam2.add(naj);
            }
            else {
                seznam2.add(naj);
            }
        }
        return seznam2;
    }
}
