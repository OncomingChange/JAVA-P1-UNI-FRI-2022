import javax.swing.text.StyledEditorKit.UnderlineAction;

public class PostniNaslov {
    private String ulicaInHisnaStevilka;
    private int postnaStevilka;
    private String posta;

    public PostniNaslov (String uiHStevilka, int pStevilka, String p) {
        this.ulicaInHisnaStevilka = uiHStevilka;
        this.postnaStevilka = pStevilka;
        this.posta = p;
    }
}
