
public class Test03 {

    public static void main(String[] args) {
        Filozof slavoj = new Filozof("Slavoj");
        Filozof renata = new Filozof("Renata");
        Filozof mladen = new Filozof("Mladen");
        Filozof tine = new Filozof("Tine");
        Filozof spomenka = new Filozof("Spomenka");

        slavoj.nastaviSoseda(spomenka, renata);
        renata.nastaviSoseda(slavoj, mladen);
        mladen.nastaviSoseda(renata, tine);
        tine.nastaviSoseda(mladen, spomenka);
        spomenka.nastaviSoseda(tine, slavoj);

        izpisiSoseda(slavoj);
        izpisiSoseda(renata);
        izpisiSoseda(mladen);
        izpisiSoseda(tine);
        izpisiSoseda(spomenka);
    }

    private static void izpisiSoseda(Filozof filozof) {
        Filozof[] soseda = filozof.vrniSoseda();
        System.out.printf("%s/%s%n", soseda[0].vrniIme(), soseda[1].vrniIme());
    }
}
