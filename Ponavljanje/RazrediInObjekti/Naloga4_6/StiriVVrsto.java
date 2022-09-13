
public class StiriVVrsto {
    private int stVrstic, stStolpcev;

    private static int STEVILO_POTEZ = 0;
    private static boolean[][][] IGRALNO_POLJE;

    public StiriVVrsto(int stVrstic, int stStolpcev) {
        this.stVrstic = stVrstic;
        this.stStolpcev = stStolpcev;
        IGRALNO_POLJE = new boolean[stVrstic][stStolpcev][2];
    }

    public int vrniSteviloVrstic() {
        return this.stVrstic;
    }

    public int vrniSteviloStolpcev() {
        return this.stStolpcev;
    }

    public boolean vrzi(int stolpec) {
        if (IGRALNO_POLJE[this.stVrstic - 1][stolpec][0]) {
            return false;
        }
        else {
            for (int indeksVrstice = 0; indeksVrstice < this.stVrstic; indeksVrstice++) {
                if (!IGRALNO_POLJE[indeksVrstice][stolpec][0]) {
                    IGRALNO_POLJE[indeksVrstice][stolpec][0] = true;
                    if (this.naPotezi() == 1) {
                        IGRALNO_POLJE[indeksVrstice][stolpec][1] = true;
                    }
                    STEVILO_POTEZ++;
                    break;
                }
            }
        }
        return true;
    }

