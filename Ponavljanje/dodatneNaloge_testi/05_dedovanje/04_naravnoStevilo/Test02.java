
public class Test02 {

    public static void main(String[] args) {
        NaravnoStevilo ena = new Ena();
        NaravnoStevilo dve = ena.naslednik();
        NaravnoStevilo tri = dve.naslednik();

        System.out.println(ena.jeEna());
        System.out.println(dve.jeEna());
        System.out.println(tri.jeEna());
    }
}
