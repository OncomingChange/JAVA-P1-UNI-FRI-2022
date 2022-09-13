
import java.util.List;
import java.util.Set;

public class Test03 {

    public static void main(String[] args) {
        Object[] tabela = {
            "ana",
            42,
            List.of("bojan"),
            Set.of(),
            List.of(List.of(1, 2, 3), List.of('A', 'B', 'C')),
            new Cas(15, 55)
        };

        OvojnikTabele ovojnik = new OvojnikTabele(tabela);
        for (Object obj: ovojnik) {
            System.out.println(obj);
        }
    }
}
