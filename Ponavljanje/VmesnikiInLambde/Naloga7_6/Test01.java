
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Test01 {

    public static void main(String[] args) {
        List<String> imena = new ArrayList<>(List.of(
                    "Eva", "Gabrijela", "Denis", "Janez", "Ana",
                    "Franci", "Iva", "Cvetka", "Hinko", "Bojan"));

        Comparator<String> poDolzini = (a, b) -> (a.length() - b.length());
        Comparator<String> poAbecedi = (a, b) -> (a.compareTo(b));

        Comparator<String> c = KombinacijaPrimerjalnikov.kombinacija(List.of(poDolzini, poAbecedi));
        imena.sort(c);
        System.out.println(imena);
    }
}
