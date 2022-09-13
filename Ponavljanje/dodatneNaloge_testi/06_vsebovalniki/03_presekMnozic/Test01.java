
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Set<Integer> a = Set.of(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30);
        Set<Integer> b = Set.of(3, 6, 9, 12, 15, 18, 21, 24, 27, 30);
        Set<Integer> c = Set.of(5, 10, 15, 20, 25, 30);
        izpisi(PresekMnozic.presek(Set.of(a, b)));
        izpisi(PresekMnozic.presek(Set.of(a, c)));
        izpisi(PresekMnozic.presek(Set.of(b, c)));
        izpisi(PresekMnozic.presek(Set.of(a, b, c)));
    }

    private static <T> void izpisi(Set<T> mnozica) {
        System.out.println(new TreeSet<>(mnozica));
    }
}
