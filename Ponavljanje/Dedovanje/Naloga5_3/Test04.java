
public class Test04 {

    public static void main(String[] args) {
        Seznam seznam = new Prazen();
        seznam = seznam.dodajK(20);
        seznam = seznam.dodajK(50);
        seznam = seznam.dodajK(10);
        seznam = seznam.dodajK(60);
        seznam = seznam.dodajK(40);
        seznam = seznam.dodajK(30);
        System.out.println(seznam.glava());
        System.out.println(seznam.rep().glava());
        System.out.println(seznam.rep().rep().glava());
        System.out.println(seznam.rep().rep().rep().glava());
        System.out.println(seznam.rep().rep().rep().rep().glava());
        System.out.println(seznam.rep().rep().rep().rep().rep().glava());
        System.out.println(seznam.rep().rep().rep().rep().rep().rep().jePrazen());
    }
}
