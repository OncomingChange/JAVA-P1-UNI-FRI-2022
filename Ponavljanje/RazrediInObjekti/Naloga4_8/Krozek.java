
public class Krozek {
    private String naziv;
    private int dan, ura, kvota, steviloClanov; 
    
    private static int steviloKrozkov;

    public Krozek(String naziv, int dan, int ura, int kvota) {
        this.naziv = naziv;
        this.dan = dan;
        this.ura = ura;
        this.kvota = kvota;
        steviloKrozkov++;
    }

    public int vrniSteviloKrozkov() {
        return steviloKrozkov;
    }

    public int vrniKvoto() {
        return this.kvota;
    }

    public String vrniNaziv() {
        return String.format("%s", this.naziv);
    }

    public int vrniDan() {
        return this.dan;
    }

    public int vrniUro() {
        return this.ura;
    }

    public void dodajClanaKrozku() {
        this.steviloClanov++;
    }

    public int odvzemiClanaKrozku() {
        this.steviloClanov--;
        return 0;
    }

    public boolean jeEnakKotKaterikoliIzmed(Krozek[] krozki) {
        for (int i = 0; i < krozki.length; i++) {
            if (this.equals(krozki[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean sePrekrivaSKrozkom(Krozek krozek) {
        if (this.dan > krozek.dan || this.dan < krozek.dan) {
            return false;
        }
        else if (this.ura - 1 > krozek.ura || this.ura + 1 < krozek.ura) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean sePrekrivaSKaterikolimKrozkom(Krozek[] krozki) {
        for (int i = 0; i < krozki.length; i++) {
            if (krozki[i] != null && this.sePrekrivaSKrozkom(krozki[i])) {
                return true;
            }
        }
        return false;
    }

    public int steviloClanov() {
        return this.steviloClanov;
    }
}

