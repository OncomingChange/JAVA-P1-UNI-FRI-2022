package JavaOdZačetka.RazrediKnjiga;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Ulomek a = new Ulomek(3, 5);
        Ulomek b = new Ulomek(4, 7);
        Ulomek c = a;
        Ulomek d = a.minus(b);
        Ulomek e = a.plus(c);
        System.out.println(Ulomek.steviloUstvarjenih()); 
    }
}
