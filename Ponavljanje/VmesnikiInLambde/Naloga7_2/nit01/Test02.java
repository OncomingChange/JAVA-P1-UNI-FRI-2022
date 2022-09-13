
import java.util.List;

public class Test02 {

    public static void main(String[] args) {
        List<String> imena = List.of("Ana", "Bojan", "Cvetko", "Darja", "Eva", "Franci", "Gabrijela");
        System.out.println(Kumulativa.kumulativa(imena, (a, b) -> a + b));
        System.out.println(Kumulativa.kumulativa(imena, (a, b) -> a.length() >= b.length() ? a : b));
    }
}
