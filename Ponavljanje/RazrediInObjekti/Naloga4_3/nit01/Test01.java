
public class Test01 {

    public static void main(String[] args) {
        System.out.println( Datum.ustvari(12, 5, 1895) != null );
        System.out.println( Datum.ustvari(12, 13, 1895) != null );
        System.out.println( Datum.ustvari(31, 11, 1895) != null );
        System.out.println( Datum.ustvari(31, 10, 1895) != null );
        System.out.println( Datum.ustvari(29, 2, 1895) != null );
        System.out.println( Datum.ustvari(29, 2, 1900) != null );
        System.out.println( Datum.ustvari(29, 2, 1600) != null );
        System.out.println( Datum.ustvari(28, 7, 1582) != null );
        System.out.println( Datum.ustvari(28, 7, 3000) != null );
        System.out.println( Datum.ustvari(15, 0, 2014) != null );
        System.out.println( Datum.ustvari(0, 6, 2014) != null );
    }
}
