package RazrediInObjekti.Naloga4_9_2;

public class Prastevila {
    private int prastevilo, indeks;
    
    private int[] trenutnoPrastevilo;
    
    public Prastevila() {
        this.prastevilo = 2;
    }

    public void nastaviTrenutno(int prastevilo) {
        this.prastevilo = prastevilo;
    }

    public int vrniTrenutno() {
        return this.prastevilo;
    }

    public int naslednje() {
        for (int i = this.prastevilo + 1; i < Math.pow(10, 9); i++) {
            if (Isprime(i)) {
                this.prastevilo = i;
                break;
            }
        }
        return this.prastevilo;
    }

    public int prejsnje() {
        if(this.prastevilo == 2) {
            return 2;
        }
        else {
            for (int i = this.prastevilo - 1; i >= 2; i--) {
                if (Isprime(i)) {
                    this.prastevilo = i;
                    break;
                }
            }
            return this.prastevilo;
        }
    }

    public static  boolean Isprime(int x){
        boolean isprime = true;
    
        for(int m = 2;m <= Math.sqrt(x); m++){
    
            int temp = x % m;
            if(temp == 0){
                isprime = false;
                break;
                }
          }
        return isprime;
    
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
