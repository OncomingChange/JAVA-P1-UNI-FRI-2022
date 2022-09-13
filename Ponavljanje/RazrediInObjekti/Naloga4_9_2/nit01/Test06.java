
public class Test06 {

    public static void main(String[] args) {
        Prastevila prastevila = new Prastevila();
        System.out.println(prastevila.vrniTrenutno());
        System.out.println(prastevila.prejsnje());
        System.out.println(prastevila.vrniTrenutno());
        System.out.println(prastevila.naslednje());
        System.out.println(prastevila.vrniTrenutno());

        prastevila.nastaviTrenutno(17);
        System.out.println(prastevila.vrniTrenutno());
        System.out.println(prastevila.prejsnje());
        System.out.println(prastevila.prejsnje());
        System.out.println(prastevila.naslednje());
        System.out.println(prastevila.vrniTrenutno());

        prastevila.nastaviTrenutno(47);
        System.out.println(prastevila.vrniTrenutno());
        System.out.println(prastevila.naslednje());
        System.out.println(prastevila.naslednje());
        System.out.println(prastevila.prejsnje());
        System.out.println(prastevila.vrniTrenutno());
    }
}
