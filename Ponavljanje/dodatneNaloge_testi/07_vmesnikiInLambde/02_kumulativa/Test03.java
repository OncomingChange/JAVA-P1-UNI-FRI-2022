
import java.util.List;

public class Test03 {

    public static void main(String[] args) {
        List<Integer> stevila = List.of(3, 7, -2, 9, 5, -6, 4);
        System.out.println(Kumulativa.doslejNajvecji(stevila, (a, b) -> a - b));
        System.out.println(Kumulativa.doslejNajvecji(stevila, (a, b) -> b - a));
    }
}
