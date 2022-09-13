import java.util.*;
import java.util.function.*;

public class KombinacijaIteratorjev<T> {
    public static <T> Iterator<T> kombinacija(List<Iterator<T>> iteratorji) {
        return (List) -> {
            while (hasNext()) {
                for (int i = 0; i < iteratorji.size(); i++) {
                    if (iteratorji[i].hasNext()) {
                        iteratorji[i].next();
                    }
                }
            }
        };
    }
}
