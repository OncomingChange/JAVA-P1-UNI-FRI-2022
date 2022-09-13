package JavaOdZačetka.RazrediKnjiga;

public class PostniNaslov {
    private String ulicaInHisnaStevilka;
    private int postnaStevilka;
    private String posta;

    public PostniNaslov(String streetAndHouseNumber, int zipCode, String city) {
        this.ulicaInHisnaStevilka = streetAndHouseNumber;
        this.postnaStevilka = zipCode;
        this.posta = city;
    }
}
