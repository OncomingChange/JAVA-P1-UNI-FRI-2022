package JavaOdZačetka;

public class Oseba {
    private String ime;
    private String priimek;
    private Character spol;
    private int letoRojstva;
    public Oseba(String name, String surname, Character sex, int birthYear) {
        this.ime = name;
        this.priimek = surname;
        this.spol = sex;
        this.letoRojstva = birthYear;
    }
    public String vrniIme() {
        return this.ime;
    }
    public String vrniPriimek() {
        return this.priimek;
    }
    public Character vrniSpol() {
        return this.spol;
    }
    public int vrniLetoRojstva() {
        return this.letoRojstva;
    }
    public String toString() {
        return String.format("%s %s (%c), %d", this.ime, this.priimek, this.spol, this.letoRojstva);
    }
}
