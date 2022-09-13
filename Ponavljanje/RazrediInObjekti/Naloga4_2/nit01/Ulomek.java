import org.w3c.dom.ranges.Range;

public class Ulomek {
    private int stevec;
    private int imenovalec;

    public Ulomek(int a, int b) {
        this.stevec = a;
        this.imenovalec = b;
        int manjši = (a > b) ? b : a;
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
    }

    public String toString() {
        return String.format("%d/%d", this.stevec, this.imenovalec);
    }

    public boolean jeEnakKot(Ulomek u) {
        return this.stevec == u.stevec && this.imenovalec == u.imenovalec;
    }

    public Ulomek negacija() {
        return new Ulomek(-this.stevec, this.imenovalec);
    }

    public Ulomek obrat() {
        return new Ulomek(this.imenovalec, this.stevec);
    }

    public Ulomek vsota(Ulomek u) {
        int noviImenovalec = this.imenovalec * u.imenovalec;
        int noviStevec = this.imenovalec * u.stevec + u.imenovalec * this.stevec;
        return new Ulomek(noviStevec, noviImenovalec);
    }

    public Ulomek razlika(Ulomek u) {
        int noviImenovalec = this.imenovalec * u.imenovalec;
        int noviStevec = u.imenovalec * this.stevec - this.imenovalec * u.stevec;
        return new Ulomek(noviStevec, noviImenovalec);
    }

    public Ulomek zmnozek(Ulomek u) {
        return new Ulomek(this.stevec * u.stevec, this.imenovalec * u.imenovalec);
    }

    public Ulomek kolicnik(Ulomek u) {
        return this.zmnozek(u.obrat());
    }

    public Ulomek potenca(int eksponent) {
        if (eksponent > 0) {
            Ulomek ulomek = new Ulomek(this.stevec, this.imenovalec);
            for (int i = 1; i < eksponent; i++) {
                ulomek = this.zmnozek(ulomek);
            }
            return ulomek;
        }
        else if (eksponent == 0) {
            return new Ulomek(1, 1);
        }
        else {
            Ulomek ulomek = new Ulomek(this.stevec, this.imenovalec);
            for (int i = -1; i > eksponent; i--) {
                ulomek = this.zmnozek(ulomek);
            }
            return ulomek.obrat();
        }
    }

    public boolean jeManjsiOd(Ulomek u) {
        return ((double) this.stevec / this.imenovalec) < ((double) u.stevec / u.imenovalec);
    }
}
