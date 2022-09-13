
import java.util.List;

public class Test04 {

    public static void main(String[] args) {
        List<String> imena = List.of("Cvetko", "Darja", "Eva", "Bojan", "Franci", "Gabrijela", "Ana");
        System.out.println(Kumulativa.doslejNajvecji(imena, (a, b) -> a.compareTo(b)));
        System.out.println(Kumulativa.doslejNajvecji(imena, (a, b) -> b.compareTo(a)));
        System.out.println(Kumulativa.doslejNajvecji(imena, (a, b) -> a.length() - b.length()));
        System.out.println(Kumulativa.doslejNajvecji(imena, (a, b) -> b.length() - a.length()));
    }
}
