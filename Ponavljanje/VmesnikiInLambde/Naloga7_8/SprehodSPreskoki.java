import java.util.*;
import java.util.function.*;

public class SprehodSPreskoki<T> implements Iterable<T>{
    List<T> seznam;
    int korak;

    public SprehodSPreskoki(List<T> seznam, int korak) {
        this.seznam = seznam;
        this.korak = korak;
    }

    @Override
    public Iterator<T> iterator() {
            Iterator<T> it = new Iterator<T>() {
                private int currentIndex = korak > 0 ? 0 : seznam.size() - 1;

                @Override
                public boolean hasNext() {
                    if (korak > 0) {
                        return currentIndex < seznam.size() && seznam.get(currentIndex) != null;
                    }
                    else {
                        return currentIndex >= 0 && seznam.get(currentIndex) != null;
                    }
                }
    
                @Override
                public T next() {
                    T vrni = seznam.get(currentIndex);
                    currentIndex += korak;
                    return vrni;
                }
    
                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
            return it;
        }
    }