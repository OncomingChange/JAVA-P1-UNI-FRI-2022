
public class Krogla extends Lik{
    private int polmer;

    public Krogla(int polmer) {
        this.polmer = polmer;
    }

    @Override
    public int povrsina() {
        return (int) Math.round(4 * Math.PI * Math.pow(this.polmer, 2));
    }

    @Override
    public int prostornina() {
        return (int) Math.round(4 * Math.PI * Math.pow(this.polmer, 3) / 3);
    }

    @Override
    public String vrniTelo() {
        return "krogla";
    }

    @Override
    public String vrniPodatke() {
        return String.format("r = %d", this.polmer);
    }
}
