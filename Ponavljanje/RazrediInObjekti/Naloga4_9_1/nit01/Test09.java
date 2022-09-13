
public class Test09 {

    public static void main(String[] args) {
        Prastevila prastevila = new Prastevila();
        prastevila.nastaviTrenutno(10_000_019);
        for (int i = 0;  i < 500;  i++) {
            System.out.println(prastevila.naslednje());
        }

        prastevila.nastaviTrenutno(99_999_989);
        for (int i = 0;  i < 500;  i++) {
            System.out.println(prastevila.prejsnje());
        }
    }
}
