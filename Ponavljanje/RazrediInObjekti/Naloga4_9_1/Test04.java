
public class Test04 {

    public static void main(String[] args) {
        Prastevila prastevila = new Prastevila();
        prastevila.nastaviTrenutno(31);
        System.out.println(prastevila.vrniTrenutno());
        for (int i = 0;  i < 10;  i++) {
            System.out.println(prastevila.naslednje());
            System.out.println(prastevila.vrniTrenutno());
        }
    }
}
