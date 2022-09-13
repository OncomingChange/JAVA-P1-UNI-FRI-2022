
import java.util.List;
import java.util.ArrayList;

public class Test01 {

    public static void main(String[] args) {
        List<Integer> stevila = new ArrayList<>(List.of(3, 7, -2, 9, 5, -6, 4));

        UrejanjePoFunkciji.urediPoFunkciji(stevila, x -> x);
        System.out.println(stevila);

        UrejanjePoFunkciji.urediPoFunkciji(stevila, x -> -x);
        System.out.println(stevila);

        UrejanjePoFunkciji.urediPoFunkciji(stevila, x -> x % 2);
        System.out.println(stevila);
    }
}
