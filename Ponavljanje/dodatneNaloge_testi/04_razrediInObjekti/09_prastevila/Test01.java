
public class Test01 {

    public static void main(String[] args) {
        Prastevila prastevila = new Prastevila();
        System.out.println(prastevila.vrniTrenutno());
        prastevila.nastaviTrenutno(37);
        System.out.println(prastevila.vrniTrenutno());
        prastevila.nastaviTrenutno(11);
        System.out.println(prastevila.vrniTrenutno());
        System.out.println(prastevila.vrniTrenutno());
    }
}
