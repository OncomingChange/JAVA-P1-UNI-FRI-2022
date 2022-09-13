package Naloga4_1;

public class Posta {
    private int postnaSt;
    private String nazivPoste;

    public Posta(int stevilka, String naziv) {
        this.postnaSt = stevilka;
        this.nazivPoste = naziv;
    }

    public int vrniStevilko() {
        return this.postnaSt;
    }

    public String vrniNaziv() {
        return this.nazivPoste;
    }

    public String toString() {
        return String.format("%d %s", this.postnaSt, this.nazivPoste);
    }
}
