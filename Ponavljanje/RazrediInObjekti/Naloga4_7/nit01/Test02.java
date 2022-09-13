
public class Test02 {

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

        System.out.println(slavoj.jeLeviSosedOd(renata));
        System.out.println(slavoj.jeLeviSosedOd(spomenka));
        System.out.println(mladen.jeLeviSosedOd(slavoj));
        System.out.println(mladen.jeLeviSosedOd(spomenka));
        System.out.println(tine.jeLeviSosedOd(spomenka));

        System.out.println(renata.jeDesniSosedOd(renata));
        System.out.println(renata.jeDesniSosedOd(slavoj));
        System.out.println(spomenka.jeDesniSosedOd(tine));
        System.out.println(spomenka.jeDesniSosedOd(slavoj));
        System.out.println(tine.jeDesniSosedOd(mladen));
    }
}
