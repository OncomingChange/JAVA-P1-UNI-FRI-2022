
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Test03 {

    private static class Student {
        String ime;
        String priimek;
        char spol;
        int ocena;

        Student(String ime, String priimek, char spol, int ocena) {
            this.ime = ime;
            this.priimek = priimek;
            this.spol = spol;
            this.ocena = ocena;
        }

        @Override
        public String toString() {
            return String.format("%s %s (%c) / %d", this.ime, this.priimek, this.spol, this.ocena);
        }
    }

    public static void main(String[] args) {
        List<Student> studentje = new ArrayList<>(List.of(
                    new Student("Janez", "Novak", 'M', 6),
                    new Student("Darja", "Oblak", 'Z', 7),
                    new Student("Peter", "Novak", 'M', 8),
                    new Student("Mojca", "Oblak", 'Z', 7),
                    new Student("Peter", "Oblak", 'M', 9),
                    new Student("Mojca", "Novak", 'Z', 6),
                    new Student("Darja", "Novak", 'Z', 10),
                    new Student("Darja", "Oblak", 'Z', 6),
                    new Student("Mojca", "Novak", 'Z', 9),
                    new Student("Peter", "Novak", 'M', 7),
                    new Student("Janez", "Novak", 'M', 8),
                    new Student("Peter", "Oblak", 'M', 10),
                    new Student("Darja", "Oblak", 'Z', 9),
                    new Student("Mojca", "Novak", 'Z', 10),
                    new Student("Mojca", "Oblak", 'Z', 9)
        ));

        Comparator<Student> poImenu = (a, b) -> (a.ime.compareTo(b.ime));
        Comparator<Student> poPriimku = (a, b) -> (a.priimek.compareTo(b.priimek));
        Comparator<Student> poSpolu = (a, b) -> (b.spol - a.spol);
        Comparator<Student> poOceni = (a, b) -> (b.ocena - a.ocena);

        Comparator<Student> c1 = KombinacijaPrimerjalnikov.kombinacija(List.of(poSpolu, poPriimku, poImenu, poOceni));
        studentje.sort(c1);
        System.out.println(studentje);

        Comparator<Student> c2 = KombinacijaPrimerjalnikov.kombinacija(List.of(poOceni, poSpolu, poPriimku, poImenu));
        studentje.sort(c2);
        System.out.println(studentje);
    }
}
