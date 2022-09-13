import java.util.*;

public class PotencnaMnozica {
    
    public static <T> Set<Set<T>> potencna(Set<T> mnozica) {
        /* Set<Set<T>> mnozicaPodmnozic = new HashSet<Set<T>>();
        mnozicaPodmnozic.add(null);
        for (int i = 1; i < mnozica.size(); i++) {
            Set<T> trenutna = new HashSet<>();
            for (int j = 0; j <= mnozica.size() - i; j++) {

            }
        }
        return mnozicaPodmnozic;
        */
        Set<Set<T>> podmnozice = new HashSet<Set<T>>();
        int n = mnozica.size();
        for (int i = 0; i < (1<<n); i++) {
            Set<T> trenutni = new HashSet();

            int m = 1; // m is used to check set bit in binary representation.
            // Print current subset
            for (T element: mnozica) {
                if ((i & m) > 0){      
                    trenutni.add(element);
                }
                m = m << 1;
            }
            podmnozice.add(trenutni);
        }
        return podmnozice;
    }
}
