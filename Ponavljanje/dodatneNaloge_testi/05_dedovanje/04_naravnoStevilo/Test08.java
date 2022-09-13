
public class Test08 {

    public static void main(String[] args) {
        NaravnoStevilo ena = new Ena();
        NaravnoStevilo stiri = new Naslednik(new Naslednik(new Naslednik(ena)));
        NaravnoStevilo devet = new Naslednik(new Naslednik(new Naslednik(new Naslednik(new Naslednik(stiri)))));

        System.out.println(ena.toInt());
        System.out.println(stiri.toInt());
        System.out.println(devet.toInt());
    }
}
