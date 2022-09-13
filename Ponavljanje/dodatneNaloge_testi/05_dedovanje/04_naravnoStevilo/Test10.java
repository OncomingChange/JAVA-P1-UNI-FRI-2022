
public class Test10 {

    public static void main(String[] args) {
        NaravnoStevilo ena = new Ena();
        NaravnoStevilo dve = ena.naslednik().naslednik().predhodnik();
        NaravnoStevilo pet = new Naslednik(new Naslednik(new Naslednik(dve)));
        NaravnoStevilo osem = NaravnoStevilo.ustvariIzInt(10).predhodnik().predhodnik();

        System.out.println(ena.jeEna());
        System.out.println(dve.jeEna());
        System.out.println(dve.predhodnik().jeEna());

        NaravnoStevilo a = dve.vsota(pet);
        NaravnoStevilo b = osem.razlika(dve);
        NaravnoStevilo c = pet.zmnozek(dve);
        NaravnoStevilo d = pet.razlika(dve).razlika(dve);
        NaravnoStevilo e = ena.vsota(pet).zmnozek(osem.razlika(ena));

        System.out.println(a.toInt());
        System.out.println(b.toString());
        System.out.println(c.toInt());
        System.out.println(d.toString());
        System.out.println(e.toInt());
    }
}
