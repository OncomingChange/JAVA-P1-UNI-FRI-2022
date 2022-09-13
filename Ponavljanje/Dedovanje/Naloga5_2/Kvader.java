
public class Kvader extends Lik{
    private int stranica1, stranica2, stranica3;

    public Kvader(int stranica1, int stranica2, int stranica3) {
        this.stranica1 = stranica1;
        this.stranica2 = stranica2;
        this.stranica3 = stranica3;
    }

    @Override
    public int povrsina() {
        return (stranica1 * stranica2 + stranica1 * stranica3 + stranica2 * stranica3) * 2;
    }

    @Override
    public int prostornina() {
        return (stranica1 * stranica2 * stranica3);
    }

    @Override
    public String vrniTelo() {
        return "kvader";
    }

    @Override
    public String vrniPodatke() {
        return String.format("a = %d%nb = %d%nc = %d", this.stranica1, this.stranica2, this.stranica3);
    }

    public int vrniStranico() {
        return stranica1;
    }

    @Override
    public String mreza() {
        String mreza = "";
        for (int i = 1; i <= (this.stranica3 + this.stranica1) * 2; i++) {
            if (i <= stranica3 || i > stranica3 + stranica1 && i <= stranica3 * 2 + stranica1) {
                mreza += String.format("%s%s%n", presledki(), sprednjaZadnja());
            }
            else if (i <= stranica3 + stranica1) {
                mreza += String.format("%s %s %s%n", levaDesna(), zgornjaSpodnja(), levaDesna());
            }
            else {
                mreza += String.format("%s%s%n", presledki(), zgornjaSpodnja());
            }
        }
        return mreza;
    }

    private String zgornjaSpodnja() {
        String zgornjaSpodnja = "o";
        for (int i = 1; i < stranica2; i++) {
            zgornjaSpodnja += " o";
        }
        return zgornjaSpodnja;
    }

    private String levaDesna() {
        String levaDesna = "+";
        for (int i = 1; i < stranica3; i++) {
            levaDesna += " +";
        }
        return levaDesna;
    }

    private String sprednjaZadnja() {
        String sprednjaZadnja = "*";
        for (int i = 1; i < stranica2; i++) {
            sprednjaZadnja += " *";
        }
        return sprednjaZadnja;
    }

    private String presledki() {
        String presledki = "";
        for (int i = 0; i < stranica3; i++) {
            presledki += "  ";
        }
        return presledki;
    }
}
