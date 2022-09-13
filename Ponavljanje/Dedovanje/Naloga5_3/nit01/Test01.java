
public class Test01 {

    public static void main(String[] args) {
        Seznam seznam = new Prazen();
        System.out.println(seznam.jePrazen());

        try {
            System.out.println(seznam.glava());
        } catch (java.util.NoSuchElementException ex) {
            System.out.println("izjema");
        }

        try {
            System.out.println(seznam.rep().jePrazen());
        } catch (java.util.NoSuchElementException ex) {
            System.out.println("izjema");
        }
    }
}
