
public class Test02 {

    public static void main(String[] args) {
        Seznam seznam = new Neprazen(42, new Prazen());
        System.out.println(seznam.jePrazen());
        System.out.println(seznam.glava());
        System.out.println(seznam.rep().jePrazen());
        try {
            System.out.println(seznam.rep().glava());
        } catch (java.util.NoSuchElementException ex) {
            System.out.println("izjema");
        }
        try {
            System.out.println(seznam.rep().rep().jePrazen());
        } catch (java.util.NoSuchElementException ex) {
            System.out.println("izjema");
        }
        System.out.println("---");

        Seznam seEnSeznam = new Neprazen(3, new Neprazen(5, new Prazen()));
        System.out.println(seEnSeznam.jePrazen());
        System.out.println(seEnSeznam.glava());
        System.out.println(seEnSeznam.rep().jePrazen());
        System.out.println(seEnSeznam.rep().glava());
        System.out.println(seEnSeznam.rep().rep().jePrazen());
        System.out.println("---");

        Seznam paSeEnSeznam = new Neprazen(3, new Neprazen(5, new Neprazen(7, new Prazen())));
        System.out.println(paSeEnSeznam.jePrazen());
        System.out.println(paSeEnSeznam.glava());
        System.out.println(paSeEnSeznam.rep().jePrazen());
        System.out.println(paSeEnSeznam.rep().glava());
        System.out.println(paSeEnSeznam.rep().rep().jePrazen());
        System.out.println(paSeEnSeznam.rep().rep().glava());
        System.out.println(paSeEnSeznam.rep().rep().rep().jePrazen());
    }
}
