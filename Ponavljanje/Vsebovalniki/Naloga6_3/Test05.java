
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        izpisi(PresekMnozic.presek(
                    List.of(Set.of(), Set.of(), Set.of())));

        izpisi(PresekMnozic.presek(
                    List.of(Set.of(1), Set.of(2), Set.of(3))));

        izpisi(PresekMnozic.presek(
                    List.of(Set.of(1), Set.of(1), Set.of(1))));
    }

    private static <T> void izpisi(Set<T> mnozica) {
        System.out.println(new TreeSet<>(mnozica));
    }
}
