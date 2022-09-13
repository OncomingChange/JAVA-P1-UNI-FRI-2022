
public class Partija {
    private String beli;
    private String crni;
    private int izid;

    public Partija(String beli, String crni, int izid) {
        this.beli = beli;
        this.crni = crni;
        this.izid = izid;
    }

    public String vrniBelega() {
        return this.beli;
    }

    public String vrniCrnega() {
        return this.crni;
    }

    public int vrniIzid() {
        return this.izid;
    }
}
