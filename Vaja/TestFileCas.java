public class TestFileCas {
    public static void main(String[] args) {
        Cas zajtrk = new Cas(9, 30);
        Cas kosilo = new Cas(13, 30);

        if (Cas.jePrviManjsi(zajtrk, kosilo)) {
            System.out.print("Zajtrk pride prej.");
        }
    }
}
