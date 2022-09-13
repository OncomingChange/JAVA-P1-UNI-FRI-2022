
public class Datum {
    int dan, mesec, leto;

    public static Datum ustvari(int dan, int mesec, int leto) {
        if (primernoLeto(leto) && primerenMesec(mesec) && primerenDan(dan, mesec, leto)) {
            Datum datum = new Datum();
            datum.dan = dan;
            datum.mesec = mesec;
            datum.leto = leto;
            return datum;
        }
        else {
            return null;
        }
    }

    private static boolean primernoLeto(int leto) {
        return (leto >= 1583 && leto <= 2999);
    }

    private static boolean primerenMesec(int mesec) {
        return (mesec >= 1 && mesec <= 12);
    }

    private static boolean primerenDan(int dan, int mesec, int leto) {
        int maxDni = 0;
        switch (mesec) {
            case 1:
            maxDni = 31;
            break;
            case 2:
            if (letoPrestopno(leto)) {
                maxDni = 29;
            }
            else {
                maxDni = 28;
            }
            break;
            case 3:
            maxDni = 31;
            break;
            case 4:
            maxDni = 30;
            break;
            case 5:
            maxDni = 31;
            break;
            case 6:
            maxDni = 30;
            break;
            case 7:
            maxDni = 31;
            break;
            case 8:
            maxDni = 31;
            break;
            case 9:
            maxDni = 30;
            break;
            case 10:
            maxDni = 31;
            break;
            case 11:
            maxDni = 30;
            break;
            case 12:
            maxDni = 31;
            break;
        }
        return (dan >= 1 && dan <= maxDni);
    }

    private static boolean letoPrestopno(int leto) {
        return (leto % 400 == 0 || leto % 4 == 0 && leto % 100 != 0);
    }

    public String toString() {
        return String.format("%02d.%02d.%d", this.dan, this.mesec, this.leto);
    }

    public boolean jeEnakKot(Datum datum) {
        return this.toString().equals(datum.toString());
    }

    public boolean jePred(Datum datum) {
        if (this.leto < datum.leto) {
            return true;
        }
        else if (this.leto == datum.leto && this.mesec < datum.mesec) {
            return true;
        }
        else if (this.leto == datum.leto && this.mesec == datum.mesec && this.dan < datum.dan) {
            return true;
        }
        else {
            return false;
        }
    }

    public Datum naslednik() {
        if (primerenDan(this.dan + 1, this.mesec, this.leto)) {
            return ustvari(this.dan + 1, this.mesec, this.leto);
        }
        else if (primerenMesec(this.mesec + 1)) {
            return ustvari(1, this.mesec + 1, this.leto);
        }
        else if (primernoLeto(this.leto + 1)) {
            return ustvari(1, 1, this.leto + 1);
        }
        else {
            return null;
        }
    }
    
    public Datum predhodnik() {
        if(primerenDan(this.dan - 1, this.mesec, this.leto)) {
            return ustvari(this.dan - 1, this.mesec, this.leto);
        }
        else if (primerenMesec(this.mesec - 1)) {
            int dan = 31;
            for (int i = 31; i > 27; i--) {
                if (primerenDan(i, this.mesec - 1, this.leto)) {
                    dan = i;
                    break;
                }
            }
            return ustvari(dan, this.mesec - 1, this.leto);
        }
        else if (primernoLeto(this.leto - 1)) {
            return ustvari(31, 12, this.leto - 1);
        }
        else {
            return null;
        }
    }

    public Datum cez(int stDni) {
        Datum datum = Datum.ustvari(this.dan, this.mesec, this.leto);
        if (stDni >= 0) {
            for (int i = 1; i <= stDni; i++) {
                datum = datum.naslednik();
            }
        }
        else {
            for (int i = -1; i >= stDni; i--) {
                datum = datum.predhodnik();
            }
        }
        return datum;
    }

    public int razlika(Datum datum) {
        int razlika = 0;
        if (this.jePred(datum)) {
            Datum ta = Datum.ustvari(this.dan, this.mesec, this.leto);
            while (ta.jePred(datum)) {
                ta = ta.naslednik();
                razlika--;
            }
        }
        else if (datum.jePred(this)) {
            Datum ta = Datum.ustvari(this.dan, this.mesec, this.leto);
            while (datum.jePred(ta)) {
                ta = ta.predhodnik();
                razlika++;
            }
        }
        return razlika;
    }
}
