
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Set<String> imena = Set.of("ana", "bojan", "cvetko", "denis", "eva");

        Set<String> imenaPlus = new HashSet<>(imena);
        imenaPlus.add("franci");

        Set<String> imenaMinus = new HashSet<>(imena);
        imenaMinus.remove("cvetko");

        izpisi(PresekMnozic.presek(List.of(imena, imena, imena)));
        izpisi(PresekMnozic.presek(List.of(imena, imenaPlus, imenaMinus)));
    }

    private static <T> void izpisi(Set<T> mnozica) {
        System.out.println(new TreeSet<>(mnozica));
    }
}
