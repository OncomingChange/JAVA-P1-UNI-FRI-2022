
import java.util.Comparator;

public class Test01 {

    public static void main(String[] args) {
        Comparator<Integer> c1 = ObratPrimerjalnika.obrni((a, b) -> a - b);
        System.out.println(c1.compare(5, 6));
        System.out.println(c1.compare(5, 5));
        System.out.println(c1.compare(5, 4));

        Comparator<String> c2 = ObratPrimerjalnika.obrni((a, b) -> a.length() - b.length());
        System.out.println(c2.compare("ana", "bojan"));
        System.out.println(c2.compare("bojan", "ana"));
        System.out.println(c2.compare("ana", "ana"));
    }
}
