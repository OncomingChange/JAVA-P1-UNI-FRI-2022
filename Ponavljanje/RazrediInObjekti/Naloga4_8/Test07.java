
public class Test07 {

    private static final String LOCILO = "--------------------";

    public static void main(String[] args) {
        Ucenec.nastaviMaksObremenitev(10);

        Ucenec anja = new Ucenec("Anja", "Antolinc");
        Ucenec bojan = new Ucenec("Bojan", "Bevk");
        Ucenec cvetka = new Ucenec("Cvetka", "Cirnik");
        Ucenec denis = new Ucenec("Denis", "Divjak");
        Ucenec eva = new Ucenec("Eva", "Erlah");

        Krozek sah = new Krozek("sah", 1, 12, 3);

        Ucenec[] ucenci = {anja, bojan, cvetka, denis, eva};
        Krozek[] krozki = {sah};

        System.out.println(anja.vclani(sah));
        System.out.println(bojan.vclani(sah));
        System.out.println(cvetka.vclani(sah));
        System.out.println(denis.vclani(sah));
        System.out.println(eva.vclani(sah));
        izpisiVse(ucenci, krozki);
        System.out.println(LOCILO);

        anja.izclani(sah);
        bojan.izclani(sah);
        System.out.println(cvetka.vclani(sah));
        System.out.println(denis.vclani(sah));
        System.out.println(eva.vclani(sah));
        izpisiVse(ucenci, krozki);
        System.out.println(LOCILO);

        anja.izclani(sah);
        bojan.izclani(sah);
        cvetka.izclani(sah);
        denis.izclani(sah);
        eva.izclani(sah);
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
