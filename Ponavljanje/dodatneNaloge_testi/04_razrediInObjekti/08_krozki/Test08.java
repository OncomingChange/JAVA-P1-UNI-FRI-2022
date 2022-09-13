
public class Test08 {

    private static final String LOCILO = "--------------------";

    public static void main(String[] args) {
        Ucenec.nastaviMaksObremenitev(3);

        Ucenec anja = new Ucenec("Anja", "Antolinc");
        Ucenec bojan = new Ucenec("Bojan", "Bevk");
        Ucenec cvetka = new Ucenec("Cvetka", "Cirnik");
        Ucenec denis = new Ucenec("Denis", "Divjak");
        Ucenec eva = new Ucenec("Eva", "Erlah");

        Krozek matematika = new Krozek("matematika", 1, 13, 2);
        Krozek sah = new Krozek("sah", 1, 14, 3);
        Krozek dramatika = new Krozek("dramatika", 1, 16, 2);
        Krozek ples = new Krozek("ples", 3, 15, 4);
        Krozek nogomet = new Krozek("nogomet", 4, 13, 2);

        Ucenec[] ucenci = {anja, bojan, cvetka, denis, eva};
        Krozek[] krozki = {matematika, sah, dramatika, ples, nogomet};

        System.out.println(anja.vclani(matematika));
        System.out.println(anja.vclani(sah));
        System.out.println(anja.vclani(dramatika));
        System.out.println(anja.vclani(ples));
        System.out.println(anja.vclani(nogomet));
        System.out.println(anja.vclani(matematika));
        System.out.println(LOCILO);

        System.out.println(bojan.vclani(matematika));
        System.out.println(bojan.vclani(dramatika));
        System.out.println(bojan.vclani(nogomet));
        System.out.println(LOCILO);

        System.out.println(cvetka.vclani(sah));
        System.out.println(cvetka.vclani(dramatika));
        System.out.println(cvetka.vclani(ples));
        System.out.println(LOCILO);

        System.out.println(denis.vclani(sah));
        System.out.println(denis.vclani(dramatika));
        System.out.println(denis.vclani(ples));
        System.out.println(LOCILO);

        System.out.println(eva.vclani(sah));
        System.out.println(eva.vclani(dramatika));
        System.out.println(eva.vclani(ples));
        System.out.println(LOCILO);

        izpisiVse(ucenci, krozki);
        System.out.println(LOCILO);

        anja.izclani(matematika);
        bojan.izclani(nogomet);
        cvetka.izclani(ples);
        denis.izclani(sah);
        eva.izclani(nogomet);

        izpisiVse(ucenci, krozki);
        System.out.println(LOCILO);

        System.out.println(eva.vclani(dramatika));
        System.out.println(eva.vclani(nogomet));
        System.out.println(cvetka.vclani(nogomet));
        System.out.println(bojan.vclani(nogomet));
        System.out.println(anja.vclani(sah));
        System.out.println(LOCILO);

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
