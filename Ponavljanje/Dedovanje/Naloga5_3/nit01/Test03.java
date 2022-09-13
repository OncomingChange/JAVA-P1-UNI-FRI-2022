
public class Test03 {

    public static void main(String[] args) {
        Seznam seznam = new Prazen();
        seznam = seznam.dodajZ(20);
        seznam = seznam.dodajZ(50);
        seznam = seznam.dodajZ(10);
        seznam = seznam.dodajZ(60);
        seznam = seznam.dodajZ(40);
        seznam = seznam.dodajZ(30);
        System.out.println(seznam.glava());
        System.out.println(seznam.rep().glava());
        System.out.println(seznam.rep().rep().glava());
        System.out.println(seznam.rep().rep().rep().glava());
        System.out.println(seznam.rep().rep().rep().rep().glava());
        System.out.println(seznam.rep().rep().rep().rep().rep().glava());
        System.out.println(seznam.rep().rep().rep().rep().rep().rep().jePrazen());
    }
}
