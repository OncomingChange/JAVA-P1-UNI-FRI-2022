
public class Test03 {

    public static void main(String[] args) {
        Prastevila prastevila = new Prastevila();
        prastevila.nastaviTrenutno(31);
        for (int i = 0;  i < 10;  i++) {
            System.out.println(prastevila.naslednje());
        }
    }
}
