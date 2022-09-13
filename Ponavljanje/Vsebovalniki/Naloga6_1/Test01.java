
import java.util.List;

public class Test01 {

    public static void main(String[] args) {
        pozeni(List.of(30, 20, 50, 40));
        pozeni(List.of(70, 90));
        pozeni(List.of());
        pozeni(List.of(5));
        pozeni(List.of(2, 9, 3, 5, 1, -6, -3, 4, 0, 7, -2, 5, 8));

        pozeni(List.of("ana", "bojan", "cvetka", "denis", "eva", "franci"));
        pozeni(List.of("danes", "je", "lep", "dan"));
    }

    private static <T> void pozeni(List<T> seznam) {
        System.out.println(ZrcalnaSlikaSeznama.zrcalnaSlika(seznam));
    }
}
