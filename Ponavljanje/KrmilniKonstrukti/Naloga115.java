package KrmilniKonstrukti;
import java.util.*;

public class Naloga115 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int stevilkaZmagovalca = 0;
            int trenutniRekord = Integer.MAX_VALUE;
            int trenutniCas = Integer.MAX_VALUE;

            for (int i = 1; i <= n; i++) {
                int prviRezultat = sc.nextInt();
                if (prviRezultat != 0) {
                    int drugiRezultat = sc.nextInt();
                    if (drugiRezultat != 0) {
                        trenutniCas = prviRezultat + drugiRezultat;
                    }
                }
                if (trenutniCas < trenutniRekord) {
                    trenutniRekord = trenutniCas;
                    stevilkaZmagovalca = i;
                }
            }
            if (trenutniRekord == Integer.MAX_VALUE) {
                System.out.println("NIHCE");
            }
            else {
                System.out.printf("%d%n%d", stevilkaZmagovalca, trenutniRekord);
            }
        }
    }   
}
