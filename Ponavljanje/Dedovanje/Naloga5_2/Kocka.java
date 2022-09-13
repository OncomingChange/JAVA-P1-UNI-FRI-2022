
public class Kocka extends Kvader{
    
    public Kocka(int stranica) {
        super(stranica, stranica, stranica);
    }

    @Override
    public String vrniTelo() {
        return "kocka";
    }

    @Override
    public String vrniPodatke() {
        return String.format("a = %d", this.vrniStranico());
    }
}
