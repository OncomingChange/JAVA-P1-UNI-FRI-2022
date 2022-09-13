
public class Test09 {

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

        System.out.println(renata.jeLeviSosedOd(slavoj));
        System.out.println(spomenka.jeLeviSosedOd(slavoj));
        System.out.println(tine.jeDesniSosedOd(mladen));
        System.out.println(spomenka.jeDesniSosedOd(mladen));
        System.out.println("---");

        izpisiSoseda(slavoj);
        izpisiSoseda(renata);
        izpisiSoseda(mladen);
        izpisiSoseda(tine);
        izpisiSoseda(spomenka);
        System.out.println("---");

        System.out.println(slavoj.primiLevo());
        System.out.println(renata.primiDesno());
        System.out.println(mladen.primiLevo());
        System.out.println(tine.primiDesno());
        System.out.println(spomenka.primiDesno());
        System.out.println(slavoj.primiLevo());
        System.out.println(slavoj.primiDesno());
        System.out.println(tine.primiLevo());
        renata.izpustiLevo();
        slavoj.izpustiDesno();
        System.out.println(renata.primiLevo());
        System.out.println("---");

        System.out.println(slavoj.kolikoPalicicDrzi());
        System.out.println(renata.kolikoPalicicDrzi());
        System.out.println(mladen.kolikoPalicicDrzi());
        System.out.println(tine.kolikoPalicicDrzi());
        System.out.println(spomenka.kolikoPalicicDrzi());
        System.out.println("---");

        Filozof[] filozofi = {slavoj, renata, mladen, tine, spomenka};
        System.out.println(Filozof.steviloJedcev(filozofi));
        System.out.println("---");

        System.out.println(slavoj.steviloFilozofov());
        System.out.println(renata.steviloFilozofov());
        System.out.println(mladen.steviloFilozofov());
        System.out.println(tine.steviloFilozofov());
        System.out.println(spomenka.steviloFilozofov());
    }

    private static void izpisiSoseda(Filozof filozof) {
        Filozof[] soseda = filozof.vrniSoseda();
        System.out.printf("%s/%s%n", soseda[0].vrniIme(), soseda[1].vrniIme());
    }
}
