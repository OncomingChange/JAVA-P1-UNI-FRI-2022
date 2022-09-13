
public class Telegram extends Posiljka {
    

    public Telegram(String naslovnik, String vsebina) {
        super(naslovnik, vsebina);
    }

    @Override
    public int cena() {
        return this.steviloCrk() * this.vrniT();
    }

    @Override
    public String vrniVrsto() {
        return "T";
    }

    @Override
    public String vrniPodatke() {
        return null;
    }

    private int steviloCrk() {
        int dolzina = this.vrniVsebino().length();
        int stZnakov = 0;
        for (int i = 0; i < dolzina; i++) {
            if(Character.isLetter(vrniVsebino().charAt(i))) {
                stZnakov++;
            }
        }
        return stZnakov;
    }
}
