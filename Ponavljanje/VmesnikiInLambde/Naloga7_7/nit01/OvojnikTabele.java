import java.util.*;
import java.util.function.*;

public class OvojnikTabele implements Iterable<Object>{
    private Object[] tabela;

    public OvojnikTabele(Object[] tabela) {
        this.tabela = tabela;
    }

    @Override
    public Iterator<Object> iterator() {
        Iterator<Object> it = new Iterator<Object>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < tabela.length && tabela[currentIndex] != null;
            }

            @Override
            public Object next() {
                return tabela[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }


}
