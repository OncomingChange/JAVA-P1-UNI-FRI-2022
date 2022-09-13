
import java.util.List;

public class Test01 {

    public static void main(String[] args) {
        pozeni(List.of(List.of(30), List.of(20, 50, 10), List.of(30, 40)));
        pozeni(List.of(List.of(1), List.of(2), List.of(3), List.of(4), List.of(5)));
        pozeni(List.of(List.of(1, 2, 3, 4, 5)));
        pozeni(List.of(List.of(), List.of(1), List.of(1, 2), List.of(1, 2, 3), List.of(1, 2, 3, 4)));
        pozeni(List.of(List.of()));
        pozeni(List.of());

        pozeni(List.of(List.of("Ivan", "Cankar"), List.of("Skodelica", "kave")));
        pozeni(List.of(List.of("", "a"), List.of("b", "c", "d", "a"), List.of("a", "", "b", "a")));
    }

    private static <T> void pozeni(List<List<T>> seznam) {
        System.out.println(SploscitevSeznama.splosci(seznam));
    }
}
