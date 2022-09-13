import java.util.*;

public class Beseda {
    public String beseda;
    public Integer stKlicev;

    public Beseda(String beseda) {
        this(beseda, 1);
    }
    public Beseda(String beseda, Integer stKlicev) {
        this.beseda = beseda;
        this.stKlicev = stKlicev;
    }

    public String toString() {
        return String.format("%s (%d)%n", this.beseda, this.stKlicev);
    }

    private static class PrimerjalnikPoKlicihInLeksikografsko implements Comparator<Beseda> {

        @Override
        public int compare(Beseda b1, Beseda b2) {
            if (b2.stKlicev - b1.stKlicev == 0) {
                return b1.beseda.compareTo(b2.beseda);
            }
            else {
                return b2.stKlicev - b1.stKlicev;
            }
        }
    }

    public static Comparator<Beseda> primerjalnikPoKlicihInLeksikografsko() {
        return new PrimerjalnikPoKlicihInLeksikografsko();
    }
}
