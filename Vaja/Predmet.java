public class Predmet {
    private String ime; 
    private String sifra; 
    private int steviloKT; 
    private boolean jeObvezen;
    public Predmet(String name, String code, int numberCP, boolean necessary) {
        this.ime = name;
        this.sifra = code;
        this.steviloKT = numberCP;
        this.jeObvezen = necessary;
    }
}