
public class Oseba {

    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;
    private Oseba oce;
    private Oseba mati;

    // števec ustvarjenih oseb
    private static int stUstvarjenih = 0;

    /** Ustvari osebo s podanim imenom, priimkom, spolom, letom rojstva,
     * očetom in materjo. */
    public Oseba(String ime, String priimek, char spol, int letoRojstva, Oseba oce, Oseba mati) {
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = letoRojstva;
        this.oce = oce;
        this.mati = mati;
        stUstvarjenih++;
    }

    /** Vrne ime osebe `this'. */
    public String vrniIme() {
        return this.ime;
    }

    /** Nastavi ime osebe `this' na `novoIme'. */
    public void nastaviIme(String novoIme) {
        this.ime = novoIme;
    }

    /** Vrne predstavitev osebe `this' v obliki niza. */
    public String toString() {
        return String.format("%s %s (%c), %d", 
                this.ime, this.priimek, this.spol, this.letoRojstva);
    }

    /** Vrne starost osebe v podanem letu. */
    public int starost(int leto) {
        return (leto - this.letoRojstva);
    }

    /** Vrne `true' natanko v primeru, če je dana oseba (torej oseba `this')
     * starejša od osebe `os'. */
    public boolean jeStarejsaOd(Oseba os) {
        if (this.letoRojstva < os.letoRojstva) {
            return true;
        } else {
            return false;
        }
        // kraj"se: return (this.letoRojstva < os.letoRojstva);
        // ali: return (this.starost(0) > os.starost(0));
    }

    /** Vrne ime očeta osebe `this' oziroma `null', če oče ni znan. */
    public String imeOceta() {
        if (this.oce == null) {
            return null;
        }
        return this.oce.ime;
    }

    /** Vrne `true' natanko v primeru, če je oseba `this' brat ali sestra
     * osebe `os'. */
    public boolean jeBratAliSestraOd(Oseba os) {
        return (this != os && this.oce != null && this.mati != null &&
                this.oce == os.oce && this.mati == os.mati);
    }

    /** Vrne `true' natanko v primeru, če je oseba `this' sestra osebe `os'. */
    public boolean jeSestraOd(Oseba os) {
        return (this.jeBratAliSestraOd(os) && this.spol == 'Z');
    }

    /* Vrne `true' natanko v primeru, če je oseba `this' teta osebe `os'. */
    public boolean jeTetaOd(Oseba os) {
        return (os.oce != null && this.jeSestraOd(os.oce) || 
                os.mati != null && this.jeSestraOd(os.mati));
    }

    /* Vrne `true' natanko v primeru, če je oseba `this' o"cetovski prednik osebe `os'. */
    public boolean jeOcetovskiPrednikOd(Oseba os) {
        Oseba p = os.oce;
        while (p != null && p != this) {
            p = p.oce;
        }
        return (p == this);
    }

    /** Vrne število doslej ustvarjenih oseb. */
    public static int steviloUstvarjenih() {
        return stUstvarjenih;
    }

    public int ocetovskaGeneracijskaRazlika(Oseba os) {
        // popravite / dopolnite ...
        return 0;
    }

    public boolean jePrednikOd(Oseba os) {
        // popravite / dopolnite ...
        return false;
    }

    public void nastejPrednike() {
        // dopolnite ...
    }

    public boolean jeSorodnikOd(Oseba os) {
        // popravite / dopolnite ...
        return false;
    }
}