    public int naPotezi() {
        if (STEVILO_POTEZ % 2 == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }

    public int vsebina(int vrstica, int stolpec) {
        if (IGRALNO_POLJE[vrstica][stolpec][0] == false) {
            return -1;
        }
        else {
            if (IGRALNO_POLJE[vrstica][stolpec][1]) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }

    public int najdaljseZaporedje(int igralec) {
        int trenutnoZaporedje = 0;
        int najdaljseZaporedje = 0;
        //preverjanje vrstic
        for (int i = 0; i < this.stVrstic; i++) {
            trenutnoZaporedje = 0;
            for (int j = 0; j < this.stStolpcev; j++) {
                if (IGRALNO_POLJE[i][j][0]) {
                    if (IGRALNO_POLJE[i][j][1] && igralec == 1) {
                        trenutnoZaporedje++;
                        if (trenutnoZaporedje > najdaljseZaporedje) {
                            najdaljseZaporedje = trenutnoZaporedje;
                        }
                    }
                    else if (!IGRALNO_POLJE[i][j][1] && igralec == 0) {
                        trenutnoZaporedje++;
                        if (trenutnoZaporedje > najdaljseZaporedje) {
                            najdaljseZaporedje = trenutnoZaporedje;
                        }
                    }
                    else {
                        trenutnoZaporedje = 0;
                    }
                }
                else {
                    trenutnoZaporedje = 0;
                }
            }
        }

        //preverjanje stolpcev
        for (int j = 0; j < this.stStolpcev; j++) {
            trenutnoZaporedje = 0;
            for (int i = 0; i < this.stVrstic; i++) {
                if (IGRALNO_POLJE[i][j][0]) {
                    if (IGRALNO_POLJE[i][j][1] && igralec == 1) {
                        trenutnoZaporedje++;
                        if (trenutnoZaporedje > najdaljseZaporedje) {
                            najdaljseZaporedje = trenutnoZaporedje;
                        }
                    }
                    else if (!IGRALNO_POLJE[i][j][1] && igralec == 0) {
                        trenutnoZaporedje++;
                        if (trenutnoZaporedje > najdaljseZaporedje) {
                            najdaljseZaporedje = trenutnoZaporedje;
                        }
                    }
                    else {
                        trenutnoZaporedje = 0;
                    }
                }
                else {
                    trenutnoZaporedje = 0;
                }
            }
        }
        
        //preverjanje diagonal od spodaj v desno
        for (int i = 0; i < this.stStolpcev; i++) {
            trenutnoZaporedje = 0;
            for (int indeks = 0; indeks < this.stVrstic && indeks + i < this.stStolpcev; indeks++) {
                if (IGRALNO_POLJE[indeks][i + indeks][0]) {
                    if (IGRALNO_POLJE[indeks][i + indeks][1] && igralec == 1) {
                        trenutnoZaporedje++;
                        if (trenutnoZaporedje > najdaljseZaporedje) {
                            najdaljseZaporedje = trenutnoZaporedje;
                        }
                    }
                    else if (!IGRALNO_POLJE[indeks][i + indeks][1] && igralec == 0) {
                        trenutnoZaporedje++;
                        if (trenutnoZaporedje > najdaljseZaporedje) {
                            najdaljseZaporedje = trenutnoZaporedje;
                        }
                    }
                    else {
                        trenutnoZaporedje = 0;
                    }
                }
                else {
                    trenutnoZaporedje = 0;
                }
            }
        }

        //preverjanje diagonal od spodaj v levo
        for (int i = this.stStolpcev - 1; i >= 0; i--) {
            trenutnoZaporedje = 0;
            for (int indeks = 0; indeks < this.stVrstic && indeks <= i; indeks++) {
                if (IGRALNO_POLJE[indeks][i - indeks][0]) {
                    if (IGRALNO_POLJE[indeks][i - indeks][1] && igralec == 1) {
                        trenutnoZaporedje++;
                        if (trenutnoZaporedje > najdaljseZaporedje) {
                            najdaljseZaporedje = trenutnoZaporedje;
                        }
                    }
                    else if (!IGRALNO_POLJE[indeks][i - indeks][1] && igralec == 0) {
                        trenutnoZaporedje++;
                        if (trenutnoZaporedje > najdaljseZaporedje) {
                            najdaljseZaporedje = trenutnoZaporedje;
                        }
                    }
                    else {
                        trenutnoZaporedje = 0;
                    }
                }
                else {
                    trenutnoZaporedje = 0;
                }
            }
        }

        //preverjanje diagonal od roba desno
        for (int vrsta = 0; vrsta < this.stVrstic; vrsta++) {
            trenutnoZaporedje = 0;
            for (int indeks = 0; indeks < this.stStolpcev && indeks < this.stVrstic - vrsta; indeks++) {
                if (IGRALNO_POLJE[vrsta + indeks][indeks][0]) {
                    if (IGRALNO_POLJE[vrsta + indeks][indeks][1] && igralec == 1) {
                        trenutnoZaporedje++;
                        if (trenutnoZaporedje > najdaljseZaporedje) {
                            najdaljseZaporedje = trenutnoZaporedje;
                        }
                    }
                    else if (!IGRALNO_POLJE[vrsta + indeks][indeks][1] && igralec == 0) {
                        trenutnoZaporedje++;
                        if (trenutnoZaporedje > najdaljseZaporedje) {
                            najdaljseZaporedje = trenutnoZaporedje;
                        }
                    }
                    else {
                        trenutnoZaporedje = 0;
                    }
                }
                else {
                    trenutnoZaporedje = 0;
                }
            }
        }
        //preverjanje diagonal od roba levo
        for (int vrsta = 0; vrsta < this.stVrstic; vrsta++) {
            trenutnoZaporedje = 0;
            for (int indeks = 0; indeks < this.stStolpcev && indeks < this.stVrstic - vrsta; indeks++) {
                if (IGRALNO_POLJE[vrsta + indeks][this.stStolpcev - 1 - indeks][0]) {
                    if (IGRALNO_POLJE[vrsta + indeks][this.stStolpcev - 1 - indeks][1] && igralec == 1) {
                        trenutnoZaporedje++;
                        if (trenutnoZaporedje > najdaljseZaporedje) {
                            najdaljseZaporedje = trenutnoZaporedje;
                        }
                    }
                    else if (!IGRALNO_POLJE[vrsta + indeks][this.stStolpcev - 1 - indeks][1] && igralec == 0) {
                        trenutnoZaporedje++;
                        if (trenutnoZaporedje > najdaljseZaporedje) {
                            najdaljseZaporedje = trenutnoZaporedje;
                        }
                    }
                    else {
                        trenutnoZaporedje = 0;
                    }
                }
                else {
                    trenutnoZaporedje = 0;
                }
            }
        }
        return najdaljseZaporedje;
    }

    public int izid() {
        if (najdaljseZaporedje(0) >= 4 && najdaljseZaporedje(1) < 4) {
            return 0;
        }
        else if (najdaljseZaporedje(1) >= 4 && najdaljseZaporedje(0) < 4) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
