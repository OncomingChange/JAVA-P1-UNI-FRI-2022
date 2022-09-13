import java.util.*;
import java.util.function.*;

public class KombinacijaIteratorjev<T> {
    public static <T> Iterator<T> kombinacija(List<Iterator<T>> iteratorji) {
        Iterator<T> it = new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                for (int i = 0; i < iteratorji.size(); i++) {
                    currentIndex++;
                    return iteratorji.get(i).hasNext();
                }
                return false;
            }

            @Override
            public T next() {
                for (int i = 0; i < iteratorji.size(); i++) {
                    return iteratorji.get(i).next();
                }
                return null;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}
