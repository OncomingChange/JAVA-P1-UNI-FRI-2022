
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Test02 {

    public static void main(String[] args) {
        Comparator<String> primerjalnik = ComparableVComparator.pretvori();
        List<String> imena = new ArrayList<>(List.of("Mojca", "Bojan", "Eva", "Iva", "Cvetka", "Denis", "Janez", "Vinko", "Mirko", "Nina"));
        imena.sort(primerjalnik);
        System.out.println(imena);
    }
}
