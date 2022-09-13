import java.util.*;

public class I29SahovskiPopoldnevi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();
        int z = sc.nextInt();
        int d = sc.nextInt();

        Random rand = new Random(s);

        for (int i = 1; i <= d; i++) {
            int stPartij = 0;
            int stZmagA = 0;
            int stZmagB = 0;
            System.out.printf("%d. dan: ", i);
            while (stPartij < p && stZmagA < z && stZmagB < z) {
                int rezultat = rand.nextInt(100);
                char rezultatPartije = naključniRezultat(rezultat, a, b);
                if (naključniRezultat(rezultat, a, b) == 'A') {
                    stZmagA++;
                }
                else if (naključniRezultat(rezultat, a, b) == 'B') {
                    stZmagB++;
                }
                System.out.print(rezultatPartije);
                stPartij++;
            }
            System.out.printf(" (%d)%n", stPartij);
        }
    }

    public static char naključniRezultat(int rezultat, int a, int b) {
        char karakter;
        if (rezultat < a) {
            karakter = 'A';
        }
        else if (rezultat >= a && rezultat < a + b) {
            karakter = 'B';
        }
        else {
            karakter = 'r';
        }
        return karakter;
    }
}
