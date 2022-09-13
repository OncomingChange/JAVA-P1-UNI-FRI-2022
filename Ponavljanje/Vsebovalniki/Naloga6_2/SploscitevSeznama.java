import java.util.*;

public class SploscitevSeznama {
    
    public static <T> List<T> splosci(List<List<T>> seznami) {
        List<T> seznam = new ArrayList<>();
        for (int i = 0; i < seznami.size(); i++) {
            seznam.addAll(seznami.get(i));
        }
        return seznam;
    }
}
