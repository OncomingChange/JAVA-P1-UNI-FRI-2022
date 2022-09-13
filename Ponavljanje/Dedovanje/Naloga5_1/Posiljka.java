
public abstract class Posiljka {
    private static int Z, R, D, P, T;
    private String naslovnik, vsebina;

    public static void setter (int Z, int R, int D, int P, int T) {
        Posiljka.Z = Z;
        Posiljka.R = R;
        Posiljka.D = D;
        Posiljka.P = P;
        Posiljka.T = T;
    }

    public int vrniZ() {
        return Z;
    }

    public int vrniR() {
        return R;
    }

    public int vrniD() {
        return D;
    }

    public int vrniP() {
        return P;
    }

    public int vrniT() {
        return T;
    }

    public Posiljka(String naslovnik, String vsebina) {
        this.naslovnik = naslovnik;
        this.vsebina = vsebina;
    }

    public abstract int cena();

    @Override
    public String toString() {
        String vrstaNaslovnikVsebina = String.format("%s | %s | %s | ", this.vrniVrsto(), this.naslovnik, this.vsebina);
        if (this instanceof NavadnoPismo) {
            vrstaNaslovnikVsebina += String.format("%s", this.vrniPodatke());
        }
        vrstaNaslovnikVsebina += String.format("%d%n", this.cena());
        return vrstaNaslovnikVsebina;
    }

    public abstract String vrniVrsto();

    public String vrniNaslovnik() {
        return this.naslovnik;
    }

    public abstract String vrniPodatke();

    public String vrniVsebino() {
        return this.vsebina;
    }
}
