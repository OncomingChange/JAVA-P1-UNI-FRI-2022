package JavaOdZačetka;

public class Naloga65 {
    public class Stevilo {
        int n;
        public Stevilo(int nn) {
            this.n = nn;
        }
        public static boolean med(Stevilo a, Stevilo b, Stevilo c) {
            return a.n >= b.n && a.n <= c.n;
            }
        public boolean vmes(Stevilo b, Stevilo c) {
            return this.n >= b.n && this.n <= c.n;
        }
    }
}
