
public class Pismo {
    private Posta izvor;
    private Posta cilj;
    private boolean priporoceno;
    private int oddaljenost;

    private static int R;
    private static int C;
    private static int P;

    public Pismo(Posta izvorna, Posta ciljna, boolean jePriporoceno, int razdalja) {
        this.izvor = izvorna;
        this.cilj = ciljna;
        this.priporoceno = jePriporoceno;
        this.oddaljenost = razdalja;
    }

    public String toString() {
        char priporočeno = (this.priporoceno) ? 'P' : 'N';
        return String.format("%d %s -> %d %s (%d km) [%c]", 
        this.izvor.vrniStevilko(), this.izvor.vrniNaziv(), 
        this.cilj.vrniStevilko(), this.cilj.vrniNaziv(), 
        this.oddaljenost, priporočeno);
    }

    public boolean izviraOd(Posta posta) {
        return this.izvor.equals(posta);
    }

    public boolean staIzvorInCiljIsta() {
        return this.izvor.equals(this.cilj);
    }

    public boolean imaIstiCiljKot(Pismo pismo) {
        return this.cilj.equals(pismo.cilj);
    }

    public static boolean imataIstiCilj(Pismo p1, Pismo p2) {
        return p1.cilj.equals(p2.cilj);
    }

    public int cena() {
        int cena = 0;

        for (int i = 1; i * R - 1 < this.oddaljenost; i++) {
            cena = (i + 1) * C;
        }

        if (priporoceno) {
            cena += P;
        }

        return cena;
    }

    public static void nastaviKonstanteZaCeno(int enotaRazdalje, int enotaCena, int priporocnina) {
        R = enotaRazdalje;
        C = enotaCena;
        P = priporocnina;
    }

    public boolean jeDrazjeOd(Pismo pismo) {
        return this.cena() > pismo.cena();
    }

    public static Pismo vrniDrazje(Pismo p1, Pismo p2) {
        return (p1.cena() > p2.cena()) ? p1 : p2;
    }

    public Pismo izdelajPovratno() {
        return new Pismo(this.cilj, this.izvor, this.priporoceno, this.oddaljenost);
    }
}
