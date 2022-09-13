
public class Test05 {

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

        System.out.println(slavoj.primiLevo());
        System.out.println(renata.primiDesno());
        System.out.println(spomenka.primiLevo());
        System.out.println(renata.primiLevo());
        System.out.println(slavoj.primiDesno());
        System.out.println(tine.primiLevo());
        System.out.println(tine.primiDesno());
        System.out.println(mladen.primiLevo());
        System.out.println(mladen.primiDesno());

        System.out.println(slavoj.kolikoPalicicDrzi());
        System.out.println(renata.kolikoPalicicDrzi());
        System.out.println(mladen.kolikoPalicicDrzi());
        System.out.println(tine.kolikoPalicicDrzi());
        System.out.println(spomenka.kolikoPalicicDrzi());
    }
}
