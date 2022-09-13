
public class Cas implements Comparable<Cas> {

    private int ura;
    private int minuta;

    public Cas(int h, int min) {
        this.ura = h;
        this.minuta = min;
    }

    @Override
    public String toString() {
        return String.format("%d:%02d", this.ura, this.minuta);
    }

    @Override
    public boolean equals(Object obj) {
        Cas cas = (Cas) obj;
        return (this.ura == cas.ura && this.minuta == cas.minuta);
    }

    @Override
    public int hashCode() {
        return (60 * this.ura + this.minuta);
    }

    @Override
    public int compareTo(Cas drugi) {
        return 60 * (this.ura - drugi.ura) + (this.minuta - drugi.minuta);
    }
}
