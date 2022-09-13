
public class Ucenec {
    private String ime, priimek;
    private Krozek[] krozkiUcenca;
    private int steviloKrozkov;
    
    public static int MAKS_OBREMENITEV;

    public static void nastaviMaksObremenitev(int maksObremenitev) {
        MAKS_OBREMENITEV = maksObremenitev;
    }

    public Ucenec(String ime, String priimek) {
        this.ime = ime;
        this.priimek = priimek;
        this.krozkiUcenca = new Krozek[MAKS_OBREMENITEV];
    }

    public String vrniIP() {
        return String.format("%s %s", this.ime, this.priimek);
    }

    public boolean vclani(Krozek krozek) {
        if(krozek.jeEnakKotKaterikoliIzmed(this.krozkiUcenca)) {
            return true;
        }
        else if(this.steviloKrozkov < MAKS_OBREMENITEV && krozek.steviloClanov() < krozek.vrniKvoto() && !krozek.sePrekrivaSKaterikolimKrozkom(this.krozkiUcenca)) {
            for(int i = 0; i < krozkiUcenca.length; i++) {
                if(krozkiUcenca[i] == null) {
                    krozkiUcenca[i] = krozek;
                    this.steviloKrozkov++;
                    krozek.dodajClanaKrozku();
                    return true;
                }
            }
        }
        return false;
    }

    public void izclani(Krozek krozek) {
        if(krozek.jeEnakKotKaterikoliIzmed(this.krozkiUcenca)) {
            for (int i = 0; i < krozkiUcenca.length; i++) {
                if(krozek.equals(krozkiUcenca[i])) {
                    krozkiUcenca[i] = null;
                    this.steviloKrozkov--;
                    krozek.odvzemiClanaKrozku();
                    break;
                }
            }
        }
    }

    public int steviloKrozkov() {
        return this.steviloKrozkov;
    }
}
