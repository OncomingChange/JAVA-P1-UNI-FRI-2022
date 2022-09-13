
import java.util.List;

public class Test03 {

    public static void main(String[] args) {
        List<String> imena = List.of(
                "Ana", "Bojan", "Cvetka", "Denis", "Eva", "Franci", "Gabrijela", "Hinko",
                "Iva", "Janez", "Karel", "Lea", "Mojca", "Nina", "Olga", "Peter", "Roman",
                "Sonja", "Tanja", "Urban", "Vinko", "Zoran");

        int[] skoki = {1, 3, 4, 8, 15, 21, 22, 30,
            -1, -3, -4, -8, -15, -21, -22, -30};

        for (int skok: skoki) {
            for (String t: new SprehodSPreskoki<String>(imena, skok)) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
    }
}
