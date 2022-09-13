
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Set<Character> znaki = new TreeSet<>();
        for (char c = 'A';  c <= 'Z';  c++) {
            znaki.add(c);
        }

        char[] odstrani = {'C', 'F', 'H', 'K', 'P'};
        List<Set<Character>> seznam = new ArrayList<>();
        for (int i = 0;  i < odstrani.length;  i++) {
            Set<Character> s = new TreeSet<>(znaki);
            s.remove(odstrani[i]);
            seznam.add(s);
        }
        izpisi(PresekMnozic.presek(seznam));
    }

    private static <T> void izpisi(Set<T> mnozica) {
        System.out.println(new TreeSet<>(mnozica));
    }
}
