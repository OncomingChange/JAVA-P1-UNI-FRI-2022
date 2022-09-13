
import java.util.List;

public class Test01 {

    public static void main(String[] args) {
        List<Integer> stevila = List.of(10, 31, 17, 19, 23, 64, 18, 22, 33, 37);

        System.out.println(ZadnjeUjemanje.zadnji(stevila, n -> n % 2 == 0));
        System.out.println(ZadnjeUjemanje.zadnji(stevila, n -> n % 2 == 1));
        System.out.println(ZadnjeUjemanje.zadnji(stevila, n -> n % 5 == 0));
        System.out.println(ZadnjeUjemanje.zadnji(stevila, n -> n % 7 == 0));
    }
}
