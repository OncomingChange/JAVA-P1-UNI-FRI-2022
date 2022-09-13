
public class Test07 {

    public static void main(String[] args) {
        StiriVVrsto igra = new StiriVVrsto(4, 6);
        igra.vrzi(3);
        System.out.printf("%d/%d%n", igra.najdaljseZaporedje(0), igra.najdaljseZaporedje(1));
        igra.vrzi(1);
        igra.vrzi(2);
        igra.vrzi(2);
        igra.vrzi(2);
        System.out.printf("%d/%d%n", igra.najdaljseZaporedje(0), igra.najdaljseZaporedje(1));
        igra.vrzi(5);
        igra.vrzi(0);
        igra.vrzi(3);
        igra.vrzi(3);
        System.out.printf("%d/%d%n", igra.najdaljseZaporedje(0), igra.najdaljseZaporedje(1));
        igra.vrzi(1);
        igra.vrzi(1);
        igra.vrzi(3);
        igra.vrzi(5);
        System.out.printf("%d/%d%n", igra.najdaljseZaporedje(0), igra.najdaljseZaporedje(1));
        igra.vrzi(1);
        igra.vrzi(1);
        igra.vrzi(3);
        igra.vrzi(4);
        igra.vrzi(4);
        igra.vrzi(1);
        igra.vrzi(3);
        System.out.printf("%d/%d%n", igra.najdaljseZaporedje(0), igra.najdaljseZaporedje(1));
    }
}
