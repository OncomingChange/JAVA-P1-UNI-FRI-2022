
public class Test08 {

    public static void main(String[] args) {
        Prastevila prastevila = new Prastevila();
        prastevila.nastaviTrenutno(1_000_003);
        for (int i = 0;  i < 500;  i++) {
            System.out.println(prastevila.naslednje());
        }

        prastevila.nastaviTrenutno(9_999_991);
        for (int i = 0;  i < 500;  i++) {
            System.out.println(prastevila.prejsnje());
        }
    }
}
