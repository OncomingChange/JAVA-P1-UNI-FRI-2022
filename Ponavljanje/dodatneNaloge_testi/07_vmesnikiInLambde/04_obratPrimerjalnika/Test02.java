
import java.util.List;
import java.util.ArrayList;

import java.util.Comparator;

public class Test02 {

    public static void main(String[] args) {
        List<Integer> stevila = new ArrayList<>(List.of(3, 7, -2, 9, 5, -6, 4));
        ObratPrimerjalnika.urediPadajoce(stevila, (a, b) -> a - b);
        System.out.println(stevila);
        ObratPrimerjalnika.urediPadajoce(stevila, (a, b) -> a % 2 - b % 2);
        System.out.println(stevila);

        List<String> imena = new ArrayList<>(List.of(
                    "Denis", "Hinko", "Eva", "Janez", "Ana",
                    "Bojan", "Gabrijela", "Iva", "Franci", "Cvetka"));
        ObratPrimerjalnika.urediPadajoce(imena, (a, b) -> a.compareTo(b));
        System.out.println(imena);
        ObratPrimerjalnika.urediPadajoce(imena, (a, b) -> a.length() - b.length());
        System.out.println(imena);
    }
}

