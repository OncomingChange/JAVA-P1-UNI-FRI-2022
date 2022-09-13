
public class Test05 {

    public static void main(String[] args) {
        Prastevila prastevila = new Prastevila();
        prastevila.nastaviTrenutno(23);
        for (int i = 0;  i < 10;  i++) {
            System.out.println(prastevila.prejsnje());
        }
    }
}
