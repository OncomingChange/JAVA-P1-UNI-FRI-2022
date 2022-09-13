
public class Test05 {

    public static void main(String[] args) {
        StiriVVrsto igra = new StiriVVrsto(3, 4);
        igra.vrzi(3);
        igra.vrzi(0);
        igra.vrzi(2);
        igra.vrzi(3);
        igra.vrzi(1);
        izpisiVsebino(igra);
        igra.vrzi(1);
        igra.vrzi(1);
        igra.vrzi(0);
        igra.vrzi(2);
        igra.vrzi(3);
        izpisiVsebino(igra);
    }

    private static void izpisiVsebino(StiriVVrsto igra) {
        int stVrstic = igra.vrniSteviloVrstic();
        int stStolpcev = igra.vrniSteviloStolpcev();
        for (int i = 0;  i < stVrstic;  i++) {
            for (int j = 0;  j < stStolpcev;  j++) {
                System.out.print(igra.vsebina(i, j) + 1);
            }
            System.out.print("|");
        }
        System.out.println();
    }
}
