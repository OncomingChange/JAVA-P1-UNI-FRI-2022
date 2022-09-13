
public class Filozof {
    private String ime;
    private Filozof leviSosed, desniSosed;
    private boolean drziLevo, drziDesno;
    

    public Filozof (String ime) {
        this.ime = ime;
    }

    public Filozof (String ime, Filozof levi, Filozof desni) {

    }

    public String vrniIme() {
        return String.format("%s", this.ime);
    }

    public void nastaviSoseda(Filozof levi, Filozof desni) {
        this.leviSosed = levi;
        this.desniSosed = desni;
    }

    public boolean jeLeviSosedOd(Filozof f) {
        return (f.leviSosed.equals(this));
    }

    public boolean jeDesniSosedOd(Filozof f) {
        return (f.desniSosed.equals(this));
    }

    public Filozof[] vrniSoseda() {
        Filozof[] soseda = {this.leviSosed, this.desniSosed};
        return soseda;
    }
    
    public int kolikoPalicicDrzi() {
        if (drziLevo && drziDesno) {
            return 2;
        }
        else if (drziLevo || drziDesno) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public boolean primiLevo() {
        if (drziLevo) {
            return true;
        }
        else if (leviSosed.drziDesno) {
            return false;
        }
        else {
            this.drziLevo = true;
            return true;
        }
    }

    public boolean primiDesno() {
        if (drziDesno) {
            return true;
        }
        else if (desniSosed.drziLevo) {
            return false;
        }
        else {
            this.drziDesno = true;
            return true;
        }
    }

    public void izpustiLevo() {
        if (this.drziLevo) {
            this.drziLevo = false;
        }
    }

    public void izpustiDesno() {
        if (this.drziDesno) {
            this.drziDesno = false;
        }
    }
    
    public static int steviloJedcev(Filozof[] filozofi) {
        int jedci = 0;
        for (int i = 0; i < filozofi.length; i++) {
            if (filozofi[i].kolikoPalicicDrzi() == 2) {
                jedci++;
            } 
        }
        return jedci;
    }

    public int steviloFilozofov() {
        int stFilozofov = 1;
        Filozof trenutniFilozof = this.leviSosed;
        while(trenutniFilozof != null && trenutniFilozof != this) {
            trenutniFilozof = trenutniFilozof.leviSosed;
            stFilozofov++;
        }
        return stFilozofov;
    }
}
