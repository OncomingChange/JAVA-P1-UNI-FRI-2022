
public class Test07 {

    public static void main(String[] args) {
        NaravnoStevilo ena = new Ena();
        NaravnoStevilo stiri = new Naslednik(new Naslednik(new Naslednik(ena)));
        NaravnoStevilo devet = new Naslednik(new Naslednik(new Naslednik(new Naslednik(new Naslednik(stiri)))));

        System.out.println(ena.toString());
        System.out.println(stiri.toString());
        System.out.println(devet.toString());
    }
}
