
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Test03 {

    public static void main(String[] args) {
        Comparator<Cas> primerjalnik = ComparableVComparator.pretvori();
        List<Cas> casi = new ArrayList<>(List.of(
                    new Cas(18, 25),
                    new Cas(4, 50),
                    new Cas(0, 30),
                    new Cas(23, 10),
                    new Cas(16, 5),
                    new Cas(11, 0),
                    new Cas(7, 45),
                    new Cas(19, 55),
                    new Cas(9, 35),
                    new Cas(2, 20)));
        casi.sort(primerjalnik);
        System.out.println(casi);
    }
}
