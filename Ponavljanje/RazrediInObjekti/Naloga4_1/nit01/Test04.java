
public class Test04 {

    public static void main(String[] args) {
        Posta lj = new Posta(1000, "Ljubljana");
        Posta mb = new Posta(2000, "Maribor");
        Posta ce = new Posta(3000, "Celje");

        Pismo lj2mb = new Pismo(lj, mb, true, 130);
        Pismo lj2ce = new Pismo(lj, ce, false, 75);
        Pismo ce2mb = new Pismo(ce, mb, true, 60);
        Pismo mb2mb = new Pismo(mb, mb, true, 0);

        System.out.println(lj2mb.staIzvorInCiljIsta());
        System.out.println(lj2ce.staIzvorInCiljIsta());
        System.out.println(ce2mb.staIzvorInCiljIsta());
        System.out.println(mb2mb.staIzvorInCiljIsta());
    }
}
