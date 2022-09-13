package JavaOdZačetka.RazrediKnjiga;

public class Oseba {
    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;

    public Oseba(String name, String surname, char gender, int birthYear) {
        this.ime = name;
        this.priimek = surname;
        this.spol = gender;
        this.letoRojstva = birthYear;
    }

    public String vrniIme() {
        return this.ime;
    }

    public String vrniPriimek() {
        return this.priimek;
    }

    public char vrniSpol() {
        return this.spol;
    }

    public int vrniLetoRojstva() {
        return this.letoRojstva;
    }

    public String toString() {
        return String.format("%s %s (%c), %d", this.ime, this.priimek, this.spol, this.letoRojstva);
    }
}
