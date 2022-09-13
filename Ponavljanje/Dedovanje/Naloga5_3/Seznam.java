
public abstract class Seznam {
    private int glava;
    private Seznam rep;

    private static int steviloElementov;

    public Seznam(int glava, Seznam rep) {
        this.glava = glava;
        this.rep = rep;
    }
    public int glava() {
        if (this.glava != 0) {
            return this.glava;
        }
        else {
            throw new java.util.NoSuchElementException();
        }
    }

    public Seznam rep() {
        if (this.glava != 0) {
            return this.rep;
        }
        else {
            throw new java.util.NoSuchElementException();
        }
    }

    public boolean jePrazen() {
        return this.glava == 0;
    }

    public Seznam dodajZ(int element) {
        steviloElementov++;
        return new Neprazen(element, this);
    }

    public Seznam dodajK(int element) {
        if (this.jePrazen()) {
            steviloElementov++;
            return new Neprazen(element, null);
        }
        else {
            Seznam rep = this.rep();
            while (rep instanceof Neprazen) {
                rep = rep.rep();
            }
            rep = new Neprazen(element, null);
        }
        steviloElementov++;
        return new Neprazen(this.glava, this.rep);
    }
}