
public class Test06 {

    private static final String LOCILO = "--------------------";

    public static void main(String[] args) {
        Ucenec.nastaviMaksObremenitev(10);

        Ucenec anja = new Ucenec("Anja", "Antolinc");
        Ucenec bojan = new Ucenec("Bojan", "Bevk");

        Krozek ka = new Krozek("ka", 1, 12, 1);
        Krozek kb = new Krozek("kb", 2, 12, 2);
        Krozek kc = new Krozek("kc", 3, 12, 1);
        Krozek kd = new Krozek("kd", 4, 12, 2);
        Krozek ke = new Krozek("ke", 5, 12, 1);

        System.out.println(anja.vclani(ka));
        System.out.println(anja.vclani(kb));
        System.out.println(anja.vclani(kc));
        System.out.println(anja.vclani(kd));
        System.out.println(anja.vclani(ke));
        System.out.println(LOCILO);

        System.out.println(bojan.vclani(ka));
        System.out.println(bojan.vclani(kb));
        System.out.println(bojan.vclani(kc));
        System.out.println(bojan.vclani(kd));
        System.out.println(bojan.vclani(ke));
        System.out.println(LOCILO);

        Ucenec[] ucenci = {anja, bojan};
        Krozek[] krozki = {ka, kb, kc, kd, ke};
        izpisiVse(ucenci, krozki);
    }

    private static void izpisiVse(Ucenec[] ucenci, Krozek[] krozki) {
        for (int i = 0;  i < ucenci.length;  i++) {
            System.out.printf("%s -> %d%n", ucenci[i].vrniIP(), ucenci[i].steviloKrozkov());
        }
        for (int i = 0;  i < krozki.length;  i++) {
            System.out.printf("%s -> %d%n", krozki[i].vrniNaziv(), krozki[i].steviloClanov());
        }
    }
}
