
public class Test05 {

    public static void main(String[] args) {
        Seznam seznam = new Prazen();
        seznam = seznam.dodajU(20);
        seznam = seznam.dodajU(50);
        seznam = seznam.dodajU(10);
        seznam = seznam.dodajU(60);
        seznam = seznam.dodajU(40);
        seznam = seznam.dodajU(30);
        System.out.println(seznam.glava());
        System.out.println(seznam.rep().glava());
        System.out.println(seznam.rep().rep().glava());
        System.out.println(seznam.rep().rep().rep().glava());
        System.out.println(seznam.rep().rep().rep().rep().glava());
        System.out.println(seznam.rep().rep().rep().rep().rep().glava());
        System.out.println(seznam.rep().rep().rep().rep().rep().rep().jePrazen());
    }
}
