
public class Test06 {

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

        slavoj.primiLevo();
        renata.primiDesno();
        spomenka.primiLevo();
        renata.primiLevo();
        slavoj.primiDesno();
        tine.primiLevo();
        tine.primiDesno();
        mladen.primiLevo();
        mladen.primiDesno();

        renata.izpustiDesno();
        slavoj.izpustiLevo();
        mladen.izpustiDesno();
        mladen.primiLevo();
        spomenka.izpustiLevo();
        tine.primiDesno();

        System.out.println(slavoj.kolikoPalicicDrzi());
        System.out.println(renata.kolikoPalicicDrzi());
        System.out.println(mladen.kolikoPalicicDrzi());
        System.out.println(tine.kolikoPalicicDrzi());
        System.out.println(spomenka.kolikoPalicicDrzi());
    }
}
