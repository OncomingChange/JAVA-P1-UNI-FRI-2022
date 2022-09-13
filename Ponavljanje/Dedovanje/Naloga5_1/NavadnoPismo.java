
public class NavadnoPismo extends Posiljka {
    private int razdalja;

    public NavadnoPismo(String naslovnik, String vsebina, int razdalja) {
        super(naslovnik, vsebina);
        this.razdalja = razdalja;
    }
    
    @Override
    public int cena() {
        int cena = this.vrniZ();
        for (int i = 1; this.razdalja > (i * this.vrniR() - 1); i++) {
            cena += this.vrniD();
        }
        return cena;
    }

    @Override
    public String vrniPodatke() {
        return String.format("%d | ", this.razdalja);
    }

    @Override
    public String vrniVrsto() {
        return "NP";
    }

    public int vrniRazdaljo() {
        return this.razdalja;
    }
}
