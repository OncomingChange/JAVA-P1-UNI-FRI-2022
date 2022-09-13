package JavaOdZačetka.RazrediKnjiga;

public class Predmet {
    private String ime;
    private String sifra;
    int steviloKT;
    private boolean jeObvezen;

    public Predmet(String name, String code, int numberCP, boolean isNecessary) {
        this.ime = name;
        this.sifra = code;
        this.steviloKT = numberCP;
        this.jeObvezen = isNecessary;
    }
}
