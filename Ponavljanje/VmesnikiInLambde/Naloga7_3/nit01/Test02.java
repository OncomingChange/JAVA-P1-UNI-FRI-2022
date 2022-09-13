
import java.util.List;
import java.util.ArrayList;

public class Test02 {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(List.of(3, 7, -2, 9, 5, -6, 4));
        List<Integer> b = new ArrayList<>(List.of(3, 7, 2, 9, 5, 6, 4));
        List<Integer> c = new ArrayList<>(List.of(-3, -7, -2, -9, -5, -6, -4));
        List<Integer> d = new ArrayList<>(List.of(10));
        List<Integer> e = new ArrayList<>(List.of());

        UrejanjePoFunkciji.urediPoAbsolutniVrednosti(a);
        System.out.println(a);

        UrejanjePoFunkciji.urediPoAbsolutniVrednosti(b);
        System.out.println(b);

        UrejanjePoFunkciji.urediPoAbsolutniVrednosti(c);
        System.out.println(c);

        UrejanjePoFunkciji.urediPoAbsolutniVrednosti(d);
        System.out.println(d);

        UrejanjePoFunkciji.urediPoAbsolutniVrednosti(e);
        System.out.println(e);
    }
}
