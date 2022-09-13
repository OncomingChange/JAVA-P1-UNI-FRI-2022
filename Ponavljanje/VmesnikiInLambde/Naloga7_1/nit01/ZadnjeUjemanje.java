import java.util.*;
import java.util.function.*;

public class ZadnjeUjemanje {
    public static <T> T zadnji(Collection<T> zbirka, Predicate<T> pogoj) {
        T zadnjiUstrezni = null;
        for (T element: zbirka) {
            if (pogoj.test(element)) {
                zadnjiUstrezni = element;
            }
        }
        return zadnjiUstrezni;
    }
}
