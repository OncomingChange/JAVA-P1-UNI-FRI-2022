import java.util.*;
import java.util.function.*;

public class ObratPrimerjalnika {
    public static <T> Comparator<T> obrni(Comparator<T> primerjalnik) {
        return primerjalnik.reversed();
    }

    public static <T> void urediPadajoce(List<T> seznam, Comparator<T> primerjalnik) {
        seznam.sort(obrni(primerjalnik));
    }
}
