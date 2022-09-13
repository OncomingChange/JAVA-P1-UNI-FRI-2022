import java.util.*;
import java.util.function.*;

public class KombinacijaPrimerjalnikov {
    public static <T> Comparator<T> kombinacija(List<Comparator<T>> primerjalniki) {
        return (a, b) -> {
            for (int i = 0; i < primerjalniki.size(); i++) {
                if (primerjalniki.get(i).compare(a, b) != 0) {
                    return primerjalniki.get(i).compare(a, b);
                }
            }
            return 0;
        };
    }
}
