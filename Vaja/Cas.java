public class Cas {
    private int ura;
    private int minuta;
    public Cas(int h, int m) {
        this.ura = h;
        this.minuta = m;
    }
    public static boolean jePrviManjsi(Cas prvi, Cas drugi) {
        return prvi.ura < drugi.ura || prvi.ura == drugi.ura && prvi.minuta < drugi.minuta;
    }
}
