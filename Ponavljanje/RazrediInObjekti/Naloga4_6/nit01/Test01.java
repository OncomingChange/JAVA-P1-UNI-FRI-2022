
public class Test01 {

    public static void main(String[] args) {
        StiriVVrsto igra = new StiriVVrsto(42, 24);
        System.out.println(igra.vrniSteviloVrstic());
        System.out.println(igra.vrniSteviloStolpcev());

        StiriVVrsto igra2 = new StiriVVrsto(1, 5);
        System.out.println(igra2.vrniSteviloVrstic());
        System.out.println(igra2.vrniSteviloStolpcev());
    }
}
