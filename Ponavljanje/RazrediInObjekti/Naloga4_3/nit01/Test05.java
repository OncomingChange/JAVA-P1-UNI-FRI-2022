
public class Test05 {

    public static void main(String[] args) {
        Datum d1 = Datum.ustvari(31, 3, 2014);
        Datum d2 = Datum.ustvari(1, 3, 2014);
        Datum d3 = Datum.ustvari(30, 6, 2014);
        Datum d4 = Datum.ustvari(31, 12, 2014);
        Datum d5 = Datum.ustvari(1, 1, 2015);
        Datum d6 = Datum.ustvari(1, 3, 2016);
        Datum d7 = Datum.ustvari(31, 12, 2999);
        Datum d8 = Datum.ustvari(1, 1, 1583);

        System.out.println( d1.naslednik().toString() );
        System.out.println( d2.naslednik().toString() );
        System.out.println( d3.naslednik().toString() );
        System.out.println( d4.naslednik().toString() );
    }
}
