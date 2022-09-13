package Metode;
import java.util.Scanner;

public class bNaloga1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int denar = sc.nextInt();
            int cenaEnegaKosila;
            int steviloKosil;
            int vino;

            while (sc.hasNext()) {
                cenaEnegaKosila = sc.nextInt();
                steviloKosil = sc.nextInt();
                vino = sc.nextInt();
                int cenaPog = cenaPogostitve(cenaEnegaKosila, steviloKosil, vino);

                if (cenaPog > denar) {
                    System.out.printf("%d -%n", cenaPog);
                    break;
                }
                else {
                    denar -= cenaPog;
                    System.out.printf("%d %d%n", cenaPog, denar);
                }
            }
        }
    }

    public static int cenaPogostitve (int cenaEnegaKosila, int steviloKosil, int vino) {
        int cenaVsehKosil = cenaEnegaKosila * steviloKosil;
        if (vino == 1) {
            cenaVsehKosil += Math.ceil((double) cenaVsehKosil / 2);
        }
        return cenaVsehKosil;
    }
}
