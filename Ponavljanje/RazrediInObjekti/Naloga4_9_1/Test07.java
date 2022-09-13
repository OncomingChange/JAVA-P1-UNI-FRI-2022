
public class Test07 {

    public static void main(String[] args) {
        Prastevila prastevila = new Prastevila();

        prastevila.nastaviTrenutno(1009);
        for (int i = 0;  i < 500;  i++) {
            System.out.println(prastevila.naslednje());
        }

        prastevila.nastaviTrenutno(9973);
        for (int i = 0;  i < 500;  i++) {
            System.out.println(prastevila.prejsnje());
        }
    }
}
