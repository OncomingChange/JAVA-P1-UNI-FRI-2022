
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        List<Partija> partije = List.of(
            new Partija("bojan", "denis", 2),
            new Partija("denis", "cvetka", 0),
            new Partija("ana", "denis", 1),
            new Partija("ana", "bojan", 0),
            new Partija("cvetka", "denis", 1),
            new Partija("bojan", "ana", 2),
            new Partija("denis", "cvetka", 1),
            new Partija("ana", "cvetka", 2),
            new Partija("ana", "bojan", 0),
            new Partija("cvetka", "ana", 1)
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
