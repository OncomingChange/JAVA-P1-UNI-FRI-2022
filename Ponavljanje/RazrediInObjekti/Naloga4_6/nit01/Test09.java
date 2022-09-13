
public class Test09 {

    public static void main(String[] args) {
        StiriVVrsto igra = new StiriVVrsto(5, 6);
        System.out.println(igra.naPotezi());
        System.out.println(igra.vrzi(2));
        System.out.println(igra.vrzi(1));
        System.out.println(igra.vrzi(3));
        System.out.println(igra.vrzi(2));
        System.out.println(igra.vrzi(3));
        System.out.println(igra.vrzi(3));
        System.out.println(igra.vrzi(4));
        System.out.println(igra.vrzi(4));
        System.out.println(igra.vrzi(4));
        System.out.println(igra.vrzi(4));
        System.out.println(igra.vrzi(5));
        System.out.println(igra.vrzi(5));
        System.out.println(igra.vrzi(5));
        System.out.println(igra.vrzi(4));
        System.out.println(igra.vrzi(4));
        System.out.println(igra.vrzi(5));
        System.out.println(igra.naPotezi());
        System.out.println(igra.vrzi(5));
        System.out.println(igra.naPotezi());

        System.out.println(igra.vsebina(0, 0));
        System.out.println(igra.vsebina(2, 3));
        System.out.println(igra.vsebina(1, 3));
        System.out.println(igra.vsebina(3, 3));

        System.out.println(igra.najdaljseZaporedje(0));
        System.out.println(igra.najdaljseZaporedje(1));
        System.out.println(igra.izid());
    }
}
