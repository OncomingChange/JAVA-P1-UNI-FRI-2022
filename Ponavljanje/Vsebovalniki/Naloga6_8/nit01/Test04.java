
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        List<Partija> partije = List.of(
            new Partija("A", "B", 0),
            new Partija("C", "A", 0),
            new Partija("B", "C", 0),
            new Partija("B", "A", 1),
            new Partija("A", "C", 2),
            new Partija("B", "A", 2),
            new Partija("C", "B", 2),
            new Partija("C", "A", 0),
            new Partija("C", "B", 0),
            new Partija("A", "B", 1),
            new Partija("B", "C", 1),
            new Partija("C", "A", 1),
            new Partija("A", "B", 2),
            new Partija("B", "C", 2),
            new Partija("C", "A", 2)
        );
        NavigableMap<String, NavigableMap<String, Integer>> slovar = SlovarDvobojev.partije2slovar(partije);
        izpisi(slovar);
    }

    private static void izpisi(Map<String, NavigableMap<String, Integer>> slovar) {
        for (String beli: slovar.keySet()) {
            System.out.printf("%s -> {", beli);
            Map<String, Integer> nasprotniki = slovar.get(beli);
            boolean prvic = true;
            for (String crni: nasprotniki.keySet()) {
                if (!prvic) {
                    System.out.print(", ");
                }
                prvic = false;
                System.out.printf("%s -> %s", crni, nasprotniki.get(crni));
            }
            System.out.println("}");
        }
    }
}
