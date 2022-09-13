
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Test02 {

    public static void main(String[] args) {
        List<Integer> stevila = new ArrayList<>();
        for (int i = 1;  i <= 100;  i++) {
            stevila.add(i);
        }

        Comparator<Integer> c2 = (a, b) -> (a % 2 - b % 2);
        Comparator<Integer> c3 = (a, b) -> (a % 3 - b % 3);
        Comparator<Integer> c5 = (a, b) -> (a % 5 - b % 5);

        Comparator<Integer> c = KombinacijaPrimerjalnikov.kombinacija(List.of(c2, c3, c5));
        stevila.sort(c);
        System.out.println(stevila);
    }
}
