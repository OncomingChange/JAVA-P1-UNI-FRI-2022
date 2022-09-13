
import java.util.List;
import java.util.ArrayList;

public class Test04 {

    public static void main(String[] args) {
        List<Integer> stevila = new ArrayList<>(List.of(3, 7, -2, 9, 5, -6, 4));
        System.out.println(UrejanjePoFunkciji.vrstniRed(stevila));

        List<String> imena = new ArrayList<>(List.of(
                    "Denis", "Hinko", "Eva", "Janez", "Ana",
                    "Bojan", "Gabrijela", "Iva", "Franci", "Cvetka"));
        System.out.println(UrejanjePoFunkciji.vrstniRed(imena));
    }
}
