
public class Test11 {

    public static void main(String[] args) {
        Datum a = Datum.ustvari(29, 2, 2016);
        Datum b = Datum.ustvari(1, 1, 2017);

        System.out.println(a.toString());
        System.out.println(a.jeEnakKot(b));
        System.out.println(a.jePred(b));
        System.out.println(a.naslednik().toString());
        System.out.println(b.predhodnik().toString());
        System.out.println(a.cez(365).toString());
        System.out.println(b.cez(-365).toString());
    }
}
