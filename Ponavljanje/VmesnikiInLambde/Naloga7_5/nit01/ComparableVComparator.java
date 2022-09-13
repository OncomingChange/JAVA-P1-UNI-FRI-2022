import java.util.*;
import java.util.function.*;

public class ComparableVComparator {
    public static <T extends Comparable<T>> Comparator<T> pretvori() {
        return Comparator.naturalOrder();
    }
}
