public class Ulomek {
    private int stevec;
    private int imenovalec;
    public Ulomek(int st, int im) {
        this.stevec = st;
        this.imenovalec = im;
    }
    public int vrniStevec() {
        return this.stevec;
    }
    public int vrniImenovalec() {
        return this.imenovalec;
    }
    public Ulomek plus(Ulomek u) {
        int noviImenovalec = this.imenovalec * u.imenovalec;
        int noviStevec = this.stevec * u.imenovalec + u.stevec * this.imenovalec;
        int imenovalec = 0;
        while (imenovalec != noviImenovalec) {
            imenovalec = noviImenovalec;
            for (int i = 2; i < noviImenovalec; i++) {
                if (noviImenovalec % i == 0 && noviStevec % i == 0) {
                    noviImenovalec /= i;
                    noviStevec /= i;
                    imenovalec = 0;
                }
            }
        }
        return new Ulomek(noviStevec, noviImenovalec);
    }
    public Ulomek negacija() {
        return new Ulomek(-this.stevec, this.imenovalec);
    }
    public Ulomek minus(Ulomek u) {
        int noviImenovalec = this.imenovalec * u.imenovalec;
        int noviStevec = this.stevec * u.imenovalec - u.stevec * this.imenovalec;
        int imenovalec = 0;
        while (imenovalec != noviImenovalec) {
            imenovalec = noviImenovalec;
            for (int i = 2; i < noviImenovalec; i++) {
                if (noviImenovalec % i == 0 && noviStevec % i == 0) {
                    noviImenovalec /= i;
                    noviStevec /= i;
                    imenovalec = 0;
                }
            }
        }
        return new Ulomek(noviStevec, noviImenovalec);
    }
    public String toString() {
        return String.format("%d/%d", this.stevec, this.imenovalec);
    }
    public int primerjaj(Ulomek drugi) {
        double prviUlomek = (double) this.stevec / this.imenovalec;
        double drugiUlomek = (double) drugi.stevec / drugi.imenovalec;
        if (prviUlomek > drugiUlomek) {
            return 1;
        }
        else if (prviUlomek == drugiUlomek) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
