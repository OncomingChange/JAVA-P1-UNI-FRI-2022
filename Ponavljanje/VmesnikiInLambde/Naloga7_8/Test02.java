
import java.util.List;

public class Test02 {

    public static void main(String[] args) {
        List<Integer> stevila = List.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        for (int t: new SprehodSPreskoki<Integer>(stevila, -1)) {
            System.out.print(t + " ");
        }
        System.out.println();

        for (int t: new SprehodSPreskoki<Integer>(stevila, -3)) {
            System.out.print(t + " ");
        }
        System.out.println();

        for (int t: new SprehodSPreskoki<Integer>(stevila, -6)) {
            System.out.print(t + " ");
        }
        System.out.println();

        for (int t: new SprehodSPreskoki<Integer>(stevila, -10)) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
