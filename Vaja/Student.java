public class Student {
    private String ime; 
    private String priimek;
    private String vpisnaStevilka; 
    private Datum datumRojstva;
    private PostniNaslov bivalisce;

    public Student(String name, String surname, String number, Datum birthDate, PostniNaslov address) {
        this.ime = name;
        this.priimek = surname;
        this.vpisnaStevilka = number;
        this.datumRojstva = birthDate;
        this.bivalisce = address;
    }

    public int skupajKT() {
        int točke = 0;
        Predmet[] predmeti;
        /*
        for(int i = 0; i < predmeti.length; i++) {
            točke += predmeti[i].steviloKT;
        }
        */
        return točke;
    }
}
