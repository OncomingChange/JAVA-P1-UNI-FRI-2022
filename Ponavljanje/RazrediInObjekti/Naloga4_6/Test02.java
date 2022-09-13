
public class Test02 {

    public static void main(String[] args) {
        StiriVVrsto igra = new StiriVVrsto(10, 10);

        System.out.println(igra.naPotezi());
        igra.vrzi(3);
        igra.vrzi(5);
        System.out.println(igra.naPotezi());
        igra.vrzi(3);
        System.out.println(igra.naPotezi());
        igra.vrzi(3);
        igra.vrzi(9);
        igra.vrzi(0);
        igra.vrzi(2);
        System.out.println(igra.naPotezi());
        igra.vrzi(3);
        igra.vrzi(6);
        igra.vrzi(7);
        igra.vrzi(8);
        igra.vrzi(1);
        System.out.println(igra.naPotezi());
        igra.vrzi(4);
        igra.vrzi(3);
        igra.vrzi(3);
        igra.vrzi(5);
        igra.vrzi(9);
        igra.vrzi(0);
        System.out.println(igra.naPotezi());
        igra.vrzi(2);
        igra.vrzi(6);
        igra.vrzi(7);
        igra.vrzi(8);
        igra.vrzi(1);
        System.out.println(igra.naPotezi());
    }
}
