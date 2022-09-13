package JavaOdZačetka.RazrediKnjiga;

public class Ulomek {
    private int stevec;
    private int imenovalec;
    private static int ustvarjeniUlomki;

    public Ulomek(int st, int im) {
        this.stevec = st;
        this.imenovalec = im;
        int manjši = (st > im) ? im : st;
        for (int i = 2; i <= Math.abs(manjši); i++) {
            if (imenovalec % i == 0 && stevec % i == 0) {
                stevec /= i;
                imenovalec /= i;
                manjši /= i;
                i = 1;
            }
        }
        if (imenovalec < 0) {
            stevec *= -1;
            imenovalec *= -1;
        }
        ustvarjeniUlomki++;
    }

    public int vrniStevec() {
        return this.stevec;
    }

    public int vrniImenovalec() {
        return this.imenovalec;
    }

    public Ulomek plus(Ulomek u) {
        int noviImenovalec = this.imenovalec * u.imenovalec;
        int noviStevec = this.imenovalec * u.stevec + u.imenovalec * this.stevec;
        return new Ulomek(noviStevec, noviImenovalec);
    }

    public Ulomek negacija() {
        return new Ulomek(this.stevec * -1, this.imenovalec);
    }

    public Ulomek minus(Ulomek u) {
        int noviImenovalec = this.imenovalec * u.imenovalec;
        int noviStevec = this.imenovalec * u.stevec - u.imenovalec * this.stevec;
        return new Ulomek(noviStevec, noviImenovalec);
    }

    public String toString() {
        return String.format("%d/%d", this.stevec, this.imenovalec);
    }

    public int primerjaj(Ulomek drugi) {
        if (this.stevec == drugi.stevec && this.imenovalec == drugi.imenovalec) {
            return 0;
        }
        else if ((double) this.stevec / this.imenovalec < (double) drugi.stevec / drugi.imenovalec) {
            return -1;
        }
        else {
            return 1;
        }
    }

    public static int steviloUstvarjenih() {
        return ustvarjeniUlomki;
    }
}
