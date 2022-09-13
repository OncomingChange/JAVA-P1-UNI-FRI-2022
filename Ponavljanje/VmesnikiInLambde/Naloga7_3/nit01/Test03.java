
import java.util.List;
import java.util.ArrayList;

public class Test03 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("Ana", "Bojan", "Cvetka",
                    "Denis", "Eva", "Franci", "Gabrijela", "Hinko", "Iva", "Janez"));

        UrejanjePoFunkciji.urediPoDolzini(seznam);
        System.out.println(seznam);
    }
}
