
import java.util.List;

public class Test04 {

    public static void main(String[] args) {
        List<Cas> casi = List.of(
                new Cas(5, 30), new Cas(15, 10), new Cas(11, 40), new Cas(0, 15),
                new Cas(19, 20), new Cas(23, 40), new Cas(16, 10), new Cas(18, 20),
                new Cas(6, 50), new Cas(9, 15), new Cas(12, 30), new Cas(14, 0)
        );

        int[] skoki = {5, 6, 7, -5, -6, -7};

        for (int skok: skoki) {
            for (Cas t: new SprehodSPreskoki<Cas>(casi, skok)) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
    }
}
