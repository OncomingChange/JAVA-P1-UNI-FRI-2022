
public class Prastevila {
    private int prastevilo, indeks;
    
    private int[] trenutnoPrastevilo;
    
    public Prastevila() {
        this.prastevilo = 2;
        this.indeks = 0;
        this.trenutnoPrastevilo = sieveOfEratosthenes((int) Math.pow(10, 8));
        this.trenutnoPrastevilo[0] = 2;
    }

    public int[] sieveOfEratosthenes(int n) {
        boolean[] pobrisano = new boolean[n + 1];
        int meja = (int) Math.round(Math.sqrt(n));
        int p = 2;
        while (p <= meja) {
            // pobriši števila 2 * p, 3 * p, 4 * p, ...
            for (int i = 2 * p; i <= n; i += p) {
                pobrisano[i] = true;
            }
            // poišci najmanjše nepobrisano število nad p ˇ
            do {
                p++;
            } while (p <= meja && pobrisano[p]);
        }

        // izpiši vsa nepobrisana števila (to so ravno praštevila)
        int[] tabelaPrastevil = new int[50847534];
        int mesto = 1;
        for (int i = 3; i <= n; i += 2) {
            if (!pobrisano[i]) {
                tabelaPrastevil[mesto] = i;
              mesto++;
            }
        } 
        return tabelaPrastevil;       
    }

    public void nastaviTrenutno(int prastevilo) {
        this.prastevilo = prastevilo;
        for (int i = 0; i < this.trenutnoPrastevilo.length; i++) {
            if (this.trenutnoPrastevilo[i] == prastevilo) {
                this.indeks = i;
                break;
            }
        }
    }

    public int vrniTrenutno() {
        return this.prastevilo;
    }

    public int naslednje() {
        this.prastevilo = this.trenutnoPrastevilo[this.indeks + 1];
        this.indeks++;
        return this.prastevilo;
    }

    public int prejsnje() {
        if(this.prastevilo == 2) {
            return 2;
        }
        else {
            this.prastevilo = this.trenutnoPrastevilo[this.indeks - 1];
            this.indeks--;
            return this.prastevilo;
        }
    }

    /*
    public static void main(String[] args) {
        Prastevila prastevila = new Prastevila();
        System.out.println(prastevila.vrniTrenutno());
        prastevila.nastaviTrenutno(37);
        System.out.println(prastevila.vrniTrenutno());
        prastevila.nastaviTrenutno(11);
        System.out.println(prastevila.vrniTrenutno());
        System.out.println(prastevila.vrniTrenutno());
    }
    */
}
