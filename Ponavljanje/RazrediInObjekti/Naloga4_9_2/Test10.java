
public class Test10 {

    public static void main(String[] args) {
        Prastevila prastevila = new Prastevila();
        prastevila.nastaviTrenutno(100_000_007);
        for (int i = 0;  i < 500;  i++) {
            System.out.println(prastevila.naslednje());
        }

        prastevila.nastaviTrenutno(999_999_937);
        for (int i = 0;  i < 500;  i++) {
            System.out.println(prastevila.prejsnje());
        }
    }
}
