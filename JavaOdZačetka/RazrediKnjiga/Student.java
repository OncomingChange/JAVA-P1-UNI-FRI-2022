package JavaOdZačetka.RazrediKnjiga;

public class Student {
    private String ime;
    private String priimek;
    private String vpisnaStevilka;
    private Datum datumRojstva;
    private PostniNaslov bivalisce;
    private int letnik;
    private Predmet[] predmeti;

    public Student(String name, String surname, String enrollmentNumber, Datum birthDate, PostniNaslov address, int year, Predmet[] classes) {
        this.ime = name;
        this.priimek = surname;
        this.vpisnaStevilka = enrollmentNumber;
        this.datumRojstva = birthDate;
        this.bivalisce = address;
        this.letnik = year;
        this.predmeti = classes;
    }

    public int skupajKT() {
        int KT = 0;
        for (int i = 0; i < predmeti.length; i++) {
            KT += predmeti[i].steviloKT;
        }
        return KT;
    }
}
