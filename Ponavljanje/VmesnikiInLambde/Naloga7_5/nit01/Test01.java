
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Test01 {

    public static void main(String[] args) {
        Comparator<Integer> primerjalnik = ComparableVComparator.pretvori();
        List<Integer> stevila = new ArrayList<>(List.of(7, -5, 3, 12, 6, 0, -10, 8, 4, -3));
        stevila.sort(primerjalnik);
        System.out.println(stevila);
    }
}
