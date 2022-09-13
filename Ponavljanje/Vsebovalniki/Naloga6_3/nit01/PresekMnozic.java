import java.util.*;

public class PresekMnozic {
    
    public static <T> Set<T> presek(Collection<Set<T>> mnozice) {
        if (mnozice.size() == 1) {
            return (Set<T>) mnozice;
        }
        else {
            Set<T> presekMnozic = new HashSet<>();
            for (Set<T> element: mnozice) {
                presekMnozic.addAll(element);
                for (Set<T> element2: mnozice) {
                    if (!element.equals(element2)) {
                        presekMnozic.retainAll(element2);
                    }
                }
                break;
            }
            return presekMnozic;
        }
    }
}
