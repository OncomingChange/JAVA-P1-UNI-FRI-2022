
public class Test10 {

    public static void main(String[] args) {
        Seznam seznam = new Prazen();
        System.out.println(seznam.jePrazen());
        System.out.println(seznam.toString());

        seznam = seznam.dodajU(30);
        seznam = seznam.dodajU(10);
        seznam = seznam.dodajU(40);
        seznam = seznam.dodajU(20);
        seznam = seznam.dodajU(60);
        seznam = seznam.dodajU(50);
        seznam = seznam.dodajU(10);
        seznam = seznam.dodajU(20);
        System.out.println(seznam.jePrazen());
        System.out.println(seznam.toString());

        seznam = seznam.dodajZ(50);
        seznam = seznam.dodajZ(60);
        seznam = seznam.dodajK(20);
        seznam = seznam.dodajK(50);
        System.out.println(seznam.toString());

        seznam = seznam.odstrani(30);
        seznam = seznam.odstrani(50);
        seznam = seznam.odstrani(30);
        System.out.println(seznam.toString());

        Seznam urejen = seznam.uredi();
        System.out.println(urejen.toString());

        seznam = seznam.odstraniDuplikate();
        System.out.println(seznam.toString());
    }
}
