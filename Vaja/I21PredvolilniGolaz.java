import java.util.*;

public class I21PredvolilniGolaz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int denar = sc.nextInt();
        
        while (denar > 0 && sc.hasNext()) {
            int cenaKosila = sc.nextInt();
            int stKosil = sc.nextInt();
            int vinoSt = sc.nextInt();
            boolean vino;
            if (vinoSt == 1) {
                vino = true;
            }
            else {
                vino = false;
            }
            denar -= cenaPogostitve(stKosil, cenaKosila, vino);
            if (denar >= 0) {
                System.out.printf("%d %d%n", cenaPogostitve(stKosil, cenaKosila, vino), denar);
            }
            else {
                System.out.printf("%d -%n", cenaPogostitve(stKosil, cenaKosila, vino));
            }
        }
    }

    public static int cenaPogostitve(int cenaKosila, int stKosil, boolean vino) {
        int cena = stKosil * cenaKosila;
        if (vino) {
            cena += Math.round(cena / 2.0);
        }
        return cena;
    }
}
