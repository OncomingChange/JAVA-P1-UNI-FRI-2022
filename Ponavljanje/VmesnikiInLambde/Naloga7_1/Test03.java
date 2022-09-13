
import java.util.List;

public class Test03 {

    public static void main(String[] args) {
        List<String> imena = List.of("Ana", "Branislava", "Cvetko", "Darja", "Eva", "Franci", "Gabrijela", "Hinko", "Iva", "Jernej",
                "Karolina", "Lea", "Mojca", "Nina", "Olga", "Peter", "Roman", "Sonja", "Tatjana", "Urh", "Vinko", "Zora");

        for (int m = 1;  m <= 11;  m++) {
            int meja = m;
            System.out.println(ZadnjeUjemanje.zadnji(imena, ime -> ime.length() >= meja));
        }
    }
}
