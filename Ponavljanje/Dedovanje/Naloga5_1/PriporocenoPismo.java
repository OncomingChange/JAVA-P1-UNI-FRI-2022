
public class PriporocenoPismo extends NavadnoPismo {
    private String posiljatelj;

    public PriporocenoPismo(String naslovnik, String vsebina, int razdalja, String posiljatelj) {
        super(naslovnik, vsebina, razdalja);
        this.posiljatelj = posiljatelj;
    }

    @Override
    public int cena() {
        return super.cena() * this.vrniP();
    }

    @Override
    public String vrniPodatke() {
        return String.format("%s%s | ", super.vrniPodatke(), this.posiljatelj);
    }

    @Override
    public String vrniVrsto() {
        return "PP";
    }

    public String vrniPosiljatelja() {
        return this.posiljatelj;
    }
}
