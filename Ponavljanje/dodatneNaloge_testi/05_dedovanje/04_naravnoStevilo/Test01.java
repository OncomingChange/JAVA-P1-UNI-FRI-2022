
public class Test01 {

    public static void main(String[] args) {
        NaravnoStevilo ena = new Ena();
        NaravnoStevilo dve = new Naslednik(ena);
        NaravnoStevilo tri = new Naslednik(dve);

        System.out.println(ena.jeEna());
        System.out.println(dve.jeEna());
        System.out.println(tri.jeEna());
    }
}
