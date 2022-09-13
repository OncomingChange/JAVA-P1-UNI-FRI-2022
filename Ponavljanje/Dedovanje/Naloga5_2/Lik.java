
public abstract class Lik {
    public abstract int povrsina();
    
    public abstract int prostornina();

    @Override
    public String toString() {
        String izhod = String.format("%s%n%s%nV = %d%nP = %d%n", this.vrniTelo(), this.vrniPodatke(), this.prostornina(), this.povrsina());
        if (this instanceof Kvader) {
           izhod += this.mreza();
        }
        izhod += String.format("======");
        return izhod;
    }

    public abstract String vrniTelo();

    public abstract String vrniPodatke();

    public abstract String mreza();
}
